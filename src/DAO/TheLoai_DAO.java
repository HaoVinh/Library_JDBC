
package DAO;
import DTO.DBConnection;
import DTO.TheLoai;
import java.util.ArrayList;
import java.sql.*;

public class TheLoai_DAO {
    Connection connection=DBConnection.GetConnection();
    
    public ArrayList<TheLoai> get_TheLoai_All()
    {
        ArrayList<TheLoai> DanhSachTheLoai=new ArrayList<>();
        try{
            String Query="Select * from TheLoai where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                TheLoai tl=new TheLoai();
                tl.setMaTheLoai(rs.getString("MaTheLoai"));
                tl.setTenTheLoai(rs.getString("TenTheLoai"));
                DanhSachTheLoai.add(tl);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return DanhSachTheLoai;
    }
    
    public ArrayList<TheLoai> get_TheLoai_AllAndIsDeleted()
    {
        ArrayList<TheLoai> DanhSachTheLoai=new ArrayList<>();
        try{
            String Query="Select * from TheLoai";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                TheLoai tl=new TheLoai();
                tl.setMaTheLoai(rs.getString("MaTheLoai"));
                tl.setTenTheLoai(rs.getString("TenTheLoai"));
                DanhSachTheLoai.add(tl);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return DanhSachTheLoai;
    }
    
    public ArrayList<TheLoai> get_TheLoai_ByMaTheLoai(String MaTheLoai)
    {
        ArrayList<TheLoai> DanhSachTheLoai=new ArrayList<>();
        try{
            String Query="Select * from TheLoai where MaTheLoai like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaTheLoai+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                TheLoai tl=new TheLoai();
                tl.setMaTheLoai(rs.getString("MaTheLoai"));
                tl.setTenTheLoai(rs.getString("TenTheLoai"));
                DanhSachTheLoai.add(tl);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return DanhSachTheLoai;
    }
    
    public ArrayList<TheLoai> get_TheLoai_ByTenTheLoai(String TenTheLoai)
    {
        ArrayList<TheLoai> DanhSachTheLoai=new ArrayList<>();
        try{
            String Query="Select * from TheLoai where TenTheLoai like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+TenTheLoai+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                TheLoai tl=new TheLoai();
                tl.setMaTheLoai(rs.getString("MaTheLoai"));
                tl.setTenTheLoai(rs.getString("TenTheLoai"));
                DanhSachTheLoai.add(tl);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return DanhSachTheLoai;
    }
    
    public boolean add_TheLoai(TheLoai theLoai)
    {
        try{
            String Query="Insert into TheLoai Values(?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,theLoai.getMaTheLoai());
            ps.setString(2,theLoai.getTenTheLoai());
            
            return ps.executeUpdate()>0;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Sua_TheLoai(TheLoai theloai)
    {
        try{
            String Query="UPDATE TheLoai SET TenTheLoai = ?\n"
                    + "WHERE MaTheLoai=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, theloai.getTenTheLoai());
            ps.setString(2, theloai.getMaTheLoai());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_TheLoai_ByMaTheLoai(String MaTheLoai)
    {
        try{
            String Query="Update TheLoai SET IsDeleted=1 Where MaTheLoai=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaTheLoai);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_TheLoai_ByTenTheLoai(String TenTheLoai)
    {
        try{
            String Query="Update TheLoai SET IsDeleted=1 Where TenTheLoai=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,TenTheLoai);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
