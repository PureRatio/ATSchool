package fifteenth.basic;

public class NatureElement {
    public NatureElement connect(NatureElement other) {
        return null;
    }

    public static NatureElement Create(String name) {
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
                return null;
        }
    }
}