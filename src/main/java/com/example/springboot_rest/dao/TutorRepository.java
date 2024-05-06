package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
}
