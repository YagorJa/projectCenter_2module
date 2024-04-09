package by.ankudovich.center.repository.implement;

import by.ankudovich.center.config.hibernate.HibernateConnection;
import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.repository.interfaces.CustomerRepository;
import jakarta.persistence.EntityManager;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public void add(Customer customer) {
        EntityManager entityManager = HibernateConnection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(customer);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
