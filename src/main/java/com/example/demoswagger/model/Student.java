package com.example.demoswagger.model;

import io.swagger.annotations.ApiModelProperty;

public class Student {
    @ApiModelProperty(notes = "Id of the student", name = "id", required = true, value = "test id")
    private Long id;

    @ApiModelProperty(notes = "Name of the Student",name="name",required=true,value="test name")
    private String name;

    @ApiModelProperty(notes = "Class of the Student",name="cls",required=true,value="test class")
    private String cls;

    @ApiModelProperty(notes = "Country of the Student",name="country",required=true,value="test country")
    private String country;

    public Student(Long id, String name, String cls, String country) {
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cls='" + cls + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
