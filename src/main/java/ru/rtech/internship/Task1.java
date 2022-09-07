package ru.rtech.internship;

public class Task1 {


    /**
     * Напишите реализацию метода, который делает первую букву каждого слова большой остальные маленькими
     * (гляньте в тесты если не понятно описание выше!)
     * =)
     */
    public String capitalize(String str) {
        throw new UnsupportedOperationException("Удалите эту строку и напишите реализацию");
    }

    public static class Nword {
        protected String headWord = "";
        protected String tailWord = "";

        public Nword(String word) {
            if (word == null || word.isEmpty()) return;
            this.headWord = word.substring(0, 1);
            this.tailWord = word.substring(1);
        }

        public String getCapitalizedWord() {
            return this.headWord.toUpperCase() + this.tailWord.toLowerCase();
        }
    }
}
