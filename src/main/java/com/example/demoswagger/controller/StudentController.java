package com.example.demoswagger.controller;

import com.example.demoswagger.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "StudentController", description = "REST Apis related to Student Entity!!!!")
@RestController
//@RequestMapping("/swagger2-demo")
public class StudentController {
    List<Student> students = new ArrayList<Student>();
    {
        students.add(new Student(1L,"Sajal", "IV", "India"));
        students.add(new Student(2L,"Lokesh", "V", "India"));
        students.add(new Student(3L,"Kajal", "III", "USA"));
        students.add(new Student(4L,"Sukesh", "VI", "USA"));
    }

    @ApiOperation(value = "Get list of the system", response = Iterable.class, tags = "getStudents")
    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!!!"),
            @ApiResponse(code = 404, message = "Not found!!!")})
    @RequestMapping(value = "/getStudents")
    public List<Student> getStudents() {
        return students;
    }

    @ApiOperation(value="Get specific Student in the System", response = Student.class, tags = "getStudent")
    @RequestMapping(value = "/getStudent/{name}")
    public Student getStudent(@PathVariable(value = "name") String name) {
        return students.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Get specific Student By Country in the System ", response = Student.class, tags = "getStudentByCountry")
    @RequestMapping(value = "/getStudentByCountry/{country}")
    public List<Student> getStudentByCountry(@PathVariable(value = "country") String country) {
        System.out.println("Searching Student in country : " + country);
        List<Student> studentsByCountry = students.stream().filter(x -> x.getCountry().equalsIgnoreCase(country))
                .collect(Collectors.toList());
        System.out.println(studentsByCountry);
        return studentsByCountry;
    }

     @ApiOperation(value = "Get specific Student By Class in the System ",response = Student.class,tags="getStudentByClass")
    @RequestMapping(value = "/getStudentByClass/{cls}")
    public List<Student> getStudentByClass(@PathVariable(value = "cls") String cls) {
        return students.stream().filter(x -> x.getCls().equalsIgnoreCase(cls)).collect(Collectors.toList());
    }
}
