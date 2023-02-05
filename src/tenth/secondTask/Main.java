package tenth.secondTask;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int minutes = m*60;
        int allMinutes = 0;

        if(m <= 0 || n <= 0){
            System.out.println("Аргументы должны быть больше нуляа");
            return;
        }

        for(int i = 0; i < n; i ++){
            allMinutes += minutes + (i * 10);
        }

        System.out.printf("Бригада работало %d часов %d минут", allMinutes/60, allMinutes%60);
    }
}
