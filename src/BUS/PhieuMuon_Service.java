
package BUS;
import DTO.PhieuMuon;
import DTO.CheckLoi;
import DAO.PhieuMuon_DAO;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PhieuMuon_Service {
    PhieuMuon_DAO phieuMuon_DAO = new PhieuMuon_DAO();
    CheckLoi checkLoi=new CheckLoi();
    
    public PhieuMuon_Service()
    {
        
    }
    
    public ArrayList<PhieuMuon> get_PhieuMuon_All()
    {
        return phieuMuon_DAO.get_PhieuMuon_All();
    }
    
    public ArrayList<PhieuMuon> get_PhieuMuon_All_And_IsDeleted()
    {
        return phieuMuon_DAO.get_PhieuMuon_AllAndIsDeleted();
    }
    
    public ArrayList<PhieuMuon> get_PhieuMuon_ByMaPhieuMuon(String MaPhieuMuon)
    {
        return phieuMuon_DAO.get_PhieuMuon_ByMaPhieuMuon(MaPhieuMuon);
    }
    
    public void Add_PhieuMuon(PhieuMuon phieuMuon,Component parentComponent)//hàm dùng để thêm phiếu mượn
    {
        //đây là phần tăng mã tự động cho phiếu mượn
        PhieuMuon_TangMaTuDong(phieuMuon);
        
        //phần này là phần thêm độc giả vào cơ sở dữ liệu
        if(phieuMuon_DAO.Add_PhieuMuon(phieuMuon))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm phiếu mượn thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm phiếu mượn thất bại");
        }
    }
    
    public void Xoa_PhieuMuon_ByMaPhieuMuon(String MaPhieuMuon,Component parentComponent)//hàm dùng để thay đổi phiếu mượn
    {
        if(phieuMuon_DAO.Xoa_PhieuMuon_ByMaPhieuMuon(MaPhieuMuon))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa phiếu mượn theo mã "+MaPhieuMuon+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa phiếu mượn theo mã "+MaPhieuMuon+" thất bại");
        }
    }
    
    public void Sua_PhieuMuon(PhieuMuon phieuMuon,Component parentComponent)//hàm dùng để thay đổi phiếu mượn
    {
        
        if(phieuMuon_DAO.Sua_PhieuMuon(phieuMuon))
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa phiếu mượn thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa phiếu mượn thất bại");
        }
    }
    
    public void PhieuMuon_TangMaTuDong(PhieuMuon phieuMuon)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<PhieuMuon> DanhSachPhieuMuon=phieuMuon_DAO.get_PhieuMuon_AllAndIsDeleted();
            if(DanhSachPhieuMuon.isEmpty())
            {
                String MaPhieuMuon="PM-01";
                phieuMuon.setMaPhieuMuon(MaPhieuMuon);
            }
            else
            {
                String[] MaPhieuMuon=DanhSachPhieuMuon.get(DanhSachPhieuMuon.size()-1).getMaPhieuMuon().split("-");
                String MaPhieuMuonCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaPhieuMuon[1]);
                phieuMuon.setMaPhieuMuon("PM-"+MaPhieuMuonCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    
}
