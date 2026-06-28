package com.jpaexample.demo.controller;


import com.jpaexample.demo.model.Student;
import com.jpaexample.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;


    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return  studentRepository.save(student);
    }

}
