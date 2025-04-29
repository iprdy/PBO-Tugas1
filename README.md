# Program Investasi Saham dan Surat Berharga Negara (SBN)

Hi! Ini adalah proyek kecil untuk Investasi Saham dan Surat Berharga Negara (SBN) demi menuntaskan Tugas I PBO KAMI.

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
  **NIM:** 2405551026  
  **Mata Kuliah:** Pemrograman Berorientasi Objek (PBO) D

---

# Penggunaan Program
Di bawah ini merupakan penggunaan program Investasi Saham dan Surat Berharga Negara (SBN) beserta hasil screenshoot. Beberapa penjelasan bagaimana kode berjalan di jelaskan di bawah.

### Login Section
![WhatsApp Image 2025-04-28 at 23 59 47_18456fb6](https://github.com/user-attachments/assets/05783fb5-5f22-430b-8412-b3a2dea206f4)

Tampilan pertama yang disediakan pada saat memulai program, tersedia pilihan untuk melakukan login dan tersedia juga untuk keluar dari program.

----
![WhatsApp Image 2025-04-29 at 00 00 18_428f5eee](https://github.com/user-attachments/assets/c6557572-d710-43fc-8ae6-717f5d9f749e)

Di lanjutkan dengan memilih login. sistem akan meminta pengguna untuk login terlebih dahulu. Jika login gagal, akan ditampilkan pesan kegagalan, sedangkan jika berhasil, pengguna akan diarahkan ke menu selanjutnya.

----
## Login as Customer
![WhatsApp Image 2025-04-29 at 00 00 30_dccb4d7b](https://github.com/user-attachments/assets/b8b46370-ac2e-4a9b-a26b-af86042511fe)

Berhasil melakukan login sebagai customer dengan memasukkan username dan password.

----

## Menu Customer
![WhatsApp Image 2025-04-29 at 00 00 42_4fef63f1](https://github.com/user-attachments/assets/c43c333b-a030-410f-99c9-1d0ed588a34e)

Sistem menampilkan menu customer dan menawarkan beberapa pilihan yang bisa digunakan oleh customer.

----
### Beli Saham
![WhatsApp Image 2025-04-29 at 09 12 27_7513df50](https://github.com/user-attachments/assets/2a6c4145-08d0-4343-9e2d-5ade9e2ba428)

Dari beberapa pilihan sebelumnya, customer memilih menu nomor 1. Beli Saham. Sistem menampilkan dan menawarkan daftar saham yang tersedia dan bisa dibeli oleh seorang customer. 

![bbca](https://github.com/user-attachments/assets/af39b0ba-54f7-4bad-9305-653182755bd2)

Sistem memberikan pilihan untuk melanjutkan pembeliannya atau kembali ke menu awal kepada user customer.

![bbca2](https://github.com/user-attachments/assets/9875c2d0-493f-46ce-bfcb-2bfc5b7d3caf)

Sistem menampilkan user berhasil membeli saham dengan kode bbca sebanyak 10 lembar, dan akan diarahkan oleh sistem kembali ke Menu Customer awal.

----
### Jual Saham
![WhatsApp Image 2025-04-29 at 11 48 19_f742652a](https://github.com/user-attachments/assets/6a01c48f-c003-4363-822b-acb3f9068056)

Setelah user customer memilih pilihan Beli Saham, Sistem menampilkan daftar saham yang dimiliki. Setelah itu, user diminta untuk menginputkan kode saham dan banyaknya lembar yang ingin dijual.

![WhatsApp Image 2025-04-29 at 11 58 02_d1765b5b](https://github.com/user-attachments/assets/e7203c07-92b5-482b-a023-9928d668ab30)

Sistem memberikan pilihan untuk melanjutkan penjualannya atau kembali ke menu awal kepada user customer.

![WhatsApp Image 2025-04-29 at 11 58 21_9026597c](https://github.com/user-attachments/assets/7de6f97b-0697-4edd-b1f8-22d1acfe64e3)

Sistem menampilkan user berhasil membeli saham dengan kode bbca sebanyak 10 lembar.

----
### Beli SBN (Surat Berharga Negara)
Di awal pada Menu Customer, user ditawarkan beberapa pilihan oleh sistem dan dalam kondisi ini user memilih menu untuk Beli SBN. Lalu sistem akan menampilkan seperti di bawah ini.

![WhatsApp Image 2025-04-29 at 12 07 21_2884de91](https://github.com/user-attachments/assets/5f8139f1-5c66-41df-8092-66f5e3d258dc)

Setelah user customer memilih pilihan Beli SBN, Sistem menampilkan daftar SBN yang tersedia. Setelah itu, user diminta untuk menginputkan nama SBN dan jumlah pembelian (dalam rupiah) yang ingin dijual.

![WhatsApp Image 2025-04-29 at 12 16 42_6e466737](https://github.com/user-attachments/assets/ac435ea2-d1d1-4866-9d07-ac27cc5bc8a2)

Sistem memberikan pilihan ingin melanjutkan pembelian SBN dengan nama SBR013 seharga Rp1,000,000.00 atau kembali ke menu awal kepada user customer. 

![WhatsApp Image 2025-04-29 at 12 23 36_d7e62de9](https://github.com/user-attachments/assets/b38f2880-df80-4587-b738-65e757511dba)

Sistem menampilkan kepada user bahwa Pembelian SBN telah berhasil.

----
### Simulasi SBN (Surat Berharga Negara)
Di awal pada Menu Customer, user ditawarkan beberapa pilihan oleh sistem dan dalam kondisi ini user memilih menu untuk **Simulasi SBN**. Lalu sistem akan menampilkan seperti di bawah ini.

![WhatsApp Image 2025-04-29 at 12 40 36_f3a438b4](https://github.com/user-attachments/assets/4acf8a07-2dc7-4986-bf76-280e627d3ab0)

Setelah user customer memilih pilihan Beli SBN, Sistem menampilkan daftar SBN yang tersedia. Setelah itu, user diminta untuk menginputkan **nama SBN dan jumlah investasi** (dalam rupiah) yang ingin disimulasikan.

![WhatsApp Image 2025-04-29 at 12 46 47_3488f109](https://github.com/user-attachments/assets/9aa92ae1-c114-4923-901c-b62ea435d46a)

Setelah itu sistem menampilkan **Hasil Simulasi** seperti yang ada pada atas.

----
### Portofolio
Di awal pada Menu Customer, user ditawarkan beberapa pilihan oleh sistem dan dalam kondisi ini user memilih menu untuk **Portofolio**. Lalu sistem akan menampilkan seperti di bawah ini.

![WhatsApp Image 2025-04-29 at 12 49 18_7349c159](https://github.com/user-attachments/assets/50db3366-68af-4b1c-82f5-e44beab278a1)

Di atas adalah bagian **Portofolio** yang dimana berisi informasi Daftar saham dan Daftar SBN yang dimiliki.

----
### Logout (by Customer)

![WhatsApp Image 2025-04-29 at 13 11 32_a61a9491](https://github.com/user-attachments/assets/e234a07b-8823-4766-afc6-ec185fb0a7d2)

![WhatsApp Image 2025-04-29 at 13 11 41_561dfcb5](https://github.com/user-attachments/assets/7507dc73-760c-4083-bc53-3ffdb9688465)

Tampilan apabila user sudah berhasil logout.

![WhatsApp Image 2025-04-29 at 13 11 59_e5234a92](https://github.com/user-attachments/assets/7b2f4cc8-9fce-4127-86e9-ae4ec65966b7)

Sistem menampilkan ucapan terimakasih kepada user karena telah memakai program dengan baik.

---

## Login as Admin

