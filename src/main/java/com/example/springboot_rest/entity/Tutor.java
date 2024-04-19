package com.example.springboot_rest.entity;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name="tutors")
public class Tutor {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="tutor_name")
    private String nameTutor;

    public Tutor(long id, String nameTutor) {
        this.id = id;
        this.nameTutor = nameTutor;
    }

    public Tutor(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameTutor() {
        return nameTutor;
    }

    public void setNameTutor(String nameTutor) {
        this.nameTutor = nameTutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tutor tutor = (Tutor) o;
        return id == tutor.id && Objects.equals(nameTutor, tutor.nameTutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameTutor);
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "id=" + id +
                ", nameTutor='" + nameTutor + '\'' +
                '}';
    }
}
