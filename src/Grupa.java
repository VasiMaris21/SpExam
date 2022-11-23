import java.util.ArrayList;
import java.util.List;

public class Grupa extends Element {
    private final List<Semigrupa> semigrupaList = new ArrayList<>();

    public Grupa(String name) {
        super(name);
    }

    public Grupa add(Semigrupa semigrupa) {
        if (semigrupaList.size() >= 2) {
            System.out.println("[-] Error: Grupa nu mai poate contine mai multe semigrupe!");
        } else {
            semigrupaList.add(semigrupa);
        }
        return this;
    }

    public List<Semigrupa> getSemigrupaList() {
        return semigrupaList;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }
}
