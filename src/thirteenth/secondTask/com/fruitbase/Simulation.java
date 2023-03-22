package thirteenth.secondTask.com.fruitbase;

import java.util.ArrayList;

import thirteenth.secondTask.com.fruitbase.customers.Customer;
import thirteenth.secondTask.com.fruitbase.customers.FreshCustomer;
import thirteenth.secondTask.com.fruitbase.customers.UniqueCustomer;

public class Simulation {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new FreshCustomer("Oleg"));
        customers.add(new UniqueCustomer("Vasiliy"));

        FruitBase fruitBase = new FruitBase();

        for(var customer : customers) {
            Cargo cargo = fruitBase.takeOrder(args);
            System.out.println("Общий вес груза: " + cargo.getWeight() + " " + "Общая цена груза: " + cargo.getPrice());
            customer.takeFruits(cargo);
            System.out.println(customer);
            System.out.println("Общий вес груза: " + cargo.getWeight() + " " + "Общая цена груза: " + cargo.getPrice());
            System.out.println();
        }
    }
}
