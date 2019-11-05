package com.company;

import java.util.Random;

public class RandomGenerator {
    public static LList<Integer> GenerateLList(int size) {
        LList<Integer> out = new LList<Integer>();

        Random random = new Random();

        for (int i = 0; i < size; i++)
        {
            out.append(random.nextInt(10)+1);
        }
        return out;
    }
}

