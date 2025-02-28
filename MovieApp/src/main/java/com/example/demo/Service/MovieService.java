package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Movie;
import com.example.demo.Repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
	@Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    public Optional<Movie> getMovieById(Long id) {
    	return movieRepository.findById(id);
    }
}

