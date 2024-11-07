public class Kipas extends Elektronik  implements Compare{
    private int kecepatan;
    
    public Kipas() {
        super(); 
    }
    
    public Kipas(String merk, double daya, double harga, int kecepatan) {
        super(merk, daya, harga); 
        this.kecepatan = kecepatan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kecepatan: " + kecepatan + " RPM");
    }
    @Override
    public void compareTo(Elektronik other) {
        if (this.harga < other.harga) {
            System.out.println("Harga Kipas lebih murah daripada Harga Mesin Cuci.");
        } else if (this.harga > other.harga) {
            System.out.println("Harga Kipas lebih Mahal daripada Harga Mesin Cuci");
        } else {
            System.out.println("Kipas dan Mesin Cuci memiliki harga yang sama.");
        }
    }
}
