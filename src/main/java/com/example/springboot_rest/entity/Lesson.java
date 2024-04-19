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

    @Column(name="date")
    private LocalDate date;

    @Column(name="group_id ")
    private Long foreignGroupStudentId;

    @Column(name="tutor_id")
    private Long foreignTutorId;


    public Lesson(Long id, LocalDate date, Long foreignGroupStudentId, Long foreignTutorId) {
        this.id = id;
        this.date = date;
        this.foreignGroupStudentId = foreignGroupStudentId;
        this.foreignTutorId = foreignTutorId;

    }

    public Lesson() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getForeignGroupStudentId() {
        return foreignGroupStudentId;
    }

    public void setForeignGroupStudentId(Long foreignGroupStudentId) {
        this.foreignGroupStudentId = foreignGroupStudentId;
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
        return Objects.equals(id, lesson.id) && Objects.equals(date, lesson.date) && Objects.equals(foreignGroupStudentId, lesson.foreignGroupStudentId) && Objects.equals(foreignTutorId, lesson.foreignTutorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, foreignGroupStudentId, foreignTutorId);
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", date=" + date +
                ", foreignGroupStudentId=" + foreignGroupStudentId +
                ", foreignTutorId=" + foreignTutorId +
                '}';
    }
}
