package com.example.realestate.repository;

import com.example.realestate.model.Booking;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {



	List<Booking> findTop5ByOrderByBookingDateDesc();

	
}
