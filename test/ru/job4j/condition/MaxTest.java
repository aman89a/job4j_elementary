package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax5to4Then5() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));

    }

    @Test
    public void whenMax5to4Then5then3() {
        int result = Max.max(5, 4, 3);
        assertThat(result, is(5));

    }

    @Test
    public void whenMax5to4Then5then3then2() {
        int result = Max.max(5, 4, 3, 2);
        assertThat(result, is(5));

    }
}