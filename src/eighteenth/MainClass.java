package eighteenth;

import eighteenth.vegetables.*;
import eighteenth.fruits.*;

public class MainClass {
    public static void main(String[] args) {
        Fruit kletchatka1 = new Banana();
        Vegetable kletchatka2 = new Cucumber();

        Basket<Vegetable> vegetableBasket = new Basket<>(5);
        Basket<Fruit> fruitBasket = new Basket<>( 5);

        fruitBasket.addItem(kletchatka1);
        vegetableBasket.addItem(kletchatka2);
    }
}
