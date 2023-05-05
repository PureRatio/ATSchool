package fifteenth.derived;

import fifteenth.basic.NatureElement;
import fifteenth.basic.Water;

public class Energy extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result;

        if (other instanceof Water) result = new Steam();
        else throw new UnsupportedOperationException();

        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}
