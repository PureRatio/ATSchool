package ninth;

public class ThirdTask {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        if (year < 0 || year > 30000) {
            System.out.println("Ты ошибся");
            return;
        }
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
