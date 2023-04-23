package fifteenth;

public class Energy extends NatureElement {
    @Override
    public NatureElement connect(NatureElement other) {
        if(other instanceof Water) {
            return new Steam();
        }
        throw new UnsupportedOperationException();
    }
}
