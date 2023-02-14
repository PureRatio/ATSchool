package twelfth;

import java.util.Random;

public class FifthTask {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] array = new int[rng.nextInt(6)][];

        for(int i = 0; i < array.length; i++) {
            array[i] = new int[rng.nextInt(8)];
            fillArray(array[i]);
        }

        sortBySumm(array);

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void fillArray(int[] array) {
        Random rng = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rng.nextInt(19) - 9;
        }
    }

    public static int summ(int[] array) {
        int result = 0;
        for(int num : array) {
            result += num;
        }
        return result;
    }

    public static void sortBySumm(int[][] arr) {
        for (int i=0;i<arr.length-1;++i){
            for(int j=0;j<arr.length-i-1; ++j){
                if(summ(arr[j+1]) > summ(arr[j])){
                    int[] swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
}
