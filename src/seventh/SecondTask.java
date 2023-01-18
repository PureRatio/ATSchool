package seventh;

public class SecondTask {
    static final String inputPattern = "Дано: a = %d, b = %d";
    static final String resultPattern = "После перестановки: a = %d, b = %d";
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(String.format(inputPattern, a, b));

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(String.format(resultPattern, a, b));
    }
}
