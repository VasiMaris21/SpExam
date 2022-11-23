public class PrintVisitor implements Visitor {
    @Override
    public void visitAn(An an) {
        System.out.println(an.getName());
        for (Grupa grupa: an.getGrupaList()) {
            System.out.print("\t");
            visitGrupa(grupa);
        }
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println(grupa.getName());
        for (Semigrupa semigrupa: grupa.getSemigrupaList()) {
            System.out.print("\t\t");
            visitSemigrupa(semigrupa);
        }
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println(semigrupa.getName());
        for (Student student: semigrupa.getStudentList()) {
            System.out.print("\t\t\t");
            visitStudent(student);
        }
    }

    @Override
    public void visitStudent(Student student) {
        System.out.println(student.getName() + ", " + student.getEmail());
    }
}
