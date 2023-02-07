package tenth.sixthTask;

public class Timer {
    public static void main(String[] args) {
        int s = Integer.parseInt(args[0]);

        if(s < 0){
            System.out.println("Аргументы должны быть больше нуля");
            return;
        }

        Timer timer = new Timer(s);
        timer.start();
    }
    private int seconds;
    public Timer(int seconds) {
        this.seconds = seconds;
    }

    void waitSecond() {
        long itsTimeToStop = System.currentTimeMillis() + 1000;
        while(System.currentTimeMillis() < itsTimeToStop);
    }

    void printTime() {
        System.out.printf("%02d:%02d\n", seconds / 60, seconds % 60);
    }

    void start() {
        for(;seconds > 0; seconds--) {
            printTime();
            waitSecond();
        }
        printTime();
    }
}
