package com.home.test;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alex", 30, "mail", "Minsk"),
                new Person("Jack", 20, "mail", "Gomel"),
                new Person("Mary", 25, "femail", "Minsk"),
                new Person("Ivan", 27, "mail", "Hrodno"),
                new Person("Liza", 18, "femail", "Uzda"),
                new Person("Ivan", 23, "mail", "Minsk"),
                new Person("Alex", 30, "mail", "Minsk"),
                new Person("Daniel", 20, "mail", "Gorki"),
                new Person("Alex", 25, "mail", "Minsk"),
                new Person("Ivan", 26, "mail", "Hrodno"),
                new Person("Nina", 19, "femail", "Minsk"),
                new Person("Ivan", 25, "mail", "Baranovichi")
        );

        SortMetods metods = new SortMetods();
        metods.militaryService(persons); // выбрать мужчин-военнообязанных
        metods.getByCity(persons, "Minsk");//выбрать мужчин-военнообязанных по городу
        metods.militaryServiceByAge(persons, 25, 27);// выбрать мужчин-военнообязанных от 25 до 27
        metods.getByName(persons, "Ivan"); //выбрать мужчин-военнообязанных по имени

    }

}
