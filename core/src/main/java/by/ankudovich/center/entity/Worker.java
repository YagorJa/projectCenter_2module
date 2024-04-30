package by.ankudovich.center.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@Table(schema = "sportcenter", name = "workers")
@PrimaryKeyJoinColumn(name = "customer_worker_id")
public class Worker extends User{
    @Column(name = "first_work_day")
    private LocalDate firstWorkDay;
    private LocalDate dismissal;
    private String position;
    private BigDecimal salary;


}
