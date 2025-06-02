import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an office
        Office office = new Office(101, "Building A, Room 203");

        // Creating PCs
        List<PC> pcList = new ArrayList<>();
        pcList.add(new PC(1, "Dell"));
        pcList.add(new PC(2, "MacBook"));
        pcList.add(new PC(3, "HP"));

        // Creating a teacher with office and PCs
        Teacher teacher = new Teacher("Mr. John", office, pcList);

        // Display details
        teacher.showTeacher();
    }
}
