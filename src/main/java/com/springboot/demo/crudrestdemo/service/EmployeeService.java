package com.springboot.demo.crudrestdemo.service;

import com.springboot.demo.crudrestdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee findEmployeeById(int id);

    Employee saveEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
