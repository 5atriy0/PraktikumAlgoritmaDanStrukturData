# **LAPORAN JOBSHEET 6**

---

<img src = "image-1.png">

---

## Nama    : Satriyo Bagus Susianto
## No      : 26
## Kelas   : 1-H
## NIM     : 2341720249

---

### A. Searching / Pencarian Menggunakan Agoritma Sequential Search

<img src = "image-2.png">
<img src = "image-3.png">
<img src = "image-4.png">

#### Pertanyaan :
1. Jelaskan fungsi break yang ada pada method FindSeqSearch!
> Pada method findSeqSearch, break digunakan untuk menghentikan perulangan setelah ditemukan nilai yang sesuai dengan nilai variabelcari.

2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih
dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti
dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi?
> Program tersebut masih bisa berjalan karena Sequential Search untuk membandingkan nilai satu per satu hingga ditemukan nilai yang dicari, sehingga data tidak perlu urut.
<img src = "image-5.png">
<img src = "image-6.png">

3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe
method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method
tersebut pada class BukuMain seperti gambar berikut :
<img src = "image.png">

### B. Searching / Pencarian Menggunakan Binary Search

<img src = "image-8.png">

#### Pertanyaan :
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
<img src = "image-9.png">

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

3. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214,
20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search?
Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai!
> Kode akan tetap berjalan, hanya saja data tidak akan diurutkan. perlu untuk membuat method sendiri untuk mengurutkan data-data yang telah dimasukkan.

4. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan
Mengapa hal tersebut bisa terjadi?
> Data tidak akan ditemukan saat program dijalankan menggunakan binary search, diperlukan pengurutan data terlebih dahulu agar data dapat ditemukan.

### C. Pengayaan Divide and Conquer

<img src = "">

### Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Ubah tipe data dari kode Buku yang awalnya int menjadi String
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan
sequential search dan binary search.

<img src = "image-10.png">

2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
- Tambahkan method pencarian judul buku menggunakan sequential search dan binary
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan
dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga
ketika input data acak, maka algoritma searching akan tetap berjalan
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam
bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang
diberikan!

<img src = "image-11.png">
