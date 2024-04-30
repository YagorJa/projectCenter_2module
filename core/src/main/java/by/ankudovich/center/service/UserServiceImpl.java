package by.ankudovich.center.service;

import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository_interf.UserRepository;
import by.ankudovich.center.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int id) {
        return null;

    }
}
