package com.tutorial3.ques5;

public class Parent {
    public void Parent(){
        System.out.println("Inside parent without arguments");
    }
    public Parent(){
        super();
        System.out.println("Inside parent's default constructor");
    }
    public Parent(int a){
        super();
        System.out.println("Inside parent's argument constructor");
    }
}
