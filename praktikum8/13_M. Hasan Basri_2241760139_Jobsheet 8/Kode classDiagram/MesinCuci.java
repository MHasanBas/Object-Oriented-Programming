public class MesinCuci extends Elektronik {
    private int kapasitas;
    
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

    @Override
    public void bekerja() {
        System.out.println("Mesin cuci mulai mencuci...");
        System.out.println("Air dimasukkan ke dalam tabung pencucian.");
        System.out.println("Deterjen ditambahkan ke dalam air.");
        System.out.println("Pakaian diaduk dalam air yang berisi deterjen.");
        System.out.println("Air kotor dibuang dan dilakukan pembilasan.");
        System.out.println("Proses mencuci selesai.");
    }
}
