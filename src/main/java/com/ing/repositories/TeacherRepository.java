package com.ing.repositories;

import com.ing.entities.AdminEntity;
import com.ing.entities.StudentEntity;
import com.ing.entities.TeacherEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class TeacherRepository {

    @PersistenceContext
    private static final EntityManagerFactory emFactory;

    private static final String PERSISTENCE_UNIT_NAME = "com.ing.teachers";

    static {
        emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    /**
     * Getter for EntityManager
     * @return EntityManager for the teacher persistence unit
     */
    public static EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    /**
     * Inserts a teacher to a database.
     * @param teacher Teacher to insert
     */
    @Transactional
    public void insertTeacher(TeacherEntity teacher) {
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        try {
            entityManager.createNativeQuery("INSERT INTO teachers (username, firstname, lastname, password) " +
                            "VALUES (?,?,?,?) " +
                            "ON CONFLICT ON CONSTRAINT teachers_pkey DO NOTHING")
                    .setParameter(1, teacher.getUsername())
                    .setParameter(2, teacher.getFirstName())
                    .setParameter(3, teacher.getLastName())
                    .setParameter(4, teacher.getPassword())
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
