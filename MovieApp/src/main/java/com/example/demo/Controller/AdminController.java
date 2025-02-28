package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Movie;
import com.example.demo.Service.MovieService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	public MovieService movieService;
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieService.addMovie(movie);
	}
	@GetMapping("/movies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}

}
