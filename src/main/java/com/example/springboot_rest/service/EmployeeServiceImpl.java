package com.example.springboot_rest.service;
import com.example.springboot_rest.dao.EmployeeRepository;
import com.example.springboot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    //@Transactional
    public List<Employee> getAllEmployees() {
        //The JpaRepository include this method
        //when we extended EmployeeRepository
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
         employeeRepository.save(employee);
    }


    @Override
    public Employee getEmployee(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        return employee.orElse(null);
    }


    @Override
    public void deleteEmployee(int id) {
         employeeRepository.deleteById(id);
    }


    @Override
    public List<Employee> findAllByName(String firstName) {
        //List<Employee> employeeList = employeeRepository.findAllByName("Oleg");
        List<Employee> employeeList = employeeRepository.findAllByName(firstName);
        return employeeList;
    }
}
