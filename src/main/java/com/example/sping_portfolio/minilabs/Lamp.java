package com.example.sping_portfolio.minilabs;

public class Lamp{
    private boolean isOn;

    public void turnOn(){
        isOn = true;
        System.out.println("Lamp is on");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Lamp is off");
    }
    public static void main (String[] args){
        Lamp newLamp = new Lamp();
        newLamp.turnOn();
        Lamp Lamp2 = new Lamp();
        newLamp.turnOff();
        Lamp lamp3;

    }

}
