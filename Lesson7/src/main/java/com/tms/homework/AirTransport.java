package com.tms.homework;

public class AirTransport extends Transport {
    /*public AirTransport(int enginePower, int maxSpeed, int weight, String model) {
        super(enginePower, maxSpeed, weight, model);
    }*/

    private int wingspan; //размах крыльев

    public AirTransport(int enginePower, int maxSpeed, int weight, String model, int wingspan) {
        super(enginePower, maxSpeed, weight, model);
        this.wingspan = wingspan;
    }


}
