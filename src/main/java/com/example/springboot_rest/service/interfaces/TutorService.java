package com.example.springboot_rest.service.interfaces;

import com.example.springboot_rest.dao.TutorRepository;
import com.example.springboot_rest.entity.Tutor;

import java.util.List;

public interface TutorService {
    public List<Tutor> getAllTutors();
    public Tutor getTutorById(long id);
    public Tutor saveTutor(Tutor tutor);
    public void deleteTutor(long id);
}
