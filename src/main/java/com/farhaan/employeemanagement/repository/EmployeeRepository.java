package com.farhaan.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farhaan.employeemanagement.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
