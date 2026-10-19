package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        FullStack fullStack = new FullStack("Siya", 26, "MALE");
//        fullStack.displayDetails();
//
//        Car car = new Car("Gray", "Mercedes", "Cla220d", 2022);
//        Car car1 = new Car("Gray", "BMW", "M4", 2024);
//        Car car2 = new Car("Gray", "AUDI", "Rs3", 2026);
//
//        Car[] cars = {car, car1, car2};
//        for(Car _cars : cars){
//            _cars.displayCars();
//        }
//        for (int i = 0; i< cars.length; i++) {
//            cars[i].displayCars();
//        }

//        System.out.print("\nMake of the car is: " + car.getMake());


        Car car = new Car("Mercedes Benz", "Cla220d", 2022, 4);
        System.out.print("Make of the car is: " + car.getMake());

        car.setMake("Toyota");
        car.displayCars();
        car.stop();




    }




}
