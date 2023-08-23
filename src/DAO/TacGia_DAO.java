/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.DBConnection;
import DTO.TacGia;
import java.sql.*;
import java.util.ArrayList;

public class TacGia_DAO {

    Connection connection = DBConnection.GetConnection();

    public ArrayList<TacGia> get_TacGia_All() {
        ArrayList<TacGia> tacgia = new ArrayList<>();
        String Query = "SELECT * FROM TacGia WHERE IsDeleted=0";
        try {
            PreparedStatement ps = connection.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TacGia tg = new TacGia();

                tg.setMaTacGia(rs.getString("MaTacGia"));
                tg.setTenTacGia(rs.getString("TenTacGia"));
                tg.setNgaySinh(rs.getDate("NgaySinh"));
                tg.setGioiTinh(rs.getString("GioiTinh"));
                tg.setEmail(rs.getString("Email"));
                tg.setDiaChi(rs.getString("DiaChi"));

                tacgia.add(tg);

            }
        } catch (SQLException e) {

        }
        return tacgia;
    }
    
    public ArrayList<TacGia> get_TacGia_AllAndIsDeleted() {
        ArrayList<TacGia> tacgia = new ArrayList<>();
        String Query = "SELECT * FROM TacGia";
        try {
            PreparedStatement ps = connection.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TacGia tg = new TacGia();

                tg.setMaTacGia(rs.getString("MaTacGia"));
                tg.setTenTacGia(rs.getString("TenTacGia"));
                tg.setNgaySinh(rs.getDate("NgaySinh"));
                tg.setGioiTinh(rs.getString("GioiTinh"));
                tg.setEmail(rs.getString("Email"));
                tg.setDiaChi(rs.getString("DiaChi"));

                tacgia.add(tg);

            }
        } catch (SQLException e) {

        }
        return tacgia;
    }

    public ArrayList<TacGia> get_TacGia_ByMaTacGia(String maTacGia) {
        ArrayList<TacGia> DanhSachTacGia = new ArrayList<>();
        try {
            String Query = "Select * from TacGia where MaTacGia like ? and IsDeleted=0";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, "%" + maTacGia + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TacGia tacgia = new TacGia();
                tacgia.setMaTacGia(rs.getString("MaTacGia"));
                tacgia.setTenTacGia(rs.getString("TenTacGia"));
                tacgia.setNgaySinh(rs.getDate("NgaySinh"));
                tacgia.setGioiTinh(rs.getString("GioiTinh"));
                tacgia.setEmail(rs.getString("Email"));
                tacgia.setDiaChi(rs.getString("DiaChi"));
                DanhSachTacGia.add(tacgia);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachTacGia;
    }

    public ArrayList<TacGia> get_TacGia_ByTenTacGia(String tenTacGia) {
        ArrayList<TacGia> DanhSachTacGia = new ArrayList<>();
        try {
            String Query = "select * from TacGia Where TenTacGia like ? and IsDeleted=0";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, "%" + tenTacGia + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TacGia tacgia = new TacGia();
                tacgia.setMaTacGia(rs.getString("MaTacGia"));
                tacgia.setTenTacGia(rs.getString("TenTacGia"));
                tacgia.setNgaySinh(rs.getDate("NgaySinh"));
                tacgia.setGioiTinh(rs.getString("GioiTinh"));
                tacgia.setEmail(rs.getString("Email"));
                tacgia.setDiaChi(rs.getString("DiaChi"));
                DanhSachTacGia.add(tacgia);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachTacGia;
    }

    public boolean add_TacGia(TacGia tacgia1) {
        String Query = "INSERT INTO TacGia(MaTacGia,TenTacGia,NgaySinh,GioiTinh,Email,DiaChi,IsDeleted)" + "VALUES (?,?,?,?,?,?,0)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(Query);
            preparedStatement.setString(1, tacgia1.getMaTacGia());
            preparedStatement.setString(2, tacgia1.getTenTacGia());
            preparedStatement.setDate(3, tacgia1.getNgaySinh());
            preparedStatement.setString(4, tacgia1.getGioiTinh());
            preparedStatement.setString(5, tacgia1.getEmail());
            preparedStatement.setString(6, tacgia1.getDiaChi());

            return preparedStatement.executeUpdate() > 0;
        } catch (Exception e) {

        }
        return false;
    }

    public boolean Xoa_TacGia_ByTenTacGia(String tenTacGia) {
        try {
            String Query = "Update TacGia SET IsDeleted=? Where TenTacGia=?";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setInt(1, 1);
            ps.setString(2, tenTacGia);
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean Xoa_TacGia_ByMaTacGia(String maTacGia) {
        try {
            String Query = "Update TacGia SET IsDeleted=? Where MaTacGia=?";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setInt(1, 1);
            ps.setString(2, maTacGia);
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean Sua_TacGia(TacGia tacgia) {
        try {
            String Query = "UPDATE TacGia SET TenTacGia = ?, DiaChi = ?, NgaySinh=?,GioiTinh=?,Email=?\n"
                    + "WHERE MaTacGia=? and IsDeleted=0";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, tacgia.getTenTacGia());
            ps.setString(2, tacgia.getDiaChi());
            ps.setDate(3, tacgia.getNgaySinh());
            ps.setString(4, tacgia.getGioiTinh());
            ps.setString(5, tacgia.getEmail());
            ps.setString(6, tacgia.getMaTacGia());
            return ps.executeUpdate() > 0;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
