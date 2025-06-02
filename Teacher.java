import java.util.List;

public class Teacher {
    String name;
    Office office;
    List<PC> pcs;

    public Teacher(String name, Office office, List<PC> pcs) {
        this.name = name;
        this.office = office;
        this.pcs = pcs;
    }

    public void showTeacher() {
        System.out.println("Teacher: " + name);
        office.showOffice(); // Show office details
        System.out.println("PCs Owned:");
        for (PC pc : pcs) {
            pc.showPC(); // Show all PCs
        }
    }
}
