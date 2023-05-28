package eighteenth;

import java.util.HashMap;
import java.util.Iterator;

public class Basket <T>{
    private HashMap<T, Void> arr;

    public Basket(){
        this.arr = new HashMap<>();
    }

    public void addItem(T item){
        arr.put(item, null);
    }

    public Iterator<T> getIterator(){
        return arr.keySet().iterator();
    }
}
