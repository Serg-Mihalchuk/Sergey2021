package com.tms.homework3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.BreakIterator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TextFormarer {

    public static void textFormater(String filename, String blackList) throws IOException {

        Stream<String> stream1 = Files.lines(Path.of(filename));
        List<String> stringText = stream1
                .filter(line -> line != null && !line.isEmpty())
                .collect(Collectors.toList());

        Stream<String> stream2 = Files.lines(Path.of(blackList));
        List<String> string2 = stream2
                .filter(line -> line != null && !line.isEmpty())
                .collect(Collectors.toList());
//        stringText.forEach(System.out::println); // вывод в консоль результата
//        string2.forEach(System.out::println);
//        System.out.println("");

        //разбиваем полученный текст на строки
        //создаем новый List строк для работы
        List<String> resultText = new ArrayList<>();
        BreakIterator iterator = BreakIterator.getSentenceInstance();
        String source = null;
        for (String s : stringText) {
            source = s.replaceAll("(\r\n|\r|\n)", "");
            iterator.setText(source);
            int start = iterator.first();
            for (int end = iterator.next();
                 end != BreakIterator.DONE;
                 start = end, end = iterator.next()) {
                resultText.add(source.substring(start, end));
            }

        }

        resultText.forEach(System.out::println);
        System.out.println("");
        //полученные строки делим на массив слов
        List<String> fullTextWords = new ArrayList<>();
        for (String s : resultText) {
            String[] words = s.split("(?U)\\W+");
            for (String word : words) {
                fullTextWords.add(word);
            }
        }
//        fullTextWords.forEach(System.out::println);
        //список blackList делим на слова
        List<String> blackListWords = new ArrayList<>();
        for (String s : string2) {
            String[] wordsOfBlackList = s.split("(?U)\\W+");
            for (String word : wordsOfBlackList) {
                blackListWords.add(word);
            }
        }
//        blackListWords.forEach(System.out::println);

        //проверка на наличие слов из blackList
        fullTextWords.retainAll(blackListWords);
        //убираем повторяющиеся элементы BlackList с использованием HashSet
        Set<String> set = new HashSet<>(fullTextWords);
        fullTextWords.clear();
        fullTextWords.addAll(set);
        System.out.println();

        String[] resulOutStings = new String[fullTextWords.size()];
        for (int i = 0; i < fullTextWords.size(); i++) {
            resulOutStings[i] = fullTextWords.get(i);
        }
//        System.out.println(Arrays.toString(resulOutStings));


        if (fullTextWords.size() != 0) {
            System.out.println("В тексте присутствуют слова паразиты: " + fullTextWords);
            System.out.println("Текст не прошел проверку на цензуру");
            System.out.println("Необходимо исправить текст:");


//            for (String s : resultText) {
//                Set<String> setResultText = new HashSet<>(resultText);
//                resultText.clear();
//                resultText.addAll(setResultText);
//                String []
//                String[] words = s.split("(?U)\\W+");
//                for (int i = 0; i < words.length; i++) {
//                    for (int j = 0; j < setResultText.size(); j++) {
//                        System.out.println();
//                        if (words[i].equalsIgnoreCase(setResultText.toArray[j])) {
//                            System.out.println(s);
//                        }
//                    }
//                }
//            }
//
//        } else {
//            System.out.println("Текст прошел проверку на цензуру");
//        }


        }
    }
}



