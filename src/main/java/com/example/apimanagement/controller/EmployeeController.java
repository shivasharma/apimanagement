package com.example.apimanagement.controller;


import com.example.apimanagement.entity.Employee;
import com.example.apimanagement.repository.EmployeeRepository;

import com.example.apimanagement.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")

public class EmployeeController {


    @Autowired
    EmployeeService employeeService ;

    @PostMapping("/save")
    public ResponseEntity<?> saveEmployee(@RequestBody  Employee employee
    ){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @PostMapping("/editEmployee/{id}")
    public ResponseEntity<?> editEmployee(@RequestBody Employee employee, @PathVariable Long id){
        return new ResponseEntity<>(employeeService.editEmployee(employee,id),HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<?> getAllEmployee(){
        return new ResponseEntity<>(employeeService.getAllEmployee(),HttpStatus.OK);

    }
    @GetMapping("/{id}")
    public ResponseEntity<?>getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);

    }
    @DeleteMapping ("/deleteEmployee/{id}")
    public ResponseEntity<?>deleteEmployee(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.deleteEmployee(id),HttpStatus.OK);

    }

}
