package com.home.model;

import java.util.Random;
import java.util.Scanner;

//описание компью
public class Computer {
    String CPU;
    int ram;
    String HDD;
    int resourceOnOff;

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
        System.out.println("Компьютер включен");

    }

    //выключение компьютера
    void off() {
        System.out.println("Компьютер выключен");

    }

    //компьютер сгорел
    void burn() {
        System.out.println("Компьютер сгорел");
    }


}