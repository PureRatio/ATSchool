package thirteenth.secondTask.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit{
    public Apple(){
        this.weight = 0.2D;
        this.price = new BigDecimal(25);
        this.name = "Apple";
        this.freshness = Freshness.FRESH;
    }
}
