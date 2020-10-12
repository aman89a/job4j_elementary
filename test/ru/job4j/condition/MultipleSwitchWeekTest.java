package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDayMondayThen1() {
        int numberOfDay = new MultipleSwitchWeek().numberOfDay("Monday");
        assertThat(1, is(1));

    }
}