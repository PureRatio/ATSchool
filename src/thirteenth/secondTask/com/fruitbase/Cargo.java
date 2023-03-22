package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cargo {
    ArrayList<Fruit> fruits;

    Cargo(){
        fruits = new ArrayList<Fruit>();
    }

    public double getWeight(){
        double weight = 0;
        for(Fruit fruit : fruits){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public BigDecimal getPrice(){
        BigDecimal price = new BigDecimal(0);
        for(Fruit fruit : fruits){
            price = price.add(fruit.getPrice());
        }
        return price;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public Fruit removeFruit(Fruit fruit){
        if(fruits.contains(fruit)) {
            fruits.remove(fruit);
            return fruit;
        }
        return null;
    }

    void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
}
