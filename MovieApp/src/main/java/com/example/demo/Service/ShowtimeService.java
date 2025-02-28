package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Showtime;
import com.example.demo.Repository.ShowtimeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShowtimeService {
	@Autowired
	private ShowtimeRepository showtimeRepository;
	public List<Showtime> getShowtimesByMovieId(Long movieId){
		
		return showtimeRepository.findByMovieId(movieId);
	}
	public Showtime addShowtime(Showtime showtime) {
		return showtimeRepository.save(showtime);
	}

}
