package fifteenth.basic;

import fifteenth.derived.*;

public class Water extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result = null;
        if(other instanceof Fire) result = new Steam();
        if(other instanceof Air) result = new Rain();
        if(other instanceof Water) result = new Sea();
        if(other instanceof Earth) result = new Mud();
        if(other instanceof Energy) result = new Steam();

        if (result == null) {
            throw new UnsupportedOperationException();
        }
        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}