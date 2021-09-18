package com.example.sping_portfolio.minilabs;

public class tanmaydemorgan {
    public static void main(String[] args) {
        boolean eaten = false;
        boolean hungry = true;

        if (eaten && hungry){
            System.out.println("You are like Allen (100% chance)");
        }
        else if (!(eaten || !hungry)){
            System.out.println("You are Charlie (0% chance)");
        }
        else if (eaten || hungry){
            System.out.println("You have a 50% chance");
        }
    }
}
