package eighteenth;

import eighteenth.vegetables.*;
import eighteenth.fruits.*;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList <Plant> plants = new ArrayList <> ();
        ArrayList <Fruit> multiFruit = new ArrayList <> ();

        plants.add(new Banana());
        plants.add(new Apple());
        plants.add(new Cucumber());
        plants.add(new Tomato());

        plants.stream()
                .filter(Fruit.class::isInstance)
                .map(Fruit.class::cast)
                .forEach(multiFruit::add);

        multiFruit.forEach(x -> System.out.println(x.getName()));
    }
}
