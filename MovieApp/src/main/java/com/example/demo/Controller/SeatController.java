package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Seat;
import com.example.demo.Service.SeatService;

@RestController
@RequestMapping("/api/seats")
public class SeatController {
	@Autowired
	private SeatService seatService;
	@GetMapping("/showtime/{showtimeId}")
	public List<Seat> getSeatsByShowtimeId(@PathVariable Long showtimeId){
		return seatService.getSeatsByShowtimeId(showtimeId);
	}
	@PostMapping
	public Seat addSeat(@RequestBody Seat seat) {
		return seatService.addSeat(seat);
	}

}
