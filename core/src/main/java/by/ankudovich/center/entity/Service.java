package by.ankudovich.center.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(schema = "sportcenter", name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int cost;

}
