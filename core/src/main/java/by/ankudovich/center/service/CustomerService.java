package by.ankudovich.center.service;

import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.repository.config.CustomerRepositoryConfig;
import by.ankudovich.center.repository.interfaces.CustomerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void add(Customer customer) {
        customer.setFirstVisitDate(LocalDate.now());
        customerRepository.save(customer);
    }
}