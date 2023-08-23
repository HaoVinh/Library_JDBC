package DTO;


public class TaiKhoan {
    private String MaTaiKhoan;
    private String MaNhanVien;
    private String TenTaiKhoan;
    private String MatKhau;
    private int Quyen;

    public TaiKhoan()
    {
        
    }

    public TaiKhoan(String MaTaiKhoan, String MaNhanVien, String TenTaiKhoan, String MatKhau, int Quyen) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.MaNhanVien = MaNhanVien;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.Quyen = Quyen;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getQuyen() {
        return Quyen;
    }

    public void setQuyen(int Quyen) {
        this.Quyen = Quyen;
    }
    
    
    
}
