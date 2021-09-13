package com.example.sping_portfolio.minilabs;

public class Allen {

    private String name;
    private String id;
    private int pay;

    public void Allen(String nm, String empid, int py) {
        name = nm;
        id = empid;
        pay = py;
    }

    public void Allen(String nm, String empid) {
        String name = nm;
        id = empid;
        pay = 20;
        System.out.print("U POOR");
    }
    public static void main(String[] args){
        Allen person1 = new Allen();
        person1.Allen("Tom", "1242");
    }

}
