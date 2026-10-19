package org.example;

public class Bike extends  Vehicle {
    int pedalNum;
    int wheels;

    Bike(int pedalNum, int wheels) {

    }

    public int getPedalNum() {
        return pedalNum;
    }

    public void setPedalNum(int pedalNum) {
        this.pedalNum = pedalNum;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
