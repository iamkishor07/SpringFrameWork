package com.example.demo.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Topic")
public class Topic {
    @Id
    @GeneratedValue
    private int id;
    private String courseName;
    private  String CourseDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    public Topic(String courseName, String courseDescription) {
        this.courseName = courseName;
        CourseDescription = courseDescription;
    }

    public Topic(int id, String courseName, String courseDescription) {
        this.id = id;
        this.courseName = courseName;
        CourseDescription = courseDescription;
    }

    public Topic() {
    }



}
