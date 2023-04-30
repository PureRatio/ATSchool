package thirteenth.secondTask.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Apple extends Fruit{
    public Apple(){
        super(0.2D, new BigDecimal(25), "Apple", Freshness.FRESH);
    }
}
