
package BUS;
import DTO.ChiTietPhieuNhap;
import java.awt.Component;
import java.util.ArrayList;
import DAO.ChiTietPhieuNhap_DAO;
import DTO.CheckLoi;
import javax.swing.JOptionPane;
public class ChiTietPhieuNhap_Service {
    
    ChiTietPhieuNhap_DAO chiTietPhieuNhap_DAO;
    CheckLoi checkLoi=new CheckLoi();
    
    public ChiTietPhieuNhap_Service()
    {
        chiTietPhieuNhap_DAO=new ChiTietPhieuNhap_DAO();
    }
    
    public ArrayList<ChiTietPhieuNhap> get_ChiTietPhieuNhap_All()
    {
        return chiTietPhieuNhap_DAO.get_ChiTietPhieuNhap_All();
    }
    
    public ArrayList<ChiTietPhieuNhap> get_ChiTietPhieuNhap_All_And_IsDeleted()
    {
        return chiTietPhieuNhap_DAO.get_ChiTietPhieuNhap_All_And_IsDeleted();
    }
    
    public ArrayList<ChiTietPhieuNhap> get_ChiTietPhieuNhap_ByMaPhieuNhap(String MaPhieuNhap)
    {
        return chiTietPhieuNhap_DAO.get_ChiTietPhieuNhap_ByMaPhieuNhap(MaPhieuNhap);
    }
    
    public void add_ChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap,Component parentComponent)//hàm dùng để thêm nhà cung cấp
    {        
        //đây là phần kiểm tra mã sách truyền vào có trùng ko nếu trùng thì tăng số lượng chứ ko có add thêm 1 dòng nữa
        if(chiTietPhieuNhap_DAO.KiemTraTrungMaSach(chiTietPhieuNhap.getMaPhieuNhap(), chiTietPhieuNhap.getMaSach()))
        {
            chiTietPhieuNhap_DAO.CapNhat_ChiTietPhieuNhap(chiTietPhieuNhap.getMaPhieuNhap(),chiTietPhieuNhap.getMaSach(), chiTietPhieuNhap.getSoLuong());
            if(chiTietPhieuNhap_DAO.CapNhat_ChiTietPhieuNhap_SoLuongSach( chiTietPhieuNhap.getMaSach(), chiTietPhieuNhap.getSoLuong()))
            {
                if(chiTietPhieuNhap_DAO.CapNhat_PhieuNhap_ThanhTien())
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thành công");
                    return;
                }
                else
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thất bại");
                    return;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thất bại");
                return;
            }
        }        

        //phần này là phần thêm chi tiết phiếu nhập vào cơ sở dữ liệu
        if(chiTietPhieuNhap_DAO.add_ChiTietPhieuNhap(chiTietPhieuNhap))
        {
            if(chiTietPhieuNhap_DAO.CapNhat_ChiTietPhieuNhap_SoLuongSach(chiTietPhieuNhap.getMaSach(), chiTietPhieuNhap.getSoLuong()))
            {
                if(chiTietPhieuNhap_DAO.CapNhat_PhieuNhap_ThanhTien())
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thành công");
                }
                else
                {
                    JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thất bại");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thất bại");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm chi tiết phiếu nhập thất bại");
        }
    }
    
    public void Xoa_ChiTietPhieuNhap_ByMaPhieuNhap(String MaPhieuNhap,String MaSach,Component parentComponent)//hàm dùng để thay đổi nhà cung cấp
    {
        if(chiTietPhieuNhap_DAO.Xoa_ChiTietPhieuNhap_ByMaPhieuNhap(MaPhieuNhap,MaSach))
        {
            if(chiTietPhieuNhap_DAO.CapNhat_PhieuNhap_ThanhTien())
            {
                JOptionPane.showMessageDialog(parentComponent,"Xóa chi tiết phiếu nhập thành công");
            } 
            else 
            {
                JOptionPane.showMessageDialog(parentComponent, "Xóa chi tiết phiếu nhập thất bại");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa chi tiết phiếu nhập theo mã "+MaPhieuNhap+" thất bại");
        }
    }
    
    public void Sua_ChiTietPhieuNhap(ChiTietPhieuNhap chiTietPhieuNhap,Component parentComponent)//hàm dùng để thay đổi nhà cung cấp
    {
        
        if(chiTietPhieuNhap_DAO.Sua_ChiTietPhieuNhap(chiTietPhieuNhap))
        {
            if(chiTietPhieuNhap_DAO.CapNhat_PhieuNhap_ThanhTien())
            {
                JOptionPane.showMessageDialog(parentComponent,"Sửa chi tiết phiếu nhập thành công");
            } 
            else 
            {
                JOptionPane.showMessageDialog(parentComponent, "Sửa chi tiết phiếu nhập thất bại");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa chi tiết phiếu nhập thất bại");
        }
    }
    
    public boolean CapNhat_PhieuNhap_ThanhTien()
    {
        return chiTietPhieuNhap_DAO.CapNhat_PhieuNhap_ThanhTien();
    }
    
}
