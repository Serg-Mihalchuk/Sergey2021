package com.tms.homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.tms.homework2.IsPolindrom.isPolindrom;
import static com.tms.homework2.WordsCount.countWordsInString;

public class TextFormatter {

    public static void textFormater(String filename) throws IOException {

        Stream<String> stream = Files.lines(Path.of(filename));
        // получаем объект Stream из метода Files.lines(), после чего применяем к нему
        //объединяем все получившиеся строки в List с помощью метода collect()
        List<String> result = stream
                .filter(line -> line != null && !line.isEmpty())
                .collect(Collectors.toList());
//        result.forEach(System.out::println); // вывод в консоль результата
//        System.out.println("");

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

//        можно сразу через BreakIterator результат поделить на слова !!!!!!!!!

//        strings.forEach(System.out::println);
//        System.out.println("");
        List<String> full = new ArrayList<>();
        for (String s : strings) {
            int count = countWordsInString(s);
            if ((count >= 3 && count <= 5) || isPolindrom(s)) {
                full.add(s);
            }

        }

        try {
            Files.write(Paths.get("hw2/output.txt"), full, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
