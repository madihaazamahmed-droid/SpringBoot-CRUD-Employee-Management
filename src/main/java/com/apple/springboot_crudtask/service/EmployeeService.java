package com.apple.springboot_crudtask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apple.springboot_crudtask.dao.EmployeeDao;
import com.apple.springboot_crudtask.dto.Employee;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public String insertData(Employee employee) {
        return employeeDao.insertData(employee);
    }
}
