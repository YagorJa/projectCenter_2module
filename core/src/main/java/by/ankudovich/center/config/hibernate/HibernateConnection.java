package by.ankudovich.center.config.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateConnection {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("UserOk");


    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
//    public static void closeEntityManagerFactory() {
//        emf.close();
//    }
}
