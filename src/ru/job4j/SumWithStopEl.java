package ru.job4j;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (el == data[i]) {
                break;
            }
            count += data[i];
        }
        if (count % 2 == 0) {
            return count;
        } else {
          return 0;
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(count(data, 7));
    }
}
