
package BUS;
import DAO.Sach_DAO;
import DTO.CheckLoi;
import DTO.Sach;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Sach_Service {
    private Sach_DAO sach_DAO;
    private CheckLoi checkLoi=new CheckLoi();
    
    public Sach_Service()
    {
        sach_DAO=new Sach_DAO();
    }
    
    public ArrayList<Sach> get_Sach_All()
    {
        return sach_DAO.getToanBoThongTinSach();
    }
    
    public ArrayList<Sach> get_Sach_AllAndIsDeleted()
    {
        return sach_DAO.get_Sach_AllAndIsDeleted();
    }
    
    public ArrayList<Sach> get_Sach_ByMaSach(String MaSach)
    {
        return sach_DAO.getSachByMaSach(MaSach);
    }
    
    public ArrayList<Sach> get_Sach_ByTenSach(String TenSach)
    {
        return sach_DAO.getSachByTenSach(TenSach);
    }
    
    public ArrayList<Sach> get_Sach_ByTenTacGia(String TenTacGia)
    {
        return sach_DAO.get_Sach_ByTenTacGia(TenTacGia);
    }
    
    public void add_Sach(Sach sach,Component parentComponent)//hàm dùng để thêm sách
    {
        
        Sach_TangMaTuDong(sach);

        //đây là phần thêm sách vào cơ sở dữ liệu
        if(sach_DAO.add_Sach(sach))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm sách thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm sách thất bại");
        }
    }
    
    public void Sua_Sach(Sach sach,Component parentComponent)//hàm dùng để thay đổi sách
    {
//        //phần này để kiểm tra xem mã sách có trùng ko
//        ArrayList<Sach> DanhSachSach=get_Sach_All();
//        for(Sach s:DanhSachSach)
//        {
//            if(s.getMaSach().equals(sach.getMaSach()))
//            {
//                JOptionPane.showMessageDialog(parentComponent, "Mã sách này đã tồn tại");
//                return;
//            }
//        }
        
        //phần này là phần sửa cơ sở dữ liệu
        if(sach_DAO.SuaSach(sach))
        {
            JOptionPane.showMessageDialog(parentComponent, "Sửa sách thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Sửa sách thất bại");
        }
    }
    
    public void Xoa_Sach_ByTenSach(String TenSach,Component parentComponent)//hàm dùng để xóa sách
    {
        if(sach_DAO.XoaSachTheoTenSach(TenSach))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa sách theo tên sách "+TenSach+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa sách theo tên sách "+TenSach+" thất bại");
        }
    }
    
    public void Xoa_Sach_ByMaSach(String MaSach,Component parentComponent)//hàm dùng để xóa sách
    {
        if(sach_DAO.XoaSachTheoMaSach(MaSach))
        {
            JOptionPane.showMessageDialog(parentComponent, "Xóa sách theo mã sách "+MaSach+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Xóa sách theo mã sách "+MaSach+" thất bại");
        }
    }
    
    public void Sach_TangMaTuDong(Sach sach)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<Sach> DanhSachSach=sach_DAO.get_Sach_AllAndIsDeleted();
            if(DanhSachSach.isEmpty())
            {
                String MaSach="S-01";
                sach.setMaSach(MaSach);
            }
            else
            {
                String[] MaSach=DanhSachSach.get(DanhSachSach.size()-1).getMaSach().split("-");
                String MaSachCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaSach[1]);
                sach.setMaSach("S-"+MaSachCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    
    
}
