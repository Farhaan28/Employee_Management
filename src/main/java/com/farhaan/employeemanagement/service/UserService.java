package com.farhaan.employeemanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.farhaan.employeemanagement.dto.UserRegistrationDto;
import com.farhaan.employeemanagement.model.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
