package praktikum03;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    public boolean isIsMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn) {
            System.out.println("Kecepatan tidak bisa diubah karena Mesin Off!");
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh nilai negatif!");
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal adalah 100!");
        } else {
            this.kecepatan = kecepatan;
        }
    }
    

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("============================");
    }
}
