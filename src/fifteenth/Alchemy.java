package fifteenth;

public class Alchemy {
    public static void main(String[] args) {
        for(int i = 0; i + 1 < args.length; i += 2) {
            var elem1 = NatureElement.Create(args[i]);
            if(elem1 == null) {
                System.out.printf("Не бывает элемента %s", args[i]);
                return;
            }
            var elem2 = NatureElement.Create(args[i + 1]);
            if(elem2 == null) {
                System.out.printf("Не бывает элемента %s", args[i+1]);
                return;
            }
            var result = elem1.connect(elem2);
            if(result == null) {
                System.out.printf("Не складываются элементы %s и %s", args[i], args[i+1]);
                return;
            }
            System.out.println(result.getClass().getName());
        }
    }
}