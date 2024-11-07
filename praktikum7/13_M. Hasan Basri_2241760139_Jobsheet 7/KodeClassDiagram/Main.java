public class Main {
    public static void main(String[] args) {
        // Membuat objek Kipas
        Kipas kipas = new Kipas("Kipas angin polytron", 50.0, 250000.0, 1200);
        System.out.println("Informasi Kipas:");
        kipas.displayInfo();
        
        System.out.println(); // Baris kosong
        
        // Membuat objek MesinCuci
        MesinCuci mesinCuci = new MesinCuci("Mesin Cuci Sharp", 500.0, 1500000.0, 7);
        System.out.println("Informasi Mesin Cuci:");
        mesinCuci.displayInfo();
    }
}
