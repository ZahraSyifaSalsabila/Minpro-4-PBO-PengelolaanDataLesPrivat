# Sistem Pengelolaan Data Les Privat
## Deskripsi Singkat Program
Sistem Pengelolaan Data Les Privat merupakan aplikasi berbasis Java (Console/CLI) yang dirancang untuk mengelola tiga entitas data utama secara terstruktur, yaitu data siswa (ID, nama, jenjang, mata pelajaran), data tutor (ID, nama, keahlian, nomor telepon), serta data jadwal les (ID jadwal, ID siswa, ID tutor, hari, dan jam). Seluruh data tersebut disimpan secara dinamis menggunakan ArrayList selama program berjalan.

Program ini menyediakan lima menu utama yaitu Tambah Data, Tampilkan Data, Update Data, Hapus Data, dan Keluar. Selain itu, sistem dilengkapi dengan mekanisme validasi input untuk memastikan data angka dan teks terisi dengan benar, mencegah input kosong (termasuk pencegahan enter langsung), serta menghindari duplikasi ID agar data tetap konsisten dan aman.

## Penjelasan Alur Program
Ketika program dijalankan melalui class MainApp, program akan menyiapkan Scanner untuk menerima input dari pengguna. Setelah itu, program membuat object yang digunakan untuk mengelola data les privat dan menampilkan menu utama.

Menu utama dijalankan menggunakan perulangan while sehingga menu akan terus muncul dan dapat digunakan berkali-kali selama program masih berjalan. Pilihan yang dimasukkan pengguna kemudian diproses menggunakan switch-case.

Setiap pilihan pada menu utama akan diteruskan melalui LesPrivatController. LesPrivatController kemudian menjalankan method yang sesuai pada LayananLesPrivat. Dengan begitu, MainApp tidak langsung melakukan proses tambah, tampil, update, atau hapus data, tetapi meneruskan proses tersebut ke bagian yang memang digunakan untuk mengelola data.

Jika pengguna memilih menu nomor 1, program menjalankan proses Tambah Data. Jika memilih nomor 2, program menjalankan proses Tampilkan Data. Nomor 3 digunakan untuk Update Data, nomor 4 untuk Hapus Data, sedangkan nomor 5 digunakan untuk keluar dari program.

**a. Data Siswa**

**Contoh penambahan data siswa:**

<img width="486" height="164" alt="Screenshot 2026-10-05 212041" src="https://github.com/user-attachments/assets/eeab1cb7-f4ad-4ce6-a7ec-47ffe4f3b742" />

Jika pengguna memilih menu Data Siswa, program akan meminta ID Siswa, nama, jenjang, dan mata pelajaran. ID harus berupa angka dan tidak boleh sama dengan ID siswa lain, sedangkan data teks tidak boleh kosong. Setelah semua data valid, program menyimpan data siswa ke dalam ArrayList sehingga dapat ditampilkan melalui menu Tampilkan Data, diubah dimenu update, atau dihapus dimenu hapus data.

**Contoh tampilkan data siswa:**

<img width="494" height="231" alt="Screenshot 2026-10-05 212340" src="https://github.com/user-attachments/assets/26796f32-94c5-4a72-aa7a-d6ae338e7bd8" />

Jika pengguna memilih Data Siswa, program melakukan perulangan pada daftarSiswa dan menampilkan setiap data siswa yang tersimpan. Informasi yang ditampilkan yaitu ID, nama, jenjang, dan mata pelajaran.

**Contoh update data siswa:**

<img width="596" height="167" alt="Screenshot 2026-10-05 212725" src="https://github.com/user-attachments/assets/9053bda0-d4a4-4def-9d02-4c728523bb82" />

Pengguna memasukkan ID siswa 1 dan memanfaatkan fitur System Enter (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan nama lama "Zahra", sementara data jenjang dan mata pelajaran berhasil diperbarui menjadi SMK dan Perkantoran

**Maka data setelah diupdate yaitu:**

<img width="640" height="227" alt="Screenshot 2026-10-05 213115" src="https://github.com/user-attachments/assets/72bdc402-e4ec-4fe3-8c8a-52f42b91f200" />

**Contoh hapus data siswa:**

<img width="677" height="328" alt="Screenshot 2026-10-05 214151" src="https://github.com/user-attachments/assets/f17e426d-67c2-46d5-8101-73aa12e9834b" />

**b. Data Tutor**

**Contoh penambahan data tutor:**

<img width="588" height="170" alt="Screenshot 2026-10-05 212140" src="https://github.com/user-attachments/assets/05432d64-c0d9-400c-82d0-0e6edaa0fac4" />

Jika pengguna memilih menu Data Tutor, program akan meminta ID Tutor, nama, keahlian, dan nomor telepon. ID harus berupa angka dan tidak boleh sama dengan ID tutor lain, sedangkan data lainnya tidak boleh kosong. Setelah semua data valid, program membuat objek Tutor dan menyimpannya ke dalam ArrayList daftarTutor agar dapat ditampilkan, diubah, atau dihapus melalui menu yang tersedia.

**Contoh tampilkan data tutor:**

<img width="701" height="233" alt="Screenshot 2026-10-05 212425" src="https://github.com/user-attachments/assets/a4acfbbc-9e08-4644-91c2-92fa12696893" />

Jika pengguna memilih Data Tutor, program melakukan perulangan pada daftarTutor dan menampilkan informasi setiap tutor. Informasi yang ditampilkan yaitu ID, nama, keahlian, dan nomor telepon.

**Contoh update data tutor:**

<img width="593" height="169" alt="Screenshot 2026-10-05 213025" src="https://github.com/user-attachments/assets/45ed2f2d-d066-4c16-ae10-3560024672db" />

Pengguna memasukkan ID tutor 2, lalu memperbarui nama menjadi "Imsa" dan nomor telepon baru, dan memanfaatkan fitur System Enter pada bagian keahlian (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan data keahlian lama yaitu Jaringan

**Maka data setelah diupdate yaitu:**

<img width="468" height="231" alt="Screenshot 2026-10-05 213328" src="https://github.com/user-attachments/assets/3a74605f-4511-44ee-b5bd-bb251170e5ee" />

**Contoh hapus data tutor:**

<img width="587" height="326" alt="Screenshot 2026-10-05 214112" src="https://github.com/user-attachments/assets/e3c355df-8c54-49c8-8daa-10abf9ba25d6" />

**c. Data Jadwal**

**Contoh penambahan data jadwal:**

<img width="620" height="175" alt="Screenshot 2026-10-05 212207" src="https://github.com/user-attachments/assets/4ff57fbf-6f14-44a8-a112-8e32218ee19f" />

Jika pengguna memilih menu Data Jadwal, program akan meminta ID Jadwal, ID Siswa, ID Tutor, hari, dan jam pelaksanaan les. ID Jadwal harus berupa angka dan tidak boleh sama dengan ID yang sudah tersimpan. Setelah semua informasi dimasukkan, program membuat objek Jadwal dan menyimpannya ke dalam ArrayList daftarJadwal. Saat jadwal ditampilkan, program mencari nama siswa dan tutor berdasarkan ID.

**Contoh tampilkan data jadwal:**

<img width="674" height="250" alt="Screenshot 2026-10-05 212507" src="https://github.com/user-attachments/assets/ae126d51-c976-4da2-8ebb-3e5e39c8a34f" />

Jika pengguna memilih Data Jadwal, program melakukan perulangan pada daftarJadwal. Untuk setiap jadwal, program mengambil ID siswa dan ID tutor yang tersimpan pada jadwal tersebut. ID tersebut kemudian digunakan untuk mencari nama siswa dan nama tutor dari daftar masing-masing.

**Contoh update data jadwal:**

<img width="383" height="183" alt="Screenshot 2026-10-05 213433" src="https://github.com/user-attachments/assets/0d152d2a-9f66-4533-a8e6-c093644a3caa" />

Pengguna memasukkan ID jadwal 2, lalu memanfaatkan fitur System Enter (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan ID siswa dan ID tutor lama, sementara informasi hari dan jam berhasil diperbarui menjadi "Jumat" dan "16.00"

**Maka data setelah diupdate yaitu:**

<img width="541" height="250" alt="Screenshot 2026-10-05 213508" src="https://github.com/user-attachments/assets/a260c5b8-020e-4ec9-8236-27c6aa99750e" />

**Contoh hapus data jadwal:**

<img width="569" height="332" alt="Screenshot 2026-10-05 213846" src="https://github.com/user-attachments/assets/6106f304-884a-4a50-af08-6e81fe53a1b7" />

**Keluar**

Ketika pengguna memilih menu nomor 5, nilai boolean berjalan pada MainApp diubah menjadi false. Kondisi tersebut membuat perulangan while berhenti sehingga menu utama tidak lagi ditampilkan.

**Contoh keluar program:**

<img width="506" height="131" alt="Screenshot 2026-10-05 214305" src="https://github.com/user-attachments/assets/af41c90e-409d-4ff2-a5c5-a0799e4079db" />

## Validasi Input

Program memiliki validasi input untuk membantu memastikan data yang dimasukkan sesuai dengan kebutuhan program.

a. Untuk input berupa angka, seperti pilihan menu dan ID, program menggunakan method inputAngka(). Method tersebut akan memeriksa apakah input yang diberikan merupakan angka. Jika pengguna memasukkan huruf atau input selain angka, program tidak langsung melanjutkan proses, tetapi meminta pengguna memasukkan angka kembali.

**Contoh validasi input berupa angka:**

<img width="293" height="81" alt="Screenshot 2026-10-05 214551" src="https://github.com/user-attachments/assets/037a3976-b83a-4ded-a64b-8d707840a179" />

b. Untuk input berupa teks, program menggunakan method inputTeks(). Method ini digunakan untuk memeriksa apakah input yang diberikan kosong atau hanya berisi spasi. Jika input kosong, pengguna akan diminta memasukkan data kembali sampai memberikan teks yang sesuai.

**Contoh validasi input berupa teks:**

<img width="275" height="88" alt="Screenshot 2026-10-05 214731" src="https://github.com/user-attachments/assets/33bba9a9-b9a4-468d-a5b3-25f876fe8feb" />

c. Program juga melakukan validasi terhadap ID siswa, tutor, dan jadwal. Setiap ID diperiksa sebelum data baru ditambahkan. Pengecekan tersebut dilakukan menggunakan method isIdSiswaAda(), isIdTutorAda(), dan isIdJadwalAda(). Jika ID yang dimasukkan sudah digunakan, program akan menampilkan pesan bahwa ID tersebut sudah digunakan dan pengguna harus memasukkan ID lain. Dengan begitu, data yang ditambahkan tidak menggunakan ID yang sama dengan data sebelumnya.

**Contoh validasi terhadap ID yang sudah ada:**

<img width="234" height="75" alt="Screenshot 2026-10-05 214840" src="https://github.com/user-attachments/assets/ee805345-17db-4c29-b94a-ac01040fcfa3" /> <img width="202" height="77" alt="Screenshot 2026-10-05 214916" src="https://github.com/user-attachments/assets/4eefa053-d788-4db6-a379-f0f7998501af" /> <img width="196" height="80" alt="Screenshot 2026-10-05 214942" src="https://github.com/user-attachments/assets/8310723c-b1c9-4cdd-8965-7d58c29d9423" />

d. Validasi juga digunakan pada proses input menu. Jika pengguna memasukkan pilihan selain pilihan yang tersedia, program akan menampilkan pesan bahwa pilihan tidak ada sehingga pengguna dapat memilih kembali menu yang sesuai. Validasi tersebut digunakan pada proses tambah data, update data, dan bagian lain yang membutuhkan input dari pengguna. Dengan adanya validasi, kesalahan input dapat dikurangi dan program dapat tetap berjalan ketika pengguna memasukkan data yang tidak sesuai.

**Contoh validasi proses input menu:**

<img width="260" height="77" alt="Screenshot 2026-10-05 215104" src="https://github.com/user-attachments/assets/f7ccacd8-e549-43cd-be1d-c38ac958c027" />

## Penerapan Encapsulation
Encapsulation diterapkan dengan membuat atribut pada class menjadi private melalui penggunaan Access Modifier. Dengan menggunakan private, atribut tidak dapat diakses dan diubah secara langsung dari luar class. Pada class Pengguna, atribut id dan nama dibuat private. Kedua atribut tersebut memiliki getter untuk mengambil nilainya dan setter untuk mengubah nilainya.

**Contoh pemberian Access Modifier pada class pengguna:**

<img width="350" height="80" alt="image" src="https://github.com/user-attachments/assets/a3998d51-902d-456a-8108-880f9fd61118" />

a. Getter digunakan ketika program membutuhkan informasi yang tersimpan. Contohnya, ketika LayananLesPrivat ingin mencari siswa berdasarkan ID, program menggunakan getId(). Ketika program ingin mengambil nama siswa untuk ditampilkan pada jadwal, program menggunakan getNama().

b. Setter digunakan ketika terdapat perubahan data. Contohnya, ketika pengguna melakukan Update Data Siswa, program menggunakan setNama(), setJenjang(), dan setMataPelajaran() untuk memasukkan informasi baru.

**Encapsulation getter dan setter pada class**

Encapsulation dapat dilihat pada class Siswa. Atribut jenjang dan mataPelajaran dibuat private dan masing-masing memiliki getter dan setter. Dengan demikian, program dapat mengambil data menggunakan getJenjang() dan getMataPelajaran(), serta mengubahnya menggunakan setJenjang() dan setMataPelajaran().

**Penerapan encapsulation pada siswa:**

<img width="582" height="370" alt="Screenshot 2026-10-05 215808" src="https://github.com/user-attachments/assets/52df3362-56f0-42a8-a2f8-070016c1fb4c" />

## Penerapan Inheritance
Inheritance diterapkan dengan menggunakan class Pengguna sebagai superclass. Class Pengguna digunakan untuk menyimpan data yang sama-sama dimiliki oleh siswa dan tutor, yaitu ID dan nama.

a. Class Siswa dan Tutor menjadi subclass dari Pengguna. Pada class Siswa digunakan hubungan: "public class Siswa extends Pengguna". Sedangkan pada class Tutor digunakan: "public class Tutor extends Pengguna". Dengan menggunakan extends, Siswa dan Tutor dapat menggunakan data dan method yang berasal dari Pengguna.

**Penerapan Inheritence extends pada masing-masing subclass siswa dan tutor:**

<img width="234" height="17" alt="Screenshot 2026-10-05 220533" src="https://github.com/user-attachments/assets/c1c1f557-58ef-4112-88c3-6e287dbc062c" />

<img width="230" height="15" alt="image" src="https://github.com/user-attachments/assets/441b92e3-5768-4d18-951b-7c77acd10ff1" />

b. Siswa memiliki data tambahan berupa jenjang dan mataPelajaran. Tutor memiliki data tambahan berupa keahlian dan noTelepon. Jadi, data yang umum untuk keduanya diletakkan pada Pengguna, sedangkan data yang berbeda diletakkan pada masing-masing class. Pada constructor Siswa dan Tutor juga digunakan super(id, nama). Bagian tersebut digunakan untuk mengirim nilai ID dan nama ke constructor Pengguna ketika object Siswa atau Tutor dibuat. Contohnya, ketika program membuat data siswa baru, program tidak perlu membuat ulang bagian ID dan nama sebagai atribut baru di dalam Siswa. Siswa cukup menggunakan atribut yang sudah dimiliki dari Pengguna, kemudian menambahkan data khusus siswa berupa jenjang dan mata pelajaran. Hal yang sama berlaku pada Tutor. Tutor menggunakan ID dan nama dari Pengguna, kemudian memiliki tambahan berupa keahlian dan nomor telepon.

**Tambahan atribut pada masing-masing subclass siswa dan tutor:**

<img width="587" height="76" alt="image" src="https://github.com/user-attachments/assets/850dee80-057d-477f-966a-eb4c7d4836fd" />

<img width="575" height="73" alt="image" src="https://github.com/user-attachments/assets/af07be2c-a81a-4d02-b69d-651a5bfe9b46" />

c. Penerapan inheritance membuat data yang sama tidak perlu dibuat berulang pada class Siswa dan Tutor. Data yang bersifat umum ditempatkan pada Pengguna, sedangkan data yang bersifat khusus ditempatkan pada masing-masing subclass. Dengan susunan tersebut, hubungan antara Pengguna, Siswa, dan Tutor dapat terlihat dengan jelas dan struktur class dalam program menjadi lebih teratur.

## MVC
Program menerapkan pemisahan package untuk mengatur bagian-bagian program berdasarkan fungsinya.

## Screenshoot Struktur Folder:

<img width="275" height="392" alt="image" src="https://github.com/user-attachments/assets/64b8f6b8-1fd9-4fd8-aa6f-6df48cc3e6d3" />

**a. Package Model**

Package model berisi class Pengguna, Siswa, Tutor, dan Jadwal yang digunakan untuk membentuk data dalam program. Pengguna digunakan sebagai dasar data yang dimiliki oleh Siswa dan Tutor, Siswa digunakan untuk menyimpan data siswa, Tutor untuk menyimpan data tutor, dan Jadwal untuk menyimpan data jadwal les. Pembagian package tersebut membuat bagian untuk menjalankan program, mengelola proses, dan membentuk data menjadi lebih teratur.

**b. Package Controller**

Package Controller berisi class LesPrivatController dan LayananLesPrivat. LesPrivatController digunakan sebagai penghubung antara MainApp dengan LayananLesPrivat, sedangkan LayananLesPrivat berisi proses utama pengelolaan data seperti menambah, menampilkan, mengubah, dan menghapus data, serta melakukan pencarian nama siswa dan tutor dan validasi input.

**c. Package View**

Package view berisi LesPrivatView yang bertanggung jawab penuh atas interaksi konsol dan penerimaan input. Alur program berjalan melalui perulangan while di menu utama yang memproses pilihan pengguna lewat switch-case dan meneruskannya ke controller.

**d. Package Main**

Package Main berisi class MainApp yang bertindak sebagai titik awal (entry point) jalannya program. Class ini bertugas untuk menginisialisasi dan memanggil controller utama agar aplikasi dapat langsung dieksekusi saat pertama kali dijalankan.

**e. Package Config**

Package Config berisi class Koneksi yang berfungsi untuk mengatur dan mengelola koneksi ke database MySQL menggunakan JDBC Driver. Package ini memastikan jembatan komunikasi antara program Java dan database db_lesprivat dapat terhubung dengan stabil

**f. Package DAO**

Package DAO (Data Access Object) berisi class SiswaDAO, TutorDAO, dan JadwalDAO yang bertanggung jawab penuh atas pengolahan data langsung ke database. Package ini mengumpulkan seluruh query SQL menggunakan PreparedStatement untuk menjalankan proses CRUD (Create, Read, Update, Delete) sehingga terpisah bersih dari kode tampilan maupun logika alur program

## Abstraction

Abstraction diterapkan melalui pembuatan abstract class dan abstract method pada hierarki class Pengguna. Class Pengguna dideklarasikan sebagai abstract class Pengguna implements CetakInfo, yang berfungsi sebagai kerangka dasar dan tidak dapat diinstansiasi secara langsung menjadi object baru menggunakan keyword new. Di dalam class Pengguna, terdapat abstract method public abstract String getPeran(); dan public abstract void tampilkanInfo();. Method-method abstrak ini tidak memiliki implementasi di superclass, melainkan wajib di-override dan diimplementasikan secara konkret oleh setiap class turunannya, yaitu Siswa dan Tutor.

**Abstract class pada class pengguna:**

<img width="332" height="44" alt="image" src="https://github.com/user-attachments/assets/d7c31b8b-808f-4d50-89f1-97818d06d41f" />

**Abstract method pada class pengguna:**

<img width="242" height="67" alt="image" src="https://github.com/user-attachments/assets/b34e54ed-58c9-4809-bae2-20ebaa445442" />

## Polymorphism

Polymorphism pada program ini diterapkan dalam dua bentuk utama, yaitu Overriding dan Overloading. Overriding diimplementasikan melalui method tampilkanInfo() dan getPeran(). Pada abstract class Pengguna, method tampilkanInfo() dideklarasikan sebagai abstract, kemudian dioverride ulang di dalam class Siswa untuk menampilkan informasi ID, nama, jenjang, dan mata pelajaran, serta dioverride di class Tutor untuk menampilkan ID, nama, keahlian, dan nomor telepon sesuai atribut masing-masing subclass. Sementara itu, overloading diterapkan pada class Jadwal melalui dua bentuk method tampilkanInfo() dengan parameter yang berbeda, yakni tampilkanInfo() tanpa parameter dan tampilkanInfo(String namaSiswa, String namaTutor) dengan parameter untuk menerjemahkan ID menjadi nama lengkap.

**Overriding diimplementasikan melalui method tampilkanInfo() dan getPeran(). Pada abstract class Pengguna, method tampilkanInfo() dideklarasikan sebagai abstract:**

<img width="242" height="67" alt="image" src="https://github.com/user-attachments/assets/b34e54ed-58c9-4809-bae2-20ebaa445442" />

**Overriding pada class siswa:**

<img width="373" height="166" alt="image" src="https://github.com/user-attachments/assets/16426901-ae43-4da1-a0cb-da5f3ef32dfb" />

**Overloading pada class jadwal:**

<img width="468" height="220" alt="image" src="https://github.com/user-attachments/assets/b7ac8181-e045-4d36-83ff-5248c38e46b3" />

Penerapan method overloading pada class Jadwal terlihat dari penggunaan dua method bernama tampilkanInfo dengan perbedaan pada parameternya. Versi pertama dibuat tanpa parameter untuk menampilkan informasi dasar berupa ID, sedangkan versi kedua menggunakan dua parameter String (namaSiswa dan namaTutor) untuk menampilkan nama secara langsung agar lebih informatif

## Interface
Sistem ini menerapkan Interface pada dua bagian utama. Pertama, interface PengelolaData pada package Controller yang mendefinisikan kontrak standar operasi CRUD (tambahData, tampilkanData, updateData, dan hapusData) yang diimplementasikan penuh pada LesPrivatController. Kedua, interface CetakInfo pada package model yang mendeklarasikan kontrak method tampilkanInfo() dan diimplementasikan oleh class Pengguna (serta diturunkan ke Siswa dan Tutor) serta diimplementasikan langsung oleh class Jadwal.

**Interface pada class pengguna:**

<img width="325" height="46" alt="image" src="https://github.com/user-attachments/assets/d8d375a7-1596-4f8a-a02a-913376238d9d" />

## Penerapan JDBC

**Buat Database dan tabel data**

<img width="170" height="181" alt="image" src="https://github.com/user-attachments/assets/b56897e6-e592-443e-a15e-d3e8e8b5ff51" />

<img width="570" height="208" alt="image" src="https://github.com/user-attachments/assets/b48dd736-14fa-46a6-b5b2-01b2c336a481" /> <img width="603" height="211" alt="image" src="https://github.com/user-attachments/assets/749629c8-e98e-483e-90d0-c74eb4374ae2" /> <img width="681" height="214" alt="image" src="https://github.com/user-attachments/assets/d65784fa-f9d4-4b05-a5fb-3bb9c27d3884" />

Implementasi JDBC dan DAO pada program ini dilakukan dengan membuat database baru yaitu lesprivat_db kemudian membuat struktur tabel database MySQL. Tiga tabel yang dibuat yaitu tabel siswa, tutor, dan jadwal.

siswa: Menyimpan data diri siswa (ID, nama, jenjang, mata pelajaran).

tutor: Menyimpan data diri tutor (ID, nama, keahlian, nomor telepon).

jadwal: Menyimpan data jadwal les yang menghubungkan id_siswa dan id_tutor sebagai foreign key, beserta hari dan jam les.

**Penambahan driver pada kode program**

<img width="614" height="272" alt="image" src="https://github.com/user-attachments/assets/ef2390a5-8dba-4ab4-b10c-9bbe7d8c2aa4" />

Masukkan file MySQL JDBC Driver (MySQL Connector/J) ke dalam bagian Libraries project Java di NetBeans agar aplikasi dapat mengenali dan berkomunikasi dengan server MySQ.

**Membuat Konfigurasi Koneksi**

<img width="554" height="297" alt="image" src="https://github.com/user-attachments/assets/afbcee4f-3f1d-4f0d-8639-09b3dd281e3a" />

Membuat class Koneksi di dalam package config. Class ini bertugas untuk membuka koneksi ke database MySQL menggunakan DriverManager dengan parameter URL, username (root), dan password:

**Membuat Package DAO**

<img width="605" height="385" alt="image" src="https://github.com/user-attachments/assets/c5735c1c-89c1-4b00-ba49-336f9b2f584f" />

Pisahkan logika akses data ke dalam package dao yang terdiri dari SiswaDAO, TutorDAO, dan JadwalDAO. Setiap kelas DAO mengimplementasikan operasi CRUD (Create, Read, Update, Delete) dengan memanfaatkan PreparedStatement untuk mengeksekusi query SQL secara aman dan terhindar dari SQL Injection.

a. Read (getAll): Mengambil data dari database menggunakan ResultSet dan mengubahnya kembali menjadi objek Java ke dalam ArrayList.

b. Create (insert): Menyimpan data baru menggunakan query INSERT INTO dengan parameter ?.

c. Update (update): Mengubah data yang sudah ada berdasarkan ID menggunakan query UPDATE.

d. Delete (delete): Menghapus data dari tabel berdasarkan ID menggunakan query DELETE.

**Integrasi ke Controller**

<img width="230" height="152" alt="image" src="https://github.com/user-attachments/assets/659cc5d7-32b7-4686-88b1-341b1e2195dc" />

Hubungkan kelas-kelas DAO ke dalam LesPrivatController. Controller tidak lagi menyimpan data sementara di dalam memori ArrayList lokal, melainkan memanggil method dari SiswaDAO, TutorDAO, dan JadwalDAO secara langsung setiap kali pengguna melakukan operasi tambah, tampil, ubah, atau hapus data melalui antarmuka konsol (LesPrivatView)

## Struktur Program

Struktur program dibagi menjadi beberapa package dan class sesuai dengan fungsinya.

a. MainApp digunakan sebagai titik awal untuk memulai program.

b. LesPrivatController digunakan sebagai penghubung dan pengatur alur logika antara menu, validasi input, serta proses layanan.

c. LayananLesPrivat digunakan untuk mengelola proses CRUD, validasi duplikasi ID, dan penyimpanan data menggunakan ArrayList.

d. Pengguna bertindak sebagai abstract class (implements CetakInfo) yang menjadi superclass bagi Siswa dan Tutor.

e. Siswa, Tutor, dan Jadwal digunakan sebagai class entity pembentuk data utama, di mana Jadwal juga ikut mengimplementasikan interface CetakInfo.

f. DatabaseConnection (di package config) digunakan untuk mengelola koneksi utama antara aplikasi Java dan database MySQL.

g. Kelas-kelas DAO (SiswaDAO, TutorDAO, JadwalDAO) digunakan untuk mengelola proses CRUD dan interaksi data langsung ke database menggunakan PreparedStatement.
