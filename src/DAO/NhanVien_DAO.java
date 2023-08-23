
package DAO;

import DTO.DBConnection;
import DTO.NhanVien;
import java.util.ArrayList;
import java.sql.*;
public class NhanVien_DAO {
    
    Connection connection=DBConnection.GetConnection();
     
    public ArrayList<NhanVien> get_NhanVien_All() {
        
        ArrayList<NhanVien> DanhSachNhanVien = new ArrayList<>();
        try {
            String Query = "select * from NhanVien\n" +
                           "Where IsDeleted=0";
            
            PreparedStatement ps = connection.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setTenNhanVien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setQueQuan(rs.getString("QueQuan"));
                nv.setGhiChu(rs.getString("GhiChu"));
                DanhSachNhanVien.add(nv);
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachNhanVien;
    }
    
    public ArrayList<NhanVien> get_NhanVien_AllAndIsDeleted() {
        
        ArrayList<NhanVien> DanhSachNhanVien = new ArrayList<>();
        try {
            String Query = "select * from NhanVien\n";
            
            PreparedStatement ps = connection.prepareStatement(Query);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) 
            {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setTenNhanVien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setQueQuan(rs.getString("QueQuan"));
                nv.setGhiChu(rs.getString("GhiChu"));
                DanhSachNhanVien.add(nv);
            }
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return DanhSachNhanVien;
    }
    
    public ArrayList<NhanVien> get_NhanVien_ByMaNhanVien(String MaNV)
    {
        ArrayList<NhanVien> DanhSachNhanVien=new ArrayList<>();
        try{
            String Query="Select * from NhanVien "
                    + "Where MaNhanVien like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaNV+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                NhanVien nv=new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setTenNhanVien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setQueQuan(rs.getString("QueQuan"));
                nv.setGhiChu(rs.getString("GhiChu"));
                DanhSachNhanVien.add(nv);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachNhanVien;
    }
    
    public ArrayList<NhanVien> get_NhanVien_ByTenNhanVien(String TenNhanVien)
    {
        ArrayList<NhanVien> DanhSachNhanVien=new ArrayList<>();
        try{
            String Query="select * from NhanVien "
                    + "Where TenNhanVien like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+TenNhanVien+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {   
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("MaNhanVien"));
                nv.setTenNhanVien(rs.getString("TenNhanVien"));
                nv.setNgaySinh(rs.getDate("NgaySinh"));
                nv.setSDT(rs.getString("SDT"));
                nv.setEmail(rs.getString("Email"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setQueQuan(rs.getString("QueQuan"));
                nv.setGhiChu(rs.getString("GhiChu"));
                DanhSachNhanVien.add(nv);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachNhanVien;
    }
    
    public boolean add_NhanVien(NhanVien nv)
    {
        try{
            String Query="Insert into NhanVien(MaNhanVien,TenNhanVien,NgaySinh,SDT,Email,GioiTinh,QueQuan,GhiChu,IsDeleted)"
                        +"Values(?,?,?,?,?,?,?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, nv.getMaNhanVien());
            ps.setString(2, nv.getTenNhanVien());
            ps.setDate(3, nv.getNgaySinh());
            ps.setString(4, nv.getSDT());
            ps.setString(5, nv.getEmail());
            ps.setString(6, nv.getGioiTinh());
            ps.setString(7, nv.getQueQuan());
            ps.setString(8, nv.getGhiChu());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Update_NhanVien(NhanVien nv)
    {
        try{
            String Query="UPDATE NhanVien SET TenNhanVien =?,"
                    + "NgaySinh = ? ,SDT = ?,Email=?,GioiTinh=?,QueQuan=?,GhiChu=?\n"
                    + "WHERE MaNhanVien=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            
            ps.setString(8, nv.getMaNhanVien());
            ps.setString(1, nv.getTenNhanVien());
            ps.setDate(2, nv.getNgaySinh());
            ps.setString(3, nv.getSDT());
            ps.setString(4, nv.getEmail());
            ps.setString(5, nv.getGioiTinh());
            ps.setString(6, nv.getQueQuan());
            ps.setString(7, nv.getGhiChu());
            
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_NhanVien_ByMaNhanVien(String MaNV)
    {
        try{
            String Query="Update NhanVien SET IsDeleted=1 Where MaNhanVien=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaNV);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_NhanVien_ByTenNhanVien(String TenNhanVien)
    {
       try{
          String Query="Update NhanVien SET IsDeleted=1 Where TenNhanVien=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,TenNhanVien);
           return ps.executeUpdate()>0;
       }catch(Exception ex){
          ex.printStackTrace();
      }
       return false;
   }
   


    
}
