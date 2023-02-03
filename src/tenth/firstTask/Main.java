package tenth.firstTask;

public class Main {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        for(int x = m; x < n; x++){
            if(x%3 == 0 && x%5 != 0){
                System.out.println(x);
            }
        }
    }
}
