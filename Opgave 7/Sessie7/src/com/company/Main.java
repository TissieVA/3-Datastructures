package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {programTest();}


    public static void programTest()
    {
        try
        {
            Inschrijvingen insch = new Inschrijvingen();
            insch.read("D:\\Documenten\\UAsem3\\Java\\3-Datastructures\\Sessie7\\gegevens.txt");
            insch.print();

        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
