package eighteenth;

import java.util.ArrayList;
import java.util.List;

public class Basket <T>{
    private List<T> arr;

    public Basket(){
        this.arr = new ArrayList<>();
    }

    public void addItem(T item){
        arr.add(item);
    }
}
