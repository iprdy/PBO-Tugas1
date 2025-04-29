# Program Investasi Saham dan Surat Berharga Negara (SBN)

Hi! Ini adalah proyek kecil untuk Investasi Saham dan Surat Berharga Negara (SBN) demi menuntaskan Tugas I PBO KAMI.

Di bawah ini adalah deskripsi program, penjelasan dari bagaimana program akan dijalankan, dan UML dari program ini. Untuk deskripsi kode lebih lengkap dapat dilihat pada kode program yang sudah dicommit sebelumnya (sudah disertakan beberapa comment untuk membantu dalam mengerti cara kerja program). Selamat menyimak :>

**Deskripsi Proyek**  
Program ini adalah aplikasi sederhana yang dikembangkan menggunakan bahasa pemrograman Java, yang memungkinkan pengguna untuk melakukan investasi dalam dua produk utama: **Saham** dan **Surat Berharga Negara (SBN)**. Program ini dirancang dengan dua jenis pengguna: **Admin** dan **Customer**, dengan akses dan fungsionalitas yang berbeda. Admin memiliki hak untuk mengelola produk investasi, sementara customer dapat melakukan investasi dan melihat portofolio mereka.

## Fitur Utama:
- **Admin:**
  - Melihat daftar saham dan SBN yang tersedia.
  - Menambah saham.
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

# UML (Unified Modeling Language )
![src 1](https://github.com/user-attachments/assets/4681ce08-abb2-4ceb-9a4f-d1153b4d38f6)

Diagram Unified Modeling Language (UML) dari sistem ini menggambarkan relasi antar class utama yang membentuk arsitektur program. Terdapat class User sebagai superclass dengan dua subclass yaitu Admin dan Customer, di mana masing-masing memiliki metode sesuai perannya, seperti tambahProduk() untuk admin dan beliSaham() atau simulasiSBN() untuk customer. Kelas ProdukInvestasi menjadi superclass dari Saham dan SuratBerhargaNegara, yang masing-masing memiliki atribut dan fungsi terkait, seperti harga, bunga, dan kuotaNasional. Hubungan antara Customer dan produk investasi bersifat aggregation, karena portofolio customer terdiri dari daftar saham dan SBN yang dimiliki, yang disimpan selama program berjalan.

# Penggunaan Program
Di bawah ini merupakan penggunaan program Investasi Saham dan Surat Berharga Negara (SBN) beserta hasil screenshoot. Beberapa penjelasan bagaimana kode berjalan dijelaskan di bawah setiap gambar sebagai keterangan.

### Login Section
![WhatsApp Image 2025-04-28 at 23 59 47_18456fb6](https://github.com/user-attachments/assets/05783fb5-5f22-430b-8412-b3a2dea206f4)

Tampilan ini menunjukkan tampilan awal ketika program dijalankan. Pengguna diberikan dua pilihan: melakukan login atau keluar dari aplikasi.

----
![WhatsApp Image 2025-04-29 at 00 00 18_428f5eee](https://github.com/user-attachments/assets/c6557572-d710-43fc-8ae6-717f5d9f749e)

Setelah memilih login, sistem meminta pengguna memasukkan username dan password. Jika salah, akan ditampilkan pesan error dan diminta mengulang.

----
## Login as Customer
![WhatsApp Image 2025-04-29 at 00 00 30_dccb4d7b](https://github.com/user-attachments/assets/b8b46370-ac2e-4a9b-a26b-af86042511fe)

Tampilan ini memperlihatkan login berhasil sebagai customer. Sistem menerima kredensial dan langsung mengarahkan ke menu utama customer.

----

## Menu Customer
![WhatsApp Image 2025-04-29 at 00 00 42_4fef63f1](https://github.com/user-attachments/assets/c43c333b-a030-410f-99c9-1d0ed588a34e)

Tampilan ini menunjukkan pilihan menu yang dapat digunakan customer, seperti membeli saham, membeli SBN, simulasi, hingga melihat portofolio.

----
### Beli Saham
![WhatsApp Image 2025-04-29 at 09 12 27_7513df50](https://github.com/user-attachments/assets/2a6c4145-08d0-4343-9e2d-5ade9e2ba428)

Customer memilih menu Beli Saham. Sistem menampilkan daftar saham yang tersedia lengkap dengan harga. 

![bbca](https://github.com/user-attachments/assets/af39b0ba-54f7-4bad-9305-653182755bd2)

Sistem meminta konfirmasi apakah user ingin melanjutkan pembelian atau membatalkannya dan kembali ke menu utama.

![bbca2](https://github.com/user-attachments/assets/9875c2d0-493f-46ce-bfcb-2bfc5b7d3caf)

Gambar menunjukkan bahwa pembelian saham telah berhasil. Sistem menampilkan jumlah lembar yang dibeli dan kembali ke menu awal.

----
### Jual Saham
![WhatsApp Image 2025-04-29 at 11 48 19_f742652a](https://github.com/user-attachments/assets/6a01c48f-c003-4363-822b-acb3f9068056)

Customer melihat daftar saham yang dimiliki, lalu memilih saham yang ingin dijual dengan memasukkan kode dan jumlah lembar.

![WhatsApp Image 2025-04-29 at 11 58 02_d1765b5b](https://github.com/user-attachments/assets/e7203c07-92b5-482b-a023-9928d668ab30)

Sistem meminta konfirmasi penjualan saham dan memberikan opsi untuk kembali ke menu utama jika batal.

![WhatsApp Image 2025-04-29 at 11 58 21_9026597c](https://github.com/user-attachments/assets/7de6f97b-0697-4edd-b1f8-22d1acfe64e3)

Tampilan menunjukkan bahwa penjualan saham telah berhasil dilakukan. Sistem menampilkan info transaksi.

----
### Beli SBN (Surat Berharga Negara)
Di awal pada Menu Customer, user ditawarkan beberapa pilihan oleh sistem dan dalam kondisi ini user memilih menu untuk Beli SBN. Lalu sistem akan menampilkan seperti di bawah ini.

![WhatsApp Image 2025-04-29 at 12 07 21_2884de91](https://github.com/user-attachments/assets/5f8139f1-5c66-41df-8092-66f5e3d258dc)

Customer memilih untuk membeli SBN. Sistem menampilkan daftar SBN yang tersedia lengkap dengan bunga dan kuota.

![WhatsApp Image 2025-04-29 at 12 16 42_6e466737](https://github.com/user-attachments/assets/ac435ea2-d1d1-4866-9d07-ac27cc5bc8a2)

Setelah memilih nama SBN dan jumlah pembelian, sistem meminta konfirmasi untuk melanjutkan atau kembali. 

![WhatsApp Image 2025-04-29 at 12 23 36_d7e62de9](https://github.com/user-attachments/assets/b38f2880-df80-4587-b738-65e757511dba)

Sistem menampilkan notifikasi bahwa pembelian SBN telah berhasil dilakukan oleh user.

----
### Simulasi SBN (Surat Berharga Negara)
Di awal pada Menu Customer, user ditawarkan beberapa pilihan oleh sistem dan dalam kondisi ini user memilih menu untuk **Simulasi SBN**. Lalu sistem akan menampilkan seperti di bawah ini.

![WhatsApp Image 2025-04-29 at 12 40 36_f3a438b4](https://github.com/user-attachments/assets/4acf8a07-2dc7-4986-bf76-280e627d3ab0)

Customer memilih fitur simulasi kupon SBN. Sistem akan meminta nama SBN dan nominal investasi untuk disimulasikan.

![WhatsApp Image 2025-04-29 at 12 46 47_3488f109](https://github.com/user-attachments/assets/9aa92ae1-c114-4923-901c-b62ea435d46a)

Sistem menghitung dan menampilkan hasil simulasi kupon yang diterima per bulan berdasarkan inputan user.

----
### Portofolio
Di awal pada Menu Customer, user ditawarkan beberapa pilihan oleh sistem dan dalam kondisi ini user memilih menu untuk **Portofolio**. Lalu sistem akan menampilkan seperti di bawah ini.

![WhatsApp Image 2025-04-29 at 12 49 18_7349c159](https://github.com/user-attachments/assets/50db3366-68af-4b1c-82f5-e44beab278a1)

Menu ini menampilkan semua saham dan SBN yang dimiliki user lengkap dengan detail jumlah, nilai pasar, dan kupon bulanan.

----------
----------

# Login as Admin

![WhatsApp Image 2025-04-29 at 13 44 09_255d35b3](https://github.com/user-attachments/assets/f31a858d-1219-431c-b5c0-80ff30ccf414)

Admin mencoba login dan sistem akan terus meminta ulang inputan jika data tidak sesuai, hingga berhasil login.

![WhatsApp Image 2025-04-29 at 13 41 33_6a1bacdd](https://github.com/user-attachments/assets/0f30c58c-da10-4859-b680-a802bf7e3c6e)

![WhatsApp Image 2025-04-29 at 13 41 56_a9d56769](https://github.com/user-attachments/assets/7e7119e2-e141-4cf4-86f7-b60be60214da)

Tampilan ini menunjukkan admin berhasil login. Sistem mengarahkan ke menu utama admin.

----

# Menu Admin

Sistem menampilkan fitur admin, yaitu pengelolaan saham, pengelolaan SBN, dan logout.

![WhatsApp Image 2025-04-29 at 13 57 13_11b09276](https://github.com/user-attachments/assets/f3ed01a7-fe99-41a1-8ef7-f06b495a1c5f)

----
## Saham (Admin)
Admin memilih fitur Saham pada Menu Admin, lalu sistem menampilkan beberapa fitur pada menu saham seperti di bawah ini. 

### Tampilkan Saham 
![image](https://github.com/user-attachments/assets/acad2f38-1e46-49aa-a549-c3215c1eaa5c)

Fitur ini digunakan untuk melihat daftar saham yang tersedia dalam sistem, lengkap dengan kode dan harga saham.

![image](https://github.com/user-attachments/assets/a7f05f5a-410e-452e-b8fa-ee76000149f9)

Sistem menampilkan **Daftar Saham Yang Tersedia** pada fitur ini. Lalu setelah itu akan kembali kepada menu Admin untuk memilih fitur kembali yang dapat digunakan oleh Admin.


### Tambah Saham
![image](https://github.com/user-attachments/assets/9e79b58b-9693-49b7-aae7-76ffc5e390dc)

Admin memilih opsi untuk menambahkan saham baru.

![image](https://github.com/user-attachments/assets/e12ca8c5-fdb3-4925-b505-89ea555d776c)

Sistem meminta input seperti nama saham, kode saham, harga per lembar, dan jumlah lembar yang tersedia.

![image](https://github.com/user-attachments/assets/7052ac69-3e23-4a89-96f2-78e58496ad47)

![image](https://github.com/user-attachments/assets/a955dcd1-1f89-41cd-af8f-016f051fd318)

Sistem memilki sebuah validasi untuk mengecek apakah data saham yang akan ditambahkan itu sudah ada atau belum, validasi ini dipakai agar mencegah terjadinya duplikat data. Seperti pada contoh, data yang dimasukkan pertama terdeteksi oleh sistem bahwa sudah tercatat di dalam sistem, lalu sistem meminta kembali Admin untuk menginputkan kembali data saham yang berbeda untuk ditambah. Selanjutnya, jika sudah sesuai maka Admin akan lanjut mengkonfirmasi data saham yang akan ditambah lalu saham berhasil ditambahkan oleh Admin.


### Ubah Harga Saham 
![image](https://github.com/user-attachments/assets/d70bf5de-5024-4ea5-ab7c-34605f3f0e3b)

Admin memilih menu ubah harga saham. 

![image](https://github.com/user-attachments/assets/f34130b2-cb24-42c3-9a7d-6640a8a57dc2)

Sistem menampilkan daftar saham yang tersedia lengkap dengan kode dan harga saat ini. 

![image](https://github.com/user-attachments/assets/ac5b5c83-97b2-44eb-b552-a39dca66c408)

Admin kemudian diminta untuk memasukkan kode saham yang ingin diubah harganya, serta harga baru yang diinginkan.

![image](https://github.com/user-attachments/assets/38000fa0-673a-4e79-ba75-0c7feb8406eb)

Setelah dikonfirmasi, sistem memperbarui harga saham tersebut dan menampilkan pesan bahwa harga berhasil diperbarui.

----

### Logout (by Customer)

![WhatsApp Image 2025-04-29 at 13 11 32_a61a9491](https://github.com/user-attachments/assets/e234a07b-8823-4766-afc6-ec185fb0a7d2)

![WhatsApp Image 2025-04-29 at 13 11 41_561dfcb5](https://github.com/user-attachments/assets/7507dc73-760c-4083-bc53-3ffdb9688465)

Tampilan apabila Customer sudah berhasil logout.

### Logout (by Admin)

![image](https://github.com/user-attachments/assets/521e01e8-ce7b-43db-bfa3-38fb868f27ef)

![image](https://github.com/user-attachments/assets/3c9fad21-3f67-4e12-95c4-8a997dda0842)

Tampilan apabila Admin sudah berhasil logout.

![WhatsApp Image 2025-04-29 at 13 11 59_e5234a92](https://github.com/user-attachments/assets/7b2f4cc8-9fce-4127-86e9-ae4ec65966b7)

Sistem menampilkan ucapan terimakasih kepada user karena telah memakai program dengan baik.
