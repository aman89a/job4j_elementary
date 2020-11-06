package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number){
        boolean prime = false;
        if (number == 2) {
            prime = true;
        }
        else {
            for (int i = 2; i < number; i++){
                    if (number % i == 0) {
                        prime = false;
                        break;
                    } else if ((number % number) == 0) {
                        prime = true;
                    }
                }
            }
        return prime;
    }
}
