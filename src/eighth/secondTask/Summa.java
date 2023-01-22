package eighth.secondTask;

public class Summa {
    int a;
    int b;
    int c;
    double x;
    double y;
    double z;

    private int sum(int a, int b){
        return a + b;
    }

    private double sum(int a, int b, int c){
        return a + b + c;
    }

    private double sum(double x, double y){
        return x + y;
    }

    private double sum(double x, double y, double z){
        return x + y + z;
    }

    private double sum(int a, double x, double y){
        return a + x + y;
    }

    /*private double sum(int a, int b){ // не получилось
        return a + b;
    }*/

    private double sum(Integer a, Integer b){
        return a + b;
    }

    @Override
    public String toString(){
        return sum(a, b) + "\n" +
                sum(a, b, c) + "\n" +
                sum(x, y) + "\n" +
                sum(x, y, z) + "\n" +
                sum(a, x, y) + "\n" +
                // sum(a, b) + "\n" +
                sum(Integer.valueOf(a), Integer.valueOf(b));
    }

    public static void main(String[] args) {
        System.out.println(new Summa());
    }
}
