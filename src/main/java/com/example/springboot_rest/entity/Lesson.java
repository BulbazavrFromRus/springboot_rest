package com.example.springboot_rest.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="lessons")
public class Lesson {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="lesson_name")
    private String name;


    @Column(name="lesson_date")
    private LocalDate date;


    @Column(name="tutor_id")
    private Long foreignTutorId;


    public Lesson(Long id,String name,  LocalDate date, Long foreignTutorId) {
        this.id = id;
        this.date = date;
        this.foreignTutorId = foreignTutorId;
        this.name=name;
    }

    public Lesson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public Long getForeignTutorId() {
        return foreignTutorId;
    }

    public void setForeignTutorId(Long foreignTutorId) {
        this.foreignTutorId = foreignTutorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lesson lesson = (Lesson) o;
        return Objects.equals(id, lesson.id) && Objects.equals(name, lesson.name) && Objects.equals(date, lesson.date) && Objects.equals(foreignTutorId, lesson.foreignTutorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, foreignTutorId);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                "name" + name +
                ", date=" + date +
                ", foreignTutorId=" + foreignTutorId +
                '}';
    }
}
