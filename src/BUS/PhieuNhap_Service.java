
package BUS;
import DTO.PhieuNhap;
import java.awt.Component;
import java.util.ArrayList;
import DAO.PhieuNhap_DAO;
import DTO.CheckLoi;
import javax.swing.JOptionPane;
public class PhieuNhap_Service {
    PhieuNhap_DAO phieuNhap_DAO;
    CheckLoi checkLoi=new CheckLoi();
    
    public PhieuNhap_Service()
    {
        phieuNhap_DAO=new PhieuNhap_DAO();
    }
    
    public ArrayList<PhieuNhap> get_PhieuNhap_All()
    {
        return phieuNhap_DAO.get_PhieuNhap_All();
    }
    
    public ArrayList<PhieuNhap> get_PhieuNhap_All_And_IsDeleted()
    {
        return phieuNhap_DAO.get_PhieuNhap_All_And_IsDeleted();
    }
    
    public ArrayList<PhieuNhap> get_PhieuNhap_ByMaPhieuNhap(String MaPhieuNhap)
    {
        return phieuNhap_DAO.get_PhieuNhap_ByMaPhieuNhap(MaPhieuNhap);
    }
    
    public void add_PhieuNhap(PhieuNhap phieuNhap,Component parentComponent)//hàm dùng để thêm phiếu nhập
    {
        //đây là phần tăng mã tự động cho phiếu nhập
        PhieuNhap_TangMaTuDong(phieuNhap);
        
        //phần này là phần thêm độc giả vào cơ sở dữ liệu
        if(phieuNhap_DAO.add_PhieuNhap(phieuNhap))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm phiếu nhập thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm phiếu nhập thất bại");
        }
    }
    
    public void Xoa_PhieuNhap_ByMaPhieuNhap(String MaPhieuNhap,Component parentComponent)//hàm dùng để thay đổi phiếu nhập
    {
        if(phieuNhap_DAO.Xoa_PhieuNhap_ByMaPhieuNhap(MaPhieuNhap))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa phiếu nhập theo mã "+MaPhieuNhap+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa phiếu nhập theo mã "+MaPhieuNhap+" thất bại");
        }
    }
    
    public void Sua_PhieuNhap(PhieuNhap phieuNhap,Component parentComponent)//hàm dùng để thay đổi phiếu nhập
    {
        
        if(phieuNhap_DAO.Sua_PhieuNhap(phieuNhap))
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa phiếu nhập thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa phiếu nhập thất bại");
        }
    }
    
    public void PhieuNhap_TangMaTuDong(PhieuNhap phieuNhap)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<PhieuNhap> DanhSachPhieuNhap=phieuNhap_DAO.get_PhieuNhap_All_And_IsDeleted();
            if(DanhSachPhieuNhap.isEmpty())
            {
                String MaPhieuNhap="PN-01";
                phieuNhap.setMaPhieuNhap(MaPhieuNhap);
            }
            else
            {
                String[] MaPhieuNhap=DanhSachPhieuNhap.get(DanhSachPhieuNhap.size()-1).getMaPhieuNhap().split("-");
                String MaPhieuNhapCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaPhieuNhap[1]);
                phieuNhap.setMaPhieuNhap("PN-"+MaPhieuNhapCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
