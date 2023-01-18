package seventh;

public class FourthTask {
    static final String inputPattern = "Дано: P = %f, r = %f, t = %f";
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        System.out.println(String.format(inputPattern, P, r, t));

        double x = P * Math.exp(r * t);
        System.out.println(x);
    }
}
