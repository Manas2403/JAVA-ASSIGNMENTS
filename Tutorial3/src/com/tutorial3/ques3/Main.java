package com.tutorial3.ques3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student manas=new Student(146,179.0f);
        Student vipul=new Student(115,160.0f);
        Student abhishek=new Student(3,160.0f);
        Student aman=new Student(33,175.0f);
        ArrayList<Float>heights=new ArrayList<>(5);
        manas.display();
        heights.add(manas.height);
        heights.add(vipul.height);
        heights.add(abhishek.height);
        heights.add(aman.height);
        System.out.println("Average Height: ");
        System.out.println(Student.averageHeight(heights));
    }
}
