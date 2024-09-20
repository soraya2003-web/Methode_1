package com.loop;

public class AverageNumbers {
    public static void main(String[] args) {

        int total = 0;
        int avg;
        for (int i = 2; i <= 8; i++) {
            total = total + i;
        }
        avg = total / 7;
        System.out.println(avg);

    }
}
