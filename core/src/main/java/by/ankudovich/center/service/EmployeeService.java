package by.ankudovich.center.service;

import by.ankudovich.center.entity.Employee;
import by.ankudovich.center.repository.config.EmployeeRepositoryConfig;
import by.ankudovich.center.repository.interfaces.EmployeeRepository;

public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService() {
        this.repository = new EmployeeRepositoryConfig();
    }

    public void add(Employee employee) {
        repository.add(employee);
    }
}
