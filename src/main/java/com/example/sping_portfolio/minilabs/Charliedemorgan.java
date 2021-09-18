package com.example.sping_portfolio.minilabs;

public class Charliedemorgan {
    public static void main(String[] args) {
        boolean cool = false;
        boolean happy = true;

        if (cool && happy){
            System.out.println("You are like Allen (100% chance)");
        }
        else if (!(cool || !happy)){
            System.out.println("You are Charlie (0% chance)");
        }
        else if (cool || happy){
            System.out.println("You have a 50% chance");
        }
    }

}
