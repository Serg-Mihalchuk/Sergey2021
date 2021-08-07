package com.tms.homework2;

public class WordsCount {

    public static int countWordsInString(String string) {

        return string.split("\\s+").length;

    }
}
