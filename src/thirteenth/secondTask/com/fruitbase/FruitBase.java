package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FruitBase{
    private FruitCatalogue fruitCatalogue;
    FruitBase(){
        this.fruitCatalogue = new FruitCatalogue();
    }

    public Delivery takeOrder(String[] order){
        Fruit fruit;
        Delivery cargo = new Cargo();
        for (String fruitName : order){
            fruit = fruitCatalogue.findFruit(fruitName);
            if(fruit != null){
                cargo.addFruit(fruit);
            }
        }
        return cargo;
    }

    public void exportCatalogue(String path) throws IOException {
        if(Files.notExists(Paths.get(path))){
            throw new FileNotFoundException();
        }
        FileOutputStream outputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(fruitCatalogue);
        objectOutputStream.close();
        System.out.println("каталог экспортирован");
    }

    public void importCatalogue(String path) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        fruitCatalogue = (FruitCatalogue) objectInputStream.readObject();
        System.out.println("каталог импортирован");
    }
}
