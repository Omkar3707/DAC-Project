package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Seat;
import com.example.demo.Repository.SeatRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SeatService {
	@Autowired
	private SeatRepository seatRepository;
	public List<Seat> getSeatsByShowtimeId(Long showtimeId){
		return seatRepository.findByShowtimeId(showtimeId);
	}
	public Seat addSeat(Seat seat) {
		return seatRepository.save(seat);
	}

}
