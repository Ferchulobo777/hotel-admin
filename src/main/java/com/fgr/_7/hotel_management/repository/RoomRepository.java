package com.fgr._7.hotel_management.repository;


import com.fgr._7.hotel_management.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}

