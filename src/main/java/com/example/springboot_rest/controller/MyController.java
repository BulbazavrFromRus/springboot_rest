package com.example.springboot_rest.controller;
import com.example.springboot_rest.dao.TutorRepository;
import com.example.springboot_rest.entity.*;
import com.example.springboot_rest.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
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

    @Autowired
    private TutorService tutorService;

    @Autowired
    private LessonService lessonService;


    //HOME PAGE
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("title", "Main page");
        return "gora";
    }


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

    @DeleteMapping("/groups/name/{name}")
    @Transactional
    public String deleteGroupByName(@PathVariable String name){
          groupService.deleteGroupByName(name);
          return "Group with name = " +name + " was deleted";
    }

    //STUDENTS
    @GetMapping("/students")
    public List<Student> showAllStudents(){
        List<Student> studentList = studentService.getAllStudent();
        return studentList;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        return student;
    }

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student with "+ id+ " was deleted";
    }

    //Tutor
    @GetMapping("/tutors")
    public List<Tutor> showAllTutors(){
       return tutorService.getAllTutors();
    }

    @GetMapping("/tutors/{id}")
    public Tutor getTutorById(@PathVariable int id) {
        Tutor tutor = tutorService.getTutorById(id);
        return tutor;
    }

    @PostMapping("/tutors")
    public Tutor addNewTutor(@RequestBody Tutor tutor) {
       return tutorService.saveTutor(tutor);
    }

    @PutMapping("/tutors")
    public Tutor updateTutor(@RequestBody Tutor tutor) {
        return tutorService.saveTutor(tutor);
    }

    @DeleteMapping("/tutors/{id}")
    public String deleteTutor(@PathVariable int id) {
        tutorService.deleteTutor(id);
       return  "Tutor with ID = " +id + " was deleted";
    }

    //LESSON
    @GetMapping("/lessons")
    public List<Lesson> showAllLessons(){
        return lessonService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    public Lesson getLessonById(@PathVariable long id) {
        Lesson lesson = lessonService.getLessonById(id);
        return lesson;
    }

    @PostMapping("/lessons")
    public void addNewTutor(@RequestBody Lesson lesson) {
         lessonService.saveLesson(lesson);
    }

    @PutMapping("/lessons")
    public void updateTutor(@RequestBody Lesson lesson) {
         lessonService.saveLesson(lesson);
    }

    @DeleteMapping("/lessons/{id}")
    public String deleteLesson(@PathVariable long id) {
        lessonService.deleteLesson(id);
        return  "Lesson with ID = " +id + " was deleted";
    }


}
