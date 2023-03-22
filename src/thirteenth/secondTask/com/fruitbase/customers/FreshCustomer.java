package thirteenth.secondTask.com.fruitbase.customers;

import thirteenth.secondTask.com.fruitbase.Cargo;

public class FreshCustomer extends Customer {

    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Cargo cargo) {
        for(var fruit : cargo.getFruits()){
            if(fruit.isFresh())
                purchases.add(cargo.removeFruit(fruit));
        }
    }
}
