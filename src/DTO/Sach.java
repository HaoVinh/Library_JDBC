
package DTO;
public class Sach {
    private String MaSach;
    private String TenSach;
    private String MaTheLoai;
    private String MaNXB;
    private String MaTacGia;
    private int SoLuongCon;
    private String ThongTinSach;

    public Sach(String MaSach, String TenSach, String MaTheLoai, String MaNXB, String MaTacGia, int SoLuongCon, String ThongTinSach) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.MaTheLoai = MaTheLoai;
        this.MaNXB = MaNXB;
        this.MaTacGia = MaTacGia;
        this.SoLuongCon = SoLuongCon;
        this.ThongTinSach = ThongTinSach;
    }
    
    public Sach()
    {
        
    }

    @Override
    public String toString() {
        return "Sach{" + "MaSach=" + MaSach + ", TenSach=" + TenSach + ", MaTheLoai=" + MaTheLoai + ", MaNXB=" + MaNXB + ", MaTacGia=" + MaTacGia + ", SoLuongCon=" + SoLuongCon + ", ThongTinSach=" + ThongTinSach + '}';
    }
    
    public String getThongTinSach() {
        return ThongTinSach;
    }

    public void setThongTinSach(String ThongTinSach) {
        this.ThongTinSach = ThongTinSach;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getMaTheLoai() {
        return MaTheLoai;
    }

    public void setMaTheLoai(String MaTheLoai) {
        this.MaTheLoai = MaTheLoai;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public String getMaTacGia() {
        return MaTacGia;
    }

    public void setMaTacGia(String MaTacGia) {
        this.MaTacGia = MaTacGia;
    }

    public int getSoLuongCon() {
        return SoLuongCon;
    }

    public void setSoLuongCon(int SoLuongCon) {
        this.SoLuongCon = SoLuongCon;
    }
    
    
    
    
}
