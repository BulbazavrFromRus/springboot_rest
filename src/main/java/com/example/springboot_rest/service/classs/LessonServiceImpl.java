package com.example.springboot_rest.service.classs;

import com.example.springboot_rest.dao.LessonRepository;
import com.example.springboot_rest.entity.Group;
import com.example.springboot_rest.entity.Lesson;
import com.example.springboot_rest.service.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonRepository lessonRepository;

    @Override
    public List<Lesson> getAllLessons() {
        List<Lesson> lessons = lessonRepository.findAll();
        return lessons;
    }

    @Override
    public Lesson getLessonById(Long id) {
       Optional<Lesson> lesson = lessonRepository.findById(id);
       return lesson.orElse(null);
    }

    @Override
    public void saveLesson(Lesson lesson) {
      List<Lesson> lessonList= lessonRepository.findLessonByName(lesson.getName());
      if(lessonList.isEmpty()){
          lessonRepository.save(lesson);
      }
    }

    @Override
    public void deleteLesson(Long id) {
       lessonRepository.deleteById(id);
    }
}
