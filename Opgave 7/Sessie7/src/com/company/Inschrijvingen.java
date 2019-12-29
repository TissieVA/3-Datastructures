package com.company;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Inschrijvingen
{

    ArrayList<TreeMap<String,Integer>> periodeArray;

    public Inschrijvingen()
    {
        this.periodeArray = new ArrayList();
        for (int i = 0; i < 4; i++) {
            this.periodeArray.add(new TreeMap<>());
        }
    }

    public void read (String pathname) throws IOException
    {

        for (String line: Files.readAllLines(Path.of(pathname)))
        {
            String[] dataString = line.split(" ");

            String vak = dataString[2];

            String periodeString = dataString[3];
            int tempPeriode =  Integer.parseInt(periodeString);

            TreeMap<String,Integer> map = periodeArray.get(tempPeriode-1);

            if(!map.containsKey(vak))
                map.put(vak,1);
            else
            {
                int value = map.get(vak);
                value ++;
                map.put(vak, value);
            }

        }
    }

    public void print()
    {
        for (int i = 0; i < periodeArray.size(); i++)
        {
            System.out.println("Periode "+(i+1));
            TreeMap<String,Integer> map = periodeArray.get(i);
            for (Map.Entry<String, Integer> entry : map.entrySet() )
            {
                System.out.println("        "+entry.getKey()+"   "+entry.getValue());
            }
        }
    }
}
