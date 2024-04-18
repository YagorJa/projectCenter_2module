package by.ankudovich.center.repository.config;

import by.ankudovich.center.config.hibernate.HibernateConnection;
import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.interfaces.UserRepository;
import jakarta.persistence.EntityManager;
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
import by.ankudovich.center.enums.UserStatus;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class UserRepositoryConfig {

    public void editStatus(UserStatus status){
        EntityManager entityManager = HibernateConnection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("update from User u set u.status = :status ");
    }

    public void delete(User user){
        EntityManager entityManager = HibernateConnection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void add(User user){

        EntityManager entityManager = HibernateConnection.getEntityManager();
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            throw new RuntimeException(e);
        }

    }

    public List<User> all(){
        EntityManager entityManager = HibernateConnection.getEntityManager();
        List<User> list = entityManager.createQuery("select u from User u").getResultList();
        entityManager.close();
        return list;
    }
}