package com.company;

public class Main {

    public static void main(String[] args) {

        PrintList();
        RemoveElement(6);
        InsertElementOld(3,50);
        InsertElementNew(3,50);
        RemoveElementNew(6);

    }


    public static void PrintList() {
        LList<Integer> exp = RandomGenerator.GenerateLList(10);

        String print = exp.toString();

        exp.moveToStart();


        for (int i = 0; i < exp.length(); i++) {

            System.out.println(exp.getValue());
            exp.next();
        }
        System.out.println("\n");


    }

    public static void RemoveElement(int location){

        LList<Integer> randomList = RandomGenerator.GenerateLList(10);
        String stringListStart = randomList.toString();
        System.out.println(stringListStart);

        location--;
        randomList.moveToPos(location);
        randomList.remove();

        randomList.moveToStart();
        String stringListEnd = randomList.toString();
        System.out.println(stringListEnd+"\n");

    }

    public static void InsertElementOld(int location,int number){

        LList<Integer> randomList = RandomGenerator.GenerateLList(10);
        String stringListStart = randomList.toString();
        System.out.println(stringListStart);

        randomList.moveToPos(location);
        randomList.insert(number);

        randomList.moveToStart();
        String stringListEnd = randomList.toString();
        System.out.println(stringListEnd+"\n");

    }

    public static void InsertElementNew(int location,int number){

        LList<Integer> randomList = RandomGenerator.GenerateLList(10);
        String stringListStart = randomList.toString();
        System.out.println(stringListStart);

        randomList.moveToPos(location);
        randomList.newInsert(number);

        randomList.moveToStart();
        String stringListEnd = randomList.toString();
        System.out.println(stringListEnd+"\n");

    }



    public static void RemoveElementNew(int location) {

        LList<Integer> randomList = RandomGenerator.GenerateLList(10);
        String stringListStart = randomList.toString();
        System.out.println(stringListStart);

        randomList.moveToPos(location);
        randomList.newRemove();

        randomList.moveToStart();
        String stringListEnd = randomList.toString();
        System.out.println(stringListEnd+"\n");

    }
}
