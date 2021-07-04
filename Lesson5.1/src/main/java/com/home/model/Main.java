package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("IBM", 8, "Barracuda", 2);
        System.out.println(computer.toString());
        System.out.println(computer.resourceOnOff);

        computer.on();
        for (int i = computer.resourceOnOff; i >= 0; i--) {
            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            Random r = new Random();
            int random = r.nextInt(2);
            if (random == number) {
                computer.off();
            } else if (computer.resourceOnOff == 0) {
                computer.burn();
                break;
            } else {
                computer.burn();
                break;
            }

        }

    }


}


