package thirteenth.secondTask.com.fruitbase;

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
}
