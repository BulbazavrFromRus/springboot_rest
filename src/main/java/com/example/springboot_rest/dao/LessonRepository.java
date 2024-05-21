package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
       List<Lesson> findLessonByName(String name);
}
