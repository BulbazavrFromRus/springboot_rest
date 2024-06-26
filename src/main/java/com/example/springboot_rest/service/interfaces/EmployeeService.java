package com.example.springboot_rest.service.interfaces;

import com.example.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String firstName);
}
