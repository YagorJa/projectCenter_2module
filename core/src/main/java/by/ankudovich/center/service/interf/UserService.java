package by.ankudovich.center.service.interf;
import by.ankudovich.center.entity.User;

import java.util.List;

public interface UserService {

    List<User> allUsers();
    User findUserById(int id);

}