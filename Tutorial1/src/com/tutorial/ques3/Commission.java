package com.tutorial.ques3;

public class Commission extends Employee{
    public static float percentage;
    public float sales;
    public Commission(String name, String address, int SSN, int number,float sales) {
        super(name, address, SSN, number);
        this.sales=sales;
    }
    public float computePay(){
        System.out.println("Computing salary pay for "+this.name);
        return this.sales*0.1f;
    }
}
