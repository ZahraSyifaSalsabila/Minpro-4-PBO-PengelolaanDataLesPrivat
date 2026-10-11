package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Jadwal;
import config.Koneksi;

public class JadwalDAO {
    
    public ArrayList<Jadwal> getAllJadwal() {
        ArrayList<Jadwal> daftarJadwal = new ArrayList<>();
        String query = "SELECT * FROM jadwal";
        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                daftarJadwal.add(new Jadwal(
                    rs.getInt("id_jadwal"),
                    rs.getInt("id_siswa"),
                    rs.getInt("id_tutor"),
                    rs.getString("hari"),
                    rs.getString("jam")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data jadwal: " + e.getMessage());
        }
        return daftarJadwal;
    }

    public boolean insertJadwal(Jadwal jadwal) {
        String query = "INSERT INTO jadwal (id_jadwal, id_siswa, id_tutor, hari, jam) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, jadwal.getIdJadwal());
            pstmt.setInt(2, jadwal.getIdSiswa());
            pstmt.setInt(3, jadwal.getIdTutor());
            pstmt.setString(4, jadwal.getHari());
            pstmt.setString(5, jadwal.getJam());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Gagal tambah jadwal: " + e.getMessage());
            return false;
        }
    }

    public boolean updateJadwal(Jadwal jadwal) {
        String query = "UPDATE jadwal SET id_siswa = ?, id_tutor = ?, hari = ?, jam = ? WHERE id_jadwal = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, jadwal.getIdSiswa());
            pstmt.setInt(2, jadwal.getIdTutor());
            pstmt.setString(3, jadwal.getHari());
            pstmt.setString(4, jadwal.getJam());
            pstmt.setInt(5, jadwal.getIdJadwal());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Gagal update jadwal: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteJadwal(int id) {
        String query = "DELETE FROM jadwal WHERE id_jadwal = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Gagal hapus jadwal: " + e.getMessage());
            return false;
        }
    }
}