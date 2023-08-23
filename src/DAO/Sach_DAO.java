
package DAO;

import DTO.DBConnection;
import DTO.Sach;
import java.util.ArrayList;
import java.sql.*;

public class Sach_DAO {
    
    Connection connection=DBConnection.GetConnection();
    
    public ArrayList<Sach> getToanBoThongTinSach()
    {
        ArrayList<Sach> DanhSachSach=new ArrayList<>();
        try{
            String Query="Select * from Sach where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Sach sach=new Sach();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTheLoai(rs.getString("MaTheLoai"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setMaTacGia(rs.getString("MaTacGia"));
                sach.setSoLuongCon(rs.getInt("SoLuongCon"));
                sach.setThongTinSach(rs.getString("ThongTinSach"));
                DanhSachSach.add(sach);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachSach;
    }
    
    public ArrayList<Sach> get_Sach_AllAndIsDeleted()
    {
        ArrayList<Sach> DanhSachSach=new ArrayList<>();
        try{
            String Query="Select * from Sach";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Sach sach=new Sach();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTheLoai(rs.getString("MaTheLoai"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setMaTacGia(rs.getString("MaTacGia"));
                sach.setSoLuongCon(rs.getInt("SoLuongCon"));
                sach.setThongTinSach(rs.getString("ThongTinSach"));
                DanhSachSach.add(sach);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachSach;
    }
    
    public ArrayList<Sach> getSachByMaSach(String MaSach)
    {
        ArrayList<Sach> DanhSachSach=new ArrayList<>();
        try{
            String Query="Select * from Sach where MaSach like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaSach+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Sach sach=new Sach();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTheLoai(rs.getString("MaTheLoai"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setMaTacGia(rs.getString("MaTacGia"));
                sach.setSoLuongCon(rs.getInt("SoLuongCon"));
                sach.setThongTinSach(rs.getString("ThongTinSach"));
                DanhSachSach.add(sach);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachSach;
    }
    
    public ArrayList<Sach> getSachByTenSach(String TenSach)
    {
        ArrayList<Sach> DanhSachSach=new ArrayList<>();
        try{
            String Query="select * from Sach Where TenSach like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+TenSach+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Sach sach=new Sach();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTheLoai(rs.getString("MaTheLoai"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setMaTacGia(rs.getString("MaTacGia"));
                sach.setSoLuongCon(rs.getInt("SoLuongCon"));
                sach.setThongTinSach(rs.getString("ThongTinSach"));
                DanhSachSach.add(sach);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachSach;
    }
    
    public ArrayList<Sach> get_Sach_ByTenTacGia(String TenTacGia)
    {
        ArrayList<Sach> DanhSachSach=new ArrayList<>();
        try{
            String Query="select *\n"
                    + "from Sach\n"
                    + "where MaTacGia in(\n"
                    + "	select MaTacGia\n"
                    + "	from TacGia\n"
                    + "	where TenTacGia like ? \n"
                    + ") and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+TenTacGia+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                Sach sach=new Sach();
                sach.setMaSach(rs.getString("MaSach"));
                sach.setTenSach(rs.getString("TenSach"));
                sach.setMaTheLoai(rs.getString("MaTheLoai"));
                sach.setMaNXB(rs.getString("MaNXB"));
                sach.setMaTacGia(rs.getString("MaTacGia"));
                sach.setSoLuongCon(rs.getInt("SoLuongCon"));
                sach.setThongTinSach(rs.getString("ThongTinSach"));
                DanhSachSach.add(sach);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachSach;
    }
    
    public boolean add_Sach(Sach sach)
    {
        try{
            String Query="Insert into Sach(MaSach,TenSach,MaTheLoai,MaNXB,MaTacGia,"
                       + "SoLuongCon,ThongTinSach,IsDeleted)\n"
                        +"Values(?,?,?,?,?,?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, sach.getMaSach());
            ps.setString(2, sach.getTenSach());
            ps.setString(3, sach.getMaTheLoai());
            ps.setString(4, sach.getMaNXB());
            ps.setString(5, sach.getMaTacGia());
            ps.setInt(6, sach.getSoLuongCon());
            ps.setString(7, sach.getThongTinSach());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean SuaSach(Sach sach)
    {
        try{
            String Query="UPDATE Sach SET TenSach = ?, MaTheLoai = ?, "
                    + "MaNXB = ? ,MaTacGia = ?,SoLuongCon=?,ThongTinSach=? "
                    + "WHERE MaSach=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, sach.getTenSach());
            ps.setString(2, sach.getMaTheLoai());
            ps.setString(3, sach.getMaNXB());
            ps.setString(4, sach.getMaTacGia());
            ps.setInt(5, sach.getSoLuongCon());
            ps.setString(6, sach.getThongTinSach());
            ps.setString(7, sach.getMaSach());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean XoaSachTheoTenSach(String TenSach)
    {
        try{
            String Query="Update Sach SET IsDeleted=1 Where TenSach=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,TenSach);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean XoaSachTheoMaSach(String MaSach)
    {
        try{
            String Query="Update Sach SET IsDeleted=1 Where MaSach=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaSach);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
}
