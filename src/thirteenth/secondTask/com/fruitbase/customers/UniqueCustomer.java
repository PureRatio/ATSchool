package thirteenth.secondTask.com.fruitbase.customers;

import java.util.ArrayList;
import java.util.List;

import thirteenth.secondTask.com.fruitbase.Cargo;
import thirteenth.secondTask.com.fruitbase.Delivery;
import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

public class UniqueCustomer extends Customer {

    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Delivery cargo) {
        for(Fruit fruit : findDistinction(cargo.getFruits())) {
            purchases.add(cargo.removeFruit(fruit));
        }
    }

    private List<Fruit> findDistinction(Fruit[] args){
        List<Fruit> arr = new ArrayList<>();
        for (Fruit x : args){
            if(!arr.contains(x))
                arr.add(x);
        }
        return arr;
    }
}
