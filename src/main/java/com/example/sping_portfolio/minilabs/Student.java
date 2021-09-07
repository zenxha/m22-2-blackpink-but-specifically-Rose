package com.example.sping_portfolio.minilabs;

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
         String colleges = null;
        if(gpaAverage < 3.99) {
            return "You didn't get in";
        }
        return("UCSD");
    }
    public static void main(String[] args){
        Student komay = new Student(4.0, 1600, "sex");
        komay.getColleges();
    }

}
