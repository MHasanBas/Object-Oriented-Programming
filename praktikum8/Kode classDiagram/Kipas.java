public class Kipas extends Elektronik {
    private int kecepatan;
    
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

    @Override
    public void bekerja() {
        System.out.println("Kipas mulai bekerja...");
        System.out.println("Pisau kipas berputar dengan kecepatan tinggi.");
        System.out.println("Angin dibelokkan dan ditiup keluar dari kipas.");
        System.out.println("Kipas memberikan pendinginan di sekitarnya.");
    }
}
