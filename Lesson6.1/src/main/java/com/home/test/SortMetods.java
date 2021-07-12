package com.home.test;

import java.util.List;
import java.util.stream.Collectors;

public class SortMetods {

    // выбрать мужчин-военнообязанных
    public void militaryService(List<Person> persons) {
        List<Person> militaryService = persons.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == "mail").collect(Collectors.toList());
        System.out.println("Военнообязанных = " + militaryService);
    }

    //выбрать мужчин-военнообязанных по городу
    public void getByCity(List<Person> persons, String address) {
        List<Person> militaryService = persons.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == "mail" && address.equals(p.getAddress())).collect(Collectors.toList());
        System.out.println("Призывников из города " + address + " " + militaryService);
    }

    // выбрать мужчин-военнообязанных от 25 до 27
    public void militaryServiceByAge(List<Person> persons, int minAge, int maxAge) {
        List<Person> militaryService = persons.stream().filter((p) -> p.getAge() >= minAge && p.getAge() < maxAge
                && p.getSex() == "mail").collect(Collectors.toList());
        System.out.println("Военнообязанных от " + minAge + " до " + maxAge + ":" + militaryService);
    }


    //выбрать мужчин-военнообязанных по имени
    public void getByName(List<Person> persons, String name) {
        List<Person> militaryService = persons.stream().filter((p) -> p.getAge() >= 18 && p.getAge() < 27
                && p.getSex() == "mail" && name.equals(p.getName())).collect(Collectors.toList());
        System.out.println("Призывников с именем " + name + " " + militaryService);

    }
}
