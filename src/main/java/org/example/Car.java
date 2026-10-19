package org.example;

public class Car extends Vehicle{

//    String color;
//    String brand;
//    String model;
//    int year;
//
//
//    public Car(String color, String brand, String model, int year) {
//        this.color = color;
//        this.brand = brand;
//        this.model = model;
//        this.year = year;
//
//    }
//
//    void displayCars() {
//        System.out.println("Color: " + this.color + "\nBrand: " + this.brand + "\nModel: " + this.model + "\nYear: " + this.year);
//    }


    private String make;
    private String model;
    private int year;
    private int wheels;

    public Car(String make, String model, int year, int wheels) {
        setMake(make);
        setModel(model);
        setYear(year);
        setWheels(wheels);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public  void setWheels(int wheels) {
        this.wheels = wheels;
    }

    void displayCars() {
        System.out.print("\nCar make is: " + this.make + "\nCar model is: " + this.model + "\nCar year is: " + this.year + "\nVehicle has " + this.wheels + " wheels");
    }
}
