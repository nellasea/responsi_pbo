/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Evaluasi;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EvaluasiDAO {
    public boolean saveEvaluasi(Evaluasi evaluasi){
    String sql = "INSERT INTO evaluasi (nama,divisi,nilai_target,nilai_disiplin,nilai_inovasi,score,status) VALUES (?,?,?,?,?,?,?,?,?)";
        try(Connection conn = DatabaseConnection.getConnnection(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, evaluasi.getNama());
            pstmt.setString(2, evaluasi.getDivisi());
            pstmt.setInt(3, evaluasi.getNilai_Target());
            pstmt.setInt(4, evaluasi.getNilai_Disiplin());
            pstmt.setInt(5, evaluasi.getNilai_Inovasi());
            pstmt.setDouble(6, evaluasi.getScore());
            pstmt.setString(7, evaluasi.getStatus());
            
            return pstmt.executeUpdate()>0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error menyimpan data :"+ e.getMessage(),"Database Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public List<Evaluasi> getAllEvaluasis(){
    List<Evaluasi> list =  new ArrayList<>();
    String sql  = "SELECT * FROM evaluasi ORDER BY id DESC";
        try(Connection conn = DatabaseConnection.getConnnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
            Evaluasi  e = new Evaluasi();
            e.setID(rs.getInt("id"));
            e.setNama(rs.getString("nama"));
            e.setDivisi(rs.getString("divisi"));
            e.setNilai_Target(rs.getInt("nilai_target"));
            e.setNilai_Disiplin(rs.getInt("nilai_disiplin"));
            e.setNilai_Inovasi(rs.getInt("nilai_inovasi"));
            e.setScore(rs.getDouble("score"));
            e.setStatus(rs.getString("status"));
            list.add(e);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error membaca data :"+ e.getMessage(),"Database Error",JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    public boolean  updateEvaluasi(Evaluasi evaluasi){
    String sql = "UPDATE evaluasi SET nama=?,divisi=?,nilai_target=?,nilai_disiplin=?,nilai_inovasi=?,score=?,status=? WHERE id=?";
         try(Connection conn = DatabaseConnection.getConnnection(); PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, evaluasi.getNama());
            pstmt.setString(2, evaluasi.getDivisi());
            pstmt.setInt(3, evaluasi.getNilai_Target());
            pstmt.setInt(4, evaluasi.getNilai_Disiplin());
            pstmt.setInt(5, evaluasi.getNilai_Inovasi());
            pstmt.setDouble(6, evaluasi.getScore());
            pstmt.setString(7, evaluasi.getStatus());
            pstmt.setInt(8, evaluasi.getID());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Update data :"+ e.getMessage(),"Database Error",JOptionPane.ERROR_MESSAGE);

        }
    
        return false;
    
    
    }
}
