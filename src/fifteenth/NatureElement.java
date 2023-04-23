package fifteenth;

import java.util.NoSuchElementException;

public class NatureElement {
    public NatureElement connect(NatureElement other) {
        throw new UnsupportedOperationException();
    }

    public static NatureElement create(String name) {
        switch(name) {
            case "Fire":
                return new Fire();
            case "Air":
                return new Air();
            case "Earth":
                return new Earth();   
            case "Water":
                return new Water();
            default:
                throw new NoSuchElementException();
        }
    }
}