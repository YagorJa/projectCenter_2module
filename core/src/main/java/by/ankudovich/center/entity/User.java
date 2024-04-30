package by.ankudovich.center.entity;

import by.ankudovich.center.enums.UserStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "sportcenter", name = "users")
public class   User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private LocalDate birthday;
    //    private int age;
//    @Column(name = "phone_number")
//    private String phoneNumber;
//    @Column(name = "last_visit")
//    private LocalDate lastVisit;
    private UserStatus status;
//    private BigDecimal summ;


}