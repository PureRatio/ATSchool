package eighth.secondTask;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 10;
        double x = 1.1d;
        double y = 5.5d;
        double z = 10.1d;
        Summa summa = new Summa();

        System.out.println(summa.sum(a, b));
        System.out.println(summa.sum(a, b, c));
        System.out.println(summa.sum(x, y));
        System.out.println(summa.sum(x, y, z));
        System.out.println(summa.sum(a, x, y));
        System.out.println(summa.sum(Integer.valueOf(a), Integer.valueOf(b)));
    }
}
