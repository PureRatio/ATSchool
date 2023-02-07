package tenth.thirdTask;

public class Snake {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int col = Integer.parseInt(args[1]);
        boolean direction = true;

        if(col <= 0 || n <= 0){
            System.out.println("Аргументы должны быть больше нуля");
            return;
        }

        for (int i = 1; i <= n; i++){
            if(direction)
                System.out.print(i);
            else {
                System.out.print(i+col-1-((i%(col+1))*2));
            }
            System.out.print(" ");
            if (i%col == 0){
                System.out.println("");
                direction = !direction;
            }
        }
    }
}
