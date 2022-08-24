package com.tutorial.ques1;

public class Tiger extends Animal{
    public Tiger(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Growl");
    }

    @Override
    void eat() {
        System.out.println("meat");
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
