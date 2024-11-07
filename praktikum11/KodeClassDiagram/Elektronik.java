public class Elektronik {
    protected String merk;
    protected double daya;
    protected double harga;
    
    public Elektronik() {
    }
    
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
