import java.util.ArrayList;
import java.util.List;

public class An extends Element {
    private final List<Grupa> grupaList = new ArrayList<>();

    public An(String name) {
        super(name);
    }

    public An add(Grupa grupa) {
        grupaList.add(grupa);
        return this;
    }

    public List<Grupa> getGrupaList() {
        return grupaList;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitAn(this);
    }
}
