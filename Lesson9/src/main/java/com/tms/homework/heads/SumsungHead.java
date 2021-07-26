package com.tms.homework.heads;

public class SumsungHead implements IHead {
    private int price;

    public SumsungHead(int price) {
        this.price = price;
    }

    public SumsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
