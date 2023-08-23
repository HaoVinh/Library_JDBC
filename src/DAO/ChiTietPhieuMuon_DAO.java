
package DAO;


import java.sql.*;
import DTO.ChiTietPhieuMuon;
import DTO.DBConnection;
import java.util.ArrayList;

public class ChiTietPhieuMuon_DAO {
    Connection con = DBConnection.GetConnection();
    
    
    public ArrayList<ChiTietPhieuMuon> get_ChiTietPhieuMuon_All()
    {
        ArrayList<ChiTietPhieuMuon> DanhSachChiTietPhieuMuon=new ArrayList<>();
        String Query="Select * from ChiTietPhieuMuon where IsDeleted=0";
        try{
            
            PreparedStatement ps=con.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                ChiTietPhieuMuon chiTietPhieuMuon=new ChiTietPhieuMuon();
                chiTietPhieuMuon.setMaPhieuMuon(rs.getString("MaPhieuMuon"));
                chiTietPhieuMuon.setMaSach(rs.getString("MaSach"));
                chiTietPhieuMuon.setNgayTra(rs.getDate("NgayTra"));
                chiTietPhieuMuon.setTienPhat(rs.getFloat("TienPhat"));
                chiTietPhieuMuon.setSoLuong(rs.getInt("SoLuong"));
                chiTietPhieuMuon.setTinhTrangSach(rs.getInt("TinhTrangSach"));
                
                DanhSachChiTietPhieuMuon.add(chiTietPhieuMuon);
            }
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return DanhSachChiTietPhieuMuon;
    }
    
    
    public boolean add_ChiTietPhieuMuon(ChiTietPhieuMuon chiTietPhieuMuon) 
    {
        String query2 = "insert into ChiTietPhieuMuon values(?,?,?,?,?,?,0)";
        try {

            PreparedStatement ps = con.prepareStatement(query2);
            ps.setString(1, chiTietPhieuMuon.getMaPhieuMuon());
            ps.setString(2, chiTietPhieuMuon.getMaSach());
            ps.setInt(3, chiTietPhieuMuon.getSoLuong());
            ps.setInt(4, chiTietPhieuMuon.getTinhTrangSach());
            ps.setDate(5, chiTietPhieuMuon.getNgayTra());
            ps.setFloat(6, chiTietPhieuMuon.getTienPhat());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
    
    public boolean Xoa_ChiTietPhieuMuon_ByMaPhieuMuonAndMaSach(String MaPhieuMuon,String MaSach)
    {
        try{
            
            String Query="Update ChiTietPhieuMuon SET IsDeleted=1 Where MaPhieuMuon=? and MaSach=?";
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setString(1,MaPhieuMuon);
            ps.setString(2,MaSach);
            return ps.executeUpdate()>0;
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean CapNhat_ChiTietPhieuMuon(ChiTietPhieuMuon chiTietPhieuMuon)
    {
        String Query="Update ChiTietPhieuMuon set NgayTra=?,TienPhat=?,SoLuong=?,TinhTrangSach=? where MaPhieuMuon=?"
                + " and MaSach=? and IsDeleted=0";
        try{
            
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setDate(1,chiTietPhieuMuon.getNgayTra());
            ps.setFloat(2, chiTietPhieuMuon.getTienPhat());
            ps.setInt(3, chiTietPhieuMuon.getSoLuong());
            ps.setInt(4, chiTietPhieuMuon.getTinhTrangSach());
            ps.setString(5, chiTietPhieuMuon.getMaPhieuMuon());
            ps.setString(6, chiTietPhieuMuon.getMaSach());
            
            return ps.executeUpdate()>0;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        return false;
    }
        
    
    public boolean KiemTraTrungMaSach(String MaPhieuMuon,String MaSach)
    {
        try{
            String Query="select *\n" +
                        "from ChiTietPhieuMuon\n" +
                        "where MaSach=? and MaPhieuMuon=? and IsDeleted=0";
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setString(1,MaSach);
            ps.setString(2, MaPhieuMuon);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                return true;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }    
    
    public boolean KiemTra_ConSachKhong(String MaSach,int SoLuong)
    {
        String Query="Select SoLuongCon from Sach where MaSach=?";
        try{
            
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setString(1, MaSach);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                if(rs.getInt("SoLuongCon")-SoLuong<0)
                {
                    return false;
                }
            }
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return true;
    }
        
    public boolean CapNhat_ChiTietPhieuMuon_LucMuon(String MaPhieuMuon,String MaSach,int SoLuong) 
    {        
        String Query_ctpm_CapNhatSoLuongSach="Update ChiTietPhieuMuon set SoLuong=SoLuong+?,NgayTra=NULL where MaPhieuMuon=? and MaSach=? and IsDeleted=0";       
        
        try {
            PreparedStatement ps=con.prepareStatement(Query_ctpm_CapNhatSoLuongSach);
            ps.setInt(1, SoLuong);
            ps.setString(2, MaPhieuMuon);
            ps.setString(3,MaSach);
            
            return ps.executeUpdate()>0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean CapNhat_ChiTietPhieuMuon_SoLuongSach_LucMuon(String MaSach,int SoLuong) 
    {
        String Query_Sach_CapNhatSoLuongSach="Update Sach set SoLuongCon=SoLuongCon-? where MaSach=? and IsDeleted=0";
        
        try {
            PreparedStatement ps=con.prepareStatement(Query_Sach_CapNhatSoLuongSach);
            ps.setInt(1, SoLuong);
            ps.setString(2, MaSach);
            
            return ps.executeUpdate()>0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean CapNhat_ChiTietPhieuMuon_SoLuongSach_LucTra(String MaSach,int SoLuong) 
    {
        String Query_Sach_CapNhatSoLuongSach="Update Sach set SoLuongCon=SoLuongCon+? where MaSach=? and IsDeleted=0";
        
        try {
            PreparedStatement ps=con.prepareStatement(Query_Sach_CapNhatSoLuongSach);
            ps.setInt(1, SoLuong);
            ps.setString(2, MaSach);
            
            return ps.executeUpdate()>0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean set_PhieuMuon_TrangThaiLucMuon(String MaPhieuMuon)
    {
        String Query="Update PhieuMuon set TinhTrang=0 where MaPhieuMuon=? and IsDeleted=0";
        try{
            
            PreparedStatement ps=con.prepareStatement(Query);
            ps.setString(1, MaPhieuMuon);
            
            return ps.executeUpdate()>0;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }    
    
    public boolean set_PhieuMuon_TrangThaiLucTra(String MaPhieuMuon)
    {
        String Query="Update PhieuMuon set TinhTrang=1 where MaPhieuMuon=? and IsDeleted=0";
        String Query_KiemTra="Select * from ChiTietPhieuMuon where MaPhieuMuon=? and NgayTra is null and IsDeleted=0";
        
        try{
            
            PreparedStatement ps=con.prepareStatement(Query_KiemTra);
            ps.setString(1, MaPhieuMuon);
            ResultSet rs=ps.executeQuery();
            if(!rs.next())
            {
                ps=con.prepareStatement(Query);
                ps.setString(1, MaPhieuMuon);
                return ps.executeUpdate()>0;
            }
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean setTienPhat(ChiTietPhieuMuon chiTietPhieuMuon)
    {
        String queryLayNgayTra = "select NgayTra from PhieuMuon where MaPhieuMuon=?";
        String querySetTienPhat = "update ChiTietPhieuMuon set TienPhat = ? where MaPhieuMuon=? and MaSach=?";

        try {
            PreparedStatement ps = con.prepareStatement(queryLayNgayTra);
            ps.setString(1, chiTietPhieuMuon.getMaPhieuMuon());
            ResultSet rs = ps.executeQuery();
            Date NgayTra = null;
            if (rs.next()) 
            {
                NgayTra = rs.getDate("NgayTra");
            }
            float tienPhat=0;
            ps = con.prepareStatement(querySetTienPhat);
            
            if(chiTietPhieuMuon.getNgayTra()!=null)
            {
                if (NgayTra.compareTo(chiTietPhieuMuon.getNgayTra()) < 0) //trả trễ
                {
                    tienPhat += 5000 * chiTietPhieuMuon.getSoLuong();
                }
            }
            
            if(chiTietPhieuMuon.getTinhTrangSach()==1)//sách bị hư hỏng
            {
                tienPhat+=5000;
            }
            
            ps.setFloat(1, tienPhat);
            ps.setString(2, chiTietPhieuMuon.getMaPhieuMuon());
            ps.setString(3, chiTietPhieuMuon.getMaSach());
                
            return ps.executeUpdate()>0;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    
}
