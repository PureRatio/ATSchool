package thirteenth.secondTask.com.fruitbase;

import java.util.ArrayList;

import thirteenth.secondTask.com.fruitbase.customers.Customer;
import thirteenth.secondTask.com.fruitbase.customers.FreshCustomer;
import thirteenth.secondTask.com.fruitbase.customers.UniqueCustomer;

public class Simulation {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new FreshCustomer("Oleg"));
        customers.add(new UniqueCustomer("Vasiliy"));

        FruitBase fruitBase = new FruitBase();
        Simulation simulation = new Simulation();

        for (int i = 0; i < args.length; i++){
            if (args[i].equals("-e") || args[i].equals("--export")){
                fruitBase.exportCatalogue(simulation.findPath(args, i));
            }
            if (args[i].equals("-i") || args[i].equals("--import")){
                fruitBase.importCatalogue(simulation.findPath(args, i));
            }
        }

        for(Customer customer : customers) {
            Delivery cargo = fruitBase.takeOrder(args);
            System.out.println("Общий вес груза: " + cargo.getWeight() + " Общая цена груза: " + cargo.getPrice());
            customer.takeFruits(cargo);
            System.out.println(customer);
            System.out.println("Общий вес груза: " + cargo.getWeight() + " Общая цена груза: " + cargo.getPrice());
            System.out.println();
        }
    }
    public String findPath(String[] arr, int index){
        if (index + 2 >= arr.length){
            return null;
        }
        if (arr[index + 1].equals("=")){
            return arr[index + 2];
        }
        return null;
    }
}
