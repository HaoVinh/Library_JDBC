
package BUS;

import DAO.ChiTietPhieuMuon_DAO;
import DTO.ChiTietPhieuMuon;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ChiTietPhieuMuon_Service {        

    
    ChiTietPhieuMuon_DAO chiTietPhieuMuon_DAO = new ChiTietPhieuMuon_DAO();
    
    public ChiTietPhieuMuon_Service()
    {
        
    }
    
    public ArrayList<ChiTietPhieuMuon> get_ChiTietPhieuMuon_All()
    {
        return chiTietPhieuMuon_DAO.get_ChiTietPhieuMuon_All();
    }
    
    public void Add_ChiTietPhieuMuon(ChiTietPhieuMuon chiTietPhieuMuon,Component parentComponent)
    {
        if(!chiTietPhieuMuon_DAO.KiemTra_ConSachKhong(chiTietPhieuMuon.getMaSach(),chiTietPhieuMuon.getSoLuong()))
        {
            JOptionPane.showMessageDialog(parentComponent,"Số lượng sách này đã hết");
            return;
        }       
        
        //đây là phần kiểm tra mã sách truyền vào có trùng ko nếu trùng thì tăng số lượng chứ ko có add thêm 1 dòng nữa
        if(chiTietPhieuMuon_DAO.KiemTraTrungMaSach(chiTietPhieuMuon.getMaPhieuMuon(), chiTietPhieuMuon.getMaSach()))
        {
            chiTietPhieuMuon_DAO.CapNhat_ChiTietPhieuMuon_LucMuon(chiTietPhieuMuon.getMaPhieuMuon(), chiTietPhieuMuon.getMaSach(), chiTietPhieuMuon.getSoLuong());
            if(chiTietPhieuMuon_DAO.CapNhat_ChiTietPhieuMuon_SoLuongSach_LucMuon(chiTietPhieuMuon.getMaSach(), chiTietPhieuMuon.getSoLuong()))
            {                
                if (chiTietPhieuMuon_DAO.set_PhieuMuon_TrangThaiLucMuon(chiTietPhieuMuon.getMaPhieuMuon())) 
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thành công");
                    return;
                }
                else
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thất bại");
                    return;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thất bại");
                return;
            }
        }        

        //phần này là phần thêm chi tiết phiếu mượn vào cơ sở dữ liệu
        if(chiTietPhieuMuon_DAO.add_ChiTietPhieuMuon(chiTietPhieuMuon))
        {
            if(chiTietPhieuMuon_DAO.CapNhat_ChiTietPhieuMuon_SoLuongSach_LucMuon( chiTietPhieuMuon.getMaSach(), chiTietPhieuMuon.getSoLuong()))
            {                
                if (chiTietPhieuMuon_DAO.set_PhieuMuon_TrangThaiLucMuon(chiTietPhieuMuon.getMaPhieuMuon())) 
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thành công");
                }
                else
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thất bại");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thất bại");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu mượn thất bại");
        }
    }
    
    public void Xoa_ChiTietPhieuMuon_ByMaPhieuMuonAndMaSach(String MaPhieuMuon,String MaSach,Component parentComponent)
    {
        if(chiTietPhieuMuon_DAO.Xoa_ChiTietPhieuMuon_ByMaPhieuMuonAndMaSach(MaPhieuMuon, MaSach))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa chi tiết phiếu mượn thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa chi tiết phiếu mượn thất bại");
        }
    }
    
    public void Sua_ChiTietPhieuMuon(ChiTietPhieuMuon chiTietPhieuMuon,Component parentComponent)
    {
        if(chiTietPhieuMuon_DAO.CapNhat_ChiTietPhieuMuon(chiTietPhieuMuon))
        {
            if(chiTietPhieuMuon_DAO.setTienPhat(chiTietPhieuMuon))
            {
                JOptionPane.showMessageDialog(parentComponent,"Sửa chi tiết phiếu mượn thành công");
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent,"Sửa chi tiết phiếu mượn thất bại");
            }
        }
    }
    
    public void Tra_ChiTietPhieuMuon(ChiTietPhieuMuon chiTietPhieuMuon,Component parentComponent)
    {
        if (chiTietPhieuMuon_DAO.CapNhat_ChiTietPhieuMuon(chiTietPhieuMuon)) 
        {
            if (chiTietPhieuMuon_DAO.setTienPhat(chiTietPhieuMuon)) 
            {
                if (chiTietPhieuMuon_DAO.CapNhat_ChiTietPhieuMuon_SoLuongSach_LucTra( chiTietPhieuMuon.getMaSach(), chiTietPhieuMuon.getSoLuong())) 
                {
                    chiTietPhieuMuon_DAO.set_PhieuMuon_TrangThaiLucTra(chiTietPhieuMuon.getMaPhieuMuon());
                    JOptionPane.showMessageDialog(parentComponent, "Trả phiếu mượn thành công");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(parentComponent, "Trả phiếu mượn thất bại");
                }

            }
        }
    }

    public void set_PhieuMuon_TrangThaiLucTra(String MaPhieuMuon)
    {
        chiTietPhieuMuon_DAO.set_PhieuMuon_TrangThaiLucTra(MaPhieuMuon);
    }
    
    public void set_PhieuMuon_TrangThaiLucMuon(String MaPhieuMuon)
    {
        chiTietPhieuMuon_DAO.set_PhieuMuon_TrangThaiLucMuon(MaPhieuMuon);
    }
    
}
