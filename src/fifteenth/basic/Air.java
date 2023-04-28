package fifteenth.basic;

import fifteenth.derived.Dust;
import fifteenth.derived.Energy;
import fifteenth.derived.Pressure;
import fifteenth.derived.Rain;

public class Air extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result = null;
        if (other instanceof Fire) result = new Energy();
        if (other instanceof Air) result = new Pressure();
        if (other instanceof Water) result = new Rain();
        if (other instanceof Earth) result = new Dust();

        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}