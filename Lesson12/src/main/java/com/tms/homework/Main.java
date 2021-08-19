package com.tms.homework;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", 280, 21000);
        Car car1 = new Car("Audi", 230, 20000);
        //System.out.println(car.toString());
        try {
            System.out.println(car.toString());
            car.start();
            System.out.println("Автомобиль " + car.getBrand() + " заведен");

        } catch (NumberFormatException e) {
            System.out.println("Вы не ввели никаких данных, запустите авто еще раз");
        }
        try {
            System.out.println(car1.toString());
            car1.start();
            System.out.println("Автомобиль " + car1.getBrand() + " заведен");

        } catch (NumberFormatException e) {
            System.out.println("Вы не ввели никаких данных, запустите авто еще раз");
        }
    }
}
