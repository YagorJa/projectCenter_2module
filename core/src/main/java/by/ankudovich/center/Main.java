package by.ankudovich.center;


import by.ankudovich.center.entity.Customer;
import by.ankudovich.center.entity.Employee;
import by.ankudovich.center.entity.User;
import by.ankudovich.center.entity.UserStatus;

import by.ankudovich.center.service.CustomerService;
import by.ankudovich.center.service.EmployeeService;
import by.ankudovich.center.service.UserService;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        CustomerService customerService = new CustomerService();
        EmployeeService employeeService = new EmployeeService();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        User user = new User();
        String date = "16/08/1995";
        LocalDate localDate = LocalDate.parse(date, formatter);
        user.setName("Erema");
        user.setSurname("Zhopov");
        user.setAddress("Lesnoy");
        user.setBirthday(localDate);
        userService.add(user);

        Customer customer = new Customer();
        String date1 = "23/09/2010";
        String date2 = "11/09/2001";
        LocalDate localDate1 = LocalDate.parse(date1, formatter);
        LocalDate localDate2 = LocalDate.parse(date2, formatter);
        customer.setFirstVisitDate(localDate1);
        customer.setLastVisitDate(localDate2);
        String spentAmountStr = "1000.50";
        BigDecimal spentAmount = new BigDecimal(spentAmountStr);
        customer.setSpentAmount(spentAmount);
        customer.setStatus(UserStatus.ACTIVE);
        customerService.add(customer);

        Employee employee = new Employee();
        String date3 = "16/12/2003";
        String date4 = "06/10/2005";
        LocalDate localDate3 = LocalDate.parse(date3, formatter);
        LocalDate localDate4 = LocalDate.parse(date4, formatter);
        employee.setFirstWorkDay(localDate3);
        employee.setDismissal(localDate4);
        employee.setPosition("builder");
        String spentAmountStr1 = "1100.70";
        BigDecimal spentAmount1 = new BigDecimal(spentAmountStr1);
        employee.setSalary(spentAmount1);
        employeeService.add(employee);
    }
}
