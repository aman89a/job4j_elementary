package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumFromZeroToTenThenFityFive() {
        int rsl = Counter.sum(0,10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenSumByEvenFromZeroToTenThenThirty() {
        int rsl = Counter.sumByEven(0, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumByEvenFrom3To8Then18() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }

}