package eighteenth.vegetables;

public class Cucumber implements Vegetable {
    private int lastHashCode;

    @Override
    public String getName() {
        return "Cucumber";
    }

    @Override
    public int hashCode() {
        return ++lastHashCode;
    }
}
