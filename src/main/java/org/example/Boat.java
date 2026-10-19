package org.example;

public class Boat extends Vehicle {
    String motor;

    Boat(String motor) {
        setMotor(motor);
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
