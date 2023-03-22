package thirteenth.secondTask.com.fruitbase.customers;

import java.util.ArrayList;
import thirteenth.secondTask.com.fruitbase.Cargo;
import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

public class UniqueCustomer extends Customer {

    public UniqueCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        for(var fruit : findDistinction(cargo.getFruits())) {
            purchases.add(cargo.removeFruit(fruit));
        }
    }

    private ArrayList<Fruit> findDistinction(ArrayList<Fruit> args){
        ArrayList<Fruit> arr = new ArrayList<Fruit>();
        for (Fruit x : args){
            if(!arr.contains(x))
                arr.add(x);
        }
        return arr;
    }
}
