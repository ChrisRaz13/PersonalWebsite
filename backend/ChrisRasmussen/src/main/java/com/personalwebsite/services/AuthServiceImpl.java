package com.personalwebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.personalwebsite.entities.User;
import com.personalwebsite.repositories.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository userRepo;

	@Override
	public User register(User user) {
//		String encryptedPassword = passwordEncoder.encode(user.getPassword());
//		user.setPassword(encryptedPassword);
//		user.setEnabled(true);
//		user.setRole("standard");
		user = userRepo.saveAndFlush(user); // save to DB
		return user; // return user
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepo.findByUsername(username);
	}
}
