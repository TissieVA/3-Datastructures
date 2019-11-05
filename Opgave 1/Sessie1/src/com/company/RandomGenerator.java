package com.company;

import java.util.Random;

public class RandomGenerator {
    public static int[] GenerateArray(int size) {
        int[] out = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {

            out[i] = random.nextInt();
        }
        return out;
    }
}