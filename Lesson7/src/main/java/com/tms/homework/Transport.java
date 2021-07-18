package com.tms.homework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Transport {
    private int enginePower;
    private int maxSpeed;
    private int weight;
    private String model;

}
