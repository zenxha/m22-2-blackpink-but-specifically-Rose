package com.example.sping_portfolio.minilabs;

public class Waterfall {
    public static void main (String[] args){
        double myaverage = 78.22;
        System.out.print("Current Average:" + myaverage);
        if (myaverage >= 89.5){
            System.out.print("Your average is an A");
        }
        else if (myaverage >= 79.5){
            System.out.print("Your average is a B");
        }
        else if (myaverage >= 69.5){
            System.out.print("Your average is a C");
        }

    }
}
