package thirteenth.secondTask.com.fruitbase.fruits;

import java.math.BigDecimal;

public class Pineapple extends Fruit{
    public Pineapple(){
        this.weight = 1D;
        this.price = new BigDecimal(300);
        this.name = "Pineapple";
        this.freshness = Freshness.FRESH;
    }
}
