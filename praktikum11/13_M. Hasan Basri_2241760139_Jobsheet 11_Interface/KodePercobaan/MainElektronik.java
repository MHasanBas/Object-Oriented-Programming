public class MainElektronik {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Meja", 200.0, "Putih", "Panasonic");
        System.out.println("Info Kipas: " + kipas.getInfo());

        Kulkas kulkas = new Kulkas(2, 1500.0, "Silver", "Samsung");
        System.out.println("Info Kulkas: " + kulkas.getInfo());

        SmartFridge smartFridge = new SmartFridge(500, 2, 2000.0, "Hitam", "LG");
        System.out.println("Info Smart Fridge: " + smartFridge.getInfo());

        TV tv = new TV("LED", 30, 1000.0, "Hitam", "Sony");
        System.out.println("Info TV: " + tv.getInfo());
    }
}
