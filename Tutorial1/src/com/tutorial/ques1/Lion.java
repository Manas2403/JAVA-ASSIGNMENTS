package com.tutorial.ques1;

public class Lion extends Animal{
    public Lion(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Roar");
    }

    @Override
    void eat() {
        System.out.println("Meat");
    }

    @Override
    void roam() {
        System.out.println("Jungle");
    }

    @Override
    void sleep() {
        System.out.println("Sleep💤");
    }
}
