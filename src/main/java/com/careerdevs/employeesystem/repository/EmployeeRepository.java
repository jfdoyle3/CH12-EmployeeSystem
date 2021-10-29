package com.careerdevs.employeesystem.repository;

import com.careerdevs.employeesystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
