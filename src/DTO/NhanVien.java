
package DTO;
import java.sql.*;

public class NhanVien {
    private String MaNhanVien;
    private String TenNhanVien;
    private Date NgaySinh; 
    private String SDT;
    private String Email;
    private String GioiTinh;
    private String QueQuan;
    private String GhiChu;
    
    public NhanVien()
    {
        
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, Date NgaySinh, String SDT, String Email, String GioiTinh, String QueQuan, String GhiChu) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.NgaySinh = NgaySinh;
        this.SDT = SDT;
        this.Email = Email;
        this.GioiTinh = GioiTinh;
        this.QueQuan = QueQuan;
        this.GhiChu = GhiChu;
    }
    
    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    public static int DemSoLuongThamSo() {
        return 7;
    }

    @Override
    public String toString() {
        return "NhanVien{"+ "MaNV="+MaNhanVien + ",TenNhanVien=" + TenNhanVien + ",NgaySinh=" + NgaySinh + ",DienThoai=" + SDT + ",Email="+ Email + ", GioiTinh=" + GioiTinh + ",QueQuan=" + QueQuan+ '}';
    }
    
    
    
}

