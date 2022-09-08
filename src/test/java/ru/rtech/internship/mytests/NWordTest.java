package ru.rtech.internship.mytests;

import org.junit.Test;
import ru.rtech.internship.Task1;

import static org.assertj.core.api.Assertions.assertThat;

public class NWordTest {
    protected static Object ass;

    @Test
    public void tezd_1() {
        ass = assertThat(Task1.capitalizedWord("vladimir").equals("Vladimir"));
    }

    @Test
    public void tezd_2() {
        ass = assertThat(Task1.capitalizedWord("vLADIMIr").equals("Vladimir"));
    }

    @Test
    public void tezd_3() {
        ass = assertThat(Task1.capitalizedWord("v").equals("V"));
    }

    @Test
    public void tezd_4() {
        ass = assertThat(Task1.capitalizedWord("").equals(""));
    }

    @Test
    public void tezd_5() {
        ass = assertThat(Task1.capitalizedWord("!!!!").equals("!!!!"));
    }

    @Test
    public void tezd_6() {
        ass = assertThat(Task1.capitalizedWord("!!!!fdgdgd").equals("!!!!fdgdgd"));
    }
}
