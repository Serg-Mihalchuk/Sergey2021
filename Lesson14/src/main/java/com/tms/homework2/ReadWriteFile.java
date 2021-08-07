package com.tms.homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadWriteFile {

    public static void readFile(String filename) throws IOException {

        Stream<String> stream = Files.lines(Path.of(filename));
        // получаем объект Stream из метода Files.lines(), после чего применяем к нему
        //объединяем все получившиеся строки в List с помощью метода collect()
        List<String> result = stream
                .filter(line -> line != null && !line.isEmpty())
                .collect(Collectors.toList());
        result.forEach(System.out::println); // вывод в консоль результата

    }
}
