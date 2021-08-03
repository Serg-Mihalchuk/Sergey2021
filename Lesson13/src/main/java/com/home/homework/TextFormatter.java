package com.home.homework;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

@Setter
@Getter
public class TextFormatter {
    private String string;

    //подсчет количества слов в предложении
    public int getSringReturnWords() {
        Scanner scanner = new Scanner(System.in);
        //Вводим предложение в консоль
        System.out.println("Введите слова одной строкой через пробел");
        String input = scanner.nextLine();
        //Начальное количество слов равно 0
        int count = 0;

        //Если ввели хотя бы одно слово, тогда считать, иначе конец программы
        if (input.length() != 0) {
            count++;
            //Проверяем каждый символ, не пробел ли это
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    //Если пробел - увеличиваем количество слов на 1
                    count++;
                }
            }
        }
        return count;
    }

    //проверка слова на полиндром
    public boolean isPolindroms(String string) {
        if (string == null) {
            return false;
        } else {
            StringBuilder strBuilder = new StringBuilder(string);
            strBuilder.reverse();
            return strBuilder.toString().equals(string);
        }

    }

    //проверка целого предложения на полиндром
    public boolean isAllPolindroms(String string) {
        //удаляем все пробелы и цифры и приводим к нижнему регистру
        String ab = string.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        //System.out.println(ab);

        for (int i = 0; i < ab.length() / 2; i++) {
            if (ab.charAt(i) != ab.charAt((ab.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    public void isInStringPolindroms() {
        String str = "Как старый дед КазаК сделал закаЗ на миллион";
        str = str.toLowerCase(Locale.ROOT);
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        int count = 0;
        //
        for (int i = 0; i < words.length; i++) {
            if (isPolindroms(words[i]) == true) {
                count++;
            }
        }
     /* for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                System.out.println("Строка пустая!!!");
            } else {
                StringBuilder strBuilder = new StringBuilder(words[i]);
                strBuilder.reverse();
                if (strBuilder.toString().equals(words[i]) == true) {
                    count++;
                }
            }
        }*/
        if (count == 0) {
            System.out.println("В предложении отсутствуют слова полиндромы");
        } else {
            System.out.println("В предложении имеются " + count + " полиндрома");
        }
    }

    //Вырезать подстроку из строки начиная с первого
    //  вхождения символа(А) до, последнего вхождения сивола(B).

    public void сutSubstringFromStringByIndex(String string) {
        try {
            int index1 = string.indexOf("А");
            int index2 = string.lastIndexOf("Б");
            String result = string.substring(index1, index2);
            System.out.println(result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Указанный вами индекс не существует");
        }

    }

}
