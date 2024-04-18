package by.ankudovich.center.service;

import by.ankudovich.center.api.user.UserResponce;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.config.UserRepositoryConfig;
import by.ankudovich.center.repository.implement.ServiceRepositoryImpl;
import by.ankudovich.center.repository.interfaces.ServiceRepository;
import by.ankudovich.center.repository.interfaces.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserService  {
    @Autowired
    private UserRepository userRepository;
    public List<User> allUsers(){
        return  userRepository.findAll();
    }

}
