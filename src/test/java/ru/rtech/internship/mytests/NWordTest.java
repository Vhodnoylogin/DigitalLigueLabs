package ru.rtech.internship.mytests;

import org.junit.Test;
import ru.rtech.internship.Task1;

import static org.assertj.core.api.Assertions.assertThat;

public class NWordTest {
    protected Object ass;

    @Test
    public void tezd_1() {
        ass = assertThat(new Task1.Nword("vladimir").getCapitalizedWord().equals("Vladimir"));
    }
}
