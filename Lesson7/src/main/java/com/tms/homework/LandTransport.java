package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LandTransport extends Transport {

    private int numberOfWheels;
    private int fuelConsumption;//расход топлива

    public LandTransport(int enginePower, int maxSpeed, int weight, String model) {
        super(enginePower, maxSpeed, weight, model);
    }

    public LandTransport(int enginePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption) {
        super(enginePower, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }


}

