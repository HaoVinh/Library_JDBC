
package DAO;
import DTO.DocGia;
import DTO.DBConnection;
import java.util.ArrayList;
import java.sql.*;

public class DocGia_DAO {
    Connection connection=DBConnection.GetConnection();
    
    public ArrayList<DocGia> get_DocGia_All()
    {
        ArrayList<DocGia> DanhSachDocGia=new ArrayList<>();
        try{
            String Query="Select * from DocGia where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                DocGia docgia=new DocGia();
                docgia.setMaDocGia(rs.getString("MaDocGia"));
                docgia.setTenDocGia(rs.getString("TenDocGia"));
                docgia.setDiaChi(rs.getString("DiaChi"));
                docgia.setGioiTinh(rs.getString("GioiTinh"));
                docgia.setNgaySinh(rs.getDate("NgaySinh"));
                docgia.setSDT(rs.getString("SDT"));
                DanhSachDocGia.add(docgia);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachDocGia;
    }
    
    public ArrayList<DocGia> get_DocGia_AllAndIsDeleted()
    {
        ArrayList<DocGia> DanhSachDocGia=new ArrayList<>();
        try{
            String Query="Select * from DocGia";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                DocGia docgia=new DocGia();
                docgia.setMaDocGia(rs.getString("MaDocGia"));
                docgia.setTenDocGia(rs.getString("TenDocGia"));
                docgia.setDiaChi(rs.getString("DiaChi"));
                docgia.setGioiTinh(rs.getString("GioiTinh"));
                docgia.setNgaySinh(rs.getDate("NgaySinh"));
                docgia.setSDT(rs.getString("SDT"));
                DanhSachDocGia.add(docgia);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachDocGia;
    }
    
    public ArrayList<DocGia> get_DocGia_ByMaDocGia(String MaDocGia)
    {
        ArrayList<DocGia> DanhSachDocGia=new ArrayList<>();
        try{
            String Query="Select * from DocGia where MaDocGia like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaDocGia+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                DocGia docgia=new DocGia();
                docgia.setMaDocGia(rs.getString("MaDocGia"));
                docgia.setTenDocGia(rs.getString("TenDocGia"));
                docgia.setDiaChi(rs.getString("DiaChi"));
                docgia.setGioiTinh(rs.getString("GioiTinh"));
                docgia.setNgaySinh(rs.getDate("NgaySinh"));
                docgia.setSDT(rs.getString("SDT"));
                DanhSachDocGia.add(docgia);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachDocGia;
    }
    
    public ArrayList<DocGia> get_DocGia_ByTenDocGia(String TenDocGia)
    {
        ArrayList<DocGia> DanhSachDocGia=new ArrayList<>();
        try{
            String Query="select * from DocGia Where TenDocGia like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+TenDocGia+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                DocGia docgia=new DocGia();
                docgia.setMaDocGia(rs.getString("MaDocGia"));
                docgia.setTenDocGia(rs.getString("TenDocGia"));
                docgia.setDiaChi(rs.getString("DiaChi"));
                docgia.setGioiTinh(rs.getString("GioiTinh"));
                docgia.setNgaySinh(rs.getDate("NgaySinh"));
                docgia.setSDT(rs.getString("SDT"));
                DanhSachDocGia.add(docgia);
            }
           
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachDocGia;
    }
    
    public boolean add_DocGia(DocGia docGia)
    {
        try{
            String Query="Insert into DocGia(MaDocGia,TenDocGia,DiaChi,GioiTinh,NgaySinh,SDT,IsDeleted)"
                        +"Values(?,?,?,?,?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, docGia.getMaDocGia());
            ps.setString(2, docGia.getTenDocGia());
            ps.setString(3, docGia.getDiaChi());
            ps.setString(4, docGia.getGioiTinh());
            ps.setDate(5, docGia.getNgaySinh());
            ps.setString(6, docGia.getSDT());
            
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_DocGia_ByTenDocGia(String TenDocGia)
    {
        try{
            String Query="Update DocGia SET IsDeleted=1 Where TenDocGia=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,TenDocGia);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_DocGia_ByMaDocGia(String MaDocGia)
    {
        try{
            String Query="Update DocGia SET IsDeleted=1 Where MaDocGia=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaDocGia);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Sua_DocGia(DocGia docGia)
    {
        try{
            String Query="UPDATE DocGia SET TenDocGia = ?, DiaChi = ?, "
                    + "NgaySinh = ? ,GioiTinh = ?,SDT=?\n"
                    + "WHERE MaDocGia=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, docGia.getTenDocGia());
            ps.setString(2, docGia.getDiaChi());
            ps.setDate(3,docGia.getNgaySinh());
            ps.setString(4, docGia.getGioiTinh());
            ps.setString(5, docGia.getSDT());
            ps.setString(6, docGia.getMaDocGia());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
