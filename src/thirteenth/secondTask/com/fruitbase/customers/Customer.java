package thirteenth.secondTask.com.fruitbase.customers;

import java.util.ArrayList;

import thirteenth.secondTask.com.fruitbase.Cargo;
import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

public abstract class Customer {

    protected String name;
    protected ArrayList<Fruit> purchases;

    Customer(String name) {
        this.name = name;
        purchases = new ArrayList<Fruit>();
    }
    
    public abstract void takeFruits(Cargo cargo);

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i <purchases.size(); i++) {
            result += purchases.get(i).getName();
            if(i < purchases.size() - 1) result += ", ";
        }
        return "Customer " + name + " purchase: " + result;
    }
}
