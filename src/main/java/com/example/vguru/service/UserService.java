package com.example.vguru.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.vguru.controller.dto.UserRegistrationDto;
import com.example.vguru.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	
}
