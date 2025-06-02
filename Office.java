public class Office {
    int officeID;
    String location;

    public Office(int officeID, String location) {
        this.officeID = officeID;
        this.location = location;
    }

    public void showOffice() {
        System.out.println("Office ID: " + officeID + ", Location: " + location);
    }
}

