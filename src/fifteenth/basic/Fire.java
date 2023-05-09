package fifteenth.basic;

import fifteenth.derived.Energy;
import fifteenth.derived.Lava;
import fifteenth.derived.Steam;

public class Fire extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result;

        if (other instanceof Air) result = new Energy();
        else if (other instanceof Water) result = new Steam();
        else if (other instanceof Earth) result = new Lava();
        else throw new UnsupportedOperationException();

        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}