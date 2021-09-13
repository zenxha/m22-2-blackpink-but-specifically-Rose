package com.example.sping_portfolio.minilabs;
import java.util.ArrayList;
public class Student {

    private String race;
    private int SAT;
    private Double gpaAverage;

    public Student(double gpa, int SATScore, String r) {
        gpaAverage = gpa;
        SAT = SATScore;
        race = r;
    }

    public String getColleges() {
         ArrayList<String> colleges = new ArrayList<String>();

        if(gpaAverage < 3.99) {
            colleges.add("UCSD");

        } else {
            colleges.add("Harvard");
        }
        return(colleges.toString());
    }
    public static void main(String[] args){
        Student komay = new Student(4.0, 1600, "sex");
        String list = komay.getColleges();
        System.out.println(list);
    }

}
