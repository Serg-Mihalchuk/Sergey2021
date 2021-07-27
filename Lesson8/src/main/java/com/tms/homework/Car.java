package com.tms.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@ToString
@AllArgsConstructor
public class Car implements CarActions {

    private String model;
    private int madeIn;
    private double maxSpeed;

    @Override
    public void start() {
        Engine engine = new Engine("Hybrid", 110);
        Tank tank = new Tank("petrol", 50, false);
        if (tank.outOfFuel(tank.outOfFuel) == true) {
            engine.engineOn();
            System.out.println("Машина поехала");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите предпологаемое время в пути: ");
            double time = scanner.nextDouble();
            double result = time * getMaxSpeed();
            System.out.println("С максимальной скоростью вы сможете проехать: " + result);
            System.out.println("Бака топлива " + tank.getTankVolume() + "Вам хватит на ");


        }

    }

    @Override
    public void drive() {
        System.out.println("Машина едет");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась");

    }

    @Override
    public void check() {
        System.out.println("Машина не может продолжать движение");
    }

    @Setter
    @Getter
    @ToString
    public static class Engine {
        private String enginesType;
        private double enginePower;

        public Engine() {
        }

        public Engine(String enginesType, double enginePower) {
            this.enginesType = enginesType;
            this.enginePower = enginePower;
        }

        public void engineOn() {
            System.out.println("Двигатель включен");
        }

        public void engineOff() {
            System.out.println("Двигатель выключен");

        }

        public void checkEngine() {
            System.out.println("Двигатель неисправен");
        }

    }

    @Setter
    @Getter
    @AllArgsConstructor
    @ToString
    public static class Tank {
        private String typeOfFuel;
        private double tankVolume;
        private boolean outOfFuel;

        public boolean outOfFuel(boolean outOfFuel) {
            Engine engine = new Engine();
            this.outOfFuel = outOfFuel;
            if (outOfFuel == true) {
                System.out.println("Топливо отсутствует, нужна дозаправка");
                engine.checkEngine();
                return false;

            } else {
                System.out.println("Топлива достаточно, можно ехать");
                return true;
            }

        }


    }


}
