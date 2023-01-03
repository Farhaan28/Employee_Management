package com.farhaan.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farhaan.employeemanagement.model.User;



public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
