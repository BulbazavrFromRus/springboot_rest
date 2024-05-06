package com.example.springboot_rest.service.classs;

import com.example.springboot_rest.dao.TutorRepository;
import com.example.springboot_rest.entity.Tutor;
import com.example.springboot_rest.service.interfaces.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorServiceImpl implements TutorService {
    
    @Autowired
    TutorRepository tutorRepository;
    
    @Override
    public List<Tutor> getAllTutors() {
        return tutorRepository.findAll();
    }

    @Override
    public Tutor getTutorById(long id) {
        Optional<Tutor> tutor  = tutorRepository.findById(id);
        return tutor.orElse(null);
    }

    @Override
    public Tutor saveTutor(Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    @Override
    public void deleteTutor(long id) {
        tutorRepository.deleteById(id);
    }
}
