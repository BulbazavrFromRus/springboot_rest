package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//We don't use @Repository because EmployeeRepository extends JpaRepository
//and Spring understand it
//we can write @Repository but it isn't necessary
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
