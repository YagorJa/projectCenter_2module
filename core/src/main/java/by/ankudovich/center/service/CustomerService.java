package by.ankudovich.center.service;

import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.repository.config.CustomerRepositoryConfig;
import by.ankudovich.center.repository.interfaces.CustomerRepository;

public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService() {
        this.repository = new CustomerRepositoryConfig();
    }

    public void add(Customer customer) {
        repository.add(customer);
    }
}