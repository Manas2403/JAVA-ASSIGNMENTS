package com.tutorial3.ques2secondpackage;

import java.util.Scanner;
import com.tutorial3.ques2.Sum;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two numbers u want to add");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(Sum.addTwoNumbers(a,b));
    }
}
