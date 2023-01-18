package seventh;

public class ThirdTask {
    static final String inputPattern = "Дано: a = %d, b = %d";
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(String.format(inputPattern, a, b));

        System.out.println(a % b == 0);
    }
}
