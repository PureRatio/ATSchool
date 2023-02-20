package twelfth;

import java.util.Random;

public class FifthTask {
    public static void main(String[] args) {
        Random rng = new Random();
        int[][] arr = new int[rng.nextInt(6)][];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[rng.nextInt(8)];
            fillArray(arr[i]);
        }

        System.out.println("Вывод исходного массива:");
        printJaggedArr(arr);

        sortBySumm(arr);

        System.out.println("Вывод отсортированного массива:");
        printJaggedArr(arr);
    }

    static void fillArray(int[] array) {
        Random rng = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rng.nextInt(19) - 9;
        }
    }

    static int summ(int[] array) {
        int result = 0;
        for(int num : array) {
            result += num;
        }
        return result;
    }

    static void sortBySumm(int[][] arr) {
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

    static void printJaggedArr(int[][] arr) {
        System.out.println("Rows count: " + arr.length);
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Columns count: %d, summ: %d {", arr[i].length, summ(arr[i]));
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("}\n");
        }
    }
}
