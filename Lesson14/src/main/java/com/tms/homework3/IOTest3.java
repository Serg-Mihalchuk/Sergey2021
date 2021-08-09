package com.tms.homework3;

import java.io.IOException;

import static com.tms.homework3.TextFormarer.textFormater;

public class IOTest3 {
    public static void main(String[] args) {
        try {
            textFormater("hw3/inputText.txt", "hw3/BlackList.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
