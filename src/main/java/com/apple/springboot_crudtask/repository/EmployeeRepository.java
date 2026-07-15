package com.apple.springboot_crudtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apple.springboot_crudtask.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
