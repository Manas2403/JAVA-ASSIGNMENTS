package com.tutorial3.ques5;

public class Child extends  Parent{
    public void Child(){
        System.out.println("Inside child without arguments");
    }
    public Child(){
        super();
        System.out.println("Inside child's default constructor");
    }
    public Child(int b){
        super(b);
        System.out.println("Inside child's argument constructor");
    }
}
