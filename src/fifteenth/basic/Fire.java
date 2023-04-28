package fifteenth.basic;

import fifteenth.derived.Energy;
import fifteenth.derived.Lava;
import fifteenth.derived.Steam;

public class Fire extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result = null;
        if(other instanceof Fire) {
            return null;
        }
        if(other instanceof Air) result = new Energy();
        if(other instanceof Water) result = new Steam();
        if(other instanceof Earth) result = new Lava();
        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}