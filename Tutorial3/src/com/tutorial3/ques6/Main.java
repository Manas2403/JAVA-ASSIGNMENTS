package com.tutorial3.ques6;

public class Main {
    public static void main(String[] args) {
        int num1=Integer.parseInt("10101010",2);
        int num2=Integer.parseInt("01010101",2);
        System.out.println(Integer.toBinaryString(num1&num2));
        System.out.println(Integer.toBinaryString(num1|num2));
        System.out.println(Integer.toBinaryString(num1^num2));
        System.out.println(Integer.toBinaryString(num1<<num2));
        System.out.println(Integer.toBinaryString(num2<<num1));
        System.out.println(Integer.toBinaryString(num1>>num2));
        System.out.println(Integer.toBinaryString(num2>>num1));
    }
}
