package com.apple.springboot_crudtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apple.springboot_crudtask.dto.Employee;
import com.apple.springboot_crudtask.repository.EmployeeRepository;
import com.apple.springboot_crudtask.service.EmployeeService;

@RestController
@RequestMapping("/students")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public String insertData(@RequestBody Employee employee)
    { 
        return employeeService.insertData(employee);
    }
}
