package eighteenth;

import eighteenth.vegetables.*;

public class MainClass {
    public static void main(String[] args) {
        Vegetable cucumber = new Cucumber();
        Vegetable tomato = new Tomato();

        Basket<Vegetable> vegetableBasket = new Basket<>();

        vegetableBasket.addItem(cucumber);
        vegetableBasket.addItem(cucumber);
        vegetableBasket.addItem(cucumber);
        
        vegetableBasket.addItem(tomato);
        vegetableBasket.addItem(tomato);

        System.out.println(vegetableBasket.size());
    }
}
