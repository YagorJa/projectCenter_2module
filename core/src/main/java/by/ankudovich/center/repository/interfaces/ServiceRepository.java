package by.ankudovich.center.repository.interfaces;

import by.ankudovich.center.entity.Service;

import java.util.List;

public interface ServiceRepository {
    void save(Service service);

    List<Service> getAll();
}
