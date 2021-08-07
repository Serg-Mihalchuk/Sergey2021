package com.tms.homework2;

public class IsPolindrom {

    public static boolean isPolindrom(String line) {
        boolean result = false;
        line = line.toLowerCase();
        String[] words = line.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                StringBuilder strBuilder = new StringBuilder(words[i]);
                strBuilder.reverse();
                if (strBuilder.toString().equals(words[i])) {
                    result = true;
                }
            }

        }
        return result;
    }
}




