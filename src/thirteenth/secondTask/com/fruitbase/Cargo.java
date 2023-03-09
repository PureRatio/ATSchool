package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.Arrays;

public class Cargo {
    Fruit[] fruits;

    Cargo(){
        fruits = new Fruit[0];
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

    void addFruit(Fruit fruit){
        fruits = Arrays.copyOf(fruits, fruits.length+1);
        fruits[fruits.length-1] = fruit;
    }
}
