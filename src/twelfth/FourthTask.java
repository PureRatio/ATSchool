package twelfth;

import static twelfth.ThirdTask.bubbleSort;
import static twelfth.FirstTask.fillArray;

public class FourthTask {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        System.out.print("Создан массив: ");
        for(int num : array)
            System.out.printf("%d ",num);
        System.out.println();
        System.out.println("Медиана: " + median(array));
        System.out.print("Повторный ввод исходного массива: ");
        for(int num : array)
            System.out.printf("%d ",num);
    }
    static int median(int[] a){
        int[] b = a.clone();
        bubbleSort(b);
        if(b.length % 2 == 0){
            return (b[b.length/2] + b[b.length/2-1])/2;
        }
        else{
            return b[b.length/2];
        }
    }
}
