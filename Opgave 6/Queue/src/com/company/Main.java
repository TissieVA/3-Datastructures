package com.company;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(TestQueue.class);

        for(Failure fail : result.getFailures())
        {
            System.out.println(fail.toString());
        }
        if (result.wasSuccessful())
            System.out.println("Everything went successfully.");
        else
            System.out.println("Not all test were correct.");
    }
}