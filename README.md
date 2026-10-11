# Sistem Pengelolaan Data Les Privat
## Deskripsi Singkat Program
Sistem Pengelolaan Data Les Privat merupakan aplikasi berbasis Java (Console/CLI) yang dirancang untuk mengelola tiga entitas data utama secara terstruktur, yaitu data siswa (ID, nama, jenjang, mata pelajaran), data tutor (ID, nama, keahlian, nomor telepon), serta data jadwal les (ID jadwal, ID siswa, ID tutor, hari, dan jam). Seluruh data tersebut disimpan secara dinamis menggunakan ArrayList selama program berjalan.

Program ini menyediakan lima menu utama yaitu Tambah Data, Tampilkan Data, Update Data, Hapus Data, dan Keluar. Selain itu, sistem dilengkapi dengan mekanisme validasi input untuk memastikan data angka dan teks terisi dengan benar, mencegah input kosong (termasuk pencegahan enter langsung), serta menghindari duplikasi ID agar data tetap konsisten dan aman.

## Penjelasan Alur Program
Ketika program dijalankan melalui class MainApp, program akan menyiapkan Scanner untuk menerima input dari pengguna. Setelah itu, program membuat object yang digunakan untuk mengelola data les privat dan menampilkan menu utama.

Menu utama terdiri dari:

1. Tambah Data
   
2. Tampilkan Data
 
3. Update Data
 
4. Hapus Data
 
5. Keluar

Menu utama dijalankan menggunakan perulangan while sehingga menu akan terus muncul dan dapat digunakan berkali-kali selama program masih berjalan. Pilihan yang dimasukkan pengguna kemudian diproses menggunakan switch-case.

Setiap pilihan pada menu utama akan diteruskan melalui LesPrivatController. LesPrivatController kemudian menjalankan method yang sesuai pada LayananLesPrivat. Dengan begitu, MainApp tidak langsung melakukan proses tambah, tampil, update, atau hapus data, tetapi meneruskan proses tersebut ke bagian yang memang digunakan untuk mengelola data.

Jika pengguna memilih menu nomor 1, program menjalankan proses Tambah Data. Jika memilih nomor 2, program menjalankan proses Tampilkan Data. Nomor 3 digunakan untuk Update Data, nomor 4 untuk Hapus Data, sedangkan nomor 5 digunakan untuk keluar dari program.

**1. Tambah Data**

Menu Tambah Data digunakan untuk memasukkan data baru ke dalam sistem. Setelah memilih menu ini, pengguna akan diberikan tiga pilihan data yang dapat ditambahkan, yaitu Siswa, Tutor, dan Jadwal.

**a. Data Siswa**

Jika pengguna memilih Data Siswa, program akan meminta beberapa informasi, yaitu ID Siswa, Nama, Jenjang, dan Mata Pelajaran.

ID Siswa harus berupa angka. Sebelum data ditambahkan, program akan memeriksa apakah ID tersebut sudah digunakan oleh siswa lain. Jika ID sudah digunakan, program akan menampilkan pesan bahwa ID sudah digunakan dan meminta pengguna memasukkan ID lain.

Setelah ID berhasil dimasukkan, pengguna dapat mengisi nama siswa, jenjang pendidikan, dan mata pelajaran. Data teks tersebut juga diperiksa agar tidak boleh kosong.

Setelah seluruh informasi berhasil dimasukkan, program membuat data siswa baru dan memasukkannya ke dalam daftar siswa menggunakan ArrayList. Data yang sudah ditambahkan kemudian dapat dilihat melalui menu Tampilkan Data.

Data siswa yang disimpan terdiri dari ID, nama, jenjang, dan mata pelajaran sehingga program dapat mengetahui identitas siswa dan informasi mengenai jenjang dan mata pelajaran yang diikuti.

**Contoh penambahan data siswa:**

<img width="486" height="164" alt="Screenshot 2026-10-05 212041" src="https://github.com/user-attachments/assets/eeab1cb7-f4ad-4ce6-a7ec-47ffe4f3b742" />

**b. Data Tutor**

Jika pengguna memilih Data Tutor, program akan meminta ID Tutor, Nama, Keahlian, dan No. Telepon.

ID Tutor harus berupa angka dan program akan melakukan pengecekan terlebih dahulu untuk memastikan ID tersebut belum digunakan oleh tutor lain. Jika ID sudah ada, pengguna harus memasukkan ID lain.

Setelah itu, pengguna memasukkan nama tutor, keahlian yang dimiliki, dan nomor telepon. Data tersebut tidak boleh dikosongkan.

Jika semua data sudah berhasil dimasukkan, program membuat object Tutor baru dan menyimpannya ke dalam ArrayList daftarTutor.

Data tersebut dapat digunakan ketika pengguna menampilkan data tutor, melakukan perubahan informasi tutor, atau menghapus data tutor.

**Contoh penambahan data tutor:**

<img width="588" height="170" alt="Screenshot 2026-10-05 212140" src="https://github.com/user-attachments/assets/05432d64-c0d9-400c-82d0-0e6edaa0fac4" />

**c. Data Jadwal**

Jika pengguna memilih Data Jadwal, program akan meminta ID Jadwal, ID Siswa, ID Tutor, Hari, dan Jam.

ID Jadwal harus berupa angka dan tidak boleh sama dengan ID jadwal yang sudah tersimpan. Setelah ID jadwal berhasil dimasukkan, pengguna memasukkan ID siswa dan ID tutor yang berkaitan dengan jadwal tersebut.

Selanjutnya pengguna memasukkan hari dan jam pelaksanaan les. Setelah semua informasi selesai dimasukkan, program membuat object Jadwal baru dan menyimpannya ke dalam ArrayList daftarJadwal.

ID siswa dan ID tutor yang terdapat pada jadwal digunakan untuk mengetahui siswa dan tutor yang berkaitan dengan jadwal tersebut. Ketika jadwal ditampilkan, program mencari nama siswa berdasarkan ID siswa dan nama tutor berdasarkan ID tutor sehingga hasil yang ditampilkan bukan hanya berupa ID.

**Contoh penambahan data jadwal:**

<img width="620" height="175" alt="Screenshot 2026-10-05 212207" src="https://github.com/user-attachments/assets/4ff57fbf-6f14-44a8-a112-8e32218ee19f" />

**2. Tampilkan Data**

Menu Tampilkan Data digunakan untuk melihat data yang sudah tersimpan dalam program. Pengguna dapat memilih data yang ingin ditampilkan, yaitu Data Siswa, Data Tutor, atau Data Jadwal.

a. Jika pengguna memilih Data Siswa, program melakukan perulangan pada daftarSiswa dan menampilkan setiap data siswa yang tersimpan. Informasi yang ditampilkan yaitu ID, nama, jenjang, dan mata pelajaran.

**Contoh tampilkan data siswa:**

<img width="494" height="231" alt="Screenshot 2026-10-05 212340" src="https://github.com/user-attachments/assets/26796f32-94c5-4a72-aa7a-d6ae338e7bd8" />

b. Jika pengguna memilih Data Tutor, program melakukan perulangan pada daftarTutor dan menampilkan informasi setiap tutor. Informasi yang ditampilkan yaitu ID, nama, keahlian, dan nomor telepon.

**Contoh tampilkan data tutor:**

<img width="701" height="233" alt="Screenshot 2026-10-05 212425" src="https://github.com/user-attachments/assets/a4acfbbc-9e08-4644-91c2-92fa12696893" />

c. Jika pengguna memilih Data Jadwal, program melakukan perulangan pada daftarJadwal. Untuk setiap jadwal, program mengambil ID siswa dan ID tutor yang tersimpan pada jadwal tersebut. ID tersebut kemudian digunakan untuk mencari nama siswa dan nama tutor dari daftar masing-masing.

**Contoh tampilkan data jadwal:**

<img width="674" height="250" alt="Screenshot 2026-10-05 212507" src="https://github.com/user-attachments/assets/ae126d51-c976-4da2-8ebb-3e5e39c8a34f" />

d. Setelah nama siswa dan tutor ditemukan, informasi jadwal ditampilkan berupa ID jadwal, nama siswa, nama tutor, hari, dan jam. Dengan cara tersebut, pengguna tidak perlu mengingat ID siswa dan ID tutor untuk mengetahui siapa yang mengikuti dan mengajar pada suatu jadwal.

Pada saat pertama kali program dijalankan, menu Tampilkan Data juga sudah dapat digunakan karena program sudah memiliki data awal berupa satu siswa, satu tutor, dan satu jadwal.

**3. Update Data**
Menu Update Data digunakan untuk mengubah informasi dari data yang sudah tersimpan.

a. Pengguna terlebih dahulu memilih jenis data yang ingin diubah, yaitu Siswa, Tutor, atau Jadwal. Setelah memilih jenis data, pengguna memasukkan ID dari data yang ingin diubah.

b. Program kemudian melakukan pencarian pada ArrayList untuk menemukan data dengan ID yang sesuai.

c. Jika data siswa ditemukan, pengguna dapat mengubah nama, jenjang, dan mata pelajaran. ID siswa tetap digunakan sebagai identitas untuk mencari data tersebut.

**Contoh update data siswa:**

<img width="596" height="167" alt="Screenshot 2026-10-05 212725" src="https://github.com/user-attachments/assets/9053bda0-d4a4-4def-9d02-4c728523bb82" />

Pengguna memasukkan ID siswa 1 dan memanfaatkan fitur System Enter (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan nama lama "Zahra", sementara data jenjang dan mata pelajaran berhasil diperbarui menjadi SMK dan Perkantoran

**Maka data setelah diupdate yaitu:**

<img width="640" height="227" alt="Screenshot 2026-10-05 213115" src="https://github.com/user-attachments/assets/72bdc402-e4ec-4fe3-8c8a-52f42b91f200" />

d. Jika data tutor ditemukan, pengguna dapat mengubah nama, keahlian, dan nomor telepon.

**Contoh update data tutor:**

<img width="593" height="169" alt="Screenshot 2026-10-05 213025" src="https://github.com/user-attachments/assets/45ed2f2d-d066-4c16-ae10-3560024672db" />

Pengguna memasukkan ID tutor 2, lalu memperbarui nama menjadi "Imsa" dan nomor telepon baru, dan memanfaatkan fitur System Enter pada bagian keahlian (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan data keahlian lama yaitu Jaringan

**Maka data setelah diupdate yaitu:**

<img width="468" height="231" alt="Screenshot 2026-10-05 213328" src="https://github.com/user-attachments/assets/3a74605f-4511-44ee-b5bd-bb251170e5ee" />

e. Jika data jadwal ditemukan, pengguna dapat mengubah ID siswa, ID tutor, hari, dan jam.

**Contoh update data jadwal:**

<img width="383" height="183" alt="Screenshot 2026-10-05 213433" src="https://github.com/user-attachments/assets/0d152d2a-9f66-4533-a8e6-c093644a3caa" />

Pengguna memasukkan ID jadwal 2, lalu memanfaatkan fitur System Enter (cukup menekan Enter tanpa mengetik apa pun) untuk mempertahankan ID siswa dan ID tutor lama, sementara informasi hari dan jam berhasil diperbarui menjadi "Jumat" dan "16.00"

**Maka data setelah diupdate yaitu:**

<img width="541" height="250" alt="Screenshot 2026-10-05 213508" src="https://github.com/user-attachments/assets/a260c5b8-020e-4ec9-8236-27c6aa99750e" />

Pada proses perubahan tersebut, program menggunakan setter yang tersedia pada masing-masing class. Jadi, informasi yang baru dimasukkan pengguna akan diberikan melalui method yang digunakan untuk mengubah data. Jika ID yang dimasukkan tidak ditemukan, program tidak melakukan perubahan dan menampilkan pesan bahwa data tidak ditemukan.

**4. Hapus Data**
Menu Hapus Data digunakan untuk menghapus data yang sudah tidak diperlukan.

a. Pengguna terlebih dahulu memilih jenis data yang ingin dihapus, yaitu Siswa, Tutor, atau Jadwal. Setelah itu, pengguna memasukkan ID dari data yang ingin dihapus.

**Contoh hapus data siswa:**

<img width="677" height="328" alt="Screenshot 2026-10-05 214151" src="https://github.com/user-attachments/assets/f17e426d-67c2-46d5-8101-73aa12e9834b" />

**Contoh hapus data tutor:**

<img width="587" height="326" alt="Screenshot 2026-10-05 214112" src="https://github.com/user-attachments/assets/e3c355df-8c54-49c8-8daa-10abf9ba25d6" />

**Contoh hapus data jadwal:**

<img width="569" height="332" alt="Screenshot 2026-10-05 213846" src="https://github.com/user-attachments/assets/6106f304-884a-4a50-af08-6e81fe53a1b7" />

b. Program akan mencari ID tersebut pada ArrayList yang sesuai. Jika ID ditemukan, data tersebut akan dihapus dari daftar. Misalnya, jika pengguna memilih data siswa dan memasukkan ID siswa tertentu, program akan mencari siswa dengan ID tersebut pada daftarSiswa. Jika ditemukan, data siswa tersebut akan dihapus. Hal yang sama dilakukan untuk data tutor dan jadwal. Program akan mencari ID yang sesuai pada daftar masing-masing sebelum melakukan penghapusan.

c. Jika data berhasil ditemukan dan dihapus, program menampilkan pesan bahwa data berhasil dihapus. Jika ID yang dimasukkan tidak sesuai dengan data yang tersedia, tidak ada data yang dihapus.

**5. Keluar**
Menu Keluar digunakan untuk menghentikan program.

a. Ketika pengguna memilih menu nomor 5, nilai boolean berjalan pada MainApp diubah menjadi false. Kondisi tersebut membuat perulangan while berhenti sehingga menu utama tidak lagi ditampilkan.

**Contoh keluar program:**

<img width="506" height="131" alt="Screenshot 2026-10-05 214305" src="https://github.com/user-attachments/assets/af41c90e-409d-4ff2-a5c5-a0799e4079db" />

b. Setelah perulangan berhenti, Scanner ditutup dan program selesai dijalankan.

Dengan menggunakan perulangan tersebut, pengguna dapat melakukan beberapa proses secara berurutan, misalnya menambahkan data kemudian langsung menampilkan data, melakukan update, menghapus data, dan kembali ke menu utama tanpa harus menjalankan program dari awal.

## Validasi Input

Program memiliki validasi input untuk membantu memastikan data yang dimasukkan sesuai dengan kebutuhan program.

a. Untuk input berupa angka, seperti pilihan menu dan ID, program menggunakan method inputAngka(). Method tersebut akan memeriksa apakah input yang diberikan merupakan angka. Jika pengguna memasukkan huruf atau input selain angka, program tidak langsung melanjutkan proses, tetapi meminta pengguna memasukkan angka kembali.

Contoh validasi input berupa angka:

<img width="293" height="81" alt="Screenshot 2026-10-05 214551" src="https://github.com/user-attachments/assets/037a3976-b83a-4ded-a64b-8d707840a179" />

b. Untuk input berupa teks, program menggunakan method inputTeks(). Method ini digunakan untuk memeriksa apakah input yang diberikan kosong atau hanya berisi spasi. Jika input kosong, pengguna akan diminta memasukkan data kembali sampai memberikan teks yang sesuai.

Contoh validasi input berupa teks:

<img width="275" height="88" alt="Screenshot 2026-10-05 214731" src="https://github.com/user-attachments/assets/33bba9a9-b9a4-468d-a5b3-25f876fe8feb" />

c. Program juga melakukan validasi terhadap ID siswa, tutor, dan jadwal. Setiap ID diperiksa sebelum data baru ditambahkan. Pengecekan tersebut dilakukan menggunakan method isIdSiswaAda(), isIdTutorAda(), dan isIdJadwalAda(). Jika ID yang dimasukkan sudah digunakan, program akan menampilkan pesan bahwa ID tersebut sudah digunakan dan pengguna harus memasukkan ID lain. Dengan begitu, data yang ditambahkan tidak menggunakan ID yang sama dengan data sebelumnya.

Contoh validasi terhadap ID yang sudah ada:

<img width="234" height="75" alt="Screenshot 2026-10-05 214840" src="https://github.com/user-attachments/assets/ee805345-17db-4c29-b94a-ac01040fcfa3" /> <img width="202" height="77" alt="Screenshot 2026-10-05 214916" src="https://github.com/user-attachments/assets/4eefa053-d788-4db6-a379-f0f7998501af" /> <img width="196" height="80" alt="Screenshot 2026-10-05 214942" src="https://github.com/user-attachments/assets/8310723c-b1c9-4cdd-8965-7d58c29d9423" />

d. Validasi juga digunakan pada proses input menu. Jika pengguna memasukkan pilihan selain pilihan yang tersedia, program akan menampilkan pesan bahwa pilihan tidak ada sehingga pengguna dapat memilih kembali menu yang sesuai. Validasi tersebut digunakan pada proses tambah data, update data, dan bagian lain yang membutuhkan input dari pengguna. Dengan adanya validasi, kesalahan input dapat dikurangi dan program dapat tetap berjalan ketika pengguna memasukkan data yang tidak sesuai.

Contoh validasi proses input menu:

<img width="260" height="77" alt="Screenshot 2026-10-05 215104" src="https://github.com/user-attachments/assets/f7ccacd8-e549-43cd-be1d-c38ac958c027" />

## Penerapan Encapsulation
Encapsulation diterapkan dengan membuat atribut pada class menjadi private melalui penggunaan Access Modifier. Dengan menggunakan private, atribut tidak dapat diakses dan diubah secara langsung dari luar class. Pada class Pengguna, atribut id dan nama dibuat private. Kedua atribut tersebut memiliki getter untuk mengambil nilainya dan setter untuk mengubah nilainya.

**Contoh pemberian Access Modifier pada class pengguna:**

<img width="350" height="80" alt="image" src="https://github.com/user-attachments/assets/a3998d51-902d-456a-8108-880f9fd61118" />

a. Getter digunakan ketika program membutuhkan informasi yang tersimpan. Contohnya, ketika LayananLesPrivat ingin mencari siswa berdasarkan ID, program menggunakan getId(). Ketika program ingin mengambil nama siswa untuk ditampilkan pada jadwal, program menggunakan getNama().

b. Setter digunakan ketika terdapat perubahan data. Contohnya, ketika pengguna melakukan Update Data Siswa, program menggunakan setNama(), setJenjang(), dan setMataPelajaran() untuk memasukkan informasi baru.

**Encapsulation getter dan setter pada class**

a. Encapsulation juga diterapkan pada class Siswa. Atribut jenjang dan mataPelajaran dibuat private dan masing-masing memiliki getter dan setter. Dengan demikian, program dapat mengambil data menggunakan getJenjang() dan getMataPelajaran(), serta mengubahnya menggunakan setJenjang() dan setMataPelajaran().

**Penerapan encapsulation pada siswa:**

<img width="582" height="370" alt="Screenshot 2026-10-05 215808" src="https://github.com/user-attachments/assets/52df3362-56f0-42a8-a2f8-070016c1fb4c" />

b. Pada class Tutor, atribut keahlian dan noTelepon juga dibuat private. Program menyediakan getKeahlian(), setKeahlian(), getNoTelepon(), dan setNoTelepon() untuk mengambil dan mengubah data tersebut.

**Penerapan encapsulation pada tutor:**

<img width="604" height="302" alt="Screenshot 2026-10-05 215730" src="https://github.com/user-attachments/assets/9f2311e8-903a-41b9-a99a-06aa3c48fb68" />
<img width="467" height="149" alt="image" src="https://github.com/user-attachments/assets/e0f577ad-c3fa-4c91-b237-09f8c97e2e27" />

c. Pada class Jadwal, atribut idJadwal, idSiswa, idTutor, hari, dan jam dibuat private. Masing-masing atribut memiliki getter dan setter yang digunakan ketika data dibutuhkan atau diperbarui.

<img width="607" height="260" alt="image" src="https://github.com/user-attachments/assets/129def96-ccc2-432b-8c2c-4c16a27883ad" />

d. Penerapan encapsulation juga dapat dilihat pada proses Update Data. Program tidak mengubah atribut secara langsung, tetapi menggunakan setter seperti setNama(), setJenjang(), setMataPelajaran(), setKeahlian(), setNoTelepon(), setIdSiswa(), setIdTutor(), setHari(), dan setJam().

<img width="580" height="239" alt="Screenshot 2026-10-05 220205" src="https://github.com/user-attachments/assets/d3eb0357-59c4-491a-b411-9929d8f04b8f" />

<img width="488" height="170" alt="Screenshot 2026-10-05 230604" src="https://github.com/user-attachments/assets/6a3df83f-0f14-4072-b88c-3806e5e8120c" />

<img width="548" height="329" alt="Screenshot 2026-10-05 230628" src="https://github.com/user-attachments/assets/a832cd45-284f-42ea-842d-c8e987d0b178" />

Dengan cara tersebut, data yang dimiliki oleh setiap object dikelola melalui method yang sudah disediakan pada class masing-masing. Hal ini juga membuat proses pengambilan dan perubahan data menjadi lebih teratur.

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

**a. Package Model**

Package model berisi class Pengguna, Siswa, Tutor, dan Jadwal yang digunakan untuk membentuk data dalam program. Pengguna digunakan sebagai dasar data yang dimiliki oleh Siswa dan Tutor, Siswa digunakan untuk menyimpan data siswa, Tutor untuk menyimpan data tutor, dan Jadwal untuk menyimpan data jadwal les. Pembagian package tersebut membuat bagian untuk menjalankan program, mengelola proses, dan membentuk data menjadi lebih teratur.

**Package Model:**

<img width="248" height="83" alt="image" src="https://github.com/user-attachments/assets/b2555063-6fe2-47ea-907f-f7657476b2bc" />

**b. Package Controller**

Package Controller berisi class LesPrivatController dan LayananLesPrivat. LesPrivatController digunakan sebagai penghubung antara MainApp dengan LayananLesPrivat, sedangkan LayananLesPrivat berisi proses utama pengelolaan data seperti menambah, menampilkan, mengubah, dan menghapus data, serta melakukan pencarian nama siswa dan tutor dan validasi input.

**Package Controller:**

<img width="241" height="41" alt="image" src="https://github.com/user-attachments/assets/7535b5b7-e832-4ea0-8779-e07defd6346d" />

**c. Package View**

Package view berisi LesPrivatView yang bertanggung jawab penuh atas interaksi konsol dan penerimaan input. Alur program berjalan melalui perulangan while di menu utama yang memproses pilihan pengguna lewat switch-case dan meneruskannya ke controller.

**Package View:**

<img width="244" height="31" alt="image" src="https://github.com/user-attachments/assets/de47e139-f0e3-43af-ab62-51c388ae4cc7" />

## Screenshoot Struktur Folder:

<img width="275" height="392" alt="image" src="https://github.com/user-attachments/assets/64b8f6b8-1fd9-4fd8-aa6f-6df48cc3e6d3" />

Setelah MVC dibuat seperti ditampilan screenshoot tiap package MVC di atas, terdapat pula package yang melengkapi program ini yaitu:

**Package Model**

**Package Config**

**Package DAO**

## Abstraction

Abstraction diterapkan melalui pembuatan abstract class dan abstract method pada hierarki class Pengguna. Class Pengguna dideklarasikan sebagai abstract class Pengguna implements CetakInfo, yang berfungsi sebagai kerangka dasar dan tidak dapat diinstansiasi secara langsung menjadi object baru menggunakan keyword new. Di dalam class Pengguna, terdapat abstract method public abstract String getPeran(); dan public abstract void tampilkanInfo();. Method-method abstrak ini tidak memiliki implementasi di superclass, melainkan wajib di-override dan diimplementasikan secara konkret oleh setiap class turunannya, yaitu Siswa dan Tutor.

**Abstract class pada class pengguna:**

<img width="332" height="44" alt="image" src="https://github.com/user-attachments/assets/d7c31b8b-808f-4d50-89f1-97818d06d41f" />

**Abstract method pada class pengguna:**

<img width="242" height="67" alt="image" src="https://github.com/user-attachments/assets/b34e54ed-58c9-4809-bae2-20ebaa445442" />

## Polymorphism

Polymorphism pada program ini diterapkan dalam dua bentuk utama, yaitu Overriding dan Overloading. Overriding diimplementasikan melalui method tampilkanInfo() dan getPeran(). Pada abstract class Pengguna, method tampilkanInfo() dideklarasikan sebagai abstract, kemudian dioverride ulang di dalam class Siswa untuk menampilkan informasi ID, nama, jenjang, dan mata pelajaran, serta dioverride di class Tutor untuk menampilkan ID, nama, keahlian, dan nomor telepon sesuai atribut masing-masing subclass. Sementara itu, overloading diterapkan pada class Jadwal melalui dua bentuk method tampilkanInfo() dengan parameter yang berbeda, yakni tampilkanInfo() tanpa parameter dan tampilkanInfo(String namaSiswa, String namaTutor) dengan parameter untuk menerjemahkan ID menjadi nama lengkap. Overloading juga diterapkan pada class LesPrivatView melalui variasi method inputAngkaWajib()

**Overriding diimplementasikan melalui method tampilkanInfo() dan getPeran(). Pada abstract class Pengguna, method tampilkanInfo() dideklarasikan sebagai abstract:**

<img width="242" height="67" alt="image" src="https://github.com/user-attachments/assets/b34e54ed-58c9-4809-bae2-20ebaa445442" />

**Overriding pada class siswa:**

<img width="373" height="166" alt="image" src="https://github.com/user-attachments/assets/16426901-ae43-4da1-a0cb-da5f3ef32dfb" />

**Overriding pada class tutor:**

<img width="352" height="167" alt="image" src="https://github.com/user-attachments/assets/35a96147-f4d5-4029-b403-54849a3c9084" />

**Overloading pada class jadwal:**

<img width="468" height="220" alt="image" src="https://github.com/user-attachments/assets/b7ac8181-e045-4d36-83ff-5248c38e46b3" />

**Overloading pada class LesPrivatView melalui variasi method inputAngkaWajib():**

<img width="477" height="14" alt="image" src="https://github.com/user-attachments/assets/a556d478-c2cd-4b59-b725-c829d6b02607" />

**Terdapat method inputAngkaWajib() di controller:**

<img width="458" height="30" alt="image" src="https://github.com/user-attachments/assets/6150c0d2-e834-46e4-875d-7b8aa4cc8419" />

## Interface
Sistem ini menerapkan Interface pada dua bagian utama. Pertama, interface PengelolaData pada package Controller yang mendefinisikan kontrak standar operasi CRUD (tambahData, tampilkanData, updateData, dan hapusData) yang diimplementasikan penuh pada LesPrivatController. Kedua, interface CetakInfo pada package model yang mendeklarasikan kontrak method tampilkanInfo() dan diimplementasikan oleh class Pengguna (serta diturunkan ke Siswa dan Tutor) serta diimplementasikan langsung oleh class Jadwal.

**Interface pada class pengguna:**

<img width="325" height="46" alt="image" src="https://github.com/user-attachments/assets/d8d375a7-1596-4f8a-a02a-913376238d9d" />

**Interface pada class jadwal:**

<img width="272" height="89" alt="image" src="https://github.com/user-attachments/assets/682e0477-ff84-4eda-bea2-c4434fb4c14c" />

**Interface PengelolaData pada class CetakInfo:**

<img width="194" height="70" alt="image" src="https://github.com/user-attachments/assets/12f2af38-b700-4954-963a-08e3a5e2c8f7" />

## Penerapan JDBC


## Struktur Program

Struktur program dibagi menjadi beberapa package dan class sesuai dengan fungsinya.

1. MainApp digunakan sebagai titik awal untuk memulai program.

2. LesPrivatController digunakan sebagai penghubung dan pengatur alur logika antara menu, validasi input, serta proses layanan.

3. LayananLesPrivat digunakan untuk mengelola proses CRUD, validasi duplikasi ID, dan penyimpanan data menggunakan ArrayList.

4. Pengguna bertindak sebagai abstract class (implements CetakInfo) yang menjadi superclass bagi Siswa dan Tutor.

5. Siswa, Tutor, dan Jadwal digunakan sebagai class entity pembentuk data utama, di mana Jadwal juga ikut mengimplementasikan interface CetakInfo.
