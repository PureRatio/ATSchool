package thirteenth.secondTask.com.fruitbase;

import java.io.FileNotFoundException;
import java.io.IOException;
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

        for (String arg : args) {
            if (arg.contains("-e") || arg.contains("--export")) {
                String path = simulation.findPath(arg);
                try {
                    fruitBase.exportCatalogue(path);
                } catch (FileNotFoundException e) {
                    System.out.println("Не найден файл");
                    return;
                } catch (IOException e) {
                    System.out.println("Ошибка при экспорте каталога в " + path);
                    return;
                } catch (Exception e) {
                    System.out.println("Непредведенная ошибка при экспорте каталога из файла");
                    return;
                }
            }

            if (arg.contains("-i") || arg.contains("--import")) {
                String path = simulation.findPath(arg);
                try {
                    fruitBase.importCatalogue(path);
                } catch (FileNotFoundException e) {
                    System.out.println("Не найден файл");
                    return;
                } catch (IOException e) {
                    System.out.println("Ошибка при импорте каталога из " + path);
                    return;
                } catch (Exception e) {
                    System.out.println("Непредведенная ошибка при импорте каталога из файла");
                    return;
                }
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
    public String findPath(String str){
        if (str.contains("=")){
            String[] result;
            result = str.split("=");
            return result[result.length-1];
        }
        else {
            return null;
        }
    }
}
