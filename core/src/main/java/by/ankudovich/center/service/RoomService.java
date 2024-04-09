package by.ankudovich.center.service;

import by.ankudovich.center.entity.Room;
import by.ankudovich.center.repository.implement.RoomRepositoryImpl;
import by.ankudovich.center.repository.interfaces.RoomRepository;

import java.util.List;

public class RoomService {
    private final RoomRepository roomRepository = new RoomRepositoryImpl();

    public void addRoom(Room room) {
        roomRepository.save(room);
    }

    public List<Room> getAllRooms() {
        return roomRepository.getAll();
    }
}