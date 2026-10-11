package Controller;

import dao.JadwalDAO;
import dao.SiswaDAO;
import dao.TutorDAO;
import java.util.ArrayList;
import java.util.Scanner;
import model.Jadwal;
import model.Siswa;
import model.Tutor;
import view.LesPrivatView;

public class LesPrivatController implements PengelolaData {
    private final SiswaDAO siswaDAO = new SiswaDAO();
    private final TutorDAO tutorDAO = new TutorDAO();
    private final JadwalDAO jadwalDAO = new JadwalDAO();

    private final Scanner scanner;
    private final LesPrivatView view;

    public LesPrivatController() {
        this.scanner = new Scanner(System.in);
        this.view = new LesPrivatView(scanner);
    }

    public void run() {
        boolean berjalan = true;

        while (berjalan) {
            view.tampilkanMenuUtama();
            int pilihan = view.inputAngkaWajib("Pilih menu (1-5): ", 1, 5);

            switch (pilihan) {
                case 1 -> tambahData();
                case 2 -> tampilkanData();
                case 3 -> updateData();
                case 4 -> hapusData();
                case 5 -> {
                    berjalan = false;
                    view.tampilkanPesan("Program selesai. Sampai jumpa!");
                }
            }
        }
        scanner.close();
    }

    private boolean isIdSiswaAda(final int id) {
        for (Siswa s : siswaDAO.getAllSiswa()) {
            if (s.getId() == id) return true;
        }
        return false;
    }

    private boolean isIdTutorAda(final int id) {
        for (Tutor t : tutorDAO.getAllTutor()) {
            if (t.getId() == id) return true;
        }
        return false;
    }

    private boolean isIdJadwalAda(final int id) {
        for (Jadwal j : jadwalDAO.getAllJadwal()) {
            if (j.getIdJadwal() == id) return true;
        }
        return false;
    }

    @Override
    public void tambahData() {
        view.tampilkanSubMenu("TAMBAH DATA");
        int pilih = view.inputAngkaWajib("Pilih kategori (1-3): ", 1, 3);

        if (pilih == 1) {
            int id = view.inputAngkaWajib("ID Siswa: ");
            while (isIdSiswaAda(id)) {
                view.tampilkanPesan("ID Siswa sudah digunakan!");
                id = view.inputAngkaWajib("Masukkan ID Siswa lain: ");
            }
            String nama = view.inputTeksWajib("Nama: ");
            String jenjang = view.inputTeksWajib("Jenjang: ");
            String mapel = view.inputTeksWajib("Mata Pelajaran: ");

            Siswa siswaBaru = new Siswa(id, nama, jenjang, mapel);
            if (siswaDAO.insertSiswa(siswaBaru)) {
                view.tampilkanPesan("Data siswa berhasil ditambahkan ke database.");
            }

        } else if (pilih == 2) {
            int id = view.inputAngkaWajib("ID Tutor: ");
            while (isIdTutorAda(id)) {
                view.tampilkanPesan("ID Tutor sudah digunakan!");
                id = view.inputAngkaWajib("Masukkan ID Tutor lain: ");
            }
            String nama = view.inputTeksWajib("Nama: ");
            String keahlian = view.inputTeksWajib("Keahlian: ");
            String telepon = view.inputTeksWajib("No. Telepon: ");

            Tutor tutorBaru = new Tutor(id, nama, keahlian, telepon);
            if (tutorDAO.insertTutor(tutorBaru)) {
                view.tampilkanPesan("Data tutor berhasil ditambahkan ke database.");
            }

        } else if (pilih == 3) {
            int id = view.inputAngkaWajib("ID Jadwal: ");
            while (isIdJadwalAda(id)) {
                view.tampilkanPesan("ID Jadwal sudah digunakan!");
                id = view.inputAngkaWajib("Masukkan ID Jadwal lain: ");
            }

            int idSiswa = view.inputAngkaWajib("ID Siswa: ");
            while (!isIdSiswaAda(idSiswa)) {
                view.tampilkanPesan("ID Siswa belum terdaftar!");
                idSiswa = view.inputAngkaWajib("Masukkan ID Siswa yang terdaftar: ");
            }

            int idTutor = view.inputAngkaWajib("ID Tutor: ");
            while (!isIdTutorAda(idTutor)) {
                view.tampilkanPesan("ID Tutor belum terdaftar!");
                idTutor = view.inputAngkaWajib("Masukkan ID Tutor yang terdaftar: ");
            }

            String hari = view.inputTeksWajib("Hari: ");
            String jam = view.inputTeksWajib("Jam: ");

            Jadwal jadwalBaru = new Jadwal(id, idSiswa, idTutor, hari, jam);
            if (jadwalDAO.insertJadwal(jadwalBaru)) {
                view.tampilkanPesan("Data jadwal berhasil ditambahkan ke database.");
            }
        }
    }

    @Override
    public void tampilkanData() {
        view.tampilkanSubMenu("TAMPILKAN DATA");
        int pilih = view.inputAngkaWajib("Pilih kategori (1-3): ", 1, 3);

        if (pilih == 1) {
            view.tampilkanPesan("\n=== DATA SISWA ===");
            ArrayList<Siswa> daftarSiswa = siswaDAO.getAllSiswa();
            if (daftarSiswa.isEmpty()) {
                view.tampilkanPesan("Belum ada data siswa.");
            } else {
                for (Siswa s : daftarSiswa) {
                    s.tampilkanInfo(); 
                    view.tampilkanPesan("-------------------------------");
                }
            }
        } else if (pilih == 2) {
            view.tampilkanPesan("\n=== DATA TUTOR ===");
            ArrayList<Tutor> daftarTutor = tutorDAO.getAllTutor();
            if (daftarTutor.isEmpty()) {
                view.tampilkanPesan("Belum ada data tutor.");
            } else {
                for (Tutor t : daftarTutor) {
                    t.tampilkanInfo(); 
                    view.tampilkanPesan("-------------------------------");
                }
            }
        } else if (pilih == 3) {
            view.tampilkanPesan("\n=== DATA JADWAL ===");
            ArrayList<Jadwal> daftarJadwal = jadwalDAO.getAllJadwal();
            if (daftarJadwal.isEmpty()) {
                view.tampilkanPesan("Belum ada data jadwal.");
            } else {
                for (Jadwal j : daftarJadwal) {
                    String namaSiswa = cariNamaSiswa(j.getIdSiswa());
                    String namaTutor = cariNamaTutor(j.getIdTutor());
                    j.tampilkanInfo(namaSiswa, namaTutor);
                    view.tampilkanPesan("-------------------------------");
                }
            }
        }
    }

    @Override
    public void updateData() {
        view.tampilkanSubMenu("UPDATE DATA");
        int pilih = view.inputAngkaWajib("Pilih kategori (1-3): ", 1, 3);

        if (pilih == 1) {
            int id = view.inputAngkaWajib("Masukkan ID Siswa yang akan diupdate: ");
            for (Siswa s : siswaDAO.getAllSiswa()) {
                if (s.getId() == id) {
                    s.setNama(view.inputTeksOpsional("Nama Baru", s.getNama()));
                    s.setJenjang(view.inputTeksOpsional("Jenjang Baru", s.getJenjang()));
                    s.setMataPelajaran(view.inputTeksOpsional("Mata Pelajaran Baru", s.getMataPelajaran()));

                    if (siswaDAO.updateSiswa(s)) {
                        view.tampilkanPesan("Data siswa berhasil diupdate di database.");
                    }
                    return;
                }
            }
            view.tampilkanPesan("Data siswa tidak ditemukan.");

        } else if (pilih == 2) {
            int id = view.inputAngkaWajib("Masukkan ID Tutor yang akan diupdate: ");
            for (Tutor t : tutorDAO.getAllTutor()) {
                if (t.getId() == id) {
                    t.setNama(view.inputTeksOpsional("Nama Baru", t.getNama()));
                    t.setKeahlian(view.inputTeksOpsional("Keahlian Baru", t.getKeahlian()));
                    t.setNoTelepon(view.inputTeksOpsional("No. Telepon Baru", t.getNoTelepon()));

                    if (tutorDAO.updateTutor(t)) {
                        view.tampilkanPesan("Data tutor berhasil diupdate di database.");
                    }
                    return;
                }
            }
            view.tampilkanPesan("Data tutor tidak ditemukan.");

        } else if (pilih == 3) {
            int id = view.inputAngkaWajib("Masukkan ID Jadwal yang akan diupdate: ");
            for (Jadwal j : jadwalDAO.getAllJadwal()) {
                if (j.getIdJadwal() == id) {
                    int idSiswaBaru = view.inputAngkaOpsional("ID Siswa Baru", j.getIdSiswa());
                    while (!isIdSiswaAda(idSiswaBaru)) {
                        view.tampilkanPesan("ID Siswa tidak ditemukan!");
                        idSiswaBaru = view.inputAngkaOpsional("ID Siswa Baru", j.getIdSiswa());
                    }

                    int idTutorBaru = view.inputAngkaOpsional("ID Tutor Baru", j.getIdTutor());
                    while (!isIdTutorAda(idTutorBaru)) {
                        view.tampilkanPesan("ID Tutor tidak ditemukan!");
                        idTutorBaru = view.inputAngkaOpsional("ID Tutor Baru", j.getIdTutor());
                    }

                    j.setIdSiswa(idSiswaBaru);
                    j.setIdTutor(idTutorBaru);
                    j.setHari(view.inputTeksOpsional("Hari Baru", j.getHari()));
                    j.setJam(view.inputTeksOpsional("Jam Baru", j.getJam()));

                    if (jadwalDAO.updateJadwal(j)) {
                        view.tampilkanPesan("Data jadwal berhasil diupdate di database.");
                    }
                    return;
                }
            }
            view.tampilkanPesan("Data jadwal tidak ditemukan.");
        }
    }

    @Override
    public void hapusData() {
        view.tampilkanSubMenu("HAPUS DATA");
        int pilih = view.inputAngkaWajib("Pilih kategori (1-3): ", 1, 3);

        if (pilih == 1) {
            int id = view.inputAngkaWajib("Masukkan ID Siswa yang akan dihapus: ");
            if (siswaDAO.deleteSiswa(id)) {
                view.tampilkanPesan("Data siswa berhasil dihapus dari database.");
            } else {
                view.tampilkanPesan("Gagal menghapus atau data siswa tidak ditemukan.");
            }

        } else if (pilih == 2) {
            int id = view.inputAngkaWajib("Masukkan ID Tutor yang akan dihapus: ");
            if (tutorDAO.deleteTutor(id)) {
                view.tampilkanPesan("Data tutor berhasil dihapus dari database.");
            } else {
                view.tampilkanPesan("Gagal menghapus atau data tutor tidak ditemukan.");
            }

        } else if (pilih == 3) {
            int id = view.inputAngkaWajib("Masukkan ID Jadwal yang akan dihapus: ");
            if (jadwalDAO.deleteJadwal(id)) {
                view.tampilkanPesan("Data jadwal berhasil dihapus dari database.");
            } else {
                view.tampilkanPesan("Gagal menghapus atau data jadwal tidak ditemukan.");
            }
        }
    }

    private String cariNamaSiswa(final int id) {
        for (Siswa s : siswaDAO.getAllSiswa()) {
            if (s.getId() == id) return s.getNama();
        }
        return "Tidak ditemukan";
    }

    private String cariNamaTutor(final int id) {
        for (Tutor t : tutorDAO.getAllTutor()) {
            if (t.getId() == id) return t.getNama();
        }
        return "Tidak ditemukan";
    }
}