package by.ankudovich.center.repository.interfaces;

import by.ankudovich.center.entity.User;

import java.util.List;

public interface UserRepository {
    void add(User user);

    List<User> getAllUsers();

    void delete(User user);
}