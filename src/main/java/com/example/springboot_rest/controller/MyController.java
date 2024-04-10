package com.example.springboot_rest.controller;
import com.example.springboot_rest.entity.Employee;
import com.example.springboot_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping( value = "/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee(@RequestBody  Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @PutMapping("/employees")
    @Transactional
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    @Transactional
    public String deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return "Employee with ID = " +id + " was deleted";

    }

    @GetMapping("/employees/name/{name}")
    public List<Employee> getAllEmployeesByName(@PathVariable String name){
        List<Employee> employeeList = employeeService.findAllByName(name);
        return employeeList;
    }

}
