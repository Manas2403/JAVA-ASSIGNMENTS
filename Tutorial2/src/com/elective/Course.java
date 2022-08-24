package com.elective;

public class Course {
    public String courseName;
    public int courseCredits;
    public int numberOfStudents;
    public Course(String courseName,int courseCredits){
        this.courseName=courseName;
        this.courseCredits=courseCredits;
    }
    public void incrementStudents(){
        this.numberOfStudents++;
    }
}
