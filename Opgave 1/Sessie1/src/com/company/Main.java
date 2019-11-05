package com.company;

public class Main {


    public static void main(String[] args) {


            PerformTests(1000);

    }
    
    public static void PerformTests(int n) {

        long a, b, t1, t2;


            String dt1 = "", dt2 = "";

        for (int i = 1; i < n; i++) {
            int[] X = RandomGenerator.GenerateArray(i);
            PrefixAverage1 prefix1 = new PrefixAverage1(X);
            a = System.nanoTime();
            prefix1.run();
            b = System.nanoTime();
            t1 = b - a;
            PrefixAverage2 prefix2 = new PrefixAverage2(X);
            a = System.nanoTime();
            prefix2.run();
            b = System.nanoTime();
            t2 = b - a;

            String o1 = Long.toString(t1);
            dt1 = dt1 + o1 + ";";
            String o2 = Long.toString(t2);
            dt2 = dt2 + o2 + ";";

        }
        System.out.print(dt1);
        System.out.print("\n\n");
        System.out.print(dt2);

    }
}
