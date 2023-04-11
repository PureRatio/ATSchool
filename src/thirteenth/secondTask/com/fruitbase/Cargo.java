package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo implements Delivery{
    List<Fruit> fruits;

    Cargo(){
        fruits = new ArrayList<>();
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

    public Fruit[] getFruits() {
        return fruits.toArray(new Fruit[0]);
    }

    public Fruit removeFruit(Fruit fruit){
        if(fruits.contains(fruit)) {
            fruits.remove(fruit);
            return fruit;
        }
        return null;
    }

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }
}
