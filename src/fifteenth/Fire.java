package fifteenth;

public class Fire extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        if(other instanceof Fire) {
            return null;
        }
        if(other instanceof Air) {
            return new Energy();
        }
        if(other instanceof Water) {
            return new Steam();
        }
        if(other instanceof Earth) {
            return new Lava();
        }
        throw new UnsupportedOperationException();
    }
}