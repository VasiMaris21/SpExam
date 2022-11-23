import java.util.ArrayList;
import java.util.List;

public class Semigrupa extends Element {
    private final List<Student> studentList = new ArrayList<>();

    public Semigrupa(String name) {
        super(name);
    }

    public Semigrupa add(Student student) {
        if (studentList.size() >= 15) {
            System.out.println("[-] Error: Semigrupa nu mai poate contine mai multi studenti!");
        } else {
            studentList.add(student);
        }
        return this;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }
}
