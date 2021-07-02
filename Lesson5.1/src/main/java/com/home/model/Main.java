package com.home.model;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.computerSpecifications(8, 16, 500, 2);
        System.out.println();
        /*Computer computer1 = new Computer();
        computer1.computerSpecifications(16, 32, 2000, 20);*/

        computer.ComputerOn();


    }

}
