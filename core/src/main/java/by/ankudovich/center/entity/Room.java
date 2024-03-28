package by.ankudovich.center.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "rooms")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "status")
    private String status;

    @Column(name = "cost_per_hour")
    private BigDecimal costPerHour;

    public Room(Long id, String name, String number, Integer capacity, String status, BigDecimal costPerHour) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.capacity = capacity;
        this.status = status;
        this.costPerHour = costPerHour;
    }

    public Room() {
    }
}

