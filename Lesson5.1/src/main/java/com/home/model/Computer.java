package com.home.model;

import java.util.Random;
import java.util.Scanner;

//описание компью
public class Computer {
    int CPU;
    int Ram;
    int HDD;
    int ResourceOnOff;


    //вывод параметров компьютера
    void computerSpecifications(int CPU, int Ram, int HDD, int ResourceOnOff) {
        this.CPU = CPU;
        this.Ram = Ram;
        this.HDD = HDD;
        this.ResourceOnOff = ResourceOnOff;
        System.out.println("Процессор " + CPU + "\nОперативная память " + Ram + "\nЖесткий диск " + HDD + "\nРесурс полных циклов работы " + ResourceOnOff);

    }

    //включение компьютера
    void ComputerOn() {

        System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random r = new Random();
        int random = r.nextInt(2);
        System.out.println(random);
        this.ResourceOnOff--; //уменьшение ресурса //но при
        System.out.println("Ресурс" + this.ResourceOnOff);
        if (number != random || this.ResourceOnOff == 0) {
            System.out.println("Компьютер сгорел!");
        } else {
            ComputerOff();
            ComputerOn();// без повторного вызова счетчик не работает!!!!
        }


    }

    //выключение компьютера
    void ComputerOff() {
        System.out.println("Компьютер выключен");
    }


}