package thirteenth.secondTask.com.fruitbase.fruits;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class Fruit implements Serializable {
    protected double weight;
    protected BigDecimal price;
    protected String name;
    protected Freshness freshness;

    public double getWeight(){
        return weight;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Double.valueOf(weight).hashCode();
        hash = 17 * hash + price.hashCode();
        hash = 17 * hash + name.hashCode();
        hash = 17 * hash + freshness.hashCode();
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Fruit)) {
            return false;
        }
        
        Fruit f = (Fruit) o;

        return Objects.equals(this.freshness, f.freshness) &&
                Objects.equals(this.weight, f.weight) &&
                Objects.equals(this.price, f.price) &&
                Objects.equals(this.name, f.name);
    }

    public boolean isFresh() {
        return freshness == Freshness.FRESH;
    }
}
