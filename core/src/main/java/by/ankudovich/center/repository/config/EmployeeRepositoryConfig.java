package by.ankudovich.center.repository.config;

import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.Employee;
import by.ankudovich.center.repository.interfaces.EmployeeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeRepositoryConfig implements EmployeeRepository {
    @Override
    public void add(Employee employee) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
    }
}