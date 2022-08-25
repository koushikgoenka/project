package com.example.ordermanagementsystem.controller;

import com.example.ordermanagementsystem.model1.Instructor;
import com.example.ordermanagementsystem.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/instructor")
public class InstructorController {

    @Autowired
    private InstructorRepository instructorRepository;

    @PostMapping
    public Instructor createInstructor(@RequestBody Instructor instructor){
        return instructorRepository.save(instructor);
    }
}
