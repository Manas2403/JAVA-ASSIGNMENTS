package com.tutorial.ques1;

public abstract class Animal {
    String food;
    String location;
    public Animal(String food,String location){
        this.food=food;
        this.location=location;
    }

    abstract void makeNoise();
    abstract  void eat();
    abstract void roam();
    abstract void sleep();
}
