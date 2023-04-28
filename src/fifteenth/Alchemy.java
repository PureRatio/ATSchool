package fifteenth;

import fifteenth.basic.NatureElement;

import java.util.NoSuchElementException;

public class Alchemy {
    public static void main(String[] args) {
        for(int i = 0; i + 1 < args.length; i += 2) {
            NatureElement elem1;
            try {
                elem1 = NatureElement.create(args[i]);
            }
            catch (NoSuchElementException e){
                System.out.printf("Не бывает элемента %s", args[i]);
                return;
            }
            NatureElement elem2;
            try {
                elem2 = NatureElement.create(args[i + 1]);
            }
            catch (NoSuchElementException e){
                System.out.printf("Не бывает элемента %s", args[i+1]);
                return;
            }
            NatureElement result;
            try {
                result = elem1.connect(elem2);
                System.out.println(result.getClass().getSimpleName());
            }
            catch (UnsupportedOperationException e){
                System.out.printf("Не складываются элементы %s и %s", args[i], args[i+1]);
            }
        }
    }
}