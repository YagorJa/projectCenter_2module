package by.ankudovich.center.repository.implement;

import by.ankudovich.center.config.hibernate.HibernateConnection;
import by.ankudovich.center.entity.Employee;
import by.ankudovich.center.repository.interfaces.EmployeeRepository;
import jakarta.persistence.EntityManager;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public void add(Employee employee) {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
