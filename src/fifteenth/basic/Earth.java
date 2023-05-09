package fifteenth.basic;

import fifteenth.derived.Dust;
import fifteenth.derived.Lava;
import fifteenth.derived.Mud;
import fifteenth.derived.Pressure;

public class Earth extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result;

        if (other instanceof Fire) result = new Lava();
        else if (other instanceof Air) result = new Dust();
        else if (other instanceof Water) result = new Mud();
        else if (other instanceof Earth) result = new Pressure();
        else throw new UnsupportedOperationException();

        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}