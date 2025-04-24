package com.investasi.ui;

public class CustomerUI {
    public static void mainMenu() {
        System.out.println("+-------------------------------+");
        System.out.println("|         Menu Customer         |");
        System.out.println("+-------------------------------+");
        System.out.println("| 1. Beli Saham                 |");
        System.out.println("| 2. Jual Saham                 |");
        System.out.println("| 3. Beli SBN                   |");
        System.out.println("| 4. Simulasi SBN               |");
        System.out.println("| 5. Portofolio                 |");
        System.out.println("| 6. Logout                     |");
        System.out.println("+-------------------------------+");
    }

    public static void uiConfirmationBeliSahamCustomer(String kode, int lembar) {
        String isi = String.format("Apakah anda ingin melanjutkan pembelian saham dengan kode %s sebanyak %d lembar?", kode, lembar);

        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.printf("| %-93s |\n", isi);
        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.println("| 1. Ya, lanjutkan pembelian                                                                    |");
        System.out.println("| 2. Tidak, kembali ke menu awal                                                                |");
        System.out.println("+-----------------------------------------------------------------------------------------------+");
    }

    public static void uiCustomerBerhasilBeliSaham(String kode, int lembar) {
        String isi = String.format("Berhasil membeli saham dengan kode %s sebanyak %d lembar", kode, lembar);

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.printf("| %-69s |\n", isi);
        System.out.println("+-----------------------------------------------------------------------+");
    }

    public static void uiGagalMenjualSahamCustomer() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Gagal menjual saham: lembar yang anda miliki kurang! |");
        System.out.println("+------------------------------------------------------+");
    }

    public static void uiConfirmationJualSahamCustomer(String kode, int lembar) {
        String isi = String.format("Apakah anda ingin melanjutkan penjualan saham dengan kode %s sebanyak %d lembar?", kode, lembar);

        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.printf("| %-93s |\n", isi);
        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.println("| 1. Ya, lanjutkan penjualan                                                                    |");
        System.out.println("| 2. Tidak, kembali ke menu awal                                                                |");
        System.out.println("+-----------------------------------------------------------------------------------------------+");
    }

    public static void uiCustomerBerhasilJualSaham(String kode, int lembar) {
        String isi = String.format("Berhasil menjual saham dengan kode %s sebanyak %d lembar", kode, lembar);

        System.out.println("+-----------------------------------------------------------------------+");
        System.out.printf("| %-69s |\n", isi);
        System.out.println("+-----------------------------------------------------------------------+");
    }

    public static void uiConfirmationBeliSBNCustomer(String namaSBN, double hargaBeli) {
        String isi = String.format("Apakah anda ingin melanjutkan pembelian SBN dengan nama %s seharga Rp%,.2f?", namaSBN, hargaBeli);

        System.out.println("+------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-100s |\n", isi);
        System.out.println("+------------------------------------------------------------------------------------------------------+");
        System.out.println("| 1. Ya, lanjutkan pembelian                                                                           |");
        System.out.println("| 2. Tidak, kembali ke menu awal                                                                       |");
        System.out.println("+------------------------------------------------------------------------------------------------------+");
    }

    public static void uiCustomerBerhasilBeliSBN(String namaSBN, double jumlahBeli) {
        System.out.println("+-----------------------------------------------+");
        System.out.println("|            Pembelian SBN berhasil!            |");
        System.out.println("+-----------------------------------------------+");
        System.out.printf("| Nama SBN: %-36s|\n", namaSBN);
        System.out.printf("| Jumlah: Rp%,-36.2f|\n", jumlahBeli);
        System.out.println("+-----------------------------------------------+");
    }

    public static void uiGagalMenjualSBNCustomer() {
        System.out.println("+-----------------------------------------+");
        System.out.println("| Pembelian gagal. Kuota tidak mencukupi! |");
        System.out.println("+-----------------------------------------+");
    }

    public static void uiSBNTidakValid() {
        System.out.println("+------------------------------------------+");
        System.out.println("| SBN tidak valid atau data tidak tersedia |");
        System.out.println("+------------------------------------------+");
    }

    public static void uiSimulasiSBN(String namaSBN, double jumlahInvestasi, double bunga, int tahun, double totalKeuntungan, double totalAkhir) {
        System.out.printf(
                        "+-------------------------------------------------------------------------+\n" +
                        "|                             Hasil Simulasi                              |\n" +
                        "+-------------------------------------------------------------------------+\n" +
                        "| Nama SBN          : %-52s|\n" +
                        "| Investasi Awal    : Rp%,-50.2f|\n" +
                        "| Bunga Tahunan (%%) : %-52.2f|\n" +
                        "| Durasi (tahun)    : %-52d|\n" +
                        "| Keuntungan        : Rp%,-50.2f|\n" +
                        "| Total Akhir       : Rp%,-50.2f|\n" +
                        "+-------------------------------------------------------------------------+\n"
                , namaSBN, jumlahInvestasi, bunga, tahun, totalKeuntungan, totalAkhir);
    }
}
