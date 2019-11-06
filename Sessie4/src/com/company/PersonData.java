package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class PersonData
{
    private ArrayList<Person> data;

    public  PersonData()
    {

    }

    public ArrayList<Person> Readfile(String pathname) throws IOException
    {
        for (String line: Files.readAllLines(Path.of(pathname)))
        {
            String[] dataString = line.split(" ");

            Person tempPerson = new Person(dataString[0], dataString[1], dataString[2]);

            data.add(tempPerson);
        }
        return data;
    }

    public void printList()
    {
        Iterator<Person>it= data.iterator();

        while(it.hasNext())
        {
            Person tempPerson=it.next();
            System.out.println(tempPerson.getSurname()+ "   "+tempPerson.getName()+"   "+tempPerson.getPlace());
        }

    }

}
