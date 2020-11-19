package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int j = index; j < array.length; j++) {
                    if (array[j] != null) {
                        String value = array[point];
                        array[point] = array[j];
                        array[j] = value;
                        break;
                    }
                }
            }
        }
        return array;
    }
}
