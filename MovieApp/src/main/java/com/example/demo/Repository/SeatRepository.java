package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
	List<Seat> findByShowtimeId(Long showtimeId);

}
