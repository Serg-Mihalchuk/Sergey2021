package com.tms.homework2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.tms.homework2.IsPolindrom.isPolindrom;
import static com.tms.homework2.WordsCount.countWordsInString;

public class IOTest2 {
    public static void main(String[] args) throws IOException {

        String file = "hw2/input.txt";
        String res = null;

        Stream<String> stream = Files.lines(Path.of(file));
        // получаем объект Stream из метода Files.lines(), после чего применяем к нему
        //объединяем все получившиеся строки в List с помощью метода collect()
        List<String> result = stream
                .filter(line -> line != null && !line.isEmpty())
                .collect(Collectors.toList());
        result.forEach(System.out::println); // вывод в консоль результата
        System.out.println("");

        //разбиваем полученный текст на строки
        //создаем новый List строк для работы
        List<String> strings = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getSentenceInstance();
        String source = null;
        for (String s : result) {
            source = s.replaceAll("(\r\n|\r|\n)", "");
            iterator.setText(source);
            int start = iterator.first();
            for (int end = iterator.next();
                 end != BreakIterator.DONE;
                 start = end, end = iterator.next()) {
                strings.add(source.substring(start, end));
            }

        }

        strings.forEach(System.out::println);
        System.out.println("");
        for (String s : strings) {
            int count = countWordsInString(s);
            if ((count >= 3 && count <= 5) || isPolindrom(s)) {
                System.out.println(s);
            }

        }

    }
}

