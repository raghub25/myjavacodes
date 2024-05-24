package com.springboot.demo.crudrestdemo.rest;

import com.springboot.demo.crudrestdemo.exception.EmployeeNotFoundException;
import com.springboot.demo.crudrestdemo.model.Employee;
import com.springboot.demo.crudrestdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        if (employeeId <= 0) {
            throw new EmployeeNotFoundException("Employee id should be more than zero");
        }
        Employee employee = employeeService.findEmployeeById(employeeId);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee with id " + employeeId + " not found");
        }
        return employee;
    }

    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
       Employee savedEmployee = employeeService.saveEmployee(employee);
       return "Employee added successfully with id " + savedEmployee.getId();
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
        if (employeeId <= 0) {
            throw new EmployeeNotFoundException("Employee id should be more than zero");
        }
        Employee employee = employeeService.findEmployeeById(employeeId);
        if (employee == null) {
            throw new EmployeeNotFoundException("Employee with id " + employeeId + " not found");
        }
        employeeService.deleteEmployeeById(employeeId);
    }
}
