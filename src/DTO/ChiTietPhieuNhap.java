
package DTO;

public class ChiTietPhieuNhap {
    private String MaPhieuNhap;
    private String MaSach;
    private int SoLuong;
    private float DonGia;

    public ChiTietPhieuNhap()
    {
        
    }
    
    public ChiTietPhieuNhap(String MaPhieuNhap, String MaSach, int SoLuong, float DonGia) {
        this.MaPhieuNhap = MaPhieuNhap;
        this.MaSach = MaSach;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaPhieuNhap() {
        return MaPhieuNhap;
    }

    public void setMaPhieuNhap(String MaPhieuNhap) {
        this.MaPhieuNhap = MaPhieuNhap;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }
    
    
    
}
