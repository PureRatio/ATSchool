package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.*;

import java.io.Serializable;
import java.math.BigDecimal;

public class FruitCatalogue implements Serializable {
    private Fruit[] fruits;

    FruitCatalogue(){
        fruits = new Fruit[]{new Apple(), new Orange(), new Banana(), new Pineapple(), new Fruit(0.15D, new BigDecimal(100), "Mango", Freshness.FRESH) {}, new Fruit(0.1D, new BigDecimal(20), "Kiwi", Freshness.FRESH) {}};
    }

    Fruit findFruit(String fruitName){
        for (Fruit fruit : fruits){
            if(fruit.getName().equals(fruitName)){
                return fruit;
            }
        }
        return null;
    }
}
