package ninth;

public class FifthTask {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);

        if(a < 0 || b < 0 || c < 0 || d < 0){
            System.out.println("Среди аргументов есть неподходящее число");
            return;
        }

        int cost = (int)(a * 100 + b);
        int paid = (int)(c * 100 + d);

        if(cost > paid)
        {
            System.out.println("У тебя недостаточно денег");
            return;
        }

        int change = paid - cost;
        int e = change / 100;
        int f = change % 100;

        System.out.printf("Сдача составит %d рублей и %d копеек.", e, f);
    }
}
