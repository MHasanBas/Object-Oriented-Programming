package praktikum03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private long limitPinjaman;
    private long jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, long limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; 
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public long getLimitPinjaman() {
        return limitPinjaman;
    }

    public long getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(long jumlah) {
        if (jumlah <= limitPinjaman - jumlahPinjaman) {
            jumlahPinjaman += jumlah;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }

    public void angsur(long jumlah) {
        double minimumAngsuran = 0.1 * jumlahPinjaman; 
        if (jumlah >= minimumAngsuran) {
            jumlahPinjaman -= jumlah;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }
    }
}
