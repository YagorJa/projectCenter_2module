package by.ankudovich.center.repository;

import by.ankudovich.center.api.service.ServiceResponse;
import by.ankudovich.center.config.hibernate.HibernateConnection;
import by.ankudovich.center.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ServiceRepostirory {
    public ServiceResponse serviceResponce;

    public void add(User user) {
        EntityTransaction transaction = null;

        EntityManager entityManager = HibernateConnection.getEntityManager();
        transaction = entityManager.getTransaction();
        transaction.begin();


        entityManager.persist(user);


        transaction.commit();

    }
}
