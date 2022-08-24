package com.elective;

import java.util.ArrayList;

public class Student {
    public String name;
    public float cgpa;
    public String rollNum;
    public String branch;
    public ArrayList<Course>previousSubjects=new ArrayList<>(3);

    public ArrayList<Course>preferenceList=new ArrayList<>(5);
    public Student(String name,float cgpa,String rollNum,String branch){
        this.name=name;
        this.cgpa=cgpa;
        this.rollNum=rollNum;
        this.branch=branch;
    }
    public void addPreviousSubject(Course subject){
        this.previousSubjects.add(subject);
    }
    public void addPreference(Course subject){
        if(this.previousSubjects.contains(subject)){
            System.out.println("You have already opted for this subject in previous semester");
        }else{
            this.preferenceList.add(subject);
        }
    }
}
