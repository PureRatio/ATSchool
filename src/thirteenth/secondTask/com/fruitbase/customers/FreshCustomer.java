package thirteenth.secondTask.com.fruitbase.customers;

import thirteenth.secondTask.com.fruitbase.Cargo;
import thirteenth.secondTask.com.fruitbase.Delivery;
import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

public class FreshCustomer extends Customer {

    public FreshCustomer(String name) {
        super(name);
    }

    @Override
    public void takeFruits(Delivery cargo) {
        for(Fruit fruit : cargo.getFruits()){
            if(fruit.isFresh()) {
                Fruit temp = cargo.removeFruit(fruit);
                if (temp != null)
                    purchases.add(temp);
            }
        }
    }
}
