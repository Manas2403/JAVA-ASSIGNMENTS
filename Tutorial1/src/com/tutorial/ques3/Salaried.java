package com.tutorial.ques3;

public class Salaried extends Employee{
    public static float salary;
    public Salaried(String name, String address, int SSN, int number) {
        super(name, address, SSN, number);
    }
    public float computePay(){
        System.out.println("Computing weekly salary pay for "+this.name);
        return salary/52;
    }
}
