package com.tms.homework.hands;

public class SumsungHand implements IHand {
    private int price;

    public SumsungHand(int price) {
        this.price = price;
    }

    public SumsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука Sumsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
