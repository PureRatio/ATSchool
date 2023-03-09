package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.FruitCatalogue;
import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

public class FruitBase {
    private FruitCatalogue fruitCatalogue;
    FruitBase(){
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Cargo takeOrder(String[] order){
        Fruit fruit;
        Cargo cargo = new Cargo();
        for (String fruitName : order){
            fruit = fruitCatalogue.findFruit(fruitName);
            if(fruit != null){
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();

        if(args.length == 0){
            return;
        }

        Cargo cargo = fruitBase.takeOrder(args);
        System.out.println("Общий вес груза: " + cargo.getWeight() + " " + "Общая цена груза: " + cargo.getPrice());
    }
}
