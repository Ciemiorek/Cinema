package com.example.demoApp.repository;

import com.example.demoApp.domain.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room,Long> {
}
