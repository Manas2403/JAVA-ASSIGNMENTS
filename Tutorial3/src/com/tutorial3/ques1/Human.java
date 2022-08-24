package com.tutorial3.ques1;

public class Human {
    public String name;
    public int age;
    public void Display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
}
