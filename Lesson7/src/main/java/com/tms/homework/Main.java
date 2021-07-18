package com.tms.homework;

public class Main {
    public static void main(String[] args) {


        /*Cars car = new Cars(180,
                100,
                2390,
                "BMW",
                4,
                10,
                "wagon",
                5);
        car.fuelConsumption();

        FreightTransport freightTransport = new FreightTransport(220,
                110,
                5600,
                "DAF",
                4,
                23,
                4500);
        freightTransport.volume();*/

        /*CivilTransport civilTransport = new CivilTransport(1200,
                2560,
                45000,
                "PowerJet",
                27,
                210,
                true);
        civilTransport.maxPassengers(202);*/

        MilitaryTransport militaryTransport = new MilitaryTransport(2800,
                3800,
                25000,
                "Tornado",
                12,
                true,
                5);
        militaryTransport.onFire(2, false);


    }
}
