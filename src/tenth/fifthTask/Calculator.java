package tenth.fifthTask;

public class Calculator {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String sign = args[1];
        int y = Integer.parseInt(args[2]);

        switch (sign) {
            case "+":
                System.out.println(Calculator.add(x, y));
                break;
            case "-":
                System.out.println(Calculator.sub(x, y));
                break;
            case "*":
                System.out.println(Calculator.mult(x, y));
                break;
            case "/":
                System.out.println(Calculator.divide(x, y));
                break;
            default:
                System.out.println("Допустимы только операции +, -, *, /");
                System.exit(0);
        }
    }
    static int add(int x, int y) { return x + y; }
    static int sub(int x, int y) { return x - y; }
    static int mult(int x, int y) { return x * y; }
    static int divide(int x, int y) {
        if(y == 0) {
            System.out.println("Операция не может быть выполнена");
            System.exit(0);
        }
        return x / y;
    }
}

