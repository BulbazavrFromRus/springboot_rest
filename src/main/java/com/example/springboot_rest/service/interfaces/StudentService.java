package com.example.springboot_rest.service.interfaces;

import com.example.springboot_rest.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public Student getStudentById(long id);
    public Student saveStudent(Student student);
    public void deleteStudent(long id);
}
