
package DAO;
import DTO.ChiTietPhieuNhap;
import DTO.DBConnection;
import java.util.ArrayList;
import java.sql.*;
public class ChiTietPhieuNhap_DAO {
    
    Connection connection=DBConnection.GetConnection();
    
    public ChiTietPhieuNhap_DAO()
    {
        
    }
    
    public ArrayList<ChiTietPhieuNhap> get_ChiTietPhieuNhap_All()
    {
        ArrayList<ChiTietPhieuNhap> DanhSachChiTietPhieuNhap=new ArrayList<>();
        try{
            String Query="Select * from ChiTietPhieuNhap where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap();
                chiTietPhieuNhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                chiTietPhieuNhap.setMaSach(rs.getString("MaSach"));
                chiTietPhieuNhap.setSoLuong(rs.getInt("SoLuong"));
                chiTietPhieuNhap.setDonGia(rs.getFloat("DonGia"));
                DanhSachChiTietPhieuNhap.add(chiTietPhieuNhap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachChiTietPhieuNhap;
    }
    
    public ArrayList<ChiTietPhieuNhap> get_ChiTietPhieuNhap_All_And_IsDeleted()
    {
        ArrayList<ChiTietPhieuNhap> DanhSachChiTietPhieuNhap=new ArrayList<>();
        try{
            String Query="Select * from ChiTietPhieuNhap";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap();
                chiTietPhieuNhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                chiTietPhieuNhap.setMaSach(rs.getString("MaSach"));
                chiTietPhieuNhap.setSoLuong(rs.getInt("SoLuong"));
                chiTietPhieuNhap.setDonGia(rs.getFloat("DonGia"));
                DanhSachChiTietPhieuNhap.add(chiTietPhieuNhap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachChiTietPhieuNhap;
    }
    
    public ArrayList<ChiTietPhieuNhap> get_ChiTietPhieuNhap_ByMaPhieuNhap(String MaChiTietPhieuNhap)
    {
        ArrayList<ChiTietPhieuNhap> DanhSachChiTietPhieuNhap=new ArrayList<>();
        try{
            String Query="Select * from ChiTietPhieuNhap where MaPhieuNhap like ? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,"%"+MaChiTietPhieuNhap+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap();
                chiTietPhieuNhap.setMaPhieuNhap(rs.getString("MaPhieuNhap"));
                chiTietPhieuNhap.setMaSach(rs.getString("MaSach"));
                chiTietPhieuNhap.setSoLuong(rs.getInt("SoLuong"));
                chiTietPhieuNhap.setDonGia(rs.getFloat("DonGia"));
                DanhSachChiTietPhieuNhap.add(chiTietPhieuNhap);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachChiTietPhieuNhap;
    }
    
    public boolean add_ChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap)
    {
        try{
            String Query="Insert into ChiTietPhieuNhap(MaPhieuNhap,MaSach,SoLuong,DonGia,IsDeleted)"
                        +"Values(?,?,?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, chiTietPhieuNhap.getMaPhieuNhap());
            ps.setString(2, chiTietPhieuNhap.getMaSach());
            ps.setInt(3, chiTietPhieuNhap.getSoLuong());
            ps.setFloat(4, chiTietPhieuNhap.getDonGia());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Xoa_ChiTietPhieuNhap_ByMaPhieuNhap(String MaPhieuNhap,String MaSach)
    {
        try{
            String Query="Update ChiTietPhieuNhap SET IsDeleted=1 Where MaPhieuNhap=? and MaSach=?";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaPhieuNhap);
            ps.setString(2,MaSach);
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean Sua_ChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap)
    {
        try{
            String Query="UPDATE ChiTietPhieuNhap SET SoLuong = ?, "
                    + "DonGia=?\n"
                    + "WHERE MaPhieuNhap=? and MaSach=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(4, chiTietPhieuNhap.getMaSach());
            ps.setInt(1, chiTietPhieuNhap.getSoLuong());
            ps.setFloat(2, chiTietPhieuNhap.getDonGia());
            ps.setString(3, chiTietPhieuNhap.getMaPhieuNhap());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean CapNhat_ChiTietPhieuNhap(String MaPhieuNhap,String MaSach,int SoLuong)
    {
        try{
            String Query_CTPM_CapNhatSoLuongSach="Update ChiTietPhieuNhap set SoLuong=SoLuong+?\n"+
                                                 "Where MaPhieuNhap=? and MaSach=? and IsDeleted=0";
            
            
            PreparedStatement ps=connection.prepareStatement(Query_CTPM_CapNhatSoLuongSach);
            ps.setInt(1,SoLuong);
            ps.setString(2, MaPhieuNhap);
            ps.setString(3, MaSach);           
            
            return ps.executeUpdate()>0;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean CapNhat_ChiTietPhieuNhap_SoLuongSach(String MaSach,int SoLuong)
    {
        try{
            
            String Query_Sach_CapNhatSoLuongSach="Update Sach set SoLuongCon=SoLuongCon+?\n"+
                                                 "Where MaSach=? and IsDeleted=0";
            
            PreparedStatement ps=connection.prepareStatement(Query_Sach_CapNhatSoLuongSach);
            ps.setInt(1, SoLuong);
            ps.setString(2, MaSach);
            
            return ps.executeUpdate()>0;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean KiemTraTrungMaSach(String MaPhieuNhap,String MaSach)
    {
        try{
            String Query="select *\n" +
                        "from ChiTietPhieuNhap\n" +
                        "where MaSach=? and MaPhieuNhap=? and IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1,MaSach);
            ps.setString(2, MaPhieuNhap);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                return true;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean CapNhat_PhieuNhap_ThanhTien()
    {
        try{
            String Query_CapNhatThanhTien="Update PhieuNhap set ThanhTien=? where MaPhieuNhap=?";
            
            String Query_ThanhTien="select MaPhieuNhap,Sum(SoLuong*DonGia) as ThanhTien\n" +
                                   "from ChiTietPhieuNhap\n" +
                                   "where IsDeleted=0\n" +
                                   "group by MaPhieuNhap";
            
            String Query_getAllMaPhieuNhap="select MaPhieuNhap\n" +
                                        "from ChiTietPhieuNhap\n" +
                                        "group by MaPhieuNhap";
            
            //Khởi tạo lại thành tiền =0 cho tất cả phiếu nhập để tránh trường hợp không tồn tại chi tiết phiếu nhập nữa là không cập nhật lại được thành tiền cho phiếu nhập
            PreparedStatement ps_getAllMaPhieuNhap=connection.prepareStatement(Query_getAllMaPhieuNhap);
            PreparedStatement ps_CapNhatThanhTien1=connection.prepareStatement(Query_CapNhatThanhTien);
            ResultSet rs_getAllMaPhieuNhap=ps_getAllMaPhieuNhap.executeQuery();
            while(rs_getAllMaPhieuNhap.next())
            {
                ps_CapNhatThanhTien1.setFloat(1,0);
                ps_CapNhatThanhTien1.setString(2, rs_getAllMaPhieuNhap.getString("MaPhieuNhap"));
                ps_CapNhatThanhTien1.executeUpdate();
            }
            
            PreparedStatement ps_CapNhatThanhTien2=connection.prepareStatement(Query_CapNhatThanhTien);
            PreparedStatement ps_ThanhTien=connection.prepareStatement(Query_ThanhTien);
            
            //đây là phần ta tiến hành lấy tổng thành tiền từ chi tiết phiếu nhập
            ResultSet rs_ThanhTien=ps_ThanhTien.executeQuery();
            while(rs_ThanhTien.next())
            {
                ps_CapNhatThanhTien2.setFloat(1, rs_ThanhTien.getFloat("ThanhTien"));
                ps_CapNhatThanhTien2.setString(2, rs_ThanhTien.getString("MaPhieuNhap"));
                ps_CapNhatThanhTien2.executeUpdate();
            }
            return true;
            
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    
}
