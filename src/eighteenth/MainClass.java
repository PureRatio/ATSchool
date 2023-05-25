package eighteenth;

import eighteenth.vegetables.*;
import eighteenth.fruits.*;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        ArrayList <Plant> plants = new ArrayList <> ();
        HashMap <String, Plant> hashMapPlants = new HashMap <> ();

        plants.add(new Banana());
        plants.add(new Apple());
        plants.add(new Cucumber());
        plants.add(new Tomato());

        plants.forEach(plant -> hashMapPlants.put(plant.getName(), plant));

        hashMapPlants.forEach((key, value) -> System.out.println(key + " " + value.getClass().getSimpleName()));
    }
}
