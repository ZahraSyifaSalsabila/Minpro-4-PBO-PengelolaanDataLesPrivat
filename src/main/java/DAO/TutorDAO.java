package dao;

import java.sql.*;
import java.util.ArrayList;
import model.Tutor;
import config.Koneksi;

public class TutorDAO {
    
    public ArrayList<Tutor> getAllTutor() {
        ArrayList<Tutor> daftarTutor = new ArrayList<>();
        String query = "SELECT * FROM tutor";
        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                daftarTutor.add(new Tutor(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("keahlian"),
                    rs.getString("no_telepon")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data tutor: " + e.getMessage());
        }
        return daftarTutor;
    }

    public boolean insertTutor(Tutor tutor) {
        String query = "INSERT INTO tutor (id, nama, keahlian, no_telepon) VALUES (?, ?, ?, ?)";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, tutor.getId());
            pstmt.setString(2, tutor.getNama());
            pstmt.setString(3, tutor.getKeahlian());
            pstmt.setString(4, tutor.getNoTelepon());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Gagal tambah tutor: " + e.getMessage());
            return false;
        }
    }

    public boolean updateTutor(Tutor tutor) {
        String query = "UPDATE tutor SET nama = ?, keahlian = ?, no_telepon = ? WHERE id = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, tutor.getNama());
            pstmt.setString(2, tutor.getKeahlian());
            pstmt.setString(3, tutor.getNoTelepon());
            pstmt.setInt(4, tutor.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Gagal update tutor: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteTutor(int id) {
        String query = "DELETE FROM tutor WHERE id = ?";
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Gagal hapus tutor: " + e.getMessage());
            return false;
        }
    }
}