
package DAO;
import DTO.NhaCungCap;
import DTO.DBConnection;
import java.util.ArrayList;
import java.sql.*;
public class NhaCungCap_DAO {
    
    Connection connection=DBConnection.GetConnection();
    
    public NhaCungCap_DAO()
    {
        
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_All()
    {
        ArrayList<NhaCungCap> DanhSachNhaCungCap=new ArrayList<>();
        try{
            String Query="Select * from NhaCungCap where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                NhaCungCap nhaCungCap=new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                nhaCungCap.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                nhaCungCap.setEmail(rs.getString("Email"));
                nhaCungCap.setSDT(rs.getString("SDT"));
                nhaCungCap.setDiaChi(rs.getString("DiaChi"));
                DanhSachNhaCungCap.add(nhaCungCap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachNhaCungCap;
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_All_And_IsDeleted()
    {
        ArrayList<NhaCungCap> DanhSachNhaCungCap=new ArrayList<>();
        try{
            String Query="Select * from NhaCungCap";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                NhaCungCap nhaCungCap=new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                nhaCungCap.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                nhaCungCap.setEmail(rs.getString("Email"));
                nhaCungCap.setSDT(rs.getString("SDT"));
                nhaCungCap.setDiaChi(rs.getString("DiaChi"));
                DanhSachNhaCungCap.add(nhaCungCap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachNhaCungCap;
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_ByMaNhaCungCap(String MaNhaCungCap)
    {
        ArrayList<NhaCungCap> DanhSachNhaCungCap=new ArrayList<>();
        try{
            String Query="Select * from NhaCungCap where MaNhaCungCap like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaNhaCungCap+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                NhaCungCap nhaCungCap=new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                nhaCungCap.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                nhaCungCap.setEmail(rs.getString("Email"));
                nhaCungCap.setSDT(rs.getString("SDT"));
                nhaCungCap.setDiaChi(rs.getString("DiaChi"));
                DanhSachNhaCungCap.add(nhaCungCap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachNhaCungCap;
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_ByTenNhaCungCap(String TenNhaCungCap)
    {
        ArrayList<NhaCungCap> DanhSachNhaCungCap=new ArrayList<>();
        try{
            String Query="select * from NhaCungCap Where TenNhaCungCap like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+TenNhaCungCap+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                NhaCungCap nhaCungCap=new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(rs.getString("MaNhaCungCap"));
                nhaCungCap.setTenNhaCungCap(rs.getString("TenNhaCungCap"));
                nhaCungCap.setEmail(rs.getString("Email"));
                nhaCungCap.setSDT(rs.getString("SDT"));
                nhaCungCap.setDiaChi(rs.getString("DiaChi"));
                DanhSachNhaCungCap.add(nhaCungCap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachNhaCungCap;
    }
    
    public boolean add_NhaCungCap(NhaCungCap nhaCungCap)
    {
        try{
            String Query="Insert into NhaCungCap(MaNhaCungCap,TenNhaCungCap,DiaChi,Email,SDT,IsDeleted)"
                        +"Values(?,?,?,?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, nhaCungCap.getMaNhaCungCap());
            ps.setString(2, nhaCungCap.getTenNhaCungCap());
            ps.setString(3, nhaCungCap.getDiaChi());
            ps.setString(4, nhaCungCap.getEmail());
            ps.setString(5, nhaCungCap.getSDT());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_NhaCungCap_ByTenNhaCungCap(String TenNhaCungCap)
    {
        try{
            String Query="Update NhaCungCap SET IsDeleted=1 Where TenNhaCungCap=?";
            PreparedStatement ps=connection.prepareStatement(Query);ps.setInt(1,0);
            ps.setString(1,TenNhaCungCap);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_NhaCungCap_ByMaNhaCungCap(String MaNhaCungCap)
    {
        try{
            String Query="Update NhaCungCap SET IsDeleted=1 Where MaNhaCungCap=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaNhaCungCap);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Sua_NhaCungCap(NhaCungCap nhaCungCap)
    {
        try{
            String Query="UPDATE NhaCungCap SET TenNhaCungCap = ?, DiaChi = ?, "
                    + "Email=?,SDT=? "
                    + "WHERE MaNhaCungCap=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, nhaCungCap.getTenNhaCungCap());
            ps.setString(2, nhaCungCap.getDiaChi());
            ps.setString(3,nhaCungCap.getEmail());
            ps.setString(4, nhaCungCap.getSDT());
            ps.setString(5, nhaCungCap.getMaNhaCungCap());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    
    
}
