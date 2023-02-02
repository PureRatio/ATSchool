package ninth;

public class FourthTask {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if(a < 0 || b < 0 || c < 0){
            System.out.println("Среди аргументов есть не натуральное число");
            return;
        }

        if(a%1 != 0 || b%1 != 0 || c%1 != 0){
            System.out.println("Среди аргументов есть не натуральное число");
            return;
        }

        if(a == 0 || b == 0 || c == 0){
            System.out.println("Impossible");
            return;
        }

        double longestSide;
        double side1;
        double side2;

        if(a > b)
        {
            longestSide = a;
            side1 = b;
        }
        else {
            longestSide = b;
            side1 = a;
        }
        if (longestSide > c)
        {
            side2 = c;
        }
        else
        {
            side2 = longestSide;
            longestSide = c;
        }

        if(side1 + side2 <= longestSide){
            System.out.println("Impossible");
            return;
        }

        double ratio = Math.pow(longestSide, 2)/(Math.pow(side1, 2) + Math.pow(side2, 2));

        if (ratio == 1){
            System.out.println("Right");
            return;
        }
        if (ratio > 1){
            System.out.println("Obtuse");
            return;
        }
        System.out.println("Acute");
    }
}
