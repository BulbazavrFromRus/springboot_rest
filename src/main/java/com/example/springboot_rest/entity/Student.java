package com.example.springboot_rest.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="students")
public class Student{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String name;

    @Column(name="last_name")
    private String lastName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="group_id")
    private long foreignGroupId;

    @Column(name="status")
    private String status;

    public Student(long id, String name, String lastName, String middleName, long foreignGroupId, String status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.foreignGroupId = foreignGroupId;
        this.status = status;
    }

    public Student(String name, String lastName, String middleName, long foreignGroupId, String status) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.foreignGroupId = foreignGroupId;
        this.status = status;
    }

    public Student(){}


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public long getForeignGroupId() {
        return foreignGroupId;
    }

    public void setForeignGroupId(long foreignGroupId) {
        this.foreignGroupId = foreignGroupId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && foreignGroupId == student.foreignGroupId && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName) && Objects.equals(middleName, student.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, middleName, foreignGroupId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", foreignGroupId=" + foreignGroupId +
                ", status="+ status+
                '}';
    }
}

