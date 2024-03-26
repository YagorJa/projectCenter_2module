package by.ankudovich.center.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Data
public class User {
    @Id
    private long id;
    private  String name;
    private String surname;
    private  int age;
    @Column(name = "phone_number")
    private  String phoneNumber;
    @Column(name = "local_date")
    private LocalDate localDate;
    @Enumerated(EnumType.STRING)
    private  UserStatus status;
    @Column(name = "lave_Away")
    private BigDecimal laveAway;

    public User(long id, String name, String surname,
                int age, String phoneNumber,
                LocalDate localDate, UserStatus status,
                BigDecimal laveAway) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.localDate = localDate;
        this.status = status;
        this.laveAway = laveAway;
    }
}

