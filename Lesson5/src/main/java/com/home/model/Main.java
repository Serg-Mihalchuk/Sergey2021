package com.home.model;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("IBM", 8, "Barracuda", 5);
        System.out.println(computer.toString());
        System.out.println(computer.resourceOnOff);

        for (int i = 0; i < computer.resourceOnOff; i++) {
            computer.on();
            computer.off();
            if (computer.resourceOnOff == 0) {
                computer.burn();
            }
        }
    }
}






