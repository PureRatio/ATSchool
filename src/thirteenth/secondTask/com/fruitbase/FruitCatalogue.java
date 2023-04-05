package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.*;

import java.io.Serializable;

public class FruitCatalogue implements Serializable {
    private Fruit[] fruits;

    FruitCatalogue(){
        fruits = new Fruit[]{new Apple(), new Orange(), new Banana(), new Pineapple()};
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
