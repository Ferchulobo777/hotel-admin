package com.fgr._7.hotel_management.repository;

import com.fgr._7.hotel_management.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
