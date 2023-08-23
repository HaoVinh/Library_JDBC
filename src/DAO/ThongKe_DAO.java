package DAO;

import DTO.DBConnection;
import DTO.CheckLoi;
import java.sql.*;
import BUS.Sach_Service;

public class ThongKe_DAO {

    Connection connection = DBConnection.GetConnection();
    CheckLoi checkloi = new CheckLoi();
    Sach_Service sach_Service = new Sach_Service();

    public ThongKe_DAO() {

    }

    public ResultSet get_Sach_MuonNhieuNhat_ByNgay(Date NgayMuon) {
        try {
            String Query ="SELECT CTPM.MaSach,S.TenSach,SUM (SoLuong) as SoLuongSachMuon,PM.NgayMuon\n" +
                          "FROM ChiTietPhieuMuon as CTPM,PhieuMuon as PM,Sach as S\n" +
                          "where CTPM.MaPhieuMuon=PM.MaPhieuMuon and NgayMuon=? and CTPM.MaSach=S.MaSach\n" +
                          "GROUP BY CTPM.MaSach,NgayMuon,TenSach\n" +
                          "having Sum(SoLuong)=(\n" +
                          "select Top(1) Sum(SoLuong)\n" +
                          "FROM ChiTietPhieuMuon as CTPM,PhieuMuon as PM,Sach as S\n" +
                          "where CTPM.MaPhieuMuon=PM.MaPhieuMuon and PM.NgayMuon=? and CTPM.MaSach=S.MaSach\n" +
                          "group by CTPM.MaSach\n" +
                          "order by Sum(SoLuong) desc"+
                          ")";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setDate(1, NgayMuon);
            ps.setDate(2,NgayMuon);
            ResultSet rs=ps.executeQuery();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet get_Sach_MuonNhieuNhat_ByThang(Date NgayMuon)
    {
        try {
            String Query ="SELECT CTPM.MaSach,S.TenSach,SUM (SoLuong) as SoLuongSachMuon,NgayMuon\n" +
                          "FROM ChiTietPhieuMuon as CTPM,PhieuMuon as PM,Sach as S\n" +
                          "where CTPM.MaPhieuMuon=PM.MaPhieuMuon and DATEPART(MONTH,NgayMuon)=? and CTPm.MaSach=S.MaSach\n" +
                          "GROUP BY CTPM.MaSach,NgayMuon,TenSach\n" +
                          "having Sum(SoLuong)=(\n" +
                          "select Top(1) Sum(SoLuong)\n" +
                          "FROM ChiTietPhieuMuon as CTPM,PhieuMuon as PM,Sach as S\n" +
                          "where CTPM.MaPhieuMuon=PM.MaPhieuMuon and DATEPART(MONTH,NgayMuon)=? and CTPM.MaSach=S.MaSach\n" +
                          "group by CTPM.MaSach\n" +
                          "order by Sum(SoLuong) desc"+ 
                          ")";
            PreparedStatement ps=connection.prepareStatement(Query);
            String ThangMuon=checkloi.ChuyenDateSangThang(NgayMuon);
            ps.setInt(1,Integer.parseInt(ThangMuon));
            ps.setInt(2,Integer.parseInt(ThangMuon));
            ResultSet rs=ps.executeQuery();
            return rs;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet get_DocGia_MuonNhieuNhat_ByNgay(Date NgayMuon)
    {
        try{
            String Query="select MaDocGia,count(MaDocGia) as SoLanMuon\n" +
                      "from PhieuMuon\n" +
                      "where NgayMuon=?\n"
                    + "group by MaDocGia\n"
                    + "having count(MaDocGia)=(\n"
                    + "	select top 1 count(MaDocGia)\n"
                    + "	from PhieuMuon\n"
                    + " where NgayMuon=?\n"
                    + "	group by MaDocGia\n"
                    + ")";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setDate(1, NgayMuon);
            ps.setDate(2, NgayMuon);
            ResultSet rs=ps.executeQuery();
            return rs;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet get_DocGia_MuonNhieuNhat_ByThang(Date NgayMuon)
    {
        try{
            String Query="select MaDocGia,count(MaDocGia) as SoLanMuon\n" +
                      "from PhieuMuon\n" +
                      "where DATEPART(MONTH,NgayMuon)=?\n"
                    + "group by MaDocGia\n"
                    + "having count(MaDocGia)=(\n"
                    + "	select top 1 count(MaDocGia)\n"
                    + "	from PhieuMuon\n"
                    + " where DATEPART(MONTH,NgayMuon)=?\n"
                    + "	group by MaDocGia\n"
                    + ")";
            PreparedStatement ps=connection.prepareStatement(Query);
            String ThangMuon=checkloi.ChuyenDateSangThang(NgayMuon);
            ps.setInt(1, Integer.parseInt(ThangMuon));
            ps.setInt(2, Integer.parseInt(ThangMuon));
            ResultSet rs=ps.executeQuery();
            return rs;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet get_DocGia_TreHanTra()
    {
        try{
            String Query="select PM.MaDocGia,TenDocGia,NgayMuon,PM.NgayTra as NgayTra,CTPM.NgayTra as NgayThucTra,DATEDIFF(Day,PM.NgayTra,CTPM.NgayTra) as SoNgayTreHan\n" +
                      "from ChiTietPhieuMuon as CTPM,PhieuMuon as PM,DocGia as DG\n"
                    + "where CTPM.MaPhieuMuon=PM.MaPhieuMuon and PM.MaDocGia=DG.MaDocGia and DATEDIFF(Day,CTPM.NgayTra,PM.NgayTra)<0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            return rs;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet get_DocGia_ChuaTraSach()
    {
        try{
            String Query="select PM.MaDocGia,TenDocGia\n" +
                      "from PhieuMuon as PM,DocGia as DG\n"
                    + "where PM.TinhTrang=0 and PM.MaDocGia=DG.MaDocGia\n"
                    + "group by PM.MaDocGia,TenDocGia";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            return rs;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public ResultSet get_DocGia_TienPhat()
    {
        try{
            String Query="select PM.MaDocGia,TenDocGia,Sum(TienPhat) as SoTienPhat\n" +
                      "from ChiTietPhieuMuon as CTPM,PhieuMuon as PM,DocGia as DG\n"
                    + "where CTPM.MaPhieuMuon=PM.MaPhieuMuon and PM.MaDocGia=DG.MaDocGia\n"
                    + "group by PM.MaDocGia,TenDocGia";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            return rs;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
}
