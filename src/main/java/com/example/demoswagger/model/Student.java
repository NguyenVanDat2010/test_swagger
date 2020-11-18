package com.example.demoswagger.model;

public class Student {
    private Long id;
    private String name;
    private String cls;
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
