package com.tms.homework;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MilitaryTransport extends AirTransport {
    public MilitaryTransport(int enginePower, int maxSpeed, int weight, String model, int wingspan, boolean bailoutSystem, int numberOfMissilesOnBoard) {
        super(enginePower, maxSpeed, weight, model, wingspan);
        this.bailoutSystem = bailoutSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }

    private boolean bailoutSystem; //катапульта
    private int numberOfMissilesOnBoard;

    protected void onFire(int numberOfMissilesOnBoard, boolean bailoutSystem) {
        if (numberOfMissilesOnBoard <= getNumberOfMissilesOnBoard()) {
            System.out.println("Ракета пошла");
        } else System.out.println("Боеприпасы отсутствуют");
        if (bailoutSystem != isBailoutSystem()) {
            System.out.println("У вас нет такой системы");
        } else System.out.println("Катапультирование прошло успешно");

    }


}
