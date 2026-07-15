package com.apple.springboot_crudtask.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apple.springboot_crudtask.dto.Employee;
import com.apple.springboot_crudtask.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String insertData(Employee employee) {
        employeeRepository.save(employee);
        return "data inserted";
    }
}
