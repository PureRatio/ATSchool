package tenth.fourthTask;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        while(!isPrime(nextInt(n)));
    }
    static int n = 100;

    static boolean isPrime(int x) {
        if(x % 2 == 0) return false;
        int halfX = x / 2;
        for(int i = 3; i < halfX; i+=2) {
            if(x % i == 0) return false;
        }
        return true;
    }

    static int nextInt(int x) {
        return new Random().nextInt(x);
    }
}
