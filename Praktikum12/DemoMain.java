public class DemoMain {

    public static void main(String[] args) {
        // Pembuatan objek dosen dan tenaga kependidikan
        // Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");
        // Dosen dosen2 = new Dosen("19700105", "Muhammad, S.T, M.T", "197001");
        // TenagaKependidikan tendik1 = new TenagaKependidikan("19750301", "Aida, A.Md.", "Tenaga Administrasi");
        // TenagaKependidikan tendik2 = new TenagaKependidikan("19650304", "Rika, S.T.", "Tenaga Laboratorium");

        // Menambahkan objek ke dalam ArrayList
        // ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        // daftarPegawai.add(dosen1);
        // daftarPegawai.add(dosen2);
        // daftarPegawai.add(tendik1);
        // daftarPegawai.add(tendik2);

        // Menampilkan informasi pegawai
        // System.out.println("Jumlah Pegawai: " + daftarPegawai.size());
        // for (Pegawai pegawai : daftarPegawai) {
        //     pegawai.displayInfo();
        //     System.out.println();
        // }

        // Upcasting
        // Pegawai pegawai1 = dosen1;
        // System.out.println(pegawai1.nip);
        // System.out.println(pegawai1.nama);
        // pegawai1.displayInfo();

        // Downcasting yang salah
        // try {
        //     TenagaKependidikan test = (TenagaKependidikan) pegawai1; // Ini akan menghasilkan error
        // } catch (ClassCastException e) {
        //     System.out.println("Runtime Error: " + e.getMessage());
        // }

        // Downcasting kembali ke Dosen
        // Dosen newDosen = (Dosen) pegawai1;
        // System.out.println(newDosen.nama);
        // System.out.println(newDosen.nidn);
        // newDosen.mengajar();

      //  Percobaan untuk nomor 5: Downcasting yang tidak valid
        try {
            Pegawai gPegawai = new Pegawai("12345", "ABAH");
            Dosen invalidDosen = (Dosen) gPegawai; // Ini akan melempar ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Percobaan nomor 5: Runtime Error: " + e.getMessage());
        }

        // Panggil method train
        // train(dosen1);
        // train(tendik1);
    // }

    // public static void train(Pegawai pegawai) {
    //     System.out.println("Memberikan pelatihan untuk pegawai");
    //     pegawai.displayInfo();
    //     System.out.println("Mengenalkan lingkungan kampus");
    //     System.out.println("Menginfokan SOP/Juknis");

        // if (pegawai instanceof Dosen) {
        //     System.out.println("Memberikan pelatihan pedagogik");
        // } else if (pegawai instanceof TenagaKependidikan) {
        //     System.out.println("Memberikan pelatihan administrasi atau teknis");
        }
    }
    