package by.ankudovich.center.service.interfaces;

import by.ankudovich.center.entity.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    User findUserById(long id);
}
