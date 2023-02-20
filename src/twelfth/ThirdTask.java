package twelfth;

import static twelfth.FirstTask.fillArray;

public class ThirdTask {
    public static void main(String[] args) {
        int[] array = new int[20];
        fillArray(array);
        for(int num : array)
            System.out.printf("%d ",num);
        System.out.println();
        bubbleSort(array);
        for(int num : array)
            System.out.printf("%d ",num);
    }
    static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
