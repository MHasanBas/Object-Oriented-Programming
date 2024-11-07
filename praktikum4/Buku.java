public class Buku {
    private String judul;
    private String pengarang;
    private int jumlah_halaman;

    public Buku(String judul, String pengarang, int jumlah_halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah_halaman = jumlah_halaman;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getJumlahHalaman() {
        return jumlah_halaman;
    }

    public void setJumlahHalaman(int jumlah_halaman) {
        this.jumlah_halaman = jumlah_halaman;
    }
}
