package com.example.demoswagger.service;

import com.example.demoswagger.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student getStudentByName(String name);

    List<Student> getStudentByClass(String className);

    List<Student> getStudentByCountry(String country);
}
