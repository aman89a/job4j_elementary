package ru.job4j;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        char temp = ' ';
        for (int i = 1; i <= seq.length / 2; i++) {
            temp = seq[i - 1];
            seq[i - 1] = seq[seq.length - i];
            seq[seq.length - i] = temp;
        }
        return seq;
    }

    public static void main(String[] args) {
        System.out.print(DestroySequence.destroy("1111100000".toCharArray()));
    }
}
