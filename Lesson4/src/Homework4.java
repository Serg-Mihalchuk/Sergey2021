import java.util.Arrays;
import java.util.Random;

public class Homework4 {
    public static void main(String[] args) {
        ameba();
        summ(5, 5);
        mass();
        number(-500);
        oddNumbers();
        randomArray();
        array20();
        maxArrayNumber();


    }


//        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    private static void ameba() {

        /*for (int i = 0; i <= 24; i += 3) {
            int result = 1;
            if (i != 0) {
                result = (int) Math.pow(2, i / 3);
            }
            System.out.println(result);
        }*/
    }
//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    private static void summ(int a, int b) {
       /* int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + a;
        }
        System.out.println(sum);*/
    }

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    private static void mass() {
        /*String[][] array = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // заполнение главной диагонали i = j
                if (i == j) {
                    array[i][j] = "*";
                    System.out.print(array[i][j]);
                }
                System.out.print(" ");

            }
            System.out.println();

        }*/
    }

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    private static void number(int a) {
       /* if (a > 0) {
            System.out.println(a + " - положительное число," + "количество цифр = " + String.valueOf(Math.abs(a)).length());
        } else
            System.out.println(a + " - отрицательное число, " + "количество цифр = " + String.valueOf(Math.abs(a)).length());
    */
    }

//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    private static void oddNumbers() {
        /*int[] array = new int[50];
        for(int i=0,n=1; i<array.length; n=n+2,i++){
            array[i] = n;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=array.length-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }*/

    }

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    private static void randomArray() {
       /* int[] array = new int[12];
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*31)-15;
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс максимального числа" + maxIndex);*/
    }

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    private static void array20() {
       /* int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 41) - 20;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }*/
    }

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    private static void maxArrayNumber() {
       /* int[] array = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
            }
        }
        array[0] = maxNumber;
        System.out.println(Arrays.toString(array));*/
    }

//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7


}