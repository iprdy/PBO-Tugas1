================================================================================
||                       APLIKASI INVESTASI SAHAM & SBN                       ||
================================================================================

Sebuah aplikasi berbasis Java yang memungkinkan pengguna melakukan simulasi investasi 
pada instrumen SAHAM dan SURAT BERHARGA NEGARA (SBN). Proyek ini dirancang dengan 
struktur modular dan arsitektur bersih sesuai standar industri perangkat lunak.


================================================================================
||                                FITUR UTAMA                                ||
================================================================================

👤 AUTENTIKASI PENGGUNA
- Login dua jenis pengguna: Admin dan Customer
- Akun login di-hardcode

🔧 FITUR ADMIN
- Tambah & ubah harga produk Saham
- Tambah produk SBN
- (Opsional) Hapus produk investasi

💸 FITUR CUSTOMER
- Beli & jual Saham
- Beli SBN dengan kuota nasional
- Simulasi bunga bulanan SBN
- Tampilkan portofolio investasi


================================================================================
||                           STRUKTUR DIREKTORI                              ||
================================================================================

📂 investasi-app-java/
├── App.java                  → Entry point aplikasi
├── config/                   → Konfigurasi & data awal
├── controller/               → Logika kontrol dan alur aplikasi
├── model/                    → Class data (Saham, SBN, User, dll)
├── repository/               → Penyimpanan data sementara (in-memory)
├── service/                  → Logika bisnis utama
├── util/                     → Utility & helper class
├── view/                     → Tampilan CLI & menu

✅ Kode utama hanya memanggil MainController → bebas logika bisnis langsung


================================================================================
||                        SIMULASI BUNGA SBN PER BULAN                       ||
================================================================================

💰 Rumus:
(% bunga / 12 bulan) × 90% × nominal investasi

Simulasi dilakukan secara real-time saat pembelian SBN.


================================================================================
||                             AKUN LOGIN DEMO                               ||
================================================================================

| Role     | Username | Password |
|----------|----------|----------|
| Admin    | admin    | admin123 |
| Customer | user1    | user123  |


================================================================================
||                         TEKNOLOGI & KONFIGURASI                           ||
================================================================================

- Bahasa: Java SE 17
- IDE: Bebas (VS Code / IntelliJ)
- Penyimpanan: In-memory (tanpa database)

================================================================================
||                            TAMPAKAN CLI MENU                              ||
================================================================================

=== Selamat Datang di Aplikasi Investasi ===
1. Login
2. Keluar

=== Menu Customer ===
1. Beli Saham
2. Jual Saham
3. Beli SBN
4. Simulasi SBN
5. Portofolio
6. Logout

