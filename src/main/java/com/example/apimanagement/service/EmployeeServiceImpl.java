package com.example.apimanagement.service;

import com.example.apimanagement.entity.Employee;
import com.example.apimanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

       @Override
    public List<Employee> getAllEmployee() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public String deleteEmployee(Long id) {
         Employee employee=employeeRepository.findById(id).get();
        if(employee !=null){
            employeeRepository.delete(employee);
            return "Employee Deleted Successfully";
        }
        return "Error deleting Employee";
    }

    @Override
    public Employee editEmployee(Employee employee, Long id) {
        Employee oldEmployee=employeeRepository.findById(id).get();
        oldEmployee.setfirstname(employee.getfirstname());
        oldEmployee.setlastname(employee.getlastname());
        oldEmployee.setemail(employee.getemail());
        return  employeeRepository.save(oldEmployee);
    }
}
