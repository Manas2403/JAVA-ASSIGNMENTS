package com.elective;

import java.util.ArrayList;
import java.util.Collections;

public class Elective extends Course{
    public int availableSeats;
    public Elective(String courseName, int courseCredits) {
        super(courseName, courseCredits);
    }
    public void addSeats(int seats){
        this.availableSeats=seats;
    }
    public ArrayList<Student>selectedStudents=new ArrayList<>(availableSeats);
    public void shortlist(ArrayList<Student>students){
        Collections.sort(students,(student1,student2)-> (int) (student2.cgpa-student1.cgpa));
        for(int i=0;i<availableSeats;i++){
            selectedStudents.add(students.get(i));

        }
    }

}
