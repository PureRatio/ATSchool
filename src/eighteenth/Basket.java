package eighteenth;

public class Basket <T>{
    private Object[] arr;
    int i;

    public Basket(int capacity){
        arr = new Object[capacity];
    }

    public void addItem(T item){
        arr[i] = item;
        i++;
    }
}
