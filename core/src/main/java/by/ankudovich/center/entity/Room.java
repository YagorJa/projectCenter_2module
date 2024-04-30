package by.ankudovich.center.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(schema = "sportcenter", name = "room")
public class Room {
    @Id
    private Long id;
    private String name;
    private int number;
    private int maxHuman;
}
