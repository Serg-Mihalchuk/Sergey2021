package com.tms.homework;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;


@Getter
@Setter
public class Truck {

    double length;
    double width;
    double height;
    double weight;

    Scanner scanner = new Scanner(System.in);

    public double getLength() {
        System.out.print("Длина - ");
        length = scanner.nextDouble();
        return length;
    }

    public double getHeight() {
        System.out.print("Высота - ");
        height = scanner.nextDouble();
        return height;
    }

    public double getWidth() {
        System.out.print("Ширина - ");
        width = scanner.nextDouble();
        return width;
    }

    public double getWeight() {
        System.out.print("Удельная плотность - ");
        weight = scanner.nextDouble();
        return weight;
    }

    public double getTotalWeight() {
        System.out.println("Введите параметры груза:");
        return getLength() * getHeight() * getWidth() * getWeight();

    }
}
