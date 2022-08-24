package com.tutorial3.ques1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Displaying Human");
        Human human=new Human("Manas Gupta",19);
        human.Display();
        System.out.println("Displaying child");
        Child child=new Child("Will",2,"Male","12-01-2020");
        child.Display();
    }
}
