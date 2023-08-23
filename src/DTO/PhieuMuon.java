package DTO;
import java.sql.*;

public class PhieuMuon {
    private String MaPhieuMuon;
    private String MaDocGia;
    private String MaNhanVien;
    private Date NgayMuon;
    private Date NgayTra;
    private int TinhTrang;

    public PhieuMuon()
    {
        
    }
    
    public PhieuMuon(String MaPhieuMuon, String MaDocGia, String MaNhanVien, Date NgayMuon, Date NgayTra, int TinhTrang) {
        this.MaPhieuMuon = MaPhieuMuon;
        this.MaDocGia = MaDocGia;
        this.MaNhanVien = MaNhanVien;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.TinhTrang = TinhTrang;
    }

    public String getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(String MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(String MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(Date NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public int getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(int TinhTrang) {
        this.TinhTrang = TinhTrang;
    }
    
    
    
}
