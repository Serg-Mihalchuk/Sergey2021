package com.tms.homework2;


import java.io.IOException;

import static com.tms.homework2.TextFormatter.textFormater;

public class IOTest2 {
    public static void main(String[] args) throws IOException {

        String file = "hw2/input.txt";
        textFormater(file);
    }
}

