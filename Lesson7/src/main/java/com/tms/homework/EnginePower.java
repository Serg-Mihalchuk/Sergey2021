package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class EnginePower {

    public EnginePower(int enginePower) {
    }

    public double setEnginePower(int enginePower) {

        double kWt = enginePower * 0.74;
        System.out.println("Мощность двигателя в кВт" + enginePower);
        return kWt;


    }
}
