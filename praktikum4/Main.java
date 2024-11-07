import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================================");
        System.out.println("Pinjam Buku :\n");

        // Membuat objek Buku
        Buku buku1 = new Buku("Matematika Diskrit", "Rusdi", 350);
        Buku buku2 = new Buku("Belajar javascript", "Mamat", 500);
        Buku buku3 = new Buku("data mining", "max", 470);

        // Membuat objek Pengguna
        Pengguna pengguna1 = new Pengguna("malika", "malika@yahoo.com");
        Pengguna pengguna2 = new Pengguna("shiren", "shiren@yahoo.com");
        pengguna2.nama = "risa";

        // Meminjam buku oleh pengguna dengan tanggal peminjaman
        LocalDate tanggalPeminjaman1 = LocalDate.of(2021, 9, 11);
        pengguna1.pinjam_buku(tanggalPeminjaman1, buku1);

        LocalDate tanggalPeminjaman2 = LocalDate.of(2021, 9, 12);
        pengguna1.pinjam_buku(tanggalPeminjaman2, buku2);

        LocalDate tanggalPeminjaman3 = LocalDate.of(2022, 1, 1);
        pengguna2.pinjam_buku(tanggalPeminjaman3, buku3);

        System.out.println("=========================================================================");
        // Melihat daftar peminjaman pengguna
        System.out.println("Tampil Daftar Peminjaman:\n");

        for (Peminjaman peminjaman : pengguna1.lihat_peminjaman()) {
            System.out.println("Peminjaman: " + peminjaman.getBuku().getJudul() +
                    " oleh " + peminjaman.getPengguna().getNama() +
                    " pada tanggal " + peminjaman.getTanggalPeminjaman());
        }

        for (Peminjaman peminjaman : pengguna2.lihat_peminjaman()) {
            System.out.println("Peminjaman: " + peminjaman.getBuku().getJudul() +
                    " oleh " + peminjaman.getPengguna().getNama() +
                    " pada tanggal " + peminjaman.getTanggalPeminjaman());
        }

        System.out.println("=========================================================================");
        System.out.println("Pengembalian Buku\n");

        // Mengembalikan salah satu buku dengan tanggal pengembalian
        LocalDate tanggalPengembalian = LocalDate.of(2021, 9, 25);
        pengguna1.kembalikan_buku(tanggalPengembalian, buku1);

        System.out.println("=========================================================================");
        // Melihat daftar peminjaman setelah pengembalian
        System.out.println("Tampil Daftar Peminjaman Setelah Pengembalian:\n");

        for (Peminjaman peminjaman : pengguna1.lihat_peminjaman()) {
            System.out.println("Peminjaman: " + peminjaman.getBuku().getJudul() +
                    " oleh " + peminjaman.getPengguna().getNama() +
                    " pada tanggal " + peminjaman.getTanggalPeminjaman() +
                    " dan tanggal pengembalian " + peminjaman.getTanggalPengembalian());
        }

        for (Peminjaman peminjaman : pengguna2.lihat_peminjaman()) {
            System.out.println("Peminjaman: " + peminjaman.getBuku().getJudul() +
                    " oleh " + peminjaman.getPengguna().getNama() +
                    " pada tanggal " + peminjaman.getTanggalPeminjaman() +
                    " dan tanggal pengembalian " + peminjaman.getTanggalPengembalian());
        }

        System.out.println("=========================================================================");
    }
}
