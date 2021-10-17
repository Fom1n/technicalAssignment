package com.ing.repositories;

import com.ing.entities.StudentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


/**
 * Student repository, handles everything with a database.
 */
@Repository
public class StudentRepository {

    @PersistenceContext
    private static final EntityManagerFactory emFactory;

    private static final String PERSISTENCE_UNIT_NAME = "com.ing.students";

    static {
        emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    /**
     * Getter for EntityManager
     * @return EntityManager for the student
     */
    public static EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    /**
     * Inserts a student to a database.
     * @param student Student to insert
     */
    @Transactional
    public void insertStudent(StudentEntity student) {
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        try {
            entityManager.createNativeQuery("INSERT INTO students (username, firstname, lastname) VALUES (?,?,?)")
                    .setParameter(1, student.getUsername())
                    .setParameter(2, student.getFirstName())
                    .setParameter(3, student.getLastName())
                    .executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            entityManager.getTransaction().commit();
            entityManager.clear();
            entityManager.close();
        }

    }

}
