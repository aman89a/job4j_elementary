package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {

        int count = 0;
        int temp = array.length - 1;
        int value = 0;
        for (int i = array.length / 2; i > 0; --i) {
            value = array[count];
            array[count] = array[temp];
            array[temp] = value;
            count++;
            temp--;
        }
        return array;
    }
}
