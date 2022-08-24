package com.ques2;

public class Main {
    public static void main(String[] args) {
        BaseBallGame game=new BaseBallGame();
        System.out.println(game.homeScore);
        System.out.println(game.visitorScore);
        System.out.println(game.home);
        System.out.println(game.visitor);
        System.out.println();
        Team giants=new Team();
        System.out.println(giants.city);
        System.out.println(giants.name);
        System.out.println(giants.numberOfLosses);
        System.out.println(giants.numberOfWins);
    }
}
