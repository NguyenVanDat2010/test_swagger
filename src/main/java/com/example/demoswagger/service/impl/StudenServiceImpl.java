package com.example.demoswagger.service.impl;

import com.example.demoswagger.mapper.StudentMapper;
import com.example.demoswagger.model.Student;
import com.example.demoswagger.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public Student getStudentByName(String name) {
        return studentMapper.getStudentByName(name);
    }

    @Override
    public List<Student> getStudentByClass(String className) {
        return studentMapper.getStudentByClass(className);
    }

    @Override
    public List<Student> getStudentByCountry(String country) {
        return studentMapper.getStudentByCountry(country);
    }
}
