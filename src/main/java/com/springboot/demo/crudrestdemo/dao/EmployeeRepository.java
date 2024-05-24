package com.springboot.demo.crudrestdemo.dao;

import com.springboot.demo.crudrestdemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
