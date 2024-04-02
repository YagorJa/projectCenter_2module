package by.ankudovich.center.repository;

import by.ankudovich.center.api.user.UserResponce;
import by.ankudovich.center.config.hibernate.HibernateConnection;
import by.ankudovich.center.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import by.ankudovich.center.config.hibernate.HibernateJavaConfig;

public class UserRepository {
    public UserResponce userResponse;

    public void add(User user) {
        EntityTransaction transaction = null;
//        try {
            EntityManager entityManager = HibernateConnection.getEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();


            entityManager.persist(user);


            transaction.commit();
//        } catch (Exception e) {
//
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        }
    }
}
