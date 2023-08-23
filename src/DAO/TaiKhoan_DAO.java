
package DAO;
import DTO.DBConnection;
import DTO.TaiKhoan;
import java.awt.Component;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
public class TaiKhoan_DAO {
    
    Connection connection=DBConnection.GetConnection();
    
    public ArrayList<TaiKhoan> get_TaiKhoan_All()
    {
        ArrayList<TaiKhoan> DanhSachTaiKhoan=new ArrayList<>();
        try{
            String Query="Select * from TaiKhoan where IsDeleted=0";
            PreparedStatement ps=connection.prepareStatement(Query);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                TaiKhoan tk=new TaiKhoan();
                tk.setTenTaiKhoan(rs.getString("TenTaiKhoan"));
                tk.setMatKhau(rs.getString("MatKhau"));
                tk.setMaTaiKhoan(rs.getString("MaTaiKhoan"));
                tk.setMaNhanVien(rs.getString("MaNhanVien"));
                tk.setQuyen(rs.getInt("Quyen"));
                DanhSachTaiKhoan.add(tk);
            }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return DanhSachTaiKhoan;
    }
    
    public boolean add_TaiKhoan(TaiKhoan taiKhoan,Component ParentComponent)
    {
        ArrayList<TaiKhoan> DanhSachTaiKhoan=get_TaiKhoan_All();
        for(TaiKhoan tk : DanhSachTaiKhoan)
        {
            if(tk.getMaTaiKhoan().equals(taiKhoan.getMaTaiKhoan()))
            {
                JOptionPane.showMessageDialog(ParentComponent,"Mã tài khoản này đã tồn tại");
                return false;
            }
            else if(tk.getTenTaiKhoan().equals(taiKhoan.getTenTaiKhoan()))
            {
                JOptionPane.showMessageDialog(ParentComponent,"Tên tài khoản này đã tồn tại");
                return false;
            }
        }
        try{
            String Query="Insert into TaiKhoan(MaTaiKhoan,MaNhanVien,TenTaiKhoan,MatKhau,Quyen,IsDeleted)"
                        +"Values(?,?,?,?,?,0)";
            PreparedStatement ps=connection.prepareStatement(Query);
            ps.setString(1, taiKhoan.getMaTaiKhoan());
            ps.setString(2, taiKhoan.getMaNhanVien());            
            ps.setString(3, taiKhoan.getTenTaiKhoan());
            ps.setString(4, taiKhoan.getMatKhau());
            ps.setInt(5, taiKhoan.getQuyen());
            return ps.executeUpdate()>0;
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
