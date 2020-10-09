package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to30Then3() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 0;
        double expected = 3.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when00to22Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when10to20Then1() {
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 1.00;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

    }
}