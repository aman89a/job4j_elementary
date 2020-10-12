package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void maxIsFirst() {
        int max = MultiMax.max(3, 2, 1);
        assertThat(max, is(3));
    }

    @Test
    public void maxIsSecond() {
        int max = MultiMax.max(2, 3, 1);
        assertThat(max, is(3));
    }

    @Test
    public void maxIsThird() {
        int max = MultiMax.max(1, 2, 3);
        assertThat(max, is(3));
    }
}