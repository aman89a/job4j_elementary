package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenNameOfDay1ThenMonday() {
        String day = new SwitchWeek().nameOfDay(1);
        assertThat(day, is("Понедельник"));
    }

    @Test
    public void whenNameOfDay12ThenError() {
        String day = new SwitchWeek().nameOfDay(12);
        assertThat(day, is("Ошибка"));
    }
}