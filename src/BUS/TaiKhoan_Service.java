
package BUS;
import DAO.TaiKhoan_DAO;
import DTO.CheckLoi;
import java.util.ArrayList;
import DTO.TaiKhoan;
import javax.swing.JOptionPane;
import java.awt.Component;

public class TaiKhoan_Service {
    private TaiKhoan_DAO taikhoan_DAO;
    private CheckLoi checkLoi=new CheckLoi();
    
    public TaiKhoan_Service()
    {
        taikhoan_DAO=new TaiKhoan_DAO();
    }
    
    public ArrayList<TaiKhoan> get_TaiKhoan_All()
    {
        return taikhoan_DAO.get_TaiKhoan_All();
    }
    
    public boolean check_Login(TaiKhoan taikhoan,Component ParentComponent)
    {
        if(check_TaiKhoan_Login(taikhoan))
        {
            JOptionPane.showMessageDialog(ParentComponent, "Đăng nhập thành công");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(ParentComponent, "Không tồn tại tài khoản này");
            return false;
        }
    }
    
    public boolean add_TaiKhoan(TaiKhoan taikhoan,Component parentComponent)
    {
        TaiKhoan_TangMaTuDong(taikhoan);
        
        if(taikhoan_DAO.add_TaiKhoan(taikhoan,parentComponent))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm tài khoản thành công");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm tài khoản thất bại");
            return false;
        }
    }
    
    public boolean check_TaiKhoan_Login(TaiKhoan tk)
    {
        ArrayList<TaiKhoan> DanhSachTaiKhoan=get_TaiKhoan_All();
        for(TaiKhoan taikhoan:DanhSachTaiKhoan)
        {
            if(taikhoan.getTenTaiKhoan().equals(tk.getTenTaiKhoan())&&taikhoan.getMatKhau().equals(tk.getMatKhau()))
            {
                tk.setQuyen(taikhoan.getQuyen());
                return true;
            }
        }
        return false;
    }
    
    public void TaiKhoan_TangMaTuDong(TaiKhoan taiKhoan)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<TaiKhoan> DanhSachTaiKhoan=get_TaiKhoan_All();
            if(DanhSachTaiKhoan.isEmpty())
            {
                String MaTaiKhoan="TK-01";
                taiKhoan.setMaTaiKhoan(MaTaiKhoan);
            }
            else
            {
                String[] MaTaiKhoan=DanhSachTaiKhoan.get(DanhSachTaiKhoan.size()-1).getMaTaiKhoan().split("-");
                String MaTaiKhoanCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaTaiKhoan[1]);
                taiKhoan.setMaTaiKhoan("TK-"+MaTaiKhoanCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
