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

    public static void uiSimulasiSBN(String namaSBN, double jumlahInvestasi, double bunga, int tahun, double totalKeuntungan, double totalAkhir) {
        System.out.printf(
                "+-------------------------------------------------------------------------+\n" +
                        "|                             Hasil Simulasi                              |\n" +
                        "+-------------------------------------------------------------------------+\n" +
                        "| Nama SBN          : %-52s|\n" +
                        "| Investasi Awal    : Rp%,-50.2f|\n" +
                        "| Bunga Tahunan (.) : %-52.2f|\n" +
                        "| Durasi (tahun)    : %-52d|\n" +
                        "| Keuntungan        : Rp%,-50.2f|\n" +
                        "| Total Akhir       : Rp%,-50.2f|\n" +
                        "+-------------------------------------------------------------------------+\n"
                , namaSBN, jumlahInvestasi, bunga, tahun, totalKeuntungan, totalAkhir);
    }
}
