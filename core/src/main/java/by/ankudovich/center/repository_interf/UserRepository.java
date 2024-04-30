package by.ankudovich.center.repository_interf;

import by.ankudovich.center.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByNameAndSurname(String name, String surname);

}