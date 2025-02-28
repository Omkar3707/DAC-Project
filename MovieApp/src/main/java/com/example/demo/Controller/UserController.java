package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

import lombok.RequiredArgsConstructor;
@CrossOrigin
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.registerUser(user);
	}
	@GetMapping("/{username}")
	public User getUser(@PathVariable String username) {
		return userService.findByUsername(username);
	}
	 @PostMapping("/login")
	    public ResponseEntity<User> login(@RequestBody User user) {
	        User foundUser = userService.findByEmailAndPassword(user.getEmail(), user.getPassword());
	        return (foundUser != null) ? ResponseEntity.ok(foundUser) : ResponseEntity.status(401).build();
	    }

}
