package com.jpaexample.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private int marks;

    public int getMarks() {
        return marks;
    }

    public Student() {
    }

    public Student(String name, int marks, int id) {
        this.name = name;
        this.marks = marks;
        this.id = id;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
