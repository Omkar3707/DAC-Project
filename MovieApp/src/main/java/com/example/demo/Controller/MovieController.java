package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Movie;
import com.example.demo.Service.MovieService;

import lombok.RequiredArgsConstructor;
@CrossOrigin
@RestController
@RequestMapping("/api/grf")
@RequiredArgsConstructor
public class MovieController {
	@Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
    @GetMapping("/movies/{id}")
    public Optional<Movie> getById(@PathVariable("id") Long id) {
    	return movieService.getMovieById(id);
    }
}

