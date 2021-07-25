package com.tms.homework;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 2001, 280);
        System.out.println(car.toString());
        car.start();

    }
}
