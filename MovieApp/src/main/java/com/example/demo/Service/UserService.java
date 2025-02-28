package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Ticket;
import com.example.demo.Entity.User;
import com.example.demo.Repository.TicketRepository;
import com.example.demo.Repository.UserRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserService {
	
@Autowired
private UserRepository userRepository;
private TicketRepository ticketRepository;
public User registerUser(User user) {
	return userRepository.save(user);
	
}
public User findByUsername(String username) {
	return userRepository.findByUsername(username);
}
public List<Ticket> getBookingHistory(Long userId) {
    return ticketRepository.findByUserId(userId);
}
public User findByEmailAndPassword(String email, String password) {
    return userRepository.findByEmailAndPassword(email, password);
}
}
