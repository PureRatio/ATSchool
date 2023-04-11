package thirteenth.secondTask.com.fruitbase.customers;

import java.util.ArrayList;
import java.util.List;

import thirteenth.secondTask.com.fruitbase.Cargo;
import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

public abstract class Customer {

    protected String name;
    protected List<Fruit> purchases;

    Customer(String name) {
        this.name = name;
        purchases = new ArrayList<>();
    }
    
    public abstract void takeFruits(Cargo cargo);

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Customer ")
                .append(name)
                .append(" purchase: ")
                .append(result);
        for(int i = 0; i <purchases.size(); i++) {
            result.append(purchases.get(i).getName());
            if(i < purchases.size() - 1) result.append(", ");
        }
        return result.toString();
    }
}
