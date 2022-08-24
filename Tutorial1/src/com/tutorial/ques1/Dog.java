package com.tutorial.ques1;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Bark");
    }

    @Override
    void eat() {
        System.out.println("Pedigree");
    }

    @Override
    void roam() {
        System.out.println("Road");
    }

    @Override
    void sleep() {
        System.out.println("Sleep💤");
    }
}
