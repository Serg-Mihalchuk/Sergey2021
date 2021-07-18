package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class FreightTransport extends LandTransport {


    public FreightTransport(int enginePower, int maxSpeed, int weight, String model) {
        super(enginePower, maxSpeed, weight, model);
    }

    private double carrying;

    public FreightTransport(int enginePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, double carrying) {
        super(enginePower, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.carrying = carrying;
    }

    public void volume() {

        Truck truck = new Truck();
        if (getCarrying() / 1000 > truck.getTotalWeight()) {
            System.out.println("Грузовик загружен");
        } else System.out.println("Вам нужен грузовик побольше");

    }
}
