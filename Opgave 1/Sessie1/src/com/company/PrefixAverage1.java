package com.company;

public class PrefixAverage1 {

    private int[] numbers;


    public PrefixAverage1(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] run() {

        int[] A = new int[this.numbers.length];

        for (int i = 0; i < this.numbers.length; i++) {

            int a = 0;

            for (int j = 0; j < i; j++) {


                a = a + numbers[j];
            }

            A[i] = a / (i + 1);
        }
        return A;
    }

}

