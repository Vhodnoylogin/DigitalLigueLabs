package ru.rtech.internship;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {

    private final Task1 task1 = new Task1();

    @Test
    public void oneWord() {
        assertThat(
                task1.capitalize("vladimir").equals("Vladimir")
        );
    }

    @Test
    public void twoWords() {
        assertThat(
                task1.capitalize("vladimir igorevich").equals("Vladimir Igorevich")
        );
    }

    @Test
    public void bigLetters() {
        assertThat(
                task1.capitalize("VLADIMIR IGOREVICH").equals("Vladimir Igorevich")
        );
    }

}