package com.example.apimanagement.service;

import com.example.apimanagement.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(Long id);

    public String deleteEmployee(Long id);
    public Employee editEmployee(Employee product,Long id);
}
