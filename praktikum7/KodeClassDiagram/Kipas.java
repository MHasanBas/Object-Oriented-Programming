public class Kipas extends Elektronik {
    private int kecepatan;
    
    // Overloading constructor tanpa parameter
    public Kipas() {
        super(); 
    }
    
    // Constructor berparameter
    public Kipas(String merk, double daya, double harga, int kecepatan) {
        super(merk, daya, harga); // Memanggil constructor berparameter dari kelas induk
        this.kecepatan = kecepatan;
    }

    
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kecepatan: " + kecepatan + " RPM");
    }
}
