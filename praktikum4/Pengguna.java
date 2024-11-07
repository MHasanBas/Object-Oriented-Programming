import java.time.LocalDate;
import java.util.ArrayList;

public class Pengguna {
    private String nama;
    private String email;
    private ArrayList<Peminjaman> daftarPeminjaman;

    public Pengguna(String nama, String email) {
        this.nama = nama;
        this.email = email;
        this.daftarPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Peminjaman> getDaftarPeminjaman() {
        return daftarPeminjaman;
    }

    public void setDaftarPeminjaman(ArrayList<Peminjaman> daftarPeminjaman) {
        this.daftarPeminjaman = daftarPeminjaman;
    }

    public void pinjam_buku(LocalDate tanggalPeminjaman, Buku buku) {
        Peminjaman peminjaman = new Peminjaman(this, buku, tanggalPeminjaman);
        tambah_pinjaman(peminjaman);
        System.out.println("Pengguna " + nama + " meminjam buku: " + buku.getJudul() + " pada tanggal: " + tanggalPeminjaman);
    }

    public void tambah_pinjaman(Peminjaman peminjaman) {
        daftarPeminjaman.add(peminjaman);
    }

    public void kembalikan_buku(LocalDate tanggalPengembalian, Buku buku) {
        for (Peminjaman peminjaman : daftarPeminjaman) {
            if (peminjaman.getBuku().equals(buku)) {
                // Set tanggal pengembalian
                peminjaman.setTanggalPengembalian(tanggalPengembalian);
                System.out.println("Pengguna " + nama + " mengembalikan buku: " + buku.getJudul() + " pada tanggal: " + tanggalPengembalian);
                return;
            }
        }
        System.out.println("Buku tidak ditemukan dalam daftar peminjaman pengguna " + nama);
    }

    public ArrayList<Peminjaman> lihat_peminjaman() {
        return daftarPeminjaman;
    }
    
}
