package com.company;

public class PrefixAverage2 {

    private int[] numbers;


    public PrefixAverage2(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] run() {

        int[] A = new int[this.numbers.length];

        int s=0;

        for (int i=0;i<this.numbers.length;i++)
        {
            s = s + numbers[i];

            A[i] = s / (i + 1);
        }
        return A;
    }
}

