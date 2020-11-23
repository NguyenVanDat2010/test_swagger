package com.example.demoswagger.mapper;

import com.example.demoswagger.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface StudentMapper {
    List<Student> getAll();

    Student getStudentByName(@Param("name") String name);

    List<Student> getStudentByClass(@Param("className") String className);

    List<Student> getStudentByCountry(@Param("country") String country);
}
