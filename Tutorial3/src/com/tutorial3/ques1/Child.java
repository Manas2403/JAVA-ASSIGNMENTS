package com.tutorial3.ques1;

public class Child extends Human{
    public String gender;
    public String dob;
    public Child(String name, int age,String gender,String dob) {
        super(name, age);
        this.gender=gender;
        this.dob=dob;
    }
    @Override
    public void Display(){
      super.Display();
        System.out.println(this.gender);
        System.out.println(this.dob);
    }
}
