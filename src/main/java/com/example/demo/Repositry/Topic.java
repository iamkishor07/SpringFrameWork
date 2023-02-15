package com.example.demo.Repositry;

public class Topic {
    private int id;

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

    public Topic(int id, String courseName, String courseDescription) {
        this.id = id;
        this.courseName = courseName;
        CourseDescription = courseDescription;
    }

    public Topic() {
    }

    private String courseName;
    private  String CourseDescription;


}
