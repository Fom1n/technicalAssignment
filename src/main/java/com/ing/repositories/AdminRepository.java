package com.ing.repositories;

import com.ing.entities.AdminEntity;
import com.ing.entities.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public class AdminRepository {

    @PersistenceContext
    private static final EntityManagerFactory emFactory;

    private static final String PERSISTENCE_UNIT_NAME = "com.ing.admins";

    static {
        emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    /**
     * Getter for EntityManager
     * @return EntityManager for the admins
     */
    public static EntityManager getEntityManager() {
        return emFactory.createEntityManager();
    }

    /**
     * Inserts an admin to a database.
     * @param admin Admin to insert
     */
    @Transactional
    public void insertAdmin(AdminEntity admin) {
        EntityManager entityManager = getEntityManager();
        entityManager.getTransaction().begin();
        try {
            entityManager.createNativeQuery("INSERT INTO admins (username, password) " +
                            "VALUES (?,?) " +
                            "ON CONFLICT ON CONSTRAINT admins_pkey DO NOTHING")
                    .setParameter(1, admin.getUsername())
                    .setParameter(2, admin.getPassword())
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
