package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Theatre;

public interface TheatreRepository extends JpaRepository<Theatre,Long> {

}
