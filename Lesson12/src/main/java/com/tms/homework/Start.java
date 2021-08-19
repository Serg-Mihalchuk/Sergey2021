package com.tms.homework;

import java.util.Random;
import java.util.Scanner;

public class Start {

    public boolean start() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int random = r.nextInt(20);
        while (true) {
            System.out.println("Введите число от 1 до 20");
            int number = Integer.parseInt(scanner.nextLine());
            if (number != random) {
                try {
                    //throw new NumberFormatException();
                    throw new Exception();
                } /*catch (NumberFormatException e) {
                    System.out.println("Не введены никакие данные");
                }*/ catch (Exception e1) {
                    System.out.println("Попробуйте еще раз");
                }
            } else {
                //System.out.println("Машина " + "заведена");
                return false;
            }
            //throw e;

        }
    }


}
