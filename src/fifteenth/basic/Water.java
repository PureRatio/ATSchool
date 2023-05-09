package fifteenth.basic;

import fifteenth.derived.*;

public class Water extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        NatureElement result;

        if(other instanceof Fire) result = new Steam();
        else if(other instanceof Air) result = new Rain();
        else if(other instanceof Water) result = new Sea();
        else if(other instanceof Earth) result = new Mud();
        else if(other instanceof Energy) result = new Steam();
        else throw new UnsupportedOperationException();

        System.out.printf("%s + %s = %s \n", this.getClass().getSimpleName(), other.getClass().getSimpleName(), result.getClass().getSimpleName());
        return result;
    }
}