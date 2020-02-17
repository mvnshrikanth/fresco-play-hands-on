package com.example.demo.employee;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployees() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Sandhya", 20, 0));
        employeeArrayList.add(new Employee("Kemp", 24, 2));
        employeeArrayList.add(new Employee("Anil", 22, 3));
        employeeArrayList.add(new Employee("Kumar", 30, 6));
        employeeArrayList.add(new Employee("Tim", 32, 7));
        Collections.sort(employeeArrayList);
        return employeeArrayList;
    }


}
