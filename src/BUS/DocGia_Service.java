
package BUS;
import DTO.DocGia;
import java.awt.Component;
import java.util.ArrayList;
import DAO.DocGia_DAO;
import DTO.CheckLoi;
import javax.swing.JOptionPane;
public class DocGia_Service {
    DocGia_DAO docGia_DAO;
    CheckLoi checkLoi=new CheckLoi();
    public DocGia_Service()
    {
        docGia_DAO=new DocGia_DAO();
    }
    
    public ArrayList<DocGia> get_DocGia_All()
    {
        return docGia_DAO.get_DocGia_All();
    }
    
    public ArrayList<DocGia> get_DocGia_ByMaDocGia(String MaDocGia)
    {
        return docGia_DAO.get_DocGia_ByMaDocGia(MaDocGia);
    }
    
    public ArrayList<DocGia> get_DocGia_ByTenDocGia(String TenDocGia)
    {
        return docGia_DAO.get_DocGia_ByTenDocGia(TenDocGia);
    }
    
    public void add_DocGia(DocGia docGia,Component parentComponent)//hàm dùng để thêm độc giả
    {
        //đây là phần tăng mã tự động cho độc giả
        DocGia_TangMaTuDong(docGia);
        
        //phần này là phần thêm độc giả vào cơ sở dữ liệu
        if(docGia_DAO.add_DocGia(docGia))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm độc giả thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm độc giả thất bại");
        }
    }
    
    public void Xoa_DocGia_ByTenDocGia(String TenDocGia,Component parentComponent)//hàm dùng để thay đổi độc giả
    {
        
        if(docGia_DAO.Xoa_DocGia_ByTenDocGia(TenDocGia))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa độc giả theo tên "+TenDocGia+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa độc giả theo tên "+TenDocGia+" thất bại");
        }
    }
    
    public void Xoa_DocGia_ByMaDocGia(String MaDocGia,Component parentComponent)//hàm dùng để thay đổi độc giả
    {
        if(docGia_DAO.Xoa_DocGia_ByMaDocGia(MaDocGia))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa độc giả theo mã "+MaDocGia+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa độc giả theo mã "+MaDocGia+" thất bại");
        }
    }
    
    public void Sua_DocGia(DocGia docGia,Component parentComponent)//hàm dùng để thay đổi độc giả
    {
        
        if(docGia_DAO.Sua_DocGia(docGia))
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa độc giả thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa độc giả thất bại");
        }
    }
    
    public void DocGia_TangMaTuDong(DocGia docGia)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<DocGia> DanhSachDocGia=docGia_DAO.get_DocGia_AllAndIsDeleted();
            if(DanhSachDocGia.isEmpty())
            {
                String MaDocGia="DG-01";
                docGia.setMaDocGia(MaDocGia);
            }
            else
            {
                String[] MaDocGia=DanhSachDocGia.get(DanhSachDocGia.size()-1).getMaDocGia().split("-");
                String MaDocGiaCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaDocGia[1]);
                docGia.setMaDocGia("DG-"+MaDocGiaCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
}
