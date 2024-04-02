package by.ankudovich.center;

import by.ankudovich.center.config.hibernate.HibernateJavaConfig;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.entity.UserStatus;
import by.ankudovich.center.repository.UserRepository;
import by.ankudovich.center.service.UserService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
            User user = new User();
            user.setId(null);
            user.setAge(4);
            user.setLaveAway(BigDecimal.valueOf(525));
            user.setLocalDate(LocalDate.now());
            user.setName("Moisha");
            user.setPhoneNumber("8 421 775 535");
            user.setStatus(UserStatus.ACTIVE);
            user.setSurname("Пряноок");

        userRepository.add(user);
//        UserService userService = new UserService();
      ////  User user = new User();
//        SessionFactory sessionFactory = HibernateJavaConfig.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        // Поиск клиента по id
//        Long clientId = 1L; // замените на id клиента, которого вы ищете
//        User user = session.get(User.class, clientId);
//
//        session.getTransaction().commit();
//        session.close();

    }
        public static void add(UserRepository userRepository) {
        }
}