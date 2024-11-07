public abstract class Hewan {
    public double berat;
    public String makanan;
    public String habitat;

    public Hewan(double berat, String makanan, String habitat) {
        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
    }

    public abstract void bergerak();
    

    public abstract void bernapas();
       

    public void cetakInfo() {
        System.out.println("Berat: " + this.berat);
        System.out.println("Makanan: " + this.makanan);
        System.out.println("Habitat: " + this.habitat);
    }
}
