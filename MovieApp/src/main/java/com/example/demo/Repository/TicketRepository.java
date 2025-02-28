package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

	List<Ticket> findByUserId(Long userId);

}
