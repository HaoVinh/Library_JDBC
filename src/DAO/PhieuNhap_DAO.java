
package DAO;
import DTO.PhieuNhap;
import DTO.DBConnection;
import java.util.ArrayList;
import java.sql.*;
public class PhieuNhap_DAO {
    
    Connection connection=DBConnection.GetConnection();
    
    public PhieuNhap_DAO()
    {
        
    }
    
    public ArrayList<PhieuNhap> get_PhieuNhap_All()
    {
        ArrayList<PhieuNhap> DanhSachPhieuNhap=new ArrayList<>();
        try{
            String Query="Select * from PhieuNhap where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                PhieuNhap phieuNhap=new PhieuNhap();
                phieuNhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                phieuNhap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                phieuNhap.setMaNhanVien(rs.getString("MaNhanVien"));
                phieuNhap.setNgayNhap(rs.getDate("NgayNhap"));
                phieuNhap.setThanhTien(rs.getFloat("ThanhTien"));
                DanhSachPhieuNhap.add(phieuNhap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachPhieuNhap;
    }
    
    public ArrayList<PhieuNhap> get_PhieuNhap_All_And_IsDeleted()
    {
        ArrayList<PhieuNhap> DanhSachPhieuNhap=new ArrayList<>();
        try{
            String Query="Select * from PhieuNhap";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                PhieuNhap phieuNhap=new PhieuNhap();
                phieuNhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                phieuNhap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                phieuNhap.setMaNhanVien(rs.getString("MaNhanVien"));
                phieuNhap.setNgayNhap(rs.getDate("NgayNhap"));
                phieuNhap.setThanhTien(rs.getFloat("ThanhTien"));
                DanhSachPhieuNhap.add(phieuNhap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachPhieuNhap;
    }
    
    public ArrayList<PhieuNhap> get_PhieuNhap_ByMaPhieuNhap(String MaPhieuNhap)
    {
        ArrayList<PhieuNhap> DanhSachPhieuNhap=new ArrayList<>();
        try{
            String Query="Select * from PhieuNhap where MaPhieuNhap like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaPhieuNhap+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                PhieuNhap phieuNhap=new PhieuNhap();
                phieuNhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                phieuNhap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                phieuNhap.setMaNhanVien(rs.getString("MaNhanVien"));
                phieuNhap.setNgayNhap(rs.getDate("NgayNhap"));
                phieuNhap.setThanhTien(rs.getFloat("ThanhTien"));
                DanhSachPhieuNhap.add(phieuNhap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachPhieuNhap;
    }
    
    public boolean add_PhieuNhap(PhieuNhap phieuNhap)
    {
        try{
            String Query="Insert into PhieuNhap(MaPhieuNhap,MaNhanVien,MaNhaCungCap,NgayNhap,ThanhTien,IsDeleted)"
                        +"Values(?,?,?,?,0,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, phieuNhap.getMaPhieuNhap());
            ps.setString(2, phieuNhap.getMaNhanVien());
            ps.setString(3, phieuNhap.getMaNhaCungCap());
            ps.setDate(4, phieuNhap.getNgayNhap());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_PhieuNhap_ByMaPhieuNhap(String MaPhieuNhap)
    {
        try{
            String Query="Update PhieuNhap SET IsDeleted=1 Where MaPhieuNhap=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaPhieuNhap);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Sua_PhieuNhap(PhieuNhap phieuNhap)
    {
        try{
            String Query="UPDATE PhieuNhap SET MaNhanVien = ?, MaNhaCungCap = ?, "
                    + "NgayNhap=?,ThanhTien=?\n"
                    + "WHERE MaPhieuNhap=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, phieuNhap.getMaNhanVien());
            ps.setString(2, phieuNhap.getMaNhaCungCap());
            ps.setDate(3, phieuNhap.getNgayNhap());
            ps.setFloat(4, phieuNhap.getThanhTien());
            ps.setString(5, phieuNhap.getMaPhieuNhap());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
}
