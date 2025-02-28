package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Showtime;
import com.example.demo.Service.ShowtimeService;
@CrossOrigin
@RestController
@RequestMapping("/api/showtimes")
public class ShowtimeController {
	@Autowired
	private ShowtimeService showtimeService;
	@GetMapping("/movie/{id}")
	public List<Showtime> getShowtimesByMovieId(@PathVariable Long movieId){
		return showtimeService.getShowtimesByMovieId(movieId);
	}
	@PostMapping
	public Showtime addShowtime(@RequestBody Showtime showtime) {
		return showtimeService.addShowtime(showtime);
	}

}
