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

**Tampilan pertama yang disediakan pada saat memulai program**

![WhatsApp Image 2025-04-29 at 00 00 18_428f5eee](https://github.com/user-attachments/assets/c6557572-d710-43fc-8ae6-717f5d9f749e)

**Program akan meminta pengguna untuk login terlebih dahulu. Jika login gagal, akan ditampilkan pesan kegagalan, sedangkan jika berhasil, pengguna akan diarahkan ke menu investasi.**

![WhatsApp Image 2025-04-29 at 00 00 30_dccb4d7b](https://github.com/user-attachments/assets/b8b46370-ac2e-4a9b-a26b-af86042511fe)

![WhatsApp Image 2025-04-29 at 00 00 42_4fef63f1](https://github.com/user-attachments/assets/c43c333b-a030-410f-99c9-1d0ed588a34e)

![WhatsApp Image 2025-04-29 at 00 01 10_b62d20e6](https://github.com/user-attachments/assets/67a710f2-ab86-4ab2-adf0-e3856a54123f)

![WhatsApp Image 2025-04-29 at 00 05 22_c4040758](https://github.com/user-attachments/assets/779380aa-30ae-46a1-a92a-4c96e13b26ce)

![WhatsApp Image 2025-04-29 at 00 20 14_3360c7c8](https://github.com/user-attachments/assets/085cf59a-f3d9-404c-97b0-f182bee651cf)

![WhatsApp Image 2025-04-29 at 00 20 41_4633fed0](https://github.com/user-attachments/assets/824d794f-5fe7-41cc-b38b-2254ff9bc17e)

![WhatsApp Image 2025-04-29 at 00 21 02_140330ba](https://github.com/user-attachments/assets/c58cbc2b-58bf-4c3a-9b66-ff76a4823731)

![WhatsApp Image 2025-04-29 at 00 21 23_4220483d](https://github.com/user-attachments/assets/3adde5ee-c634-4ddb-a732-6ed5cc793878)

![WhatsApp Image 2025-04-29 at 00 21 57_93472ff6](https://github.com/user-attachments/assets/7ea1acce-e5a8-4166-9f09-c1ca95677a39)

![WhatsApp Image 2025-04-29 at 00 22 26_4a75a133](https://github.com/user-attachments/assets/0b931ed6-ef47-467f-a2c3-4e05e14f0d21)

![WhatsApp Image 2025-04-29 at 00 22 53_955991d8](https://github.com/user-attachments/assets/9badf121-96c2-478e-82fb-b3028699dc45)

![WhatsApp Image 2025-04-29 at 00 23 08_6cfd8788](https://github.com/user-attachments/assets/953c406e-5923-40bc-80e4-21446d0d0c32)

![WhatsApp Image 2025-04-29 at 00 24 12_45754732](https://github.com/user-attachments/assets/bc42765c-4f98-4cd9-bace-3eaaa63e60d7)

![WhatsApp Image 2025-04-29 at 00 24 52_0bdac956](https://github.com/user-attachments/assets/61b21c1d-b6d9-4873-8b95-cacc0fddb9b8)

![WhatsApp Image 2025-04-29 at 00 25 03_2f592f22](https://github.com/user-attachments/assets/d5fe9069-2417-4bd6-b1bb-a0b8164b9fab)

![WhatsApp Image 2025-04-29 at 00 25 23_7990d3a3](https://github.com/user-attachments/assets/7198c5ae-23c7-4a02-beba-12f39d8c8534)

![WhatsApp Image 2025-04-29 at 00 26 08_c628b3d6](https://github.com/user-attachments/assets/f8e3da00-fa13-4be6-96d3-09a46e6078ed)

![WhatsApp Image 2025-04-29 at 00 26 30_80e34166](https://github.com/user-attachments/assets/5f0d90de-760a-48da-bf65-ae20f4cae35f)

![WhatsApp Image 2025-04-29 at 00 26 51_782974e8](https://github.com/user-attachments/assets/5d6747bb-cd13-42d5-b7e4-28144b32646e)

![WhatsApp Image 2025-04-29 at 00 27 05_eecfb6ac](https://github.com/user-attachments/assets/36f4221b-2ce5-4cd3-9be0-ba89c9313934)

![WhatsApp Image 2025-04-29 at 00 27 35_e751f1b8](https://github.com/user-attachments/assets/233aff44-5520-4fa5-a6b7-baad56916850)

![WhatsApp Image 2025-04-29 at 00 28 11_a0436ecf](https://github.com/user-attachments/assets/9ef38d21-4f5f-43c8-a627-8b0962b9304e)

![WhatsApp Image 2025-04-29 at 00 28 51_57d54d0d](https://github.com/user-attachments/assets/1360766e-5b60-4e25-9dd9-078bd5bb2cc9)

![WhatsApp Image 2025-04-29 at 00 29 06_ddcbc6c6](https://github.com/user-attachments/assets/94182bed-2557-471e-8e9f-01a2406b5d76)

![WhatsApp Image 2025-04-29 at 01 09 50_07abe217](https://github.com/user-attachments/assets/498a4161-9c10-4ffc-82e2-fd5cb98880b4)

![WhatsApp Image 2025-04-29 at 01 10 34_e53cd055](https://github.com/user-attachments/assets/6f62b57d-a4b0-43df-a9d0-a94bf95cbd8a)

![WhatsApp Image 2025-04-29 at 01 11 32_25241be7](https://github.com/user-attachments/assets/fda2c70c-d5bf-4538-a842-41f1525f432a)

![WhatsApp Image 2025-04-29 at 01 11 54_e6c88166](https://github.com/user-attachments/assets/beb4e697-efe7-450a-80a9-a5e97fde7a33)

![WhatsApp Image 2025-04-29 at 01 12 37_13a943e6](https://github.com/user-attachments/assets/a58ffb1d-7241-4c09-8e30-afce417dfd94)

![WhatsApp Image 2025-04-29 at 01 12 51_a97e4623](https://github.com/user-attachments/assets/633ee3d0-d161-427d-b412-a6a754776a2b)

![WhatsApp Image 2025-04-29 at 01 13 31_0bc47d32](https://github.com/user-attachments/assets/cb9c1e6a-6cb1-4ae7-99c1-c1a80450e247)

![WhatsApp Image 2025-04-29 at 01 13 44_4798f023](https://github.com/user-attachments/assets/fa4db328-fd23-4a22-a99e-16123ede0311)

![WhatsApp Image 2025-04-29 at 01 14 14_7b52f13c](https://github.com/user-attachments/assets/4e2e219a-e125-4928-b6cc-f0c42d9aa59f)

![WhatsApp Image 2025-04-29 at 01 14 34_f9581d96](https://github.com/user-attachments/assets/4c1b92e5-38af-4010-ae83-3371b1f4d394)

![WhatsApp Image 2025-04-29 at 01 14 48_549f6303](https://github.com/user-attachments/assets/b821c1e1-0c5b-4001-a3c1-01323418acf9)

![WhatsApp Image 2025-04-29 at 01 15 08_61a0b43d](https://github.com/user-attachments/assets/7e7076f5-a9e3-4edb-a83b-ef8d873ac216)

![WhatsApp Image 2025-04-29 at 01 15 26_fe03d040](https://github.com/user-attachments/assets/12af33b6-ce8e-401a-a2a9-20d2cd045aa3)

![WhatsApp Image 2025-04-29 at 01 15 50_c2178767](https://github.com/user-attachments/assets/ec530811-a937-4b59-8b84-c31e5d78bc19)

![WhatsApp Image 2025-04-29 at 01 16 06_716afcd0](https://github.com/user-attachments/assets/fbd3c51c-0650-4983-bb5d-299b3bb0252e)

![WhatsApp Image 2025-04-29 at 01 16 19_48fd2ce0](https://github.com/user-attachments/assets/7cf8a2d2-d613-433f-a614-176253d56170)

![WhatsApp Image 2025-04-29 at 01 16 59_5ceeb53a](https://github.com/user-attachments/assets/bee3818c-9579-4a34-aa93-41308188d15b)

![WhatsApp Image 2025-04-29 at 01 17 11_d4a60474](https://github.com/user-attachments/assets/93cd4376-78e8-497f-8ac3-efd2fab236c6)

![WhatsApp Image 2025-04-29 at 01 17 27_a3ee3027](https://github.com/user-attachments/assets/c386a4f1-67e3-4052-9e5d-0f664968f17a)

![WhatsApp Image 2025-04-29 at 01 17 53_a68ababb](https://github.com/user-attachments/assets/d7d01a3e-05c4-4cd4-8875-51d895570625)

