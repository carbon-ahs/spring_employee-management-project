package com.axiagroups.employeemanagementproject.controller;

import org.springframework.web.bind.annotation.RestController;

import com.axiagroups.employeemanagementproject.model.Employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmployeeController {
    @GetMapping("employees")
    public List<Employee> getEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        return employeeList;
    }
    
}
