/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.NhaXuatBan_DAO;
import DTO.NhaXuatBan;
import DTO.CheckLoi;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NhaXuatBan_Service {

    private NhaXuatBan_DAO nxb_DAO;
    private CheckLoi checkLoi = new CheckLoi();

    public NhaXuatBan_Service() 
    {
        nxb_DAO = new NhaXuatBan_DAO();
    }

    
    public ArrayList<NhaXuatBan> get_NXB_ALL_AND_IsDeleted(){
        return nxb_DAO.get_NhaXuatBan_All_And_IsDeleted();
    }
    
    //NXB có IsDeleted=0
    public ArrayList<NhaXuatBan> get_NXB_All() {
        return nxb_DAO.get_NhaXuatBan_All();
    }
    //Tìm kiếm theo tên NXB
     public ArrayList<NhaXuatBan> getNXBByTenNXB(String TenNXB){
          return nxb_DAO.getNhaXuatBanByTenNhaXuatBan(TenNXB);
      }
     //Tìm kiếm theo mã NXB
       public ArrayList<NhaXuatBan> getNXBByMaNXB(String MaNXB){
          return nxb_DAO.getNhaXuatBanByMaNhaXuatBan(MaNXB);
      }
    
    //Ham add nxb
    public void addNXB(NhaXuatBan nxb, Component parentComponent)//hàm dùng để thêm nhà xuất bản
    {
        NXB_TangMaTuDong(nxb);

        if (nxb_DAO.addNhaXuatBan(nxb)) {
            JOptionPane.showMessageDialog(parentComponent, "Thên thành công");
        } else {
            JOptionPane.showMessageDialog(parentComponent, "Thêm thất bại");
        }
    }

    //Ham Update nxb
    public void UpdateNXB(NhaXuatBan nxb, Component parentComponent,String Message) {
        if (nxb_DAO.SuaNhaXuatBan(nxb)) {
            JOptionPane.showMessageDialog(parentComponent, "Sửa thành công");
        } else {
            JOptionPane.showMessageDialog(parentComponent, "Sửa không thành công");
        }
    }

    // Hàm xóa mã NXB
    public boolean XoaNXBTheoMaNXB(String MaNXB, Component parentComponent, String Message)
    {
        if (nxb_DAO.deleteMaNhaXuatBan(MaNXB)) {
            JOptionPane.showMessageDialog(parentComponent, "Xóa thành công");
            return true;
        } else {
            JOptionPane.showMessageDialog(parentComponent, "Xóa không thành công");
        }
        return false;
    }
    
    //Hàm dùng để xóa tên NXB
    public boolean XoaNXBTheoTenNXB(String TenNXB, Component parentComponent, String Message)
    {
        if(nxb_DAO.deleteTenNhaXuatBan(TenNXB)){
            JOptionPane.showMessageDialog(parentComponent, "Xóa thành công");
        }else{
            JOptionPane.showMessageDialog(parentComponent, "Xóa thất bại");
        }
        return false;
    }

    //Hàm tăng mã tự động
    public void NXB_TangMaTuDong(NhaXuatBan nxb) {
        //https://dinhnt.com/course-series/74
        try {
            ArrayList<NhaXuatBan> DanhSachNXB = nxb_DAO.get_NhaXuatBan_All();
            if (DanhSachNXB.isEmpty()) {
                String MaNXB = "NXB-01";
                nxb.setMaNXB(MaNXB);
            } else {
                String[] MaNXB = DanhSachNXB.get(DanhSachNXB.size() - 1).getMaNXB().split("-");
                String MaNXBCanChuyen = checkLoi.ChuyenDoiMaTuDong(MaNXB[1]);
                nxb.setMaNXB("NXB-" + MaNXBCanChuyen);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
