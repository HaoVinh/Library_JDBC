/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.TacGia_DAO;
import DTO.CheckLoi;
import DTO.TacGia;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TacGia_Service {
    private TacGia_DAO tacGia_DAO;
    private CheckLoi checkLoi=new CheckLoi();
    
    public TacGia_Service()
    {
        tacGia_DAO=new TacGia_DAO();
    }
    
    public ArrayList<TacGia> get_tacGia_All()
    {
        return tacGia_DAO.get_TacGia_All();
    }
     public ArrayList<TacGia> get_TacGia_ByMaTacGia(String maTacGia)
    {
        return tacGia_DAO.get_TacGia_ByMaTacGia(maTacGia);
    }
    
    public ArrayList<TacGia> get_TacGia_ByTenTacGia(String tenTacGia)
    {
        return tacGia_DAO.get_TacGia_ByTenTacGia(tenTacGia);
    }
    
    public void add_tacGia(TacGia tacgia1,Component parentComponent)
    {                
        TacGia_TangMaTuDong(tacgia1);
        
        
        if(tacGia_DAO.add_TacGia(tacgia1))
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm tác giả thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent, "Thêm tác giả thất bại");
        }
    }
    public void delete_tacGia_ByTenTacGia(String tenTacGia,Component parentComponent)
    {
        
        if(tacGia_DAO.Xoa_TacGia_ByTenTacGia(tenTacGia))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa tác giả theo tên "+tenTacGia+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa tác giả theo tên "+tenTacGia+" thất bại");
        }
    }
    
    public void delete_tacGia_ByMaTacGia(String maTacGia,Component parentComponent)
    {
        if(tacGia_DAO.Xoa_TacGia_ByMaTacGia(maTacGia))
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa tác giả theo mã "+maTacGia+" thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Xóa tác giả theo mã "+maTacGia+" thất bại");
        }
    }
    public void Sua_TacGia(TacGia tacgia,Component parentComponent)//hàm dùng để thay đổi độc giả
    {
        
        if(tacGia_DAO.Sua_TacGia(tacgia))
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa tác giả thành công");
        }
        else
        {
            JOptionPane.showMessageDialog(parentComponent,"Sửa tác giả thất bại");
        }
    }
   
    public void TacGia_TangMaTuDong(TacGia tacGia)
    {
        //https://dinhnt.com/course-series/74
        try{
            ArrayList<TacGia> DanhSachTacGia=tacGia_DAO.get_TacGia_AllAndIsDeleted();
            if(DanhSachTacGia.isEmpty())
            {
                String MaTacGia="TG-01";
                tacGia.setMaTacGia(MaTacGia);
            }
            else
            {
                String[] MaTacGia=DanhSachTacGia.get(DanhSachTacGia.size()-1).getMaTacGia().split("-");
                String MaTacGiaCanChuyen=checkLoi.ChuyenDoiMaTuDong(MaTacGia[1]);
                tacGia.setMaTacGia("TG-"+MaTacGiaCanChuyen);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
