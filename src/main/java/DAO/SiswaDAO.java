package dao;

import config.Koneksi;
import java.sql.*;
import java.util.ArrayList;
import model.Siswa;

public class SiswaDAO {
    
    public ArrayList<Siswa> getAllSiswa() {
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        String query = "SELECT * FROM siswa";
        
        try (Connection conn = Koneksi.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                daftarSiswa.add(new Siswa(
                    rs.getInt("id"),
                    rs.getString("nama"),
                    rs.getString("jenjang"),
                    rs.getString("mata_pelajaran")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data siswa: " + e.getMessage());
        }
        return daftarSiswa;
    }

    public boolean insertSiswa(Siswa siswa) {
        String query = "INSERT INTO siswa (id, nama, jenjang, mata_pelajaran) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, siswa.getId());
            pstmt.setString(2, siswa.getNama());
            pstmt.setString(3, siswa.getJenjang());
            pstmt.setString(4, siswa.getMataPelajaran());
            pstmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Gagal tambah siswa: " + e.getMessage());
            return false;
        }
    }

    public boolean updateSiswa(Siswa siswa) {
        String query = "UPDATE siswa SET nama = ?, jenjang = ?, mata_pelajaran = ? WHERE id = ?";
        
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setString(1, siswa.getNama());
            pstmt.setString(2, siswa.getJenjang());
            pstmt.setString(3, siswa.getMataPelajaran());
            pstmt.setInt(4, siswa.getId());
            pstmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Gagal update siswa: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteSiswa(int id) {
        String query = "DELETE FROM siswa WHERE id = ?";
        
        try (Connection conn = Koneksi.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Gagal hapus siswa: " + e.getMessage());
            return false;
        }
    }
}