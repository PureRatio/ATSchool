package fifteenth;

public class Water extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        if(other instanceof Fire) {
            return new Steam();
        }
        if(other instanceof Air) {
            return new Rain();
        }
        if(other instanceof Water) {
            return new Sea();
        }
        if(other instanceof Earth) {
            return new Mud();
        }
        return null;
    }
}