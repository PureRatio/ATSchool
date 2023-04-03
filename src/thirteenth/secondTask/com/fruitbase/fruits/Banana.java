package thirteenth.secondTask.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Banana extends Fruit{
    public Banana(){
        this.weight = 0.3D;
        this.price = new BigDecimal(20);
        this.name = "Banana";
        this.freshness = Freshness.FRESH;
    }
}
