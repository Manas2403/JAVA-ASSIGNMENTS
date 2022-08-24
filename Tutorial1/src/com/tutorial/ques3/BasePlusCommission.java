package com.tutorial.ques3;

public class BasePlusCommission extends Commission{
    public static float baseSalary;
    public BasePlusCommission(String name, String address, int SSN, int number, float sales) {
        super(name, address, SSN, number, sales);
    }
    public float computePay(){
        System.out.println("Computing salary pay for "+this.name);
        return baseSalary+this.sales*0.1f;
    }
}
