package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when01to02Then2() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 2, 3);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when001to023Then282() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 2, 3);
        double expected = 2.82;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}