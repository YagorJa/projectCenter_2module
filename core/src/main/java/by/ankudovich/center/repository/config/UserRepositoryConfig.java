package by.ankudovich.center.repository.config;

import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.interfaces.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserRepositoryConfig implements UserRepository {
    @Override
    public void add(User user) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }

    @Override
    public List<User> getAllUsers() {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM User", User.class).getResultList();
        }
    }

    @Override
    public void delete(User user) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }
    }
}