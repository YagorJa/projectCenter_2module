package by.ankudovich.center.repository.interfaces;

import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findByNameAndSurnameAndAddress(String name, String surname, String address);
}