package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car extends Start {
    private String brand;
    private double speed;
    private double price;

    public Car() {
    }

    public Car(String brand, double speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }
}
