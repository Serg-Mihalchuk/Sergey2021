import java.util.*;

public class Homework4 {
    public static void main(String[] args) {
        ameba();
        summ(3, -5);
        mass();
        number(0);
        oddNumbers();
        randomArray();
        array20();
        maxArrayNumber();
        duplicates();
        roundMatrix();
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
        // a & b = 0 !!!
        // a < 0, b < 0 result  = - result;

        /* int sum = 0;
        for (int i = 1; i <= Math.abs(b); i++) {
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
        char[][] drawingBoard = new char[6][6];
        for (int i = 0; i < drawingBoard.length; i++) {
            Arrays.fill(drawingBoard[i], '*');
        }
        triangle(drawingBoard, 'a');
        triangle(drawingBoard, 'b');
        triangle(drawingBoard, 'k');
        triangle(drawingBoard, 'd');
        triangle(drawingBoard, 'c');
    }

    /*метод triangle(char[][] board, char type) рисует треугольники на квадратной матрице board типа char[][] с любым размером и любым наполнением (не только '*').
    второе вводимое значение (type) отвечает за форму треугольника, вводится в виде одного из char 'a', 'b', 'c' или 'd'.
    */

    public static void triangle(char[][] board, char type) {
        switch (type) {
            case 'a':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j >= board.length - 1 - i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j <= i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'c':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j >= i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            case 'd':
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board.length; j++) {
                        if (j <= board.length - 1 - i) {
                            System.out.print(board[i][j]);
                        } else {
                            System.out.print(' ');
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Что-то не так.");
        }
        System.out.println();
    }

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    private static void number(int a) {
       /* if (a > 0) {
            System.out.println(a + " - положительное число," + "количество цифр = " + String.valueOf(Math.abs(a)).length());
        } else if (a < 0) {
            System.out.println(a + " - отрицательное число, " + "количество цифр = " + String.valueOf(Math.abs(a)).length());
        } else System.out.println("a = 0");*/

    }

//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    private static void oddNumbers() {
        /*int[] array = new int[50];
        for (int i = 0, n = 1; i < array.length; n = n + 2, i++) {
            array[i] = n;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }*/
    }

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    private static void randomArray() {
       /* Random random = new Random();
        int[] array = new int[12];
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) -15;
            if (array[i] >= maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
           }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Индекс максимального числа " + maxIndex + "\nМаксимальное число " + maxNumber);
*/
    }

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    private static void array20() {
      /*  Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }
        //массив произвольных чисел от -20 до 20
        System.out.println(Arrays.toString(array));
        System.out.println();
       // нечетные индексы на 0
        *//* for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }*//*
        //нечетные элементы на 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        //массив с заменой на 0
        System.out.println(Arrays.toString(array));*/
    }

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    private static void maxArrayNumber() {
        /*int[] array = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxNumber) {
                maxNumber = array[i];
             }
        }
        //замена максимального элемента на нуль
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNumber) {
                array[i] = 0;
            }
        }
        //замена элементов равных нулю на макс
        *//*for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = maxNumber;
            }
        }*//*
        //замена нулевого элемента на макс
        // array[0] = maxNumber;
        System.out.println(maxNumber);
        System.out.println(Arrays.toString(array));*/
    }


//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    private static void duplicates() {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int arrLenght = random.nextInt(20);
        for (int a = 0; a < arrLenght; a++) {
            arr.add(random.nextInt(20));
        }
        System.out.println(arr);
        checkRepeat(arr);
        System.out.println();
    }

    public static void checkRepeat(ArrayList<Integer> mass) {
        Set<Integer> repeats = new HashSet<>();
        for (int i = 0; i < mass.size(); i++) {
            for (int j = i + 1; j < mass.size(); j++) {
                if (mass.get(i).equals(mass.get(j))) {
                    repeats.add(mass.get(i));
                    break;
                }
            }
        }
        if (repeats.isEmpty()) {
            System.out.println("Массив не имеет повторяющихся элементов");
        } else {
            System.out.print("Массив имеет повторяющиеся эелементы ");
            for (Integer repeat : repeats) {
                System.out.print(repeat + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }
    }


//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    private static void roundMatrix() {
       /* Scanner console = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int matrix = console.nextInt();
        int[][] array = new int[matrix][matrix];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) ((Math.random() * 50) - Math.pow(matrix, 2));
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + "   ");

            }
            System.out.println();
        }*/

    }
}