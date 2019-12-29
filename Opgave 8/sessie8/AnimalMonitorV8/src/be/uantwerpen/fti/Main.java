package be.uantwerpen.fti;

import java.util.List;

// this is the Java 8 version (chapter 05 - BlueJ
public class Main {

    public static void main(String[] args) {

        AnimalMonitor aM = new AnimalMonitor();
        aM.addSightings("sightingsNew.csv");
        System.out.println("*** all observations ");
        aM.printList();
        System.out.println("\n*** all Buffalo observations ");
        aM.printSightingsOf("Buffalo");

        System.out.println("\n*** all Topi observations ");
        aM.printSightingsOf("Topi");

        System.out.println("\n*** all observations at Odzala National Park");
        aM.printSightingsAt("Odzala National Park");

        System.out.println("\n*** all observations by Francis");
        aM.printSightingsBy("Francis");

        System.out.println("\n*** all buffalos by Jean");
        aM.printAllAnimalsBy("Jean", "Buffalo");

        System.out.println("\n*** all observations (short) by Francis");
        aM.printShortSightingsBy("Francis");

        System.out.println("\n*** amount of buffalo's spotted");
        System.out.println(aM.getCountOfAnimal("Buffalo"));

        System.out.println("\n*** amount of Topi's spotted by Francis");
        System.out.println(aM.getCountOfAnimalsSeenBy("Topi","Francis"));

        System.out.println("\n*** animals spotted by Jean");
        List<Sighting> list = aM.listSightingsBy("Jean");

        for (Sighting sight: list)
        {
            System.out.println(sight.getAnimal());
        }

        System.out.println("\n*** map of animals spotted by Jean");
        aM.makeMapOf("Jean");

    }
}
