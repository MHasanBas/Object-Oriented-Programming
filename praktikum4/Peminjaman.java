import java.time.LocalDate;

public class Peminjaman {
    private Pengguna pengguna;
    private Buku buku;
    private LocalDate tanggalPeminjaman;
    private LocalDate tanggalPengembalian;

    public Peminjaman(Pengguna pengguna, Buku buku, LocalDate tanggalPeminjaman) {
        this.pengguna = pengguna;
        this.buku = buku;
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public void setPengguna(Pengguna pengguna) {
        this.pengguna = pengguna;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public LocalDate getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public LocalDate getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(LocalDate tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
}
