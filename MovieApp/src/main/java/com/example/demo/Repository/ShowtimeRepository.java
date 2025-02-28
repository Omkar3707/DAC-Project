package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Showtime;

public interface ShowtimeRepository extends JpaRepository<Showtime, Long> {
	List<Showtime> findByMovieId(Long movieId);

}
