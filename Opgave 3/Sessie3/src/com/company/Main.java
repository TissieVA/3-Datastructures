package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args)
    {
    checkString("(3+2*{AB-C}/[35°])");
    checkString("(Dit is een [testString) ");

    }

    public static void checkString(String testString)
    {
        Parser parser= new Parser();
        if (parser.parse(testString))
        {
            System.out.println("Text was correct.");
        }
        else if(!parser.parse(testString))
        {
            System.out.println("The text was incorrect.");
        }
        else
        {
            System.out.println("Something went wrong.");
        }


    }
}


