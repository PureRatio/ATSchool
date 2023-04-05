package thirteenth.secondTask.com.fruitbase;

import thirteenth.secondTask.com.fruitbase.fruits.Fruit;

import java.io.*;

public class FruitBase{
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

    public void exportCatalogue(){
        try(FileOutputStream outputStream = new FileOutputStream("src\\thirteenth\\secondTask\\com\\fruitbase\\fruitCatalogue.ser")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(fruitCatalogue);
            objectOutputStream.close();
            System.out.println("каталог экспортирован");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void importCatalogue(){
        try(FileInputStream fileInputStream = new FileInputStream("src\\thirteenth\\secondTask\\com\\fruitbase\\fruitCatalogue.ser")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            fruitCatalogue = (FruitCatalogue) objectInputStream.readObject();
            System.out.println("каталог импортирован");
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
