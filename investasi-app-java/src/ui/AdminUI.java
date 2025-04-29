package ui;

import data.DataSaham;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AdminUI {
    public static void mainMenu() {
        ClearUI.clearScreen();
        System.out.println("+-------------------------------+");
        System.out.println("|           Menu Admin          |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Saham                      |");
        System.out.println("| 2. SBN                        |");
        System.out.println("| 3. Logout                     |");
        System.out.println("+-------------------------------+");
    }

    public static void menuSaham() {
        ClearUI.clearScreen();
        System.out.println("+-------------------------------+");
        System.out.println("|       Menu Admin > Saham      |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Tampilkan Saham            |");
        System.out.println("| 2. Tambah Saham               |");
        System.out.println("| 3. Ubah Harga Saham           |");
        System.out.println("| 4. Kembali                    |");
        System.out.println("+-------------------------------+");
    }

    public static void tambahSahamUI() {
        ClearUI.clearScreen();
        System.out.println("+---------------------------------------------------+");
        System.out.println("|       Menu Admin  >  Saham  >  Tambah Saham       |");
        System.out.println("+---------------------------------------------------+");
    }

    public static void ubahHargaSahamUI() {
        System.out.println();
        System.out.println("+---------------------------------------------------+");
        System.out.println("|     Menu Admin  >  Saham  >  Ubah Harga Saham     |");
        System.out.println("+---------------------------------------------------+");
    }

    public static void menuSBN() {
        ClearUI.clearScreen();
        System.out.println("+-------------------------------+");
        System.out.println("|       Menu Admin > SBN        |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Tampilkan SBN              |");
        System.out.println("| 2. Tambah SBN                 |");
        System.out.println("| 3. Kembali                    |");
        System.out.println("+-------------------------------+");
    }

    public static void tambahSBNUI() {
        ClearUI.clearScreen();
        System.out.println("+---------------------------------------------------+");
        System.out.println("|         Menu Admin  >  SBN  >  Tambah SBN         |");
        System.out.println("+---------------------------------------------------+");
    }

    public static void uiConfirmationTambahSahamAdmin(String kode, String namaPerusahaan, double harga) {
        ClearUI.clearScreen();
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|     Apakah anda ingin melanjutkan penambahan saham dibawah ini?     |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("| Kode            : %-50s|\n", kode);
        System.out.printf("| Nama perusahaan : %-50s|\n", namaPerusahaan);
        System.out.printf("| Harga           : Rp%,-48.2f|\n", harga);
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("| 1. Ya, lanjutkan penambahan saham                                   |");
        System.out.println("| 2. Tidak, kembali ke menu saham                                     |");
        System.out.println("+---------------------------------------------------------------------+");
    }

    public static void uiBerhasilTambahSahamAdmin(String kode) {
        String isi = String.format("Berhasil menambahkan saham dengan kode %s ke dalam data!", kode);

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.printf("| %-69s |\n", isi);
        System.out.println("+-----------------------------------------------------------------------+");
    }

    public static void uiConfirmationUbahHargaSahamAdmin(String kode, double hargaLama, double hargaBaru) {
        ClearUI.clearScreen();
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|  Apakah anda ingin melanjutkan pengubahan harga saham dibawah ini?  |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("| Kode        : %-54s|\n", kode);
        System.out.printf("| Harga awal  : Rp%,-52.2f|\n", hargaLama);
        System.out.printf("| Harga baru  : Rp%,-52.2f|\n", hargaBaru);
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("| 1. Ya, lanjutkan pengubahan harga saham                             |");
        System.out.println("| 2. Tidak, kembali ke menu saham                                     |");
        System.out.println("+---------------------------------------------------------------------+");
    }

    public static void uiBerhasilUbahHargaSahamAdmin(String kode, double hargaBaru) {
        double hargaLama = DataSaham.getHargaSaham(kode);

        System.out.println("+-------------------------------------------------------+");
        System.out.printf("|  Berhasil mengubah harga saham dengan kode %-10s |\n", kode);
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("|  Harga awal : Rp%,-38.2f|\n", hargaLama);
        System.out.printf("|  Harga baru : Rp%,-38.2f|\n", hargaBaru);
        System.out.println("+-------------------------------------------------------+");
    }

    public static void uiConfirmationTambahSBNAdmin(String nama, double bunga, int jangkaWaktu, LocalDate tanggalJatuhTempo, double kuotaNasional) {
        String bungaFormatted = String.format("%.2f%%", bunga);
        String jangkaFormatted = String.format("%d tahun", jangkaWaktu);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String tanggalJatuhTempoFormatted = tanggalJatuhTempo.format(formatter);

        ClearUI.clearScreen();
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|      Apakah anda ingin melanjutkan penambahan SBN dibawah ini?      |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("| Nama SBN            : %-46s|\n", nama);
        System.out.printf("| Bunga               : %-46s|\n", bungaFormatted);
        System.out.printf("| Jangka waktu        : %-46s|\n", jangkaFormatted);
        System.out.printf("| Tanggal jatuh tempo : %-46s|\n", tanggalJatuhTempoFormatted);
        System.out.printf("| Kuota nasional      : Rp%,-44.2f|\n", kuotaNasional);
        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("| 1. Ya, lanjutkan penambahan saham                                   |");
        System.out.println("| 2. Tidak, kembali ke menu saham                                     |");
        System.out.println("+---------------------------------------------------------------------+");
    }

    public static void uiBerhasilTambahSBNAdmin(String nama) {
        String isi = String.format("Berhasil menambahkan SBN dengan nama %s ke dalam data!", nama);

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.printf("| %-69s |\n", isi);
        System.out.println("+-----------------------------------------------------------------------+");
    }
}
