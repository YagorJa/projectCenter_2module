package by.ankudovich.center.repository.interfaces;

import by.ankudovich.center.entity.Room;

import java.util.List;

public interface RoomRepository {
    void save(Room room);

    List<Room> getAll();
}
