public class SepedaStruktural {
    
    public static void main(String[] args) {
        String merek, merek2;
        int kecepatan, kecepatan2, gear, gear2;

        merek = "Poligone";
        kecepatan = 10;
        gear = 1;

        merek2 = "Wiim Cycle";
        kecepatan2 = 15;
        gear2 = 3;

        kecepatan = tambahKecepatan(kecepatan, 10);
        kecepatan2 = tambahKecepatan(kecepatan2, 5);

        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);

        System.out.println("Merek: " + merek2);
        System.out.println("Kecepatan: " + kecepatan2);
    }

    public static int tambahKecepatan(int kecepatan, int increment) {
        kecepatan += increment;
        return kecepatan;
    }

    public static int kurangikecepatan(int kecepatan, int decrement) {
        kecepatan -= decrement;
        return kecepatan;
    }
}
