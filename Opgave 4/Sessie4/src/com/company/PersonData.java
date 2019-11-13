package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PersonData
{
    private ArrayList<Person> data;

    public  PersonData()
    {
        this.data = new ArrayList<>();
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
        ListIterator<Person> li =this.data.listIterator();
        int i=0;
        System.out.println("Alle Personen:");

        while(li.hasNext())
        {
            Person tempPerson=li.next();
            System.out.println(i+" "+tempPerson.getSurname()+ " "+tempPerson.getName()+" "+tempPerson.getPlace());
            i++;
        }
    }

    public void printName(String firstName)
    {
        ListIterator<Person>li = this.data.listIterator();
        System.out.println("\nDe personen met voornaam Albert:");

        while(li.hasNext())
        {
            Person tempPerson=li.next();
            if (tempPerson.getName().equals(firstName))
                System.out.println(tempPerson.getSurname()+ " "+tempPerson.getName()+" "+tempPerson.getPlace());

        }
    }

    public void printSurnameStartWith(String firstLetter)
    {
        ListIterator<Person> li = this.data.listIterator(data.size());
        System.out.println("\nPersonen met familienaam M*");
        while(li.hasPrevious())
        {
            Person tempPerson=li.previous();
            if (tempPerson.getSurname().substring(0,1).equals(firstLetter))
                System.out.println(tempPerson.getSurname()+ " "+tempPerson.getName()+" "+tempPerson.getPlace());

        }
    }

    public void PrintAddress(String birthPlace)
    {
        ArrayList<Integer> placeInList = new ArrayList<>();
        ListIterator<Person> li = this.data.listIterator();


        int i =0;
        while (li.hasNext())
        {
            Person tempPerson=li.next();
            if(tempPerson.getPlace().equals(birthPlace))
                placeInList.add(i);
            i++;
        }

        Iterator<Integer> it = placeInList.iterator();

        while(it.hasNext())
        {
            int tempInt =it.next();
            System.out.println(tempInt+" "+ data.get(tempInt).getSurname()+" "+data.get(tempInt).getName()+" "+data.get(tempInt).getPlace());
        }

    }
}
