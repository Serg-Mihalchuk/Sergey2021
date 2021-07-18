package com.home.model;

import java.util.Random;
import java.util.Scanner;

//описание компью
public class Computer {
    String CPU;
    int ram;
    String HDD;
    int resourceOnOff;
    boolean burn;

    //параметрический метод инициализации через конструктор
    public Computer(String CPU, int ram, String HDD, int resourceOnOff) {
        this.CPU = CPU;
        this.ram = ram;
        this.HDD = HDD;
        this.resourceOnOff = resourceOnOff;
    }

    //вывод параметров компьютера через свой String
    @Override
    public String toString() {
        return "Computer{" +
                "CPU= '" + CPU + '\'' +
                ", Ram= '" + ram + '\'' +
                ", HDD= '" + HDD + '\'' +
                ", ResourceOnOff= " + resourceOnOff +
                '}';
    }

    //включение компьютера
    void on() {
        if (this.resourceOnOff == 0) {
            burn();
        } else {
            System.out.println("Компьютер включен");
        }
    }

    //выключение компьютера
    void off() {
        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random r = new Random();
        int random = r.nextInt(2);
        if (random == number) {
            System.out.println("Компьютер выключен");
            this.resourceOnOff--;
        } else {
            burn();
            this.resourceOnOff = 0;
        }
    }

    //компьютер сгорел
    void burn() {
        System.out.println("Компьютер сгорел");
    }


}