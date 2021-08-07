package com.tms.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOTest {

    public static void main(String[] args) {
        File directory = new File("hw1");
        File file = new File(directory, "input.txt");
        File file1 = new File(directory, "output.txt");
        /*File directory2 = new File("hw2");
        File file2 = new File("hw2/input.txt");*/
        try {
            directory.mkdir();
            //directory2.mkdir();
            file.createNewFile();
            file1.createNewFile();
            //file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        /*System.out.println(file2.getName());
        System.out.println(file2.getAbsolutePath());*/

        //чтение из файла и вывод в консоль через reader посимвольно с приведением к char
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            int a = reader.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (a > 0) {
                stringBuilder.append((char) a);
                a = reader.read();
            }
            System.out.println(stringBuilder.toString());

            String s = new String(stringBuilder);
            s = s.replaceAll("\r\n", " ");
            int count = 0;

            StringBuilder stringBuilder1 = new StringBuilder(s);
            System.out.println(stringBuilder1);
            String[] strList = s.split(" ");

            List<String> polindroms = new ArrayList<>();
            for (int i = 0; i < strList.length; i++) {
                if (isPolindroms(strList[i]) == true) {
                    polindroms.add(strList[i]);
                }
            }
            polindroms.forEach(System.out::println);

            // запись в файл

            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            Writer writer = new OutputStreamWriter(fileOutputStream);
            for (String polindrom : polindroms) {
                writer.write(polindrom);
                writer.write("\n");
            }
            writer.close();// так как не прописали в try


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // с использованием класса Files и Stream
        /*List<String> result = new ArrayList<>();
        try {
            Stream<String> stream = Files.lines(Paths.get("hw1/input.txt"));
            // получаем объект Stream из метода Files.lines(), после чего применяем к нему
            result = stream
                    .filter(line -> isPolindroms(line)) //проверка на полиндром
                    .collect(Collectors.toList()); //объединяем все получившиеся строки в List с помощью метода collect()
            result.forEach(System.out::println); // вывод в консоль результата
        } catch (IOException e) {
            e.printStackTrace();
        }
        // запись содержимого List в файл 2
        try {
            Files.write(Paths.get("hw1/output.txt"), result, StandardOpenOption.WRITE);
            //WRITE - запись в уже созданный файл
            //CREAT - создание файла и запись в него содержимого
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/


    //проверка на полиндром
    public static boolean isPolindroms(String line) {
        StringBuilder strBuilder = new StringBuilder(line);
        strBuilder.reverse();
        return strBuilder.toString().equals(line);

    }

    // Вычислить количество строк в файле

    public static int CountLinesInFile(String filename) throws IOException {
        // 1. Объявить внутренние переменные
        int count = 0; // количество строк в файле - результат
        FileReader fr = null;
        int symbol;

        try {
            // 2. Попытка открыть файл для чтения
            fr = new FileReader(filename);

            // Цикл чтения символов из файла и подсчета их количества
            do {
                // Считать символ из файла
                symbol = fr.read();

                // Проверить, есть ли символ конца строки
                if ((char) symbol == '\n')
                    count++; // Увеличить количество строк в файле на 1
            } while (fr.ready()); // Проверка на конец файла
        } catch (IOException e) {
            // 3. Если файл не открыт, то вывести соответствующее сообщение
            System.out.println("I/O error: " + e);
        } finally {

            // 4. Закрыть файл, если он был открыт
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("File close error.");
            }
        }

        // 5. Вернуть результат
        return count;
    }

        /*
        String path = "folder1/folder2/folder3";
        File directories = new File(path);
        List<File> files = new ArrayList<>();
        files.add(new File(path + "/A1.txt"));
        files.add(new File(path + "/A2.txt"));
        files.add(new File(path + "/A3.txt"));
        files.add(new File(path + "/B1.txt"));
        files.add(new File(path + "/B2.txt"));
        directories.mkdirs();
        //создание файлов из списка файлов, помещенных в список List
        for (File file : files) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //сортировка файла по названию, начинаетсяс буквы А
        File[] filtered = directories.listFiles((dir, name) -> name.startsWith("A"));
        for (File file : filtered) {
            System.out.println(file.getAbsolutePath());
        }*/
}
