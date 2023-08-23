
package BUS;
import DAO.ThongKe_DAO;
import DTO.Sach;
import java.awt.Component;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class ThongKe_Service {
    private ThongKe_DAO thongKe_DAO;
    
    public ThongKe_Service()
    {
        thongKe_DAO=new ThongKe_DAO();
    }
    
    public ResultSet get_Sach_MuonNhieuNhat_ByNgay(Date NgayMuon,Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_Sach_MuonNhieuNhat_ByNgay(NgayMuon);
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
    
    public ResultSet get_Sach_MuonNhieuNhat_ByThang(Date NgayMuon,Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_Sach_MuonNhieuNhat_ByThang(NgayMuon);
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
    
    public ResultSet get_DocGia_ChuaTraSach(Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_DocGia_ChuaTraSach();
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
    
    public ResultSet get_DocGia_TreHanTra(Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_DocGia_TreHanTra();
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
    
    public ResultSet get_DocGia_MuonNhieuNhat_ByNgay(Date NgayMuon,Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_DocGia_MuonNhieuNhat_ByNgay(NgayMuon);
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
    
    public ResultSet get_DocGia_MuonNhieuNhat_ByThang(Date NgayMuon,Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_DocGia_MuonNhieuNhat_ByThang(NgayMuon);
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
    
    public ResultSet get_DocGia_TienPhat(Component ParentComponent)
    {
        ResultSet rs=thongKe_DAO.get_DocGia_TienPhat();
        if(rs!=null)
        {
            JOptionPane.showMessageDialog(ParentComponent,"Lấy thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent,"Không tồn tại");
        }
        return rs;
    }
}
