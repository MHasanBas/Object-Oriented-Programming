public class MesinCuci extends Elektronik {
    private int kapasitas;
    
    // Overloading constructor tanpa parameter
    public MesinCuci() {
        super(); 
    }
    
    // Constructor berparameter
    public MesinCuci(String merk, double daya, double harga, int kapasitas) {
        super(merk, daya, harga); // Memanggil constructor berparameter dari kelas induk
        this.kapasitas = kapasitas;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas: " + kapasitas + " kg");
    }
}
