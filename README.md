# Program Investasi Saham dan Surat Berharga Negara (SBN)

Hi! Ini adalah proyek kecil untuk pemesanan makanan online demi menuntaskan Tugas I PBO KAMI.

Di bawah ini adalah deskripsi program, penjelasan dari bagaimana program akan dijalankan, dan UML dari program ini. Untuk deskripsi kode lebih lengkap dapat dilihat pada kode program yang sudah dicommit sebelumnya (sudah disertakan beberapa comment untuk membantu dalam mengerti cara kerja program). Selamat menyimak :>

**Deskripsi Proyek**  
Program ini adalah aplikasi sederhana yang dikembangkan menggunakan bahasa pemrograman Java, yang memungkinkan pengguna untuk melakukan investasi dalam dua produk utama: **Saham** dan **Surat Berharga Negara (SBN)**. Program ini dirancang dengan dua jenis pengguna: **Admin** dan **Customer**, dengan akses dan fungsionalitas yang berbeda. Admin memiliki hak untuk mengelola produk investasi, sementara customer dapat melakukan investasi dan melihat portofolio mereka.

## Fitur Utama:
- **Admin:**
  - Melihat daftar saham dan SBN yang tersedia.
  - Menambah dan menghapus saham.
  - Mengubah harga saham yang terdaftar.
  - Menambah produk SBN baru.
- **Customer:**
  - Melakukan investasi dalam saham (membeli dan menjual).
  - Membeli SBN sesuai kuota yang tersedia.
  - Melihat portofolio investasi mereka (saham dan SBN yang dimiliki).
  - Melakukan simulasi kupon SBN per bulan.

## Alur Program:
1. **Login Pengguna**  
   Program akan meminta pengguna untuk login terlebih dahulu. Jika login gagal, akan ditampilkan pesan kegagalan, sedangkan jika berhasil, pengguna akan diarahkan ke menu investasi.
   
2. **Menu Investasi**  
   - Admin memiliki akses untuk mengelola produk investasi (saham dan SBN).
   - Customer dapat memilih produk yang ingin mereka investasikan, yaitu membeli saham atau SBN, serta melakukan penjualan saham.
   
3. **Mekanisme Investasi:**
   - **Pembelian Saham:** Customer dapat melihat daftar saham yang tersedia dan membeli saham sesuai jumlah yang diinginkan.
   - **Penjualan Saham:** Customer dapat menjual saham yang dimiliki dengan memilih saham yang tersedia dan memasukkan jumlah lembar yang akan dijual.
   - **Pembelian SBN:** Customer dapat membeli produk SBN dengan memilih SBN yang tersedia dan memasukkan jumlah nominal yang ingin dibeli. Program akan memastikan bahwa kuota nasional masih tersedia.
   
4. **Simulasi Kupon SBN:**  
   Rumus simulasi kupon per bulan adalah:
   **(Persentase bunga tahunan ÷ 12) × 90% × nominal investasi**

## Deskripsi Kelas:
- **Kelas Saham:**
  - **Field:** Kode, Nama Perusahaan, Harga
- **Kelas SuratBerhargaNegara (SBN):**
  - **Field:** Nama, Bunga, Jangka Waktu, Tanggal Jatuh Tempo, Kuota Nasional

## Portofolio Customer:
- Menampilkan daftar saham yang dimiliki lengkap dengan jumlah lembar dan nilai pasar.
- Menampilkan daftar SBN yang dimiliki, termasuk nominal dan bunga SBN yang diterima setiap bulan dalam Rupiah.

## Catatan:
Seluruh proses dalam program ini tidak memerlukan penyimpanan pada file ataupun database. Semua data disimpan di dalam memori selama program berjalan.

---

### Identitas Kami
- **Nama:** Gerald Hizkia Turnip  
  **NIM:** 2405551081  
  **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO) D  

- **Nama:** i Putu Raditya Dharma Yoga  
  **NIM:** 24055510--  
  **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO) D
