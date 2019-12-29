package be.uantwerpen.fti;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Monitor counts of different types of animal.
 * Sightings are recorded by spotters.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.03.01 (functional)
 */
public class AnimalMonitor
{
    private ArrayList<Sighting> sightings;

    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor()
    {
        this.sightings = new ArrayList<>();
    }

    /**
     * Add the sightings recorded in the given filename to the current list.
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename)
    {
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
    }

    /**
     * Print details of all the sightings.
     */
    public void printList()
    {
        sightings.forEach(sighting -> System.out.println(sighting.getDetails()));
    }

    /**
     * Print details of all the sightings of the given animal.
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal)
    {
        sightings.stream()
                .filter(sighting -> animal.equals(sighting.getAnimal()))
                .forEach(sighting -> System.out.println(sighting.getDetails()));
    }

    public void printSightingsAt(String area)
    {
        sightings.stream()
                .filter(sighting -> area.equals(sighting.getArea()))
                .forEach(sighting -> System.out.println(sighting.getDetails()));
    }

    public void printSightingsBy(String spotter)
    {
        sightings.stream()
                .filter(sighting -> spotter.equals(sighting.getSpotter()))
                .forEach(sighting -> System.out.println(sighting.getDetails()));
    }

    public void printAllAnimalsBy(String spotter, String animal)
    {
        sightings.stream()
                .filter(sighting -> spotter.equals(sighting.getSpotter()))
                .filter(sighting -> animal.equals(sighting.getAnimal()))
                .forEach(sighting -> System.out.println(sighting.getDetails()));
    }

    public void printShortSightingsBy(String spotter)
    {
        sightings.stream()
                .filter(sighting -> spotter.equals(sighting.getSpotter()))
                .forEach(sighting -> System.out.println(sighting.shortDetails()));
    }
    
    /**
     * Return a count of the number of sightings of the given animal.
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCountOfAnimal(String animal)
    {
        return sightings.stream()
                .filter(sighting -> animal.equals(sighting.getAnimal()))
                .map(sighting -> sighting.getCount())
                .reduce(0, (runningSum, count) -> runningSum + count);
    }



    public int getCountOfAnimalsSeenBy(String animal, String spotter)
    {
        return sightings.stream()
                    .filter(sighting -> animal.equals(sighting.getAnimal()))
                    .filter(sighting -> spotter.equals(sighting.getSpotter()))
                    .map(sighting -> sighting.getCount())
                    .reduce(0, (runningSum, count) -> runningSum + count);
    }

    public List<Sighting> listSightingsBy (String spotter)
    {

         return sightings.stream()
                .filter(sighting -> spotter.equals(sighting.getSpotter()))
                .collect(Collectors.toCollection(ArrayList::new));

    }



    public void makeMapOf (String spotter)
    {
        List<Sighting> spotting = listSightingsBy(spotter);
        Map<String, Integer> mapInfo =
                (Map<String, Integer>) spotting.stream()
                        .collect(Collectors.groupingBy
                                (Sighting::getAnimal,Collectors.summingInt
                                        (Sighting::getCount)));

        System.out.println(spotter+":");
        for(Map.Entry<String, Integer> entry : mapInfo.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }


}
