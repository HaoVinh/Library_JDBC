
package DAO;

import DTO.DBConnection;
import DTO.NhaXuatBan;
import java.util.ArrayList;
import java.sql.*;

public class NhaXuatBan_DAO {

    Connection connection = DBConnection.GetConnection();

    //Lấy tất cả các nhà xuất bản trong database
    public ArrayList<NhaXuatBan> get_NhaXuatBan_All_And_IsDeleted() {
        ArrayList<NhaXuatBan> DanhSachNhaXuatBan = new ArrayList<>();
        try {
            String Query = "Select * from NhaXuatBan";
            PreparedStatement ps = connection.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getString("MaNhaXuatBan"));
                nxb.setTenNXB(rs.getString("TenNhaXuatBan"));
                nxb.setDiaChi(rs.getString("DiaChi"));
                nxb.setEmail(rs.getString("Email"));
                nxb.setSDT(rs.getString("SDT"));
                DanhSachNhaXuatBan.add(nxb);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachNhaXuatBan;
    }

    // Lấy nhà xuất bản có isdeleted=0
    public ArrayList<NhaXuatBan> get_NhaXuatBan_All() {
        ArrayList<NhaXuatBan> DanhSachNhaXuatBan = new ArrayList<>();
        try {
            String Query = "Select * from NhaXuatBan where IsDeleted=0";
            PreparedStatement ps = connection.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getString("MaNhaXuatBan"));
                nxb.setTenNXB(rs.getString("TenNhaXuatBan"));
                nxb.setDiaChi(rs.getString("DiaChi"));
                nxb.setEmail(rs.getString("Email"));
                nxb.setSDT(rs.getString("SDT"));
                DanhSachNhaXuatBan.add(nxb);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachNhaXuatBan;
    }

    public boolean addNhaXuatBan(NhaXuatBan nxb) {
        String Query = "INSERT INTO NhaXuatBan VALUES (?,?,?,?,?,0)";
        try {
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, nxb.getMaNXB());
            ps.setString(2, nxb.getTenNXB());
            ps.setString(3, nxb.getDiaChi());
            ps.setString(4, nxb.getEmail());
            ps.setString(5, nxb.getSDT());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {

        }
        return false;
    }
    // Xóa theo mã NhaXuatBan

    public boolean deleteMaNhaXuatBan(String MaNhaXuatBan) {
        String sql = "UPDATE NhaXuatBan SET IsDeleted=1 WHERE MaNhaXuatBan=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, MaNhaXuatBan);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {

        }
        return false;
    }

    //Xóa theo tên NhaXuatBan
    public boolean deleteTenNhaXuatBan(String TenNhaXuatBan) {
        String Query = "UPDATE NhaXuatBan SET IsDeleted=1 WHERE TenNhaXuatBan=?";
        try {
            PreparedStatement ps = connection.prepareStatement(Query);
            
            ps.setString(1, TenNhaXuatBan);
            return ps.executeUpdate() > 0;
        } catch(Exception e){
        
    }
        return false;
    }

    public boolean SuaNhaXuatBan(NhaXuatBan nxb) {

        try {
            String Query = "UPDATE NhaXuatBan SET TenNhaXuatBan=?, DiaChi=?, Email=?, SDT=? WHERE MaNhaXuatBan=? AND IsDeleted=0";

            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, nxb.getTenNXB());
            ps.setString(2, nxb.getDiaChi());
            ps.setString(3, nxb.getEmail());
            ps.setString(4, nxb.getSDT());
            ps.setString(5, nxb.getMaNXB());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<NhaXuatBan> getNhaXuatBanByTenNhaXuatBan(String TenNhaXuatBan) //Tìm kiếm theo tên NhaXuatBan
    {
        ArrayList<NhaXuatBan> DanhSachNhaXuatBan = new ArrayList<>();
        try {
            String Query = "select * from NhaXuatBan Where TenNhaXuatBan like ? and IsDeleted=0";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, "%" + TenNhaXuatBan + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getString("MaNhaXuatBan"));
                nxb.setTenNXB(rs.getString("TenNhaXuatBan"));
                nxb.setDiaChi(rs.getString("DiaChi"));
                nxb.setEmail(rs.getString("Email"));
                nxb.setSDT(rs.getString("SDT"));

                DanhSachNhaXuatBan.add(nxb);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachNhaXuatBan;
    }

    //Tìm kiếm theo mã nhà xuất bản
    public ArrayList<NhaXuatBan> getNhaXuatBanByMaNhaXuatBan(String MaNhaXuatBan) {
        ArrayList<NhaXuatBan> DanhSachNhaXuatBan = new ArrayList<>();
        try {
            String Query = "select * from NhaXuatBan Where MaNhaXuatBan like ? and IsDeleted=0";
            PreparedStatement ps = connection.prepareStatement(Query);
            ps.setString(1, "%" + MaNhaXuatBan + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(rs.getString("MaNhaXuatBan"));
                nxb.setTenNXB(rs.getString("TenNhaXuatBan"));
                nxb.setDiaChi(rs.getString("DiaChi"));
                nxb.setEmail(rs.getString("Email"));
                nxb.setSDT(rs.getString("SDT"));

                DanhSachNhaXuatBan.add(nxb);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachNhaXuatBan;
    }

}
