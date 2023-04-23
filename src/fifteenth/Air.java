package fifteenth;

public class Air extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        if(other instanceof Fire) {
            return new Energy();
        }
        if(other instanceof Air) {
            return new Pressure();
        }
        if(other instanceof Water) {
            return new Rain();
        }
        if(other instanceof Earth) {
            return new Dust();
        }
        throw new UnsupportedOperationException();
    }
}