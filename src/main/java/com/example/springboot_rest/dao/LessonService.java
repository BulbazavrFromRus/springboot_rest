package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonService extends JpaRepository<Lesson, Long> {

}
