package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Scanner;

@Getter
@Setter
@ToString
public class Cars extends LandTransport {
    public Cars(int enginePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption) {
        super(enginePower, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
    }

    private String bodyType;
    private int numberOfPassengers;

    public Cars(int enginePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(enginePower, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    EnginePower power = new EnginePower(getEnginePower());


    public double distanceTraveled(double time) {
        double result = time * getMaxSpeed();
        return result;
    }

    public double fuelConsumption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время проведенное в пути");
        double time = scanner.nextDouble();
        double result = distanceTraveled(time) / this.getFuelConsumption();
        System.out.println("За время " + time + " ч. автомобиль " + this.getModel() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() + " км/ч " +
                " проедет " + distanceTraveled(time) + " км и израсходует " + result + " литров топлива.");
        return result;

    }


}
