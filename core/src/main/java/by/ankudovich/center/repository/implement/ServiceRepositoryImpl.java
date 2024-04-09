package by.ankudovich.center.repository.implement;


import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.Service;
import by.ankudovich.center.repository.interfaces.ServiceRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ServiceRepositoryImpl implements ServiceRepository {
    @Override
    public void save(Service service) {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.saveOrUpdate(service);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
    }

    @Override
    public List<Service> getAll() {
        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            Query<Service> query = session.createQuery("FROM Service", Service.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            sessionFactory.close();
        }
    }
}
