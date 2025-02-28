package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Booking;
import com.example.demo.Repository.BookingRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {
    private final BookingRepository bookingRepository;

    @PostMapping
    public Booking bookTicket(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    //@GetMapping("/{userEmail}")
    //public List<Booking> getUserBookings(@PathVariable String userEmail) {
      //  return bookingRepository.findByUserEmail(userEmail);
    //}
   
}

