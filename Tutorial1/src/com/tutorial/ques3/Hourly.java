package com.tutorial.ques3;

public class Hourly extends Employee{
    public static float hourlyRate;
    public float hoursWorked;

    public Hourly(String name, String address, int SSN, int number,float hoursWorked) {
        super(name, address, SSN, number);
        this.hoursWorked=hoursWorked;
    }

    public  float computePay(){
        System.out.println("Computing hourly pay for "+this.name);
        float pay=0.0f;
        if(this.hoursWorked<=40){
            pay= hourlyRate*this.hoursWorked;
        }else{
            pay=(hourlyRate*40)+(hourlyRate*(this.hoursWorked-40)*1.5f);
        }
        return pay;
    }
}
