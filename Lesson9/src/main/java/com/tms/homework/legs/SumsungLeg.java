package com.tms.homework.legs;

public class SumsungLeg implements ILeg {
    private int price;

    public SumsungLeg(int price) {
        this.price = price;
    }

    public SumsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sumsung");
    }

    @Override
    public int getPrice() {
        return price;
    }

}
