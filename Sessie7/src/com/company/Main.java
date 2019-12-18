package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {programTest();}


    public static void programTest()
    {
        try
        {
            Inschrijvingen per = new Inschrijvingen();
            per.read("D:\\Documenten\\UAsem3\\Java\\3-Datastructures\\Sessie7\\gegevens.txt");
            per.print();

        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

}
