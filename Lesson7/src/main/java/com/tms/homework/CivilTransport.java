package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CivilTransport extends AirTransport {

    public CivilTransport(int enginePower, int maxSpeed, int weight, String model, int wingspan) {
        super(enginePower, maxSpeed, weight, model, wingspan);
    }

    private int numberOfPassengers;
    private boolean businessClass;

    public CivilTransport(int enginePower,
                          int maxSpeed,
                          int weight,
                          String model,
                          int wingspan,
                          int numberOfPassengers,
                          boolean businessClass) {
        super(enginePower, maxSpeed, weight, model, wingspan);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }


    protected void maxPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= getNumberOfPassengers()) {
            System.out.println("Нужен самолет побольше");
        } else System.out.println("Самолет заполнен");
    }

}
