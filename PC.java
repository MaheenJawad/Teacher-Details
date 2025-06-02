public class PC {
    int pcID;
    String brand;

    public PC(int pcID, String brand) {
        this.pcID = pcID;
        this.brand = brand;
    }

    public void showPC() {
        System.out.println("PC ID: " + pcID + ", Brand: " + brand);
    }
}
