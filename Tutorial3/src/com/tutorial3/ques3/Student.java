package com.tutorial3.ques3;

import java.util.ArrayList;

public class Student {
    int rollNumber;
    float height;
   public void display(){
       System.out.println(this.rollNumber);
       System.out.println(this.height);
   }
   public static  float averageHeight(ArrayList<Float>heights){
       float sum=0.0f;
       for(int i=0;i<heights.size();i++){
           sum+=heights.get(i);
       }
       return (sum/(float)(heights.size()));
   }
   public Student(int rollNumber,float height){
       this.rollNumber=rollNumber;
       this.height=height;
   }
}
