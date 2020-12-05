package ru.job4j;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i] + " ";
        }
        return result.trim();
    }
}
