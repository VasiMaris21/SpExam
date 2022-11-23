public class Student extends Element {
    private final String email;

    public Student(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}
