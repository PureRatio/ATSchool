package fifteenth.basic;

import fifteenth.derived.Dust;
import fifteenth.derived.Lava;
import fifteenth.derived.Mud;
import fifteenth.derived.Pressure;

public class Earth extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result = null;
        if (other instanceof Fire) result = new Lava();
        if (other instanceof Air) result = new Dust();
        if (other instanceof Water) result = new Mud();
        if (other instanceof Earth) result = new Pressure();

        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}