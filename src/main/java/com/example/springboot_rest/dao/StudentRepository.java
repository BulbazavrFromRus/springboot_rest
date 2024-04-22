package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    public List<Student> findByName(String name);
    public List<Student> findByLastName(String surname);
    public List<Student> findByMiddleName(String middleName);
}
