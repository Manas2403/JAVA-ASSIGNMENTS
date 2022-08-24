package com.elective;
import java.util.ArrayList;
public class Professor {
    public String name;
    public ArrayList<Course>subjects=new ArrayList<>(3);
    public void allotSubject(Course subject){
        this.subjects.add(subject);
    }
    public Professor(String name){
        this.name=name;
    }
}
