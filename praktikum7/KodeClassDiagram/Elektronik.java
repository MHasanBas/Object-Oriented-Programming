public class Elektronik {
    private String merk;
    private double daya;
    private double harga;
    
    // Constructor tanpa parameter
    public Elektronik() {
    }
    
    // Constructor berparameter
    public Elektronik(String merk, double daya, double harga) {
        this.merk = merk;
        this.daya = daya;
        this.harga = harga;
    }
    
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Daya: " + daya + " Watt");
        System.out.println("Harga: Rp " + harga);
    }
}
