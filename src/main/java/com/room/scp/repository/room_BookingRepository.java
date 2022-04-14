package com.room.scp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.room.scp.entity.room_Booking;

@Repository
public interface room_BookingRepository extends JpaRepository<room_Booking, Long>{

}
