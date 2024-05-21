package com.example.springboot_rest.service.interfaces;

import com.example.springboot_rest.entity.Lesson;

import java.util.List;

public interface LessonService {
       List<Lesson> getAllLessons();
       Lesson getLessonById(Long id);
       void saveLesson(Lesson lesson);
       void deleteLesson(Long id);

}
