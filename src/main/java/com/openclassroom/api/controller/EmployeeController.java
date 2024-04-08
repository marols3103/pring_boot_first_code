package com.openclassroom.api.controller;

import com.openclassroom.api.model.Employee;
import com.openclassroom.api.service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmplyeeService employeeService;

    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployee();
    }
}
