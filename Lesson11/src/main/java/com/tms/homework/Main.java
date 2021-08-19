package com.tms.homework;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 1, "red");
        Car car2 = new Car("BMW", 1, "red");
        //для правильной работы equals необходимо переопределить метод с учетом полей объекта
        System.out.println(car1.equals(car2));
        //переопредилил equals переопредели и hashCode
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car1.hashCode() == car2.hashCode());
        //если hashCode разные то и объекты разные
        //если hashCode равны, то это не значит что объекты равны (колизии)
        //объектов может быть миллиарды, а hashCode ограничен значением int

        //ссылочные типы нельзя сравнивать через == потому что сравниваются их ссылки,
        // а не сами объекты


    }
}
