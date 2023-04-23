package fifteenth;

public class Earth extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        if(other instanceof Fire) {
            return new Lava();
        }
        if(other instanceof Air) {
            return new Dust();
        }
        if(other instanceof Water) {
            return new Mud();
        }
        if(other instanceof Earth) {
            return new Pressure();
        }
        throw new UnsupportedOperationException();
    }
}