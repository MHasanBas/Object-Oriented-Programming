public class MesinCuci extends Elektronik  implements Compare {
    private int kapasitas;
    
    public MesinCuci() {
        super(); 
    }
    
    public MesinCuci(String merk, double daya, double harga, int kapasitas) {
        super(merk, daya, harga);
        this.kapasitas = kapasitas;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas: " + kapasitas + " kg");
    }
    
    @Override
    public void compareTo(Elektronik other) {
        if (this.harga < other.harga) {
            System.out.println("Harga Mesin cuci lebih murah daripada Harga Kipas.");
        } else if (this.harga > other.harga) {
            System.out.println("Harga Mesin cuci lebih Mahal daripada Harga Kipas");
        } else {
            System.out.println("mesin cuci dan Kipas memiliki harga yang sama.");
        }
    }
}
