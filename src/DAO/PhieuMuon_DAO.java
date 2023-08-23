
package DAO;

import java.sql.*;
import DTO.DBConnection;
import DTO.PhieuMuon;
import java.util.ArrayList;

public class PhieuMuon_DAO {
    Connection connection = DBConnection.GetConnection();
    
    public PhieuMuon_DAO()
    {
        
    }
    
    public ArrayList<PhieuMuon> get_PhieuMuon_All()
    {
        ArrayList<PhieuMuon> DanhSachPhieuMuon=new ArrayList<>();
        try{
            String Query="Select * from PhieuMuon where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                PhieuMuon phieuMuon=new PhieuMuon();
                phieuMuon.setMaPhieuMuon(rs.getString("MaPhieuMuon"));
                phieuMuon.setMaDocGia(rs.getString("MaDocGia"));
                phieuMuon.setMaNhanVien(rs.getString("MaNhanVien"));
                phieuMuon.setNgayMuon(rs.getDate("NgayMuon"));
                phieuMuon.setNgayTra(rs.getDate("NgayTra"));
                phieuMuon.setTinhTrang(rs.getInt("TinhTrang"));
                DanhSachPhieuMuon.add(phieuMuon);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachPhieuMuon;
    }
    
    public ArrayList<PhieuMuon> get_PhieuMuon_AllAndIsDeleted()
    {
        ArrayList<PhieuMuon> DanhSachPhieuMuon=new ArrayList<>();
        try{
            String Query="Select * from PhieuMuon";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                PhieuMuon phieuMuon=new PhieuMuon();
                phieuMuon.setMaPhieuMuon(rs.getString("MaPhieuMuon"));
                phieuMuon.setMaDocGia(rs.getString("MaDocGia"));
                phieuMuon.setMaNhanVien(rs.getString("MaNhanVien"));
                phieuMuon.setNgayMuon(rs.getDate("NgayMuon"));
                phieuMuon.setNgayTra(rs.getDate("NgayTra"));
                phieuMuon.setTinhTrang(rs.getInt("TinhTrang"));
                DanhSachPhieuMuon.add(phieuMuon);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachPhieuMuon;
    }
    
    public ArrayList<PhieuMuon> get_PhieuMuon_ByMaPhieuMuon(String MaPhieuMuon)
    {
        ArrayList<PhieuMuon> DanhSachPhieuMuon=new ArrayList<>();
        try{
            String Query="Select * from PhieuMuon where MaPhieuMuon like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaPhieuMuon+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                PhieuMuon phieuMuon=new PhieuMuon();
                phieuMuon.setMaPhieuMuon(rs.getString("MaPhieuMuon"));
                phieuMuon.setMaDocGia(rs.getString("MaDocGia"));
                phieuMuon.setMaNhanVien(rs.getString("MaNhanVien"));
                phieuMuon.setNgayMuon(rs.getDate("NgayMuon"));
                phieuMuon.setNgayTra(rs.getDate("NgayTra"));
                phieuMuon.setTinhTrang(rs.getInt("TinhTrang"));
                DanhSachPhieuMuon.add(phieuMuon);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachPhieuMuon;
    }
    
    
    public boolean Add_PhieuMuon(PhieuMuon phieuMuon) 
    {
        String query = "insert into PhieuMuon values(?,?,?,?,?,?,0)";

        try {

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, phieuMuon.getMaPhieuMuon());
            ps.setString(2, phieuMuon.getMaNhanVien());
            ps.setString(3, phieuMuon.getMaDocGia());
            ps.setDate(4, phieuMuon.getNgayMuon());
            ps.setDate(5, phieuMuon.getNgayTra());
            ps.setInt(6, phieuMuon.getTinhTrang());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean GiamSoLuongSach(String maSach, int soLuong) 
    {
        String Query_LaySoLuongSach = "select SoLuong from Sach where MaSach = ?";
        String Query_GiamSoLuongSach = "update Sach set SoLuong = ? where MaSach = ?";
        int SoLuongSach = 0;

        try {
            PreparedStatement ps = connection.prepareStatement(Query_LaySoLuongSach);
            ps.setString(1, maSach);
            ResultSet rs_LaySoLuongSach = ps.executeQuery();
            while (rs_LaySoLuongSach.next()) 
            {
                SoLuongSach= rs_LaySoLuongSach.getInt("SoLuong");
            }
            if (SoLuongSach == 0) {
                return false;
            } 
            else 
            {
                SoLuongSach -= soLuong;
                ps = connection.prepareStatement(Query_GiamSoLuongSach);
                ps.setInt(1, SoLuongSach);
                ps.setString(2, maSach);
            }
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_PhieuMuon_ByMaPhieuMuon(String MaPhieuMuon) 
    {
        String query = "update  PhieuMuon set isDeleted = 1 where MaPhieuMuon =?";

        try {
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,MaPhieuMuon);

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean Sua_PhieuMuon(PhieuMuon phieuMuon)
    {
        try{
            String Query="UPDATE PhieuMuon SET MaDocGia=?, MaNhanVien=?, "
                    + "NgayMuon=?,NgayTra=?\n"
                    + "WHERE MaPhieuMuon=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, phieuMuon.getMaDocGia());
            ps.setString(2, phieuMuon.getMaNhanVien());
            ps.setDate(3, phieuMuon.getNgayMuon());
            ps.setDate(4, phieuMuon.getNgayTra());
            ps.setString(5, phieuMuon.getMaPhieuMuon());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
}
