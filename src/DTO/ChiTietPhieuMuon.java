
package DTO;
import java.sql.*;

public class ChiTietPhieuMuon {
    
    private String MaPhieuMuon;
    private String MaSach;
    private Date NgayTra;
    private int TinhTrangSach;
    private int SoLuong;
    private float TienPhat;

    public ChiTietPhieuMuon()
    {
        
    }
    
    public ChiTietPhieuMuon(String MaPhieuMuon, String MaSach, Date NgayTra, int TinhTrangSach, int SoLuong, float TienPhat) {
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaSach = MaSach;
        this.NgayTra = NgayTra;
        this.TinhTrangSach = TinhTrangSach;
        this.SoLuong = SoLuong;
        this.TienPhat = TienPhat;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public int getTinhTrangSach() {
        return TinhTrangSach;
    }

    public void setTinhTrangSach(int TinhTrangSach) {
        this.TinhTrangSach = TinhTrangSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getTienPhat() {
        return TienPhat;
    }

    public void setTienPhat(float TienPhat) {
        this.TienPhat = TienPhat;
    }

    
    
}
