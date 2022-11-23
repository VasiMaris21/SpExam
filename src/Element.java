public abstract class Element implements IElement {
    private final String name;

    public Element(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
