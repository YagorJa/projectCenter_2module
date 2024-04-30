package by.ankudovich.center;

//
//import by.ankudovich.center.config.hibernate.HibernateConfiguration;
//import by.ankudovich.center.entity.User;


import by.ankudovich.center.service.UserServiceI;

import by.ankudovich.center.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;
@Configuration
//@ComponentScan("by.ankudovich.center")
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
//
//        Customer customer = new Customer();
//        String date1 = "23/09/2010";
//        String date2 = "11/09/2001";
//        LocalDate localDate1 = LocalDate.parse(date1, formatter);
//        LocalDate localDate2 = LocalDate.parse(date2, formatter);
//        customer.setFirstVisitDate(localDate1);
//        customer.setLastVisitDate(localDate2);
//        String spentAmountStr = "1000.50";
//        BigDecimal spentAmount = new BigDecimal(spentAmountStr);
//        customer.setSpentAmount(spentAmount);
//        customer.setStatus(UserStatus.ACTIVE);
//        customerService.add(customer);

//        ApplicationContext ctx = new AnnotationConfigApplicationContext
//                (Main.class);
//        UserServiceI userService1 = ctx.getBean("userServiceI", UserServiceI.class);
//        List<User> users = userService1.allUsers();
//        users.forEach(System.out::println);
//        CategoryService categoryService = ctx.getBean("categoryService", CategoryService.class);
//        BrandService brandService = ctx.getBean("brandService", BrandService.class);

    }
}
