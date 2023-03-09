package thirteenth.secondTask.com.fruitbase.fruits;

import java.math.BigDecimal;

public abstract class Fruit {
    protected double weight;
    protected BigDecimal price;
    protected String name;

    public double getWeight(){
        return weight;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
