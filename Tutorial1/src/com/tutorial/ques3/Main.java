package com.tutorial.ques3;

public class Main {
    public static void main(String[] args) {
        Salaried.salary=8000000;
        Salaried employee1=new Salaried("Manas Gupta","guptamanas149@gmail.com",1234,1);
        employee1.mailCheck();
        System.out.println(employee1.computePay());
        System.out.println();
        Hourly.hourlyRate=250;
        Hourly employee2=new Hourly("Aman","amankarnwat@gmail.com",124,3,45);
        System.out.println(employee2.computePay());
        System.out.println();
        Commission employee3=new Commission("Vipul","vipuljain123@gmail.com",123,50,54);
        System.out.println(employee3.computePay());
        System.out.println();
        BasePlusCommission employee4=new BasePlusCommission("Steve","steve@gmail.com",355,23,45);
        BasePlusCommission.baseSalary=4000000;
        System.out.println(employee4.computePay());
        System.out.println();
    }
}
