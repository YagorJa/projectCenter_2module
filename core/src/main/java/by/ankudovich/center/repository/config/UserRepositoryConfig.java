package by.ankudovich.center.repository.config;

import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.interfaces.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class UserRepositoryConfig {

    @Autowired
    private SessionFactory sessionFactory;

    public void add(User user) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }


    public List<User> getAllUsers() {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM User", User.class).getResultList();
        }
    }


    public void delete(User user) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        }
    }
}