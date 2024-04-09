package by.ankudovich.center.service;

import by.ankudovich.center.api.user.UserResponce;
import by.ankudovich.center.entity.Service;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.repository.config.UserRepositoryConfig;
import by.ankudovich.center.repository.implement.ServiceRepositoryImpl;
import by.ankudovich.center.repository.interfaces.ServiceRepository;
import by.ankudovich.center.repository.interfaces.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class UserService {
    private UserRepository repository;
    private final ServiceRepository serviceRepository = new ServiceRepositoryImpl();

    public UserService() {
        this.repository = new UserRepositoryConfig();
    }

    public void add(User user) {
        repository.add(user);
    }

    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }

    public void delete(User user) {
        repository.delete(user);
    }

    public void addService(Service service) {
        serviceRepository.save(service);
    }

    public List<Service> getAllServices() {
        return serviceRepository.getAll();
    }
}
