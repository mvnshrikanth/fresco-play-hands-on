package com.example.demo.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/")
    public List<Employee> getEmpList() {
        return employeeService.getEmployees();
    }

}
