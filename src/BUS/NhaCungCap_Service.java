
package BUS;
import DTO.NhaCungCap;
import java.awt.Component;
import java.util.ArrayList;
import DAO.NhaCungCap_DAO;
import DTO.CheckLoi;
import javax.swing.JOptionPane;
public class NhaCungCap_Service {
    NhaCungCap_DAO nhaCungCap_DAO;
    CheckLoi checkLoi=new CheckLoi();
    
    public NhaCungCap_Service()
    {
        nhaCungCap_DAO=new NhaCungCap_DAO();
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_All()
    {
        return nhaCungCap_DAO.get_NhaCungCap_All();
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_All_And_IsDeleted()
    {
        return nhaCungCap_DAO.get_NhaCungCap_All_And_IsDeleted();
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_ByMaNhaCungCap(String MaNhaCungCap)
    {
        return nhaCungCap_DAO.get_NhaCungCap_ByMaNhaCungCap(MaNhaCungCap);
    }
    
    public ArrayList<NhaCungCap> get_NhaCungCap_ByTenNhaCungCap(String TenNhaCungCap)
    {
        return nhaCungCap_DAO.get_NhaCungCap_ByTenNhaCungCap(TenNhaCungCap);
    }
    
    public void add_NhaCungCap(NhaCungCap nhaCungCap,Component parentComponent)//hàm dùng để thêm nhà cung cấp
    {
        //đây là phần tăng mã tự động cho nhà cung cấp
        NhaCungCap_TangMaTuDong(nhaCungCap);
        
        //phần này là phần thêm độc giả vào cơ sở dữ liệu
        if(nhaCungCap_DAO.add_NhaCungCap(nhaCungCap))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm nhà cung cấp thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm nhà cung cấp thất bại");
        }
    }
    
    public void Xoa_NhaCungCap_ByTenNhaCungCap(String TenNhaCungCap,Component parentComponent)//hàm dùng để thay đổi nhà cung cấp
    {
        
        if(nhaCungCap_DAO.Xoa_NhaCungCap_ByTenNhaCungCap(TenNhaCungCap))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa nhà cung cấp theo tên "+TenNhaCungCap+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa nhà cung cấp theo tên "+TenNhaCungCap+" thất bại");
        }
    }
    
    public void Xoa_NhaCungCap_ByMaNhaCungCap(String MaNhaCungCap,Component parentComponent)//hàm dùng để thay đổi nhà cung cấp
    {
        if(nhaCungCap_DAO.Xoa_NhaCungCap_ByMaNhaCungCap(MaNhaCungCap))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa nhà cung cấp theo mã "+MaNhaCungCap+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa nhà cung cấp theo mã "+MaNhaCungCap+" thất bại");
        }
    }
    
    public void Sua_NhaCungCap(NhaCungCap nhaCungCap,Component parentComponent)//hàm dùng để thay đổi nhà cung cấp
    {
        
        if(nhaCungCap_DAO.Sua_NhaCungCap(nhaCungCap))
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa nhà cung cấp thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa nhà cung cấp thất bại");
        }
    }
    
    public void NhaCungCap_TangMaTuDong(NhaCungCap nhaCungCap)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<NhaCungCap> DanhSachNhaCungCap=nhaCungCap_DAO.get_NhaCungCap_All_And_IsDeleted();
            if(DanhSachNhaCungCap.isEmpty())
            {
                String MaNhaCungCap="NCC-01";
                nhaCungCap.setMaNhaCungCap(MaNhaCungCap);
            }
            else
            {
                String[] MaNhaCungCap=DanhSachNhaCungCap.get(DanhSachNhaCungCap.size()-1).getMaNhaCungCap().split("-");
                String MaNhaCungCapCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaNhaCungCap[1]);
                nhaCungCap.setMaNhaCungCap("NCC-"+MaNhaCungCapCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        NhaCungCap nhaCungCap=new NhaCungCap();
        
        
        
    }
    
}
