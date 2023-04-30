package thirteenth.secondTask.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Orange extends Fruit{
    public Orange(){
        super(0.2D, new BigDecimal(40), "Orange", Freshness.FRESH);
    }
}
