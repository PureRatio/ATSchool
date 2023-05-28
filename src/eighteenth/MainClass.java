package eighteenth;

import eighteenth.vegetables.*;
import eighteenth.fruits.*;

import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        Fruit kletchatka1 = new Banana();
        Fruit kletchatka2 = new Apple();
        Vegetable kletchatka3 = new Cucumber();
        Vegetable kletchatka4 = new Tomato();

        Basket<Vegetable> vegetableBasket = new Basket<>();
        Basket<Fruit> fruitBasket = new Basket<>();

        fruitBasket.addItem(kletchatka1);
        fruitBasket.addItem(kletchatka2);
        vegetableBasket.addItem(kletchatka3);
        vegetableBasket.addItem(kletchatka4);
        MainClass mc = new MainClass();
        mc.makeSalad(fruitBasket.getIterator());
        mc.makeSalad(vegetableBasket.getIterator());
    }

    public <T> void makeSalad(Iterator<T> plantIterator){
        System.out.print("Готовим салатик: ");
        while (plantIterator.hasNext()){
            System.out.print(plantIterator.next().getClass().getSimpleName() + " ");
        }
        System.out.println("\nУгощайся!");
    }
}
