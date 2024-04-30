package by.ankudovich.center.repository_interf;

import by.ankudovich.center.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
