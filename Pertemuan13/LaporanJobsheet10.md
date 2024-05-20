# **LAPORAN JOBSHEET 10**

---

<img src = "image.png">

---

## Nama    : Satriyo Bagus Susianto
## No      : 26
## Kelas   : 1-H
## NIM     : 2341720249

---

### A. Percobaan 1 :

<img src = "image-1.png">

#### Pertanyaan :
1. Jelaskan perbedaan antara single linked list dengan double linked lists!

> Single linked list memiliki setiap node yang terhubung ke node berikutnya dalam satu arah saja, sementara double linked list memiliki setiap node yang terhubung ke node sebelumnya dan berikutnya, memungkinkan traversal maju dan mundur.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut
tersebut?

> Atribut next digunakan untuk menunjukkan node berikutnya dalam double linked list, sementara atribut prev digunakan untuk menunjukkan node sebelumnya. Dengan memiliki kedua atribut ini, setiap node dapat mengakses node sebelumnya dan berikutnya dalam list.

3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan
size seperti pada gambar berikut ini?

<img src = "image-2.png">

> Inisialisasi atribut head dengan null menandakan bahwa awalnya linked list tidak memiliki node apa pun, karena tidak ada node yang menunjuk ke node lainnya. Inisialisasi size dengan nilai 0 menandakan bahwa linked list tersebut kosong pada awalnya, karena belum ada node yang dimasukkan ke dalamnya.

4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev dianggap sama dengan null?

    Node newNode = new Node(null, item, head);

> Dalam method addFirst(), ketika menambahkan node baru di posisi pertama dari double linked list, node baru tersebut menjadi node pertama baru. Oleh karena itu, node sebelumnya dari node baru (yang akan menjadi node kedua) adalah null, karena tidak ada node sebelumnya dalam double linked list ini. Jadi, pada pembuatan objek dari konstruktor class Node, parameter prev dianggap sama dengan null untuk menunjukkan bahwa node baru ini akan menjadi node pertama dalam linked list dan tidak memiliki node sebelumnya.

5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?

> Statement head.prev = newNode mengatur node yang sebelumnya menjadi kepala (head) untuk menunjuk ke node baru yang ditambahkan, sehingga menghubungkan node baru ke linked list secara ganda.

6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan
parameter prev dengan current, dan next dengan null?

    Node newNode = new Node(current, item, null);

> Pembuatan objek Node dengan mengisikan parameter prev dengan current dan next dengan null berarti node baru terhubung ke node terakhir dan tidak memiliki node setelahnya.

7. Pada method add(), terdapat potongan kode program sebagai berikut:

<img src = "image-3.png">

Jelaskan maksud dari bagian yang ditandai dengan kotak kuning.

> Kode ini memastikan bahwa ketika sebuah node baru ditambahkan pada indeks 0 atau head (di depan linked list), node tersebut diatur dengan benar sebagai node pertama (head). Node yang awalnya adalah node pertama sekarang menjadi node kedua, dan referensi head diperbarui untuk menunjuk ke node baru.

### B. Percobaan 2 :

<img src = "image-4.png">

#### Pertanyaan :
1. Apakah maksud statement berikut pada method removeFirst()?

    head = head.next;
    
    head.prev = null;

> Kode ini akan memindahkan atau menggeser posisi head ke node yang ke-2 kemudian menghapus pointer prev dari node ke-2 (yang sekarang menjadi head) menjadi null.

2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?

> Metode removeLast() mendeteksi dan menghapus elemen terakhir dalam linked list dengan langkah-langkah sebagai berikut: Pertama, periksa apakah list kosong dan lemparkan pengecualian jika benar. Kedua, jika list hanya memiliki satu elemen (head.next adalah null), hapus elemen tersebut dengan mengatur head ke null dan kurangi ukuran list. Ketiga, untuk list dengan lebih dari satu elemen, iterasi melalui node hingga menemukan node kedua terakhir (node yang next-nya adalah node terakhir). Terakhir, hapus node terakhir dengan mengatur next dari node kedua terakhir ke null dan kurangi ukuran list.

3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!

<img src = "image-5.png">

> tmp seharusnya dijadikan sebagai node pertama (head) bukan head.next. Dan dengan mengatur head.next ke tmp.next, maka akan melewati node kedua dan langsung menghubungkan node pertama ke node setelahnya. Ini akan menghilangkan node kedua dari linked list, bukan node yang dimaksud.

4. Jelaskan fungsi kode program berikut ini pada fungsi remove!

<img src = "image-6.png">

> Kode ini akan menghubungkan node sebelum dan sesudah node yang dihapus sehingga tidak ada lagi node yang terhubung langsung ke node yang dihapus.

### C. Percobaan 3 :

<img src = "image-7.png">

#### Pertanyaan :
1. Jelaskan method size() pada class DoubleLinkedLists!

> Metode size() pada kelas DoubleLinkedLists digunakan untuk mengembalikan jumlah elemen atau berapa node yang ada dalam double linked list pada saat ini.

2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!

> Mengatur indeks pada double linked list agar dimulai dari indeks ke-1: Secara default, indeks pada linked list dimulai dari 0. Namun, untuk mengatur agar indeks dimulai dari 1, kita dapat mengubah logika pada method-method yang terkait dengan indeks, seperti add(int item, int index), remove(int index), dan get(int index). Pada setiap method tersebut, kita dapat mengurangi nilai index dengan 1 sebelum digunakan dalam operasi pada linked list.

3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists!

> Pada double linked lists, setiap node memiliki dua pointer, yaitu prev (pointer ke node sebelumnya) dan next (pointer ke node berikutnya). Saa tmenambahkan elemen baru, kita perlu memperbarui kedua pointer ini untuk menyambungkan node baru dengan node sebelumnya dan node berikutnya. Sedangkan pada single linked lists, setiap node hanya memiliki satu pointer, yaitu next (pointer ke node berikutnya).

4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!

<img src = "image-8.png">

> Perbedaannya ada pada bagaimana jalan kedua prograamnya meskipun sama sama untuk mencari tau apakah kosong tapi jika a mencari true dan flase tetrlebih dahulu sedangkan yang b langsung

### Tugas :
1. 