package com.example.springboot_rest.controller;
import com.example.springboot_rest.entity.Employee;
import com.example.springboot_rest.entity.Group;
import com.example.springboot_rest.entity.Student;
import com.example.springboot_rest.service.interfaces.EmployeeService;
import com.example.springboot_rest.service.interfaces.GroupService;
import com.example.springboot_rest.service.interfaces.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private GroupService groupService;

    @Autowired
    private StudentService studentService;


    //EMPLOYEE
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

    //GROUP
    @RequestMapping("/groups")
    public List<Group> showAllGroups(){
        List<Group> groupList = groupService.getAllGroups();
        return groupList;
    }

    @GetMapping("/groups/{id}")
    public Group getGroupById(@PathVariable int id) {
        Group group = groupService.getGroup(id);
        return group;
    }

    @PostMapping("/groups")
    public Group addNewGroup(@RequestBody Group group) {
           groupService.saveGroup(group);
           return group;
    }

    @PutMapping("/groups")
    @Transactional
    public Group updateGroup(@RequestBody Group group) {
        groupService.saveGroup(group);
        return group;
    }

    @DeleteMapping("/groups/{id}")
    @Transactional
    public String deleteGroup(@PathVariable int id) {
        groupService.deleteGroup(id);
        return "Group with ID = " +id + " was deleted";
    }


    //STUDENTS
    @GetMapping("/student")
    public List<Student> showAllStudents(){
        List<Student> studentList = studentService.getAllStudent();
        return studentList;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        return student;
    }

    @PostMapping("/student")
    public Student addNewStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student with "+ id+ " was deleted";
    }
}
