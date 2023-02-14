package twelfth;

public class FirstTask {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        for(int i = 0; i < array.length; i++){
            System.out.printf("%d ",array[i]);
        }
    }

    public static void fillArray(int[] array) {
        for(int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random()*19)- 9);
        }
    }
}
