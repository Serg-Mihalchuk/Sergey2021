package com.tms.homework;

import java.io.File;
import java.io.IOException;

public class IOTest {
    public static void main(String[] args) {
        File directory = new File("hw1");
        File file = new File("hw1/input.txt");
        File directory2 = new File("hw2");
        File file2 = new File("hw2/input.txt");
        try {
            directory.mkdir();
            directory2.mkdir();
            file.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getName());
        System.out.println(file2.getAbsolutePath());

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
}
