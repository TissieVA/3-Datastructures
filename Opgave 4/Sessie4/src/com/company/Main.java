package com.company;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        programTest();
    }

    public static void programTest()
    {
        try {
            PersonData testData = new PersonData();
            testData.Readfile("D:\\Documenten\\UAsem3\\Java\\3-Datastructures\\Sessie4\\ListData.txt");
            testData.printList();
            testData.printName("Albert");
            testData.printSurnameStartWith("M");
            testData.PrintAddress("Antwerpen");


        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
