
package BUS;
import DAO.TheLoai_DAO;
import DTO.CheckLoi;
import DTO.TheLoai;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TheLoai_Service {
    private TheLoai_DAO theLoai_DAO;
    private CheckLoi checkLoi= new CheckLoi();
    
    public TheLoai_Service()
    {
        theLoai_DAO=new TheLoai_DAO();
    }
    
    public ArrayList<TheLoai> get_TheLoai_All()
    {
        return theLoai_DAO.get_TheLoai_All();
    }
    
    public ArrayList<TheLoai> get_TheLoai_ByMaTheLoai(String MaTheLoai)
    {
        return theLoai_DAO.get_TheLoai_ByMaTheLoai(MaTheLoai);
    }
    
    public ArrayList<TheLoai> get_TheLoai_ByTenTheLoai(String TenTheLoai)
    {
        return theLoai_DAO.get_TheLoai_ByTenTheLoai(TenTheLoai);
    }
    
    public void Add_TheLoai(TheLoai theLoai,Component parentComponent)
    {
        TheLoai_TangMaTuDong(theLoai);
        
        if(theLoai_DAO.add_TheLoai(theLoai))
        {
            JOptionPane.showMessageDialog(parentComponent,"Thêm thể loại thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Thêm thể loại thất bại");
        }
    }    
    
    public void Xoa_TheLoai_ByMaTheLoai(String MaTheLoai,Component parentComponent)
    {
        if(theLoai_DAO.Xoa_TheLoai_ByMaTheLoai(MaTheLoai))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa thể loại thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa thể loại thất bại");
        }
    }   
    
    public void Xoa_TheLoai_ByTenTheLoai(String TenTheLoai,Component parentComponent)
    {
        if(theLoai_DAO.Xoa_TheLoai_ByTenTheLoai(TenTheLoai))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa thể loại thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa thể loại thất bại");
        }
    }   
    
    public void Sua_TheLoai(TheLoai theLoai,Component parentComponent)//hàm dùng để thay đổi sách
    {
        
        //phần này là phần sửa cơ sở dữ liệu
        if(theLoai_DAO.Sua_TheLoai(theLoai))
        {
            JOptionPane.showMessageDialog(parentComponent, "Sửa thể loại thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Sửa thể loại thất bại");
        }
    }
    
    public void TheLoai_TangMaTuDong(TheLoai theLoai)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<TheLoai> DanhSachTheLoai=theLoai_DAO.get_TheLoai_AllAndIsDeleted();
            if(DanhSachTheLoai.isEmpty())
            {
                String MaTheLoai="TL-01";
                theLoai.setMaTheLoai(MaTheLoai);
            }
            else
            {
                String[] MaTheLoai=DanhSachTheLoai.get(DanhSachTheLoai.size()-1).getMaTheLoai().split("-");
                String MaTheLoaiCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaTheLoai[1]);
                theLoai.setMaTheLoai("TL-"+MaTheLoaiCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
