import java.util.Scanner;

public class Integer {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num = 0;
        System.out.println("Введите 5 произвольных чисел:");
        for (int i = 0; i < 5; i++) {
            int Integer = console.nextInt();
            if (Integer >= 0) {
                num++;
            }
        }
        System.out.println("Количество положительных чисел = " + num);
    }


}

