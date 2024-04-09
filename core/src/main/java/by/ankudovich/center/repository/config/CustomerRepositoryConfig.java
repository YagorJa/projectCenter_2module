package by.ankudovich.center.repository.config;

import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.repository.interfaces.CustomerRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CustomerRepositoryConfig implements CustomerRepository {
    @Override
    public void add(Customer customer) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(customer);
            session.getTransaction().commit();
        }
    }
}