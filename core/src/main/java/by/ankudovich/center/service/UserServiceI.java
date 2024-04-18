package by.ankudovich.center.service;

import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceI implements by.ankudovich.center.service.interfaces.UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> allUsers(){
        return  userRepository.findAll();
    }

    @Override
    public User findUserById(long id) {
        return null;
    }

}
