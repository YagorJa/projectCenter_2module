package by.ankudovich.center.repository.implement;

import by.ankudovich.center.config.hibernate.HibernateConnection;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.interfaces.UserRepository;
import jakarta.persistence.EntityManager;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public void add(User user) {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<User> getAllUsers() {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        List<User> users = entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
        entityManager.close();
        return users;
    }

    @Override
    public void delete(User user) {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
