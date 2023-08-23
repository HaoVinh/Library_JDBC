
package BUS;

import DAO.NhanVien_DAO;
import DTO.CheckLoi;
import DTO.NhanVien;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NhanVien_Service {
    private NhanVien_DAO nhanVien_DAO;
    private CheckLoi checkLoi=new CheckLoi();
    
    public NhanVien_Service()
    {
        nhanVien_DAO=new NhanVien_DAO();
    }
    
    public ArrayList<NhanVien> get_NhanVien_All()
    {
        return nhanVien_DAO.get_NhanVien_All();
    }
    
    public ArrayList<NhanVien> get_NhanVien_ByMaNhanVien(String MaNhanVien)
    {
        return nhanVien_DAO.get_NhanVien_ByMaNhanVien(MaNhanVien);
    }
    
    public ArrayList<NhanVien> get_NhanVien_ByTenNhanVien(String HoTen)
    {
        return nhanVien_DAO.get_NhanVien_ByTenNhanVien(HoTen);
    }
    
    public void add_NhanVien(NhanVien nhanVien,Component parentComponent)//hàm dùng để thêm sách
    {
        
        NhanVien_TangMaTuDong(nhanVien);
        
        //đây là phần thêm sách vào cơ sở dữ liệu
        if(nhanVien_DAO.add_NhanVien(nhanVien))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm nhân viên thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm nhân viên thất bại");
        }
    }
    
    public void Sua_NhanVien(NhanVien nhanVien,Component parentComponent)//hàm dùng để thay đổi sách
    {
        //phần này là phần sửa cơ sở dữ liệu
        if(nhanVien_DAO.Update_NhanVien(nhanVien))
        {
            JOptionPane.showMessageDialog(parentComponent, "Sửa nhân viên thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Sửa nhân viên thất bại");
        }
    }
    
    public void Xoa_NhanVien_ByTenNhanVien(String HoTen,Component parentComponent)//hàm dùng để xóa sách
    {
        if(nhanVien_DAO.Xoa_NhanVien_ByTenNhanVien(HoTen))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa nhân viên theo tên "+HoTen+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa nhân viên theo tên "+HoTen+" thất bại");
        }
    }
    
    public void Xoa_NhanVien_ByMaNhanVien(String MaNhanVien,Component parentComponent)//hàm dùng để xóa sách
    {
        if(nhanVien_DAO.Xoa_NhanVien_ByMaNhanVien(MaNhanVien))
        {
            JOptionPane.showMessageDialog(parentComponent, "Xóa nhân viên theo mã nhân viên "+MaNhanVien+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Xóa nhân viên theo mã nhân viên "+MaNhanVien+" thất bại");
        }
    }
    
    public void NhanVien_TangMaTuDong(NhanVien nhanVien)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<NhanVien> DanhSachNhanVien=nhanVien_DAO.get_NhanVien_AllAndIsDeleted();
            if(DanhSachNhanVien.isEmpty())
            {
                String MaNhanVien="NV-01";
                nhanVien.setMaNhanVien(MaNhanVien);
            }
            else
            {
                String[] MaNhanVien=DanhSachNhanVien.get(DanhSachNhanVien.size()-1).getMaNhanVien().split("-");
                String MaNhanVienCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaNhanVien[1]);
                nhanVien.setMaNhanVien("NV-"+MaNhanVienCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        
    }
}
