package ru.rtech.internship;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    public static String capitalizedWord(String word) {
        if (word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase()
                + word.substring(1).toLowerCase();
    }

    /**
     * Напишите реализацию метода, который делает первую букву каждого слова большой остальные маленькими
     * (гляньте в тесты если не понятно описание выше!)
     * =)
     */
    public String capitalize(String str) {
//        throw new UnsupportedOperationException("Удалите эту строку и напишите реализацию");
        String DELIM = " ";
        return Arrays.stream(str.split(DELIM))
                .map(Task1::capitalizedWord)
                .collect(Collectors.joining(DELIM));
    }
}
