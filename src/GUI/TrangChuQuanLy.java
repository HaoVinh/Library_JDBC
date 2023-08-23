

package GUI;

import DTO.NhaCungCap;
import DTO.PhieuNhap;
import DTO.Sach;
import DTO.TheLoai;
import DTO.ChiTietPhieuNhap;
import DTO.CheckLoi;
import DTO.DocGia;
import DTO.NhanVien;
import DTO.PhieuMuon;
import DTO.ChiTietPhieuMuon;
import DTO.Excel;
import DTO.NhaXuatBan;
import DTO.TacGia;

import BUS.NhaCungCap_Service;
import BUS.Sach_Service;
import BUS.PhieuNhap_Service;
import BUS.ChiTietPhieuNhap_Service;
import BUS.TheLoai_Service;
import BUS.DocGia_Service;
import BUS.ThongKe_Service;
import BUS.NhanVien_Service;
import BUS.PhieuMuon_Service;
import BUS.ChiTietPhieuMuon_Service;
import BUS.TacGia_Service;
import BUS.NhaXuatBan_Service;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.*;

public class TrangChuQuanLy extends javax.swing.JFrame {

    private final NhaCungCap_Service nhaCungCap_Service=new NhaCungCap_Service();
    private final NhanVien_Service nhanVien_Service=new NhanVien_Service();
    private final Sach_Service sach_Service=new Sach_Service();
    private final TheLoai_Service theLoai_Service=new TheLoai_Service();
    private final PhieuNhap_Service phieuNhap_Service=new PhieuNhap_Service();
    private final ChiTietPhieuNhap_Service chiTietPhieuNhap_Service=new ChiTietPhieuNhap_Service();
    private final DocGia_Service  docGia_Service=new DocGia_Service();
    private final ThongKe_Service thongKe_Service=new ThongKe_Service();
    private final PhieuMuon_Service phieuMuon_Service=new PhieuMuon_Service();
    private final ChiTietPhieuMuon_Service chiTietPhieuMuon_Service=new ChiTietPhieuMuon_Service();
    private final TacGia_Service tacGia_Service=new TacGia_Service();
    private final NhaXuatBan_Service nhaXuatBan_Service=new NhaXuatBan_Service();
    
    private final CheckLoi checkLoi=new CheckLoi();
    private final Excel excel=new Excel();
    
    private DefaultTableModel model_NhaCungCap=new DefaultTableModel();
    private DefaultTableModel model_PhieuNhap=new DefaultTableModel();
    private DefaultTableModel model_ChiTietPhieuNhap=new DefaultTableModel();
    private DefaultTableModel model_Sach=new DefaultTableModel();
    private DefaultTableModel model_DocGia=new DefaultTableModel();
    private DefaultTableModel model_ThongKe_Sach=new DefaultTableModel();
    private DefaultTableModel model_NhanVien=new DefaultTableModel();
    private DefaultTableModel model_PhieuMuon=new DefaultTableModel();
    private DefaultTableModel model_ChiTietPhieuMuon=new DefaultTableModel();
    
    public TrangChuQuanLy() {
        initComponents();
        
        //khởi tạo dữ liệu ban đầu cho các table
        KhoiTao_tbl_QuanLyNhaCungCap();
        KhoiTao_tbl_QuanLyPhieuNhap();
        KhoiTao_tbl_QuanLyChiTietPhieuNhap();
        KhoiTao_tbl_Sach();
        KhoiTao_tbl_DocGia();
        KhoiTao_tbl_ThongKe_Sach();
        KhoiTao_tbl_NhanVien();
        KhoiTao_tbl_PhieuMuon();
        KhoiTao_tbl_ChiTietPhieuMuon();
        
        //set dữ liệu cho combobox
        set_PhieuNhap_cbb_MaNhanVien();
        set_PhieuNhap_cbb_MaNhaCungCap();
        set_ChiTietPhieuNhap_cbb_MaPhieuNhap();
        set_Sach_cbb_MaTheLoai();
        set_Sach_cbb_MaNhaXuatBan();
        set_Sach_cbb_MaTacGia();
        set_ChiTietPhieuNhap_cbb_MaSach();
        set_PhieuMuon_cbb_MaNhanVien();
        set_PhieuMuon_cbb_MaDocGia();
        
        set_PhieuMuon2_cbb_MaPhieuMuon();
        set_PhieuMuon2_cbb_MaSach();
        set_ChiTietPhieuMuon_cbb_MaPhieuMuon();
        set_ChiTietPhieuMuon_cbb_MaSach();
        
        set_PhieuMuon_TrangThai();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_GioiTinh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Panel_NhaCungCap = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NhaCungCap_MaNhaCungCap = new javax.swing.JTextField();
        txt_NhaCungCap_TenNhaCungCap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_NhaCungCap_DiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_NhaCungCap_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_NhaCungCap_SDT = new javax.swing.JTextField();
        btn_NhaCungCap_Them = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_NhaCungCap = new javax.swing.JTable();
        btn_NhaCungCap_Xoa = new javax.swing.JButton();
        btn_NhaCungCap_Sua = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_NhaCungCap_TimKiem = new javax.swing.JTextField();
        cbb_NhaCungCap_Xoa = new javax.swing.JComboBox<>();
        txt_NhaCungCap_Xoa = new javax.swing.JTextField();
        cbb_NhaCungCap_TimKiem = new javax.swing.JComboBox<>();
        btn_NhaCungCap_Excel = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        Panel_PhieuNhap = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_PhieuNhap_MaPhieuNhap = new javax.swing.JTextField();
        txt_PhieuNhap_ThanhTien = new javax.swing.JTextField();
        Date_PhieuNhap_NgayNhap = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_PhieuNhap = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txt_PhieuNhap_TimKiem = new javax.swing.JTextField();
        cbb_PhieuNhap_TimKiem = new javax.swing.JComboBox<>();
        btn_PhieuNhap_Them = new javax.swing.JButton();
        btn_PhieuNhap_Xoa = new javax.swing.JButton();
        cbb_PhieuNhap_Xoa = new javax.swing.JComboBox<>();
        btn_PhieuNhap_Sua = new javax.swing.JButton();
        txt_PhieuNhap_Xoa = new javax.swing.JTextField();
        btn_PhieuNhap_Excel = new javax.swing.JButton();
        cbb_PhieuNhap_MaNhaCungCap = new javax.swing.JComboBox<>();
        cbb_PhieuNhap_MaNhanVien = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        Panel_ChiTietPhieuNhap = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbb_ChiTietPhieuNhap_MaPhieuNhap = new javax.swing.JComboBox<>();
        cbb_ChiTietPhieuNhap_MaSach = new javax.swing.JComboBox<>();
        Spinner_ChiTietPhieuNhap_SoLuong = new javax.swing.JSpinner();
        txt_ChiTietPhieuNhap_DonGia = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_ChiTietPhieuNhap = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        txt_ChiTietPhieuNhap_TimKiem = new javax.swing.JTextField();
        cbb_ChiTietPhieuNhap_TimKiem = new javax.swing.JComboBox<>();
        btn_ChiTietPhieuNhap_Them = new javax.swing.JButton();
        btn_ChiTietPhieuNhap_Xoa = new javax.swing.JButton();
        cbb_ChiTietPhieuNhap_Xoa = new javax.swing.JComboBox<>();
        btn_ChiTietPhieuNhap_Sua = new javax.swing.JButton();
        btn_ChiTietPhieuNhap_Excel = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        Panel_Sach = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Sach = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txt_Sach_TimKiem = new javax.swing.JTextField();
        cbb_Sach_TimKiem = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_Sach_ThongTinSach = new javax.swing.JTextArea();
        txt_Sach_TenSach = new javax.swing.JTextField();
        cbb_Sach_MaTheLoai = new javax.swing.JComboBox<>();
        txt_Sach_TenTheLoai = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        cbb_Sach_MaTacGia = new javax.swing.JComboBox<>();
        txt_Sach_TenTacGia = new javax.swing.JTextField();
        cbb_Sach_MaNhaXuatBan = new javax.swing.JComboBox<>();
        btn_Sach_Them = new javax.swing.JButton();
        btn_Sach_Xoa = new javax.swing.JButton();
        cbb_Sach_Xoa = new javax.swing.JComboBox<>();
        btn_Sach_Sua = new javax.swing.JButton();
        btn_Sach_Excel = new javax.swing.JButton();
        txt_Sach_Xoa = new javax.swing.JTextField();
        txt_Sach_TenNhaXuatBan = new javax.swing.JTextField();
        txt_Sach_MaSach = new javax.swing.JTextField();
        Spinner_Sach_SoLuong = new javax.swing.JSpinner();
        jLabel44 = new javax.swing.JLabel();
        Panel_DocGia = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txt_DocGia_MaDocGia = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_DocGia = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        txt_DocGia_TimKiem = new javax.swing.JTextField();
        cbb_DocGia_TimKiem = new javax.swing.JComboBox<>();
        txt_DocGia_TenDocGia = new javax.swing.JTextField();
        rdbtn_DocGia_Nu = new javax.swing.JRadioButton();
        rdbtn_DocGia_Nam = new javax.swing.JRadioButton();
        txt_DocGia_SDT = new javax.swing.JTextField();
        txt_DocGia_DiaChi = new javax.swing.JTextField();
        Date_DocGia_NgaySinh = new com.toedter.calendar.JDateChooser();
        btn_DocGia_Them = new javax.swing.JButton();
        btn_DocGia_Sua = new javax.swing.JButton();
        btn_DocGia_Excel = new javax.swing.JButton();
        btn_DocGia_Xoa = new javax.swing.JButton();
        cbb_DocGia_Xoa = new javax.swing.JComboBox<>();
        txt_DocGia_Xoa = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_ThongKe_Sach = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        cbb_ThongKeSach_TimKiem = new javax.swing.JComboBox<>();
        Date_ThongKeSach_TimKiem = new com.toedter.calendar.JDateChooser();
        btn_ThongKeSach_TimKiem = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_ThongKe_DocGia = new javax.swing.JTable();
        jLabel43 = new javax.swing.JLabel();
        cbb_ThongKeDocGia_TimKiem = new javax.swing.JComboBox<>();
        Date_ThongKeDocGia_TimKiem = new com.toedter.calendar.JDateChooser();
        btn_ThongKeDocGia_TimKiem = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txt_NhanVien_TimKiem = new javax.swing.JTextField();
        cbb_NhanVien_TimKiem = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txt_NhanVien_MaNhanVien = new javax.swing.JTextField();
        txt_NhanVien_QueQuan = new javax.swing.JTextField();
        Date_NhanVien_NgaySinh = new com.toedter.calendar.JDateChooser();
        cbb_NhanVien_GioiTinh = new javax.swing.JComboBox<>();
        txt_NhanVien_TenNhanVien = new javax.swing.JTextField();
        txt_NhanVien_Email = new javax.swing.JTextField();
        txt_NhanVien_SDT = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_NhanVien_GhiChu = new javax.swing.JTextArea();
        btn_NhanVien_Them = new javax.swing.JButton();
        btn_NhanVien_Sua = new javax.swing.JButton();
        btn_NhanVien_Excel = new javax.swing.JButton();
        btn_NhanVien_Xoa = new javax.swing.JButton();
        cbb_NhanVien_Xoa = new javax.swing.JComboBox<>();
        txt_NhanVien_Xoa = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_PhieuMuon = new javax.swing.JTable();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        txt_PhieuMuon_MaPhieuMuon = new javax.swing.JTextField();
        cbb_PhieuMuon_MaDocGia = new javax.swing.JComboBox<>();
        cbb_PhieuMuon_MaNhanVien = new javax.swing.JComboBox<>();
        Date_PhieuMuon_NgayMuon = new com.toedter.calendar.JDateChooser();
        Date_PhieuMuon_NgayTra = new com.toedter.calendar.JDateChooser();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        txt_PhieuMuon_TimKiem = new javax.swing.JTextField();
        cbb_PhieuMuon_TimKiem = new javax.swing.JComboBox<>();
        btn_PhieuMuon_Them = new javax.swing.JButton();
        btn_PhieuMuon_Sua = new javax.swing.JButton();
        btn_PhieuMuon_Xoa = new javax.swing.JButton();
        cbb_PhieuMuon_Xoa = new javax.swing.JComboBox<>();
        txt_PhieuMuon_Xoa = new javax.swing.JTextField();
        cbb_PhieuMuon_TinhTrang = new javax.swing.JComboBox<>();
        btn_PhieuMuon_Excel = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        Spinner_PhieuMuon2_SoLuong = new javax.swing.JSpinner();
        cbb_PhieuMuon2_MaPhieuMuon = new javax.swing.JComboBox<>();
        cbb_PhieuMuon2_MaSach = new javax.swing.JComboBox<>();
        btn_ChiTietPhieuMuon_Them = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tbl_ChiTietPhieuMuon = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txt_DocGia_TimKiem2 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        cbb_ChiTietPhieuMuon_MaPhieuMuon = new javax.swing.JComboBox<>();
        cbb_ChiTietPhieuMuon_MaSach = new javax.swing.JComboBox<>();
        Date_ChiTietPhieuMuon_NgayTra = new com.toedter.calendar.JDateChooser();
        txt_ChiTietPhieuMuon_TienPhat = new javax.swing.JTextField();
        btn_ChiTietPhieuMuon_Sua = new javax.swing.JButton();
        btn_ChiTietPhieuMuon_Excel = new javax.swing.JButton();
        btn_ChiTietPhieuMuon_Xoa = new javax.swing.JButton();
        cbb_ChiTietPhieuMuon_Xoa = new javax.swing.JComboBox<>();
        txt_ChiTietPhieuMuon_Xoa = new javax.swing.JTextField();
        cbb_ChiTietPhieuMuon_TinhTrangSach = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        Spinner_ChiTietPhieuMuon_SoLuong = new javax.swing.JSpinner();
        btn_ChiTietPhieuMuon_Tra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_DangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_NhaCungCap.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel3.setText("Mã nhà cung cấp:");
        jLabel3.setFocusable(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel4.setText("Tên nhà cung cấp:");
        jLabel4.setFocusable(false);

        txt_NhaCungCap_MaNhaCungCap.setEnabled(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TacGia_DiaChi_25px.png"))); // NOI18N
        jLabel5.setText("Địa chỉ:");
        jLabel5.setFocusable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Email(Chung)_25px_2.png"))); // NOI18N
        jLabel6.setText("Email:");
        jLabel6.setFocusable(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_DienThoai_25px.png"))); // NOI18N
        jLabel7.setText("Số điện thoại:");
        jLabel7.setFocusable(false);

        btn_NhaCungCap_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_NhaCungCap_Them.setText("Thêm");
        btn_NhaCungCap_Them.setFocusable(false);
        btn_NhaCungCap_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhaCungCap_ThemActionPerformed(evt);
            }
        });

        tbl_NhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Email", "Số điện thoại"
            }
        ));
        tbl_NhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_NhaCungCap);

        btn_NhaCungCap_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_NhaCungCap_Xoa.setText("Xóa");
        btn_NhaCungCap_Xoa.setFocusable(false);
        btn_NhaCungCap_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhaCungCap_XoaActionPerformed(evt);
            }
        });

        btn_NhaCungCap_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_NhaCungCap_Sua.setText("Sửa");
        btn_NhaCungCap_Sua.setFocusable(false);
        btn_NhaCungCap_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhaCungCap_SuaActionPerformed(evt);
            }
        });

        jLabel8.setText("Từ khóa:");
        jLabel8.setFocusable(false);

        txt_NhaCungCap_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_NhaCungCap_TimKiemCaretUpdate(evt);
            }
        });

        cbb_NhaCungCap_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà cung cấp", "Tên nhà cung cấp", "Dòng được chọn" }));

        cbb_NhaCungCap_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà cung cấp", "Tên nhà cung cấp", "Không có" }));

        btn_NhaCungCap_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_NhaCungCap_Excel.setText("Excel");
        btn_NhaCungCap_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhaCungCap_ExcelActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel68.setText("Tìm kiếm");

        javax.swing.GroupLayout Panel_NhaCungCapLayout = new javax.swing.GroupLayout(Panel_NhaCungCap);
        Panel_NhaCungCap.setLayout(Panel_NhaCungCapLayout);
        Panel_NhaCungCapLayout.setHorizontalGroup(
            Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                        .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_NhaCungCap_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                            .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_NhaCungCapLayout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18))
                                                .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addGap(71, 71, 71)))
                                            .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_NhaCungCap_TenNhaCungCap)
                                                .addComponent(txt_NhaCungCap_DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                                    .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel68)))
                                .addGap(67, 67, 67)
                                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_NhaCungCap_Them)
                                    .addComponent(jLabel7)
                                    .addComponent(btn_NhaCungCap_Sua)
                                    .addComponent(jLabel6)))
                            .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_NhaCungCap_SDT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txt_NhaCungCap_Email))
                            .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                        .addComponent(btn_NhaCungCap_Xoa)
                                        .addGap(37, 37, 37)
                                        .addComponent(cbb_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                                        .addComponent(txt_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_NhaCungCap_Excel)))))
                        .addGap(0, 183, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        Panel_NhaCungCapLayout.setVerticalGroup(
            Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_NhaCungCap_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_NhaCungCap_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_NhaCungCap_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NhaCungCap_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_NhaCungCap_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NhaCungCap_Them)
                    .addComponent(btn_NhaCungCap_Xoa)
                    .addComponent(cbb_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_NhaCungCap_Sua)
                            .addComponent(txt_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_NhaCungCap_Excel))
                        .addGap(28, 28, 28)
                        .addGroup(Panel_NhaCungCapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_NhaCungCapLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel68)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Quản Lý Nhà cung cấp", Panel_NhaCungCap);

        Panel_PhieuNhap.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel1.setText("Mã phiếu nhập:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel2.setText("Mã nhà cung cấp:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel10.setText("Mã nhân viên:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_schedule_25px.png"))); // NOI18N
        jLabel11.setText("Ngày Nhập:");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_money_25px.png"))); // NOI18N
        jLabel12.setText("Thành tiền:");

        txt_PhieuNhap_MaPhieuNhap.setEnabled(false);

        txt_PhieuNhap_ThanhTien.setEnabled(false);

        Date_PhieuNhap_NgayNhap.setDateFormatString("yyyy-MM-dd");

        tbl_PhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu nhập", "Mã nhân viên", "Mã nhà cung cấp", "Ngày nhập", "Thành tiền"
            }
        ));
        tbl_PhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_PhieuNhap);

        jLabel14.setText("Từ khóa:");
        jLabel14.setFocusable(false);

        txt_PhieuNhap_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_PhieuNhap_TimKiemCaretUpdate(evt);
            }
        });

        cbb_PhieuNhap_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu nhập", "Không có" }));

        btn_PhieuNhap_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_PhieuNhap_Them.setText("Thêm");
        btn_PhieuNhap_Them.setFocusable(false);
        btn_PhieuNhap_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuNhap_ThemActionPerformed(evt);
            }
        });

        btn_PhieuNhap_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_PhieuNhap_Xoa.setText("Xóa");
        btn_PhieuNhap_Xoa.setFocusable(false);
        btn_PhieuNhap_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuNhap_XoaActionPerformed(evt);
            }
        });

        cbb_PhieuNhap_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu nhập", "Dòng được chọn" }));

        btn_PhieuNhap_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_PhieuNhap_Sua.setText("Sửa");
        btn_PhieuNhap_Sua.setFocusable(false);
        btn_PhieuNhap_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuNhap_SuaActionPerformed(evt);
            }
        });

        btn_PhieuNhap_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_PhieuNhap_Excel.setText("Excel");
        btn_PhieuNhap_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuNhap_ExcelActionPerformed(evt);
            }
        });

        cbb_PhieuNhap_MaNhaCungCap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbb_PhieuNhap_MaNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel75.setText("Tìm kiếm");

        javax.swing.GroupLayout Panel_PhieuNhapLayout = new javax.swing.GroupLayout(Panel_PhieuNhap);
        Panel_PhieuNhap.setLayout(Panel_PhieuNhapLayout);
        Panel_PhieuNhapLayout.setHorizontalGroup(
            Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txt_PhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbb_PhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
            .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_PhieuNhap_MaPhieuNhap)
                            .addComponent(txt_PhieuNhap_ThanhTien)
                            .addComponent(Date_PhieuNhap_NgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cbb_PhieuNhap_MaNhaCungCap, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbb_PhieuNhap_MaNhanVien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_PhieuNhap_Excel)
                            .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_PhieuNhap_Them)
                                    .addComponent(btn_PhieuNhap_Sua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_PhieuNhap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                                        .addComponent(btn_PhieuNhap_Xoa)
                                        .addGap(32, 32, 32)
                                        .addComponent(cbb_PhieuNhap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel75)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel_PhieuNhapLayout.setVerticalGroup(
            Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_PhieuNhap_MaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbb_PhieuNhap_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbb_PhieuNhap_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(23, 23, 23)
                                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_PhieuNhap_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Date_PhieuNhap_NgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                        .addComponent(btn_PhieuNhap_Them)
                        .addGap(30, 30, 30)
                        .addComponent(btn_PhieuNhap_Sua)
                        .addGap(30, 30, 30)
                        .addComponent(btn_PhieuNhap_Excel))
                    .addGroup(Panel_PhieuNhapLayout.createSequentialGroup()
                        .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_PhieuNhap_Xoa)
                            .addComponent(cbb_PhieuNhap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(txt_PhieuNhap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addGroup(Panel_PhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_PhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_PhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý phiếu nhập", Panel_PhieuNhap);

        Panel_ChiTietPhieuNhap.setBackground(new java.awt.Color(204, 204, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel15.setText("Mã phiếu nhập:");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel17.setText("Mã sách:");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_estimates_25px.png"))); // NOI18N
        jLabel18.setText("Số lượng:");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_money_25px.png"))); // NOI18N
        jLabel19.setText("Đơn giá:");

        cbb_ChiTietPhieuNhap_MaPhieuNhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbb_ChiTietPhieuNhap_MaSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbl_ChiTietPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã phiếu nhập", "Mã sách", "Số lượng", "Đơn giá"
            }
        ));
        tbl_ChiTietPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ChiTietPhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_ChiTietPhieuNhap);

        jLabel20.setText("Từ khóa:");
        jLabel20.setFocusable(false);

        txt_ChiTietPhieuNhap_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_ChiTietPhieuNhap_TimKiemCaretUpdate(evt);
            }
        });

        cbb_ChiTietPhieuNhap_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu nhập", "Không có" }));

        btn_ChiTietPhieuNhap_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_ChiTietPhieuNhap_Them.setText("Thêm");
        btn_ChiTietPhieuNhap_Them.setFocusable(false);
        btn_ChiTietPhieuNhap_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuNhap_ThemActionPerformed(evt);
            }
        });

        btn_ChiTietPhieuNhap_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_ChiTietPhieuNhap_Xoa.setText("Xóa");
        btn_ChiTietPhieuNhap_Xoa.setFocusable(false);
        btn_ChiTietPhieuNhap_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuNhap_XoaActionPerformed(evt);
            }
        });

        cbb_ChiTietPhieuNhap_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dòng được chọn" }));

        btn_ChiTietPhieuNhap_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_ChiTietPhieuNhap_Sua.setText("Sửa");
        btn_ChiTietPhieuNhap_Sua.setFocusable(false);
        btn_ChiTietPhieuNhap_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuNhap_SuaActionPerformed(evt);
            }
        });

        btn_ChiTietPhieuNhap_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_ChiTietPhieuNhap_Excel.setText("Excel");
        btn_ChiTietPhieuNhap_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuNhap_ExcelActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel76.setText("Tìm kiếm");

        javax.swing.GroupLayout Panel_ChiTietPhieuNhapLayout = new javax.swing.GroupLayout(Panel_ChiTietPhieuNhap);
        Panel_ChiTietPhieuNhap.setLayout(Panel_ChiTietPhieuNhapLayout);
        Panel_ChiTietPhieuNhapLayout.setHorizontalGroup(
            Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ChiTietPhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbb_ChiTietPhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3)
                        .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                            .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19))
                            .addGap(18, 18, 18)
                            .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbb_ChiTietPhieuNhap_MaPhieuNhap, 0, 141, Short.MAX_VALUE)
                                .addComponent(cbb_ChiTietPhieuNhap_MaSach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Spinner_ChiTietPhieuNhap_SoLuong)
                                .addComponent(txt_ChiTietPhieuNhap_DonGia))
                            .addGap(111, 111, 111)
                            .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_ChiTietPhieuNhap_Excel)
                                .addComponent(btn_ChiTietPhieuNhap_Sua)
                                .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                                    .addComponent(btn_ChiTietPhieuNhap_Them)
                                    .addGap(85, 85, 85)
                                    .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                                            .addComponent(btn_ChiTietPhieuNhap_Xoa)
                                            .addGap(18, 18, 18)
                                            .addComponent(cbb_ChiTietPhieuNhap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(0, 123, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
            .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel76)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_ChiTietPhieuNhapLayout.setVerticalGroup(
            Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                        .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cbb_ChiTietPhieuNhap_MaPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(cbb_ChiTietPhieuNhap_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(Spinner_ChiTietPhieuNhap_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(txt_ChiTietPhieuNhap_DonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel_ChiTietPhieuNhapLayout.createSequentialGroup()
                        .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ChiTietPhieuNhap_Them)
                            .addComponent(btn_ChiTietPhieuNhap_Xoa)
                            .addComponent(cbb_ChiTietPhieuNhap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btn_ChiTietPhieuNhap_Sua)
                        .addGap(30, 30, 30)
                        .addComponent(btn_ChiTietPhieuNhap_Excel)))
                .addGap(31, 31, 31)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ChiTietPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_ChiTietPhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_ChiTietPhieuNhap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Quản lý chi tiết phiếu nhập", Panel_ChiTietPhieuNhap);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel22.setText("Mã sách:");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_book_25px.png"))); // NOI18N
        jLabel23.setText("Tên sách:");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel24.setText("Mã thể loại:");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_token_card_code_25px.png"))); // NOI18N
        jLabel25.setText("Tên thể loại:");

        tbl_Sach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Mã thể loại", "Mã tác giả", "Mã nhà xuất bản", "Số lượng còn", "Thông tin sách"
            }
        ));
        tbl_Sach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SachMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_Sach);

        jLabel26.setText("Từ khóa:");
        jLabel26.setFocusable(false);

        txt_Sach_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_Sach_TimKiemCaretUpdate(evt);
            }
        });

        cbb_Sach_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Không có" }));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_GhiChu_25px.png"))); // NOI18N
        jLabel27.setText("Thông tin sách:");

        txt_Sach_ThongTinSach.setColumns(20);
        txt_Sach_ThongTinSach.setRows(5);
        jScrollPane5.setViewportView(txt_Sach_ThongTinSach);

        cbb_Sach_MaTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_Sach_MaTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_Sach_MaTheLoaiActionPerformed(evt);
            }
        });

        txt_Sach_TenTheLoai.setEnabled(false);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel28.setText("Mã tác giả:");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel29.setText("Tên tác giả:");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel30.setText("Mã nhà xuất bản:");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel31.setText("Tên nhà xuất bản:");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_estimates_25px.png"))); // NOI18N
        jLabel32.setText("Số lượng:");

        cbb_Sach_MaTacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_Sach_MaTacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_Sach_MaTacGiaActionPerformed(evt);
            }
        });

        txt_Sach_TenTacGia.setEnabled(false);

        cbb_Sach_MaNhaXuatBan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_Sach_MaNhaXuatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_Sach_MaNhaXuatBanActionPerformed(evt);
            }
        });

        btn_Sach_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_Sach_Them.setText("Thêm");
        btn_Sach_Them.setFocusable(false);
        btn_Sach_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sach_ThemActionPerformed(evt);
            }
        });

        btn_Sach_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_Sach_Xoa.setText("Xóa");
        btn_Sach_Xoa.setFocusable(false);
        btn_Sach_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sach_XoaActionPerformed(evt);
            }
        });

        cbb_Sach_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Dòng được chọn" }));

        btn_Sach_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_Sach_Sua.setText("Sửa");
        btn_Sach_Sua.setFocusable(false);
        btn_Sach_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sach_SuaActionPerformed(evt);
            }
        });

        btn_Sach_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_Sach_Excel.setText("Excel");
        btn_Sach_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sach_ExcelActionPerformed(evt);
            }
        });

        txt_Sach_TenNhaXuatBan.setEnabled(false);

        txt_Sach_MaSach.setEnabled(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel44.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane5)
                                    .addComponent(cbb_Sach_MaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Sach_TenTheLoai)
                                    .addComponent(txt_Sach_TenSach)
                                    .addComponent(txt_Sach_MaSach)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel44)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Sach_Sua)
                                    .addComponent(btn_Sach_Them))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Sach_Excel)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btn_Sach_Xoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbb_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(62, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel30))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbb_Sach_MaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Sach_TenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbb_Sach_MaNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel32))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Sach_TenNhaXuatBan)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(Spinner_Sach_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel28)
                    .addComponent(cbb_Sach_MaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sach_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Sach_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29)
                        .addComponent(txt_Sach_TenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(cbb_Sach_MaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(cbb_Sach_MaNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Sach_TenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31)
                        .addComponent(txt_Sach_TenNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel27)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Spinner_Sach_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Sach_Them)
                            .addComponent(btn_Sach_Xoa)
                            .addComponent(cbb_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Sach_Sua)
                    .addComponent(btn_Sach_Excel)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txt_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Panel_SachLayout = new javax.swing.GroupLayout(Panel_Sach);
        Panel_Sach.setLayout(Panel_SachLayout);
        Panel_SachLayout.setHorizontalGroup(
            Panel_SachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_SachLayout.setVerticalGroup(
            Panel_SachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý sách", Panel_Sach);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel33.setText("Mã độc giả:");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel35.setText("Tên độc giả:");

        txt_DocGia_MaDocGia.setEnabled(false);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_GioiTinh(Chung)_25px_2.png"))); // NOI18N
        jLabel36.setText("Giới tính:");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_DienThoai_25px.png"))); // NOI18N
        jLabel37.setText("Số điện thoại:");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TacGia_DiaChi_25px.png"))); // NOI18N
        jLabel38.setText("Địa chỉ:");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NgaySinh(Chung)_25px.png"))); // NOI18N
        jLabel39.setText("Ngày sinh:");

        tbl_DocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã độc giả", "Tên độc giả", "Địa chỉ", "Giới tính", "Ngày sinh", "Số điện thoại"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_DocGiaMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_DocGia);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel40.setText("Tìm kiếm");

        jLabel41.setText("Từ khóa:");

        txt_DocGia_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_DocGia_TimKiemCaretUpdate(evt);
            }
        });

        cbb_DocGia_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã độc giả", "Tên độc giả", "Không có" }));

        btnGroup_GioiTinh.add(rdbtn_DocGia_Nu);
        rdbtn_DocGia_Nu.setText("Nữ");

        btnGroup_GioiTinh.add(rdbtn_DocGia_Nam);
        rdbtn_DocGia_Nam.setSelected(true);
        rdbtn_DocGia_Nam.setText("Nam");

        Date_DocGia_NgaySinh.setDateFormatString("yyyy-MM-dd");

        btn_DocGia_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_DocGia_Them.setText("Thêm");
        btn_DocGia_Them.setFocusable(false);
        btn_DocGia_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocGia_ThemActionPerformed(evt);
            }
        });

        btn_DocGia_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_DocGia_Sua.setText("Sửa");
        btn_DocGia_Sua.setFocusable(false);
        btn_DocGia_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocGia_SuaActionPerformed(evt);
            }
        });

        btn_DocGia_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_DocGia_Excel.setText("Excel");
        btn_DocGia_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocGia_ExcelActionPerformed(evt);
            }
        });

        btn_DocGia_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_DocGia_Xoa.setText("Xóa");
        btn_DocGia_Xoa.setFocusable(false);
        btn_DocGia_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DocGia_XoaActionPerformed(evt);
            }
        });

        cbb_DocGia_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã độc giả", "Tên độc giả", "Dòng được chọn" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txt_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cbb_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel40)))
                        .addContainerGap(534, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(rdbtn_DocGia_Nam)
                                        .addGap(52, 52, 52)
                                        .addComponent(rdbtn_DocGia_Nu))
                                    .addComponent(txt_DocGia_MaDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txt_DocGia_TenDocGia)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DocGia_SDT)
                                    .addComponent(txt_DocGia_DiaChi)
                                    .addComponent(Date_DocGia_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(btn_DocGia_Excel)
                                .addGap(277, 277, 277))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_DocGia_Them)
                                    .addComponent(btn_DocGia_Sua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btn_DocGia_Xoa)
                                        .addGap(32, 32, 32)
                                        .addComponent(cbb_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(95, 95, 95))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txt_DocGia_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_DocGia_TenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtn_DocGia_Nam)
                            .addComponent(rdbtn_DocGia_Nu)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(txt_DocGia_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(txt_DocGia_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_DocGia_Xoa)
                                .addComponent(cbb_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(txt_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(btn_DocGia_Them)
                            .addGap(30, 30, 30)
                            .addComponent(btn_DocGia_Sua)
                            .addGap(30, 30, 30)
                            .addComponent(btn_DocGia_Excel))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(Date_DocGia_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cbb_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_DocGiaLayout = new javax.swing.GroupLayout(Panel_DocGia);
        Panel_DocGia.setLayout(Panel_DocGiaLayout);
        Panel_DocGiaLayout.setHorizontalGroup(
            Panel_DocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_DocGiaLayout.setVerticalGroup(
            Panel_DocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý độc giả", Panel_DocGia);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 204));

        tbl_ThongKe_Sach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Ngày", "Số lượng"
            }
        ));
        jScrollPane7.setViewportView(tbl_ThongKe_Sach);

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 153, 153));
        jLabel42.setText("Lựa chọn:");

        cbb_ThongKeSach_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbb_ThongKeSach_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sách được mượn nhiều nhất theo ngày", "Sách được mượn nhiều nhất theo tháng" }));

        btn_ThongKeSach_TimKiem.setText("Lọc");
        btn_ThongKeSach_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongKeSach_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ThongKeSach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cbb_ThongKeSach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Date_ThongKeSach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_ThongKeSach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(cbb_ThongKeSach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_ThongKeSach_TimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        jTabbedPane2.addTab("Thống Kê Sách", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 204));

        tbl_ThongKe_DocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã độc giả", "Tên độc giả", "Số sách mượn"
            }
        ));
        jScrollPane8.setViewportView(tbl_ThongKe_DocGia);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 153, 153));
        jLabel43.setText("Lựa chọn:");

        cbb_ThongKeDocGia_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbb_ThongKeDocGia_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Độc giả chưa trả sách", "Độc giả trễ hạn trả sách", "Độc giả mượn nhiều nhất theo ngày", "Độc giả mượn nhiều nhất theo tháng", "Độc giả có tiền phạt" }));

        Date_ThongKeDocGia_TimKiem.setDateFormatString("yyyy-MM-dd");

        btn_ThongKeDocGia_TimKiem.setText("Lọc");
        btn_ThongKeDocGia_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongKeDocGia_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbb_ThongKeDocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Date_ThongKeDocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(btn_ThongKeDocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 300, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Date_ThongKeDocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(cbb_ThongKeDocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ThongKeDocGia_TimKiem)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jTabbedPane2.addTab("Thống Kê Độc Giả", jPanel10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Thống kê", jPanel8);

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel45.setText("Mã nhân viên:");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel46.setText("Họ tên:");

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NgaySinh(Chung)_25px.png"))); // NOI18N
        jLabel48.setText("Ngày sinh:");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_GioiTinh(Chung)_25px_2.png"))); // NOI18N
        jLabel49.setText("Giới tính:");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_QueQuan(Chung)_25px.png"))); // NOI18N
        jLabel50.setText("Quê quán:");

        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Ngày sinh", "Điện thoại", "Email", "Giới tính ", "Quê quán", "Ghi Chú"
            }
        ));
        tbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhanVientbl_QuanLyNVMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tbl_NhanVien);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_DienThoai_25px.png"))); // NOI18N
        jLabel51.setText("Điện thoại:");

        jLabel54.setText("Từ khóa:");

        txt_NhanVien_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_NhanVien_TimKiemCaretUpdate(evt);
            }
        });

        cbb_NhanVien_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Tên nhân viên", "Không có" }));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_GhiChu_25px.png"))); // NOI18N
        jLabel52.setText("Ghi chú:");

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Email(Chung)_25px_2.png"))); // NOI18N
        jLabel55.setText("Email:");

        txt_NhanVien_MaNhanVien.setEnabled(false);

        Date_NhanVien_NgaySinh.setDateFormatString("yyyy-MM-dd");

        cbb_NhanVien_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam ", "Nữ" }));

        txt_NhanVien_GhiChu.setColumns(20);
        txt_NhanVien_GhiChu.setRows(5);
        jScrollPane9.setViewportView(txt_NhanVien_GhiChu);

        btn_NhanVien_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_NhanVien_Them.setText("Thêm");
        btn_NhanVien_Them.setFocusable(false);
        btn_NhanVien_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVien_ThemActionPerformed(evt);
            }
        });

        btn_NhanVien_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_NhanVien_Sua.setText("Sửa");
        btn_NhanVien_Sua.setFocusable(false);
        btn_NhanVien_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVien_SuaActionPerformed(evt);
            }
        });

        btn_NhanVien_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_NhanVien_Excel.setText("Excel");
        btn_NhanVien_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVien_ExcelActionPerformed(evt);
            }
        });

        btn_NhanVien_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_NhanVien_Xoa.setText("Xóa");
        btn_NhanVien_Xoa.setFocusable(false);
        btn_NhanVien_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhanVien_XoaActionPerformed(evt);
            }
        });

        cbb_NhanVien_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhân viên", "Tên nhân viên", "Dòng được chọn" }));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel53.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel49))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_NhanVien_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_NhanVien_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbb_NhanVien_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_NhanVien_QueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(50, 50, 50)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel51)
                                                    .addComponent(jLabel55)
                                                    .addComponent(jLabel48)))
                                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel52)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel53)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_NhanVien_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_NhanVien_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Date_NhanVien_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(btn_NhanVien_Sua)
                                        .addGap(40, 40, 40)
                                        .addComponent(txt_NhanVien_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(btn_NhanVien_Them)
                                        .addGap(40, 40, 40)
                                        .addComponent(btn_NhanVien_Xoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbb_NhanVien_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_NhanVien_Excel)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_NhanVien_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_NhanVien_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel51)
                    .addComponent(txt_NhanVien_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NhanVien_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel55)
                    .addComponent(txt_NhanVien_TenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NhanVien_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Date_NhanVien_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel48)
                        .addComponent(jLabel49)
                        .addComponent(cbb_NhanVien_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(txt_NhanVien_QueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_NhanVien_Them)
                            .addComponent(btn_NhanVien_Xoa)
                            .addComponent(cbb_NhanVien_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_NhanVien_Sua)
                            .addComponent(txt_NhanVien_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_NhanVien_Excel))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txt_NhanVien_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_NhanVien_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý nhân viên", jPanel11);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel47.setText("Mã phiếu mượn:");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel56.setText("Mã độc giả:");

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel57.setText("Mã nhân viên:");

        tbl_PhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn", "Mã Nhân viên", "Mã Độc Giả", "Ngày Mượn", "Ngày Trả", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_PhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PhieuMuonMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tbl_PhieuMuon);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_schedule_25px.png"))); // NOI18N
        jLabel58.setText("Ngày mượn:");

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_schedule_25px.png"))); // NOI18N
        jLabel59.setText("Ngày trả:");

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_terms_and_conditions_25px.png"))); // NOI18N
        jLabel60.setText("Tình trạng:");

        txt_PhieuMuon_MaPhieuMuon.setEnabled(false);

        cbb_PhieuMuon_MaDocGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbb_PhieuMuon_MaNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Date_PhieuMuon_NgayMuon.setDateFormatString("yyyy-MM-dd");

        Date_PhieuMuon_NgayTra.setDateFormatString("yyyy-MM-dd");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel61.setText("Tìm kiếm");

        jLabel62.setText("Từ khóa:");

        txt_PhieuMuon_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_PhieuMuon_TimKiemCaretUpdate(evt);
            }
        });

        cbb_PhieuMuon_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu mượn", "Không có" }));

        btn_PhieuMuon_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_PhieuMuon_Them.setText("Thêm");
        btn_PhieuMuon_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuMuon_ThemActionPerformed(evt);
            }
        });

        btn_PhieuMuon_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_PhieuMuon_Sua.setText("Sửa");
        btn_PhieuMuon_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuMuon_SuaActionPerformed(evt);
            }
        });

        btn_PhieuMuon_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_PhieuMuon_Xoa.setText("Xóa");
        btn_PhieuMuon_Xoa.setFocusable(false);
        btn_PhieuMuon_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuMuon_XoaActionPerformed(evt);
            }
        });

        cbb_PhieuMuon_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu mượn", "Dòng được chọn" }));

        cbb_PhieuMuon_TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chưa trả", "Đã trả" }));
        cbb_PhieuMuon_TinhTrang.setEnabled(false);

        btn_PhieuMuon_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_PhieuMuon_Excel.setText("Excel");
        btn_PhieuMuon_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuMuon_ExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_PhieuMuon_MaPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_PhieuMuon_NgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Date_PhieuMuon_NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_PhieuMuon_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbb_PhieuMuon_MaNhanVien, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbb_PhieuMuon_MaDocGia, javax.swing.GroupLayout.Alignment.LEADING, 0, 90, Short.MAX_VALUE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_PhieuMuon_Sua)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(btn_PhieuMuon_Them)
                                .addGap(27, 27, 27)
                                .addComponent(btn_PhieuMuon_Excel))
                            .addComponent(txt_PhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(btn_PhieuMuon_Xoa)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_PhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(txt_PhieuMuon_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbb_PhieuMuon_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel61)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txt_PhieuMuon_MaPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(cbb_PhieuMuon_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(cbb_PhieuMuon_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(Date_PhieuMuon_NgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_PhieuMuon_Xoa)
                            .addComponent(cbb_PhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_PhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(Date_PhieuMuon_NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_PhieuMuon_Them)
                        .addComponent(btn_PhieuMuon_Excel))
                    .addComponent(cbb_PhieuMuon_TinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_PhieuMuon_Sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txt_PhieuMuon_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_PhieuMuon_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel63.setText("Mã phiếu mượn:");

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel64.setText("Mã sách:");

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_estimates_25px.png"))); // NOI18N
        jLabel65.setText("Số lượng:");

        cbb_PhieuMuon2_MaPhieuMuon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbb_PhieuMuon2_MaSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_ChiTietPhieuMuon_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_ChiTietPhieuMuon_Them.setText("Thêm");
        btn_ChiTietPhieuMuon_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuMuon_ThemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Chi tiết phiếu mượn");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ChiTietPhieuMuon_Them)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Spinner_PhieuMuon2_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbb_PhieuMuon2_MaPhieuMuon, 0, 100, Short.MAX_VALUE)
                                        .addComponent(cbb_PhieuMuon2_MaSach, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel9)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addGap(51, 51, 51)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(cbb_PhieuMuon2_MaPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(cbb_PhieuMuon2_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Spinner_PhieuMuon2_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(34, 34, 34)
                .addComponent(btn_ChiTietPhieuMuon_Them)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý phiếu mượn", jPanel13);

        jPanel17.setBackground(new java.awt.Color(204, 204, 255));

        tbl_ChiTietPhieuMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phiếu Mượn", "Mã Sách", "Số Lượng", "Ngày Trả Thực Tế", "Tình Trạng Sách", "Tiền Phạt"
            }
        ));
        tbl_ChiTietPhieuMuon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ChiTietPhieuMuonMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tbl_ChiTietPhieuMuon);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel66.setText("Mã phiếu mượn:");

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel67.setText("Mã sách:");

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_schedule_25px.png"))); // NOI18N
        jLabel69.setText("Ngày trả:");

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_terms_and_conditions_25px.png"))); // NOI18N
        jLabel70.setText("Tình trạng sách:");

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_money_25px.png"))); // NOI18N
        jLabel71.setText("Tiền phạt:");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel72.setText("Tìm kiếm");

        jLabel73.setText("Từ khóa:");

        txt_DocGia_TimKiem2.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_DocGia_TimKiem2CaretUpdate(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã phiếu mượn" }));

        cbb_ChiTietPhieuMuon_MaPhieuMuon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_ChiTietPhieuMuon_MaPhieuMuon.setEnabled(false);

        cbb_ChiTietPhieuMuon_MaSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_ChiTietPhieuMuon_MaSach.setEnabled(false);

        txt_ChiTietPhieuMuon_TienPhat.setEnabled(false);

        btn_ChiTietPhieuMuon_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_ChiTietPhieuMuon_Sua.setText("Sửa");
        btn_ChiTietPhieuMuon_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuMuon_SuaActionPerformed(evt);
            }
        });

        btn_ChiTietPhieuMuon_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_ChiTietPhieuMuon_Excel.setText("Excel");
        btn_ChiTietPhieuMuon_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuMuon_ExcelActionPerformed(evt);
            }
        });

        btn_ChiTietPhieuMuon_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_ChiTietPhieuMuon_Xoa.setText("Xóa");
        btn_ChiTietPhieuMuon_Xoa.setFocusable(false);
        btn_ChiTietPhieuMuon_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuMuon_XoaActionPerformed(evt);
            }
        });

        cbb_ChiTietPhieuMuon_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dòng được chọn" }));

        cbb_ChiTietPhieuMuon_TinhTrangSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bình thường", "Hư hỏng" }));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_estimates_25px.png"))); // NOI18N
        jLabel74.setText("Số lượng sách:");

        btn_ChiTietPhieuMuon_Tra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_sell_25px.png"))); // NOI18N
        btn_ChiTietPhieuMuon_Tra.setText("Trả");
        btn_ChiTietPhieuMuon_Tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChiTietPhieuMuon_TraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addGap(18, 18, 18)
                                .addComponent(txt_DocGia_TimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel72))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel74))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Spinner_ChiTietPhieuMuon_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbb_ChiTietPhieuMuon_MaSach, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)
                                        .addComponent(cbb_ChiTietPhieuMuon_MaPhieuMuon, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txt_ChiTietPhieuMuon_TienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbb_ChiTietPhieuMuon_TinhTrangSach, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Date_ChiTietPhieuMuon_NgayTra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                .addGap(142, 142, 142)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_ChiTietPhieuMuon_Sua)
                                    .addComponent(btn_ChiTietPhieuMuon_Excel)
                                    .addComponent(btn_ChiTietPhieuMuon_Tra))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(btn_ChiTietPhieuMuon_Xoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbb_ChiTietPhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_ChiTietPhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 172, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(cbb_ChiTietPhieuMuon_MaPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(cbb_ChiTietPhieuMuon_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(Spinner_ChiTietPhieuMuon_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(Date_ChiTietPhieuMuon_NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel70)
                            .addComponent(cbb_ChiTietPhieuMuon_TinhTrangSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ChiTietPhieuMuon_Xoa)
                            .addComponent(cbb_ChiTietPhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_ChiTietPhieuMuon_Tra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ChiTietPhieuMuon_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btn_ChiTietPhieuMuon_Sua)
                        .addGap(11, 11, 11)))
                .addGap(19, 19, 19)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ChiTietPhieuMuon_TienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(btn_ChiTietPhieuMuon_Excel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(txt_DocGia_TimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý chi tiết phiếu mượn", jPanel16);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        btn_DangXuat.setText("Đăng xuất");
        btn_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_DangXuat)
                .addContainerGap(830, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btn_DangXuat)
                .addContainerGap(493, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đăng xuất", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NhaCungCap_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhaCungCap_ThemActionPerformed
        
        //phần check thông tin nhập vào
        if(txt_NhaCungCap_TenNhaCungCap.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Tên nhà cung cấp không được để trống");
            return;
        }
        if(txt_NhaCungCap_DiaChi.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Địa chỉ nhà cung cấp không được để trống");
            return;
        }
        if(txt_NhaCungCap_Email.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Email nhà cung cấp không được để trống");
            return;
        }
        if(txt_NhaCungCap_SDT.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Số điện thoại nhà cung cấp không được để trống");
            return;
        }
        
        NhaCungCap nhaCungCap=new NhaCungCap();
        nhaCungCap.setTenNhaCungCap(txt_NhaCungCap_TenNhaCungCap.getText());
        nhaCungCap.setDiaChi(txt_NhaCungCap_DiaChi.getText());
        nhaCungCap.setEmail(txt_NhaCungCap_Email.getText());
        nhaCungCap.setSDT(txt_NhaCungCap_SDT.getText());
        
        //đây là phần thực hiện thêm vào database
        nhaCungCap_Service.add_NhaCungCap(nhaCungCap, this);
        KhoiTao_tbl_QuanLyNhaCungCap();
        
        //sau khi thêm nhà cung cấp phải khởi tạo lại combobox nhà cung cấp bên phiếu nhập
        set_PhieuNhap_cbb_MaNhaCungCap();
        KhoiTao_tbl_QuanLyPhieuNhap();
        
    }//GEN-LAST:event_btn_NhaCungCap_ThemActionPerformed

    private void txt_NhaCungCap_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_NhaCungCap_TimKiemCaretUpdate
        
        //nếu tìm kiếm để trống set lại model cũ
        if(txt_NhaCungCap_TimKiem.getText().isBlank())
            tbl_NhaCungCap.setModel(model_NhaCungCap);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String Column[]={"Mã nhà cung cấp","Tên nhà cung cấp","Địa chỉ","Email","Số điện thoại"};
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_NhaCungCap_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã nhà cung cấp
            {
                ArrayList<NhaCungCap> DanhSachNhaCungCap = nhaCungCap_Service.get_NhaCungCap_ByMaNhaCungCap(txt_NhaCungCap_TimKiem.getText());
                for (NhaCungCap nhaCungCap : DanhSachNhaCungCap) 
                {
                    model_TimKiem.addRow(new Object[]{nhaCungCap.getMaNhaCungCap(),nhaCungCap.getTenNhaCungCap()
            ,nhaCungCap.getDiaChi(),nhaCungCap.getEmail(),nhaCungCap.getSDT()});
                }
                tbl_NhaCungCap.setModel(model_TimKiem);
            } 
            else if (cbb_NhaCungCap_TimKiem.getSelectedIndex() == 1)//đây là phần tìm theo tên nhà cung cấp
            {
                ArrayList<NhaCungCap> DanhSachNhaCungCap = nhaCungCap_Service.get_NhaCungCap_ByTenNhaCungCap(txt_NhaCungCap_TimKiem.getText());
                for (NhaCungCap nhaCungCap : DanhSachNhaCungCap) 
                {
                    model_TimKiem.addRow(new Object[]{nhaCungCap.getMaNhaCungCap(),nhaCungCap.getTenNhaCungCap()
            ,nhaCungCap.getDiaChi(),nhaCungCap.getEmail(),nhaCungCap.getSDT()});
                }
                tbl_NhaCungCap.setModel(model_TimKiem);
            }
            else
            {
                tbl_NhaCungCap.setModel(model_NhaCungCap);
            }
        }
        
    }//GEN-LAST:event_txt_NhaCungCap_TimKiemCaretUpdate

    private void btn_NhaCungCap_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhaCungCap_XoaActionPerformed
        
        if(cbb_NhaCungCap_Xoa.getSelectedIndex()==0)//xóa nhà cung cấp theo mã nhà cung cấp
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_NhaCungCap_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(this,"Thông tin cần xóa không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa nhà cung cấp
            nhaCungCap_Service.Xoa_NhaCungCap_ByMaNhaCungCap(txt_NhaCungCap_Xoa.getText(), this);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_QuanLyNhaCungCap();

            return;
        }
        
        if(cbb_NhaCungCap_Xoa.getSelectedIndex()==1)//xóa nhà cung cấp theo tên nhà cung cấp
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_NhaCungCap_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(this,"Thông tin cần xóa không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa sách
            nhaCungCap_Service.Xoa_NhaCungCap_ByTenNhaCungCap(txt_NhaCungCap_Xoa.getText(), this);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_QuanLyNhaCungCap();
        }

        if(cbb_NhaCungCap_Xoa.getSelectedIndex()==2)//xóa nhà cung cấp theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_NhaCungCap.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa nhà cung cấp
            int SelectedRow=tbl_NhaCungCap.getSelectedRow();//lấy số dòng được chọn
            String MaNhaCungCap=(String)model_NhaCungCap.getValueAt(SelectedRow,0);
            nhaCungCap_Service.Xoa_NhaCungCap_ByMaNhaCungCap(MaNhaCungCap, this);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_QuanLyNhaCungCap();
        }
        
        set_PhieuNhap_cbb_MaNhaCungCap();
        KhoiTao_tbl_QuanLyNhaCungCap();
        
    }//GEN-LAST:event_btn_NhaCungCap_XoaActionPerformed

    private void btn_NhaCungCap_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhaCungCap_SuaActionPerformed
        
        if(tbl_NhaCungCap.getSelectedRow()==-1)//nếu table ko chọn dòng nào thì trả về
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn");
            return;
        }

        //đây là phần khởi tạo thông tin sách lấy dữ liệu từ các Text và combobox
        NhaCungCap nhaCungCap=new NhaCungCap();
        nhaCungCap.setMaNhaCungCap(txt_NhaCungCap_MaNhaCungCap.getText());
        nhaCungCap.setTenNhaCungCap(txt_NhaCungCap_TenNhaCungCap.getText());
        nhaCungCap.setDiaChi(txt_NhaCungCap_DiaChi.getText());
        nhaCungCap.setEmail(txt_NhaCungCap_Email.getText());
        nhaCungCap.setSDT(txt_NhaCungCap_SDT.getText());

        //đây là phần thực hiện sửa dữ liệu trong database
        nhaCungCap_Service.Sua_NhaCungCap(nhaCungCap, this);

        //đây là phần thực hiện thay đổi dữ liệu trong tbl_NhaCungCap
        KhoiTao_tbl_QuanLyNhaCungCap();
        
    }//GEN-LAST:event_btn_NhaCungCap_SuaActionPerformed

    //hàm dùng để export tbl NhaCungCap ra excel
    private void btn_NhaCungCap_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhaCungCap_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_NhaCungCap);
        
    }//GEN-LAST:event_btn_NhaCungCap_ExcelActionPerformed

    private void tbl_NhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhaCungCapMouseClicked
                
        int SelectedRow=tbl_NhaCungCap.getSelectedRow();
        
        //phần này là khi nhấn chọn dòng đưa dữ liệu txtfield
        txt_NhaCungCap_MaNhaCungCap.setText((String)tbl_NhaCungCap.getValueAt(SelectedRow,0));
        txt_NhaCungCap_TenNhaCungCap.setText((String)tbl_NhaCungCap.getValueAt(SelectedRow,1));
        txt_NhaCungCap_DiaChi.setText((String)tbl_NhaCungCap.getValueAt(SelectedRow,2));
        txt_NhaCungCap_Email.setText((String)tbl_NhaCungCap.getValueAt(SelectedRow,3));
        txt_NhaCungCap_SDT.setText((String)tbl_NhaCungCap.getValueAt(SelectedRow,4));
        
        if(SelectedRow>=0)
        {
            btn_NhaCungCap_Sua.setEnabled(true);
        }
        else
        {
            btn_NhaCungCap_Sua.setEnabled(false);
        }
        
    }//GEN-LAST:event_tbl_NhaCungCapMouseClicked

    private void txt_PhieuNhap_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_PhieuNhap_TimKiemCaretUpdate
        
        if(txt_PhieuNhap_TimKiem.getText().isBlank())
            tbl_PhieuNhap.setModel(model_PhieuNhap);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String Column[]={"Mã phiếu nhập","Mã nhân viên","Mã nhà cung cấp","Ngày nhập","Thành tiền"};
            
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_PhieuNhap_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã phiếu nhập
            {
                ArrayList<PhieuNhap> DanhSachPhieuNhap = phieuNhap_Service.get_PhieuNhap_ByMaPhieuNhap(txt_PhieuNhap_TimKiem.getText());
                for (PhieuNhap phieuNhap : DanhSachPhieuNhap) 
                {
                    model_TimKiem.addRow(new Object[]{phieuNhap.getMaPhieuNhap(),phieuNhap.getMaNhanVien()
            ,phieuNhap.getMaNhaCungCap(),phieuNhap.getNgayNhap(),phieuNhap.getThanhTien()});
                }
                tbl_PhieuNhap.setModel(model_TimKiem);
            } 
            else
            {
                tbl_PhieuNhap.setModel(model_PhieuNhap);
            }
        }
        
    }//GEN-LAST:event_txt_PhieuNhap_TimKiemCaretUpdate

    private void btn_PhieuNhap_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuNhap_ThemActionPerformed
        
        if(Date_PhieuNhap_NgayNhap.getDate()==null)
        {
            JOptionPane.showMessageDialog(this,"Ngày nhập không được để trống");
            return;
        }
        
        PhieuNhap phieuNhap=new PhieuNhap();
        phieuNhap.setMaNhaCungCap((String)cbb_PhieuNhap_MaNhaCungCap.getSelectedItem());
        phieuNhap.setMaNhanVien((String)cbb_PhieuNhap_MaNhanVien.getSelectedItem());
        phieuNhap.setNgayNhap((Date)checkLoi.ChuyenDate(Date_PhieuNhap_NgayNhap.getDate()));
        phieuNhap.setThanhTien(0);
        
        phieuNhap_Service.add_PhieuNhap(phieuNhap, this);
        KhoiTao_tbl_QuanLyPhieuNhap();
        
        set_ChiTietPhieuNhap_cbb_MaPhieuNhap();
        KhoiTao_tbl_QuanLyChiTietPhieuNhap();
        
    }//GEN-LAST:event_btn_PhieuNhap_ThemActionPerformed

    private void btn_PhieuNhap_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuNhap_XoaActionPerformed
        
        if(cbb_PhieuNhap_Xoa.getSelectedIndex()==0)//xóa phiếu nhập theo mã phiếu nhập
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_PhieuNhap_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(this,"Thông tin cần xóa không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa nhà cung cấp
            phieuNhap_Service.Xoa_PhieuNhap_ByMaPhieuNhap(txt_PhieuNhap_Xoa.getText(), this);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_QuanLyPhieuNhap();

            return;
        }

        if(cbb_PhieuNhap_Xoa.getSelectedIndex()==1)//xóa phiếu nhập theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_PhieuNhap.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa phiếu nhập
            int SelectedRow=tbl_PhieuNhap.getSelectedRow();//lấy số dòng được chọn
            String MaPhieuNhap=(String)model_PhieuNhap.getValueAt(SelectedRow,0);
            phieuNhap_Service.Xoa_PhieuNhap_ByMaPhieuNhap(MaPhieuNhap, this);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_QuanLyPhieuNhap();
        }
        
        set_ChiTietPhieuNhap_cbb_MaPhieuNhap();
        KhoiTao_tbl_QuanLyChiTietPhieuNhap();
        
    }//GEN-LAST:event_btn_PhieuNhap_XoaActionPerformed

    private void btn_PhieuNhap_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuNhap_SuaActionPerformed
        
        if(tbl_PhieuNhap.getSelectedRow()==-1)//nếu table ko chọn dòng nào thì trả về
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn");
            return;
        }

        //đây là phần khởi tạo thông tin sách lấy dữ liệu từ các Text và combobox
        PhieuNhap phieuNhap=new PhieuNhap();
        phieuNhap.setMaPhieuNhap((String)txt_PhieuNhap_MaPhieuNhap.getText());
        phieuNhap.setMaNhaCungCap((String)cbb_PhieuNhap_MaNhaCungCap.getSelectedItem());
        phieuNhap.setMaNhanVien((String)cbb_PhieuNhap_MaNhanVien.getSelectedItem());
        phieuNhap.setNgayNhap((Date)checkLoi.ChuyenDate(Date_PhieuNhap_NgayNhap.getDate()));
        phieuNhap.setThanhTien(Float.parseFloat(txt_PhieuNhap_ThanhTien.getText()));

        //đây là phần thực hiện sửa dữ liệu trong database
        phieuNhap_Service.Sua_PhieuNhap(phieuNhap, this);

        //đây là phần thực hiện thay đổi dữ liệu trong tbl_NhaCungCap
        KhoiTao_tbl_QuanLyPhieuNhap();
        
    }//GEN-LAST:event_btn_PhieuNhap_SuaActionPerformed

    private void btn_PhieuNhap_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuNhap_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_PhieuNhap);
        
    }//GEN-LAST:event_btn_PhieuNhap_ExcelActionPerformed

    private void tbl_PhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhieuNhapMouseClicked
        
        int SelectedRow=tbl_PhieuNhap.getSelectedRow();
        
        //phần này là khi nhấn chọn dòng đưa dữ liệu txtfield
        txt_PhieuNhap_MaPhieuNhap.setText((String)model_PhieuNhap.getValueAt(SelectedRow,0));
        cbb_PhieuNhap_MaNhaCungCap.setSelectedItem(model_PhieuNhap.getValueAt(SelectedRow,1));
        cbb_PhieuNhap_MaNhanVien.setSelectedItem(model_PhieuNhap.getValueAt(SelectedRow,2));
        Date_PhieuNhap_NgayNhap.setDate((Date)model_PhieuNhap.getValueAt(SelectedRow, 3));
        txt_PhieuNhap_ThanhTien.setText(String.valueOf(model_PhieuNhap.getValueAt(SelectedRow, 4)));
        
        if(SelectedRow>=0)
        {
            btn_NhaCungCap_Sua.setEnabled(true);
        }
        else
        {
            btn_NhaCungCap_Sua.setEnabled(false);
        }
        
    }//GEN-LAST:event_tbl_PhieuNhapMouseClicked

    private void tbl_ChiTietPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ChiTietPhieuNhapMouseClicked
        
        int SelectedRow=tbl_ChiTietPhieuNhap.getSelectedRow();
        
        //phần này là khi nhấn chọn dòng đưa dữ liệu txtfield
        cbb_ChiTietPhieuNhap_MaPhieuNhap.setSelectedItem(model_ChiTietPhieuNhap.getValueAt(SelectedRow, 0));
        cbb_ChiTietPhieuNhap_MaSach.setSelectedItem(model_ChiTietPhieuNhap.getValueAt(SelectedRow, 1));
        Spinner_ChiTietPhieuNhap_SoLuong.setValue(model_ChiTietPhieuNhap.getValueAt(SelectedRow, 2));
        txt_ChiTietPhieuNhap_DonGia.setText(model_ChiTietPhieuNhap.getValueAt(SelectedRow, 3).toString());
        
        if(SelectedRow>=0)
        {
            btn_ChiTietPhieuNhap_Sua.setEnabled(true);
        }
        else
        {
            btn_ChiTietPhieuNhap_Sua.setEnabled(false);
        }
        
    }//GEN-LAST:event_tbl_ChiTietPhieuNhapMouseClicked

    private void txt_ChiTietPhieuNhap_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_ChiTietPhieuNhap_TimKiemCaretUpdate
        
        if(txt_ChiTietPhieuNhap_TimKiem.getText().isBlank())
            tbl_ChiTietPhieuNhap.setModel(model_ChiTietPhieuNhap);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String Column[]={"Mã phiếu nhập","Mã sách","Số lượng","Đơn giá"};
            
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_ChiTietPhieuNhap_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã phiếu nhập
            {
                ArrayList<ChiTietPhieuNhap> DanhSachChiTietPhieuNhap = chiTietPhieuNhap_Service.get_ChiTietPhieuNhap_ByMaPhieuNhap(txt_ChiTietPhieuNhap_TimKiem.getText());
                for (ChiTietPhieuNhap chiTietPhieuNhap : DanhSachChiTietPhieuNhap) 
                {
                    model_TimKiem.addRow(new Object[]{chiTietPhieuNhap.getMaPhieuNhap(),chiTietPhieuNhap.getMaSach()
            ,chiTietPhieuNhap.getSoLuong(),chiTietPhieuNhap.getDonGia()});
                }
                tbl_ChiTietPhieuNhap.setModel(model_TimKiem);
            } 
            else
            {
                tbl_ChiTietPhieuNhap.setModel(model_ChiTietPhieuNhap);
            }
        }
        
    }//GEN-LAST:event_txt_ChiTietPhieuNhap_TimKiemCaretUpdate

    private void btn_ChiTietPhieuNhap_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuNhap_ThemActionPerformed
        
        if(Integer.parseInt(Spinner_ChiTietPhieuNhap_SoLuong.getValue().toString())<=0)
        {
            JOptionPane.showMessageDialog(this,"Số lượng không hợp lệ");
            return;
        }
        if(txt_ChiTietPhieuNhap_DonGia.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this,"Đơn giá không được để trống");
            return;
        }
        
        ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap();
        chiTietPhieuNhap.setMaPhieuNhap(cbb_ChiTietPhieuNhap_MaPhieuNhap.getSelectedItem().toString());
        chiTietPhieuNhap.setMaSach(cbb_ChiTietPhieuNhap_MaSach.getSelectedItem().toString());
        chiTietPhieuNhap.setSoLuong(Integer.parseInt(Spinner_ChiTietPhieuNhap_SoLuong.getValue().toString()));
        chiTietPhieuNhap.setDonGia(Float.parseFloat(txt_ChiTietPhieuNhap_DonGia.getText()));
        
        chiTietPhieuNhap_Service.add_ChiTietPhieuNhap(chiTietPhieuNhap, this);
        KhoiTao_tbl_QuanLyChiTietPhieuNhap();
        KhoiTao_tbl_QuanLyPhieuNhap();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btn_ChiTietPhieuNhap_ThemActionPerformed

    private void btn_ChiTietPhieuNhap_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuNhap_XoaActionPerformed
          
        if(cbb_ChiTietPhieuNhap_Xoa.getSelectedIndex()==0)//xóa phiếu nhập theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_ChiTietPhieuNhap.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa chi tiết phiếu nhập
            int SelectedRow=tbl_ChiTietPhieuNhap.getSelectedRow();//lấy số dòng được chọn
            String MaPhieuNhap=(String)model_ChiTietPhieuNhap.getValueAt(SelectedRow,0);
            String MaSach=(String)model_ChiTietPhieuNhap.getValueAt(SelectedRow,1);
            chiTietPhieuNhap_Service.Xoa_ChiTietPhieuNhap_ByMaPhieuNhap(MaPhieuNhap,MaSach, this);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_QuanLyChiTietPhieuNhap();
            KhoiTao_tbl_QuanLyPhieuNhap();
        }
        
    }//GEN-LAST:event_btn_ChiTietPhieuNhap_XoaActionPerformed

    private void btn_ChiTietPhieuNhap_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuNhap_SuaActionPerformed
        
        if(tbl_ChiTietPhieuNhap.getSelectedRow()==-1)//nếu table ko chọn dòng nào thì trả về
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn");
            return;
        }

        //đây là phần khởi tạo thông tin chi tiết phiếu nhập lấy dữ liệu từ các Text và combobox
        ChiTietPhieuNhap chiTietPhieuNhap=new ChiTietPhieuNhap();
        chiTietPhieuNhap.setMaPhieuNhap(cbb_ChiTietPhieuNhap_MaPhieuNhap.getSelectedItem().toString());
        chiTietPhieuNhap.setMaSach(cbb_ChiTietPhieuNhap_MaSach.getSelectedItem().toString());
        chiTietPhieuNhap.setSoLuong(Integer.parseInt(Spinner_ChiTietPhieuNhap_SoLuong.getValue().toString()));
        chiTietPhieuNhap.setDonGia(Float.parseFloat(txt_ChiTietPhieuNhap_DonGia.getText()));

        //đây là phần check không cho sửa mã phiếu nhập và mã sách
        int SelectedRow=tbl_ChiTietPhieuNhap.getSelectedRow();
        if(!chiTietPhieuNhap.getMaPhieuNhap().equals(model_ChiTietPhieuNhap.getValueAt(SelectedRow, 0)))
        {
            JOptionPane.showMessageDialog(this,"Không thể thay đổi mã phiếu nhập");
            return;
        }
        if(!chiTietPhieuNhap.getMaSach().equals(model_ChiTietPhieuNhap.getValueAt(SelectedRow, 1)))
        {
            JOptionPane.showMessageDialog(this,"Không thể thay đổi mã sách");
            return;
        }
        
        //đây là phần thực hiện sửa dữ liệu trong database
        chiTietPhieuNhap_Service.Sua_ChiTietPhieuNhap(chiTietPhieuNhap, this);

        //đây là phần thực hiện thay đổi dữ liệu trong tbl_ChiTietPhieuNhap
        KhoiTao_tbl_QuanLyChiTietPhieuNhap();
        KhoiTao_tbl_QuanLyPhieuNhap();
    }//GEN-LAST:event_btn_ChiTietPhieuNhap_SuaActionPerformed

    private void btn_ChiTietPhieuNhap_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuNhap_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_ChiTietPhieuNhap);
        
    }//GEN-LAST:event_btn_ChiTietPhieuNhap_ExcelActionPerformed

    private void tbl_SachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SachMouseClicked
        
        
        int SelectedRow=tbl_Sach.getSelectedRow();
        
        //phần này là khi nhấn chọn dòng đưa dữ liệu txtfield
        txt_Sach_MaSach.setText(String.valueOf(model_Sach.getValueAt(SelectedRow,0)));
        txt_Sach_TenSach.setText((String)model_Sach.getValueAt(SelectedRow,1));
        cbb_Sach_MaTheLoai.setSelectedItem(model_Sach.getValueAt(SelectedRow, 2));
        cbb_Sach_MaNhaXuatBan.setSelectedItem(model_Sach.getValueAt(SelectedRow, 3));
        cbb_Sach_MaTacGia.setSelectedItem(model_Sach.getValueAt(SelectedRow, 4));
        Spinner_Sach_SoLuong.setValue(model_Sach.getValueAt(SelectedRow,5));;
        txt_Sach_ThongTinSach.setText(String.valueOf(model_Sach.getValueAt(SelectedRow,6)));
        
        if(SelectedRow>=0)
        {
            btn_Sach_Sua.setEnabled(true);
        }
        else
        {
            btn_Sach_Sua.setEnabled(false);
        }
        
    }//GEN-LAST:event_tbl_SachMouseClicked

    private void txt_Sach_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_Sach_TimKiemCaretUpdate
        
        if(txt_Sach_TimKiem.getText().isBlank())
            tbl_Sach.setModel(model_Sach);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String Column[]={"Mã sách","Tên sách","Mã thể loại","Mã nhà xuất bản","Mã tác giả","Số lượng sách còn lại","Thông tin sách"};
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_Sach_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã sách
            {
                ArrayList<Sach> DanhSachSach = sach_Service.get_Sach_ByMaSach(txt_Sach_TimKiem.getText());
                for (Sach sach : DanhSachSach) 
                {
                    model_TimKiem.addRow(new Object[]{sach.getMaSach(), sach.getTenSach(), sach.getMaTheLoai(),
                        sach.getMaNXB(), sach.getMaTacGia(), sach.getSoLuongCon(), sach.getThongTinSach()});

                }
                tbl_Sach.setModel(model_TimKiem);
            } 
            else if (cbb_Sach_TimKiem.getSelectedIndex() == 1)//đây là phần tìm theo tên sách
            {
                ArrayList<Sach> DanhSachSach = sach_Service.get_Sach_ByTenSach(txt_Sach_TimKiem.getText());
                for (Sach sach : DanhSachSach) 
                {
                    model_TimKiem.addRow(new Object[]{sach.getMaSach(), sach.getTenSach(), sach.getMaTheLoai(),
                        sach.getMaNXB(), sach.getMaTacGia(), sach.getSoLuongCon(), sach.getThongTinSach()});
                }
                tbl_Sach.setModel(model_TimKiem);
            }
            else
            {
                tbl_Sach.setModel(model_Sach);
            }
        }
        
    }//GEN-LAST:event_txt_Sach_TimKiemCaretUpdate

    private void btn_Sach_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sach_ThemActionPerformed
        
        if(txt_Sach_TenSach.getText().isBlank())//nếu tên sách bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_Sach_TenSach, "Tên sách không được để trống");
            return;
        }
        
        if(txt_Sach_ThongTinSach.getText().isBlank())//nếu thông tin sách bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_Sach_ThongTinSach, "Thông tin sách không được để trống");
            return;
        }
        
        Sach sach=new Sach();
        sach.setTenSach(txt_Sach_TenSach.getText());
        sach.setMaTheLoai((String)cbb_Sach_MaTheLoai.getSelectedItem());
        sach.setMaNXB((String)cbb_Sach_MaNhaXuatBan.getSelectedItem());
        sach.setMaTacGia((String)cbb_Sach_MaTacGia.getSelectedItem());
        sach.setSoLuongCon(0);
        sach.setThongTinSach(txt_Sach_ThongTinSach.getText());

        sach_Service.add_Sach(sach, this);
        KhoiTao_tbl_Sach();
        
        //khởi tạo lại
        set_ChiTietPhieuNhap_cbb_MaSach();
        KhoiTao_tbl_QuanLyPhieuNhap();
        set_ChiTietPhieuMuon_cbb_MaSach();
        KhoiTao_tbl_ChiTietPhieuMuon();
        
    }//GEN-LAST:event_btn_Sach_ThemActionPerformed
    
    private void btn_Sach_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sach_XoaActionPerformed
        
        if(cbb_Sach_Xoa.getSelectedIndex()==0)//xóa sách theo mã sách
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_Sach_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_Sach_Xoa,"Thông tin cần xóa không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa sách
            sach_Service.Xoa_Sach_ByMaSach(txt_Sach_Xoa.getText(), txt_Sach_Xoa);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_Sach();

            return;
        }
        
        if(cbb_Sach_Xoa.getSelectedIndex()==1)//xóa sách theo tên sách
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_Sach_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_Sach_Xoa, "Thông tin xóa tên sách không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa sách
            sach_Service.Xoa_Sach_ByTenSach(txt_Sach_Xoa.getText(),txt_Sach_Xoa);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_Sach();
        }

        if(cbb_Sach_Xoa.getSelectedIndex()==2)//xóa sách theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_Sach.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(txt_Sach_Xoa,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa sách
            int SelectedRow=tbl_Sach.getSelectedRow();//lấy số dòng được chọn
            String MaSach=(String)model_Sach.getValueAt(SelectedRow,0);
            sach_Service.Xoa_Sach_ByMaSach(MaSach, txt_Sach_Xoa);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_Sach();
        }
        
        //khởi tạo lại
        set_ChiTietPhieuNhap_cbb_MaSach();
        KhoiTao_tbl_QuanLyPhieuNhap();
        set_ChiTietPhieuMuon_cbb_MaSach();
        KhoiTao_tbl_ChiTietPhieuMuon();
        
    }//GEN-LAST:event_btn_Sach_XoaActionPerformed

    private void btn_Sach_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sach_SuaActionPerformed
       
        if(tbl_Sach.getSelectedRow()==-1)//nếu table ko chọn dòng nào thì trả về
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn");
            return;
        }

        //đây là phần khởi tạo thông tin sách lấy dữ liệu từ các Text và combobox
        Sach sach=new Sach();
        sach.setMaSach(txt_Sach_MaSach.getText());
        sach.setTenSach(txt_Sach_TenSach.getText());
        sach.setMaTheLoai((String)cbb_Sach_MaTheLoai.getSelectedItem());
        sach.setMaNXB((String)cbb_Sach_MaNhaXuatBan.getSelectedItem());
        sach.setMaTacGia((String)cbb_Sach_MaTacGia.getSelectedItem());
        sach.setSoLuongCon(Integer.parseInt(Spinner_Sach_SoLuong.getValue().toString()));
        sach.setThongTinSach(txt_Sach_ThongTinSach.getText());

        //đây là phần thực hiện sửa dữ liệu trong database
        sach_Service.Sua_Sach(sach, btn_Sach_Sua);

        //đây là phần thực hiện thay đổi dữ liệu trong tblSach
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btn_Sach_SuaActionPerformed

    private void btn_Sach_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sach_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_Sach);
        
    }//GEN-LAST:event_btn_Sach_ExcelActionPerformed

    private void cbb_Sach_MaTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_Sach_MaTheLoaiActionPerformed
               
        if(cbb_Sach_MaTheLoai.getSelectedItem()!=null)
        {
            ArrayList<TheLoai> DanhSachTheLoai=theLoai_Service.get_TheLoai_ByMaTheLoai(cbb_Sach_MaTheLoai.getSelectedItem().toString());
            txt_Sach_TenTheLoai.setText(DanhSachTheLoai.get(0).getTenTheLoai());
        }
                
    }//GEN-LAST:event_cbb_Sach_MaTheLoaiActionPerformed

    private void tbl_DocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_DocGiaMouseClicked
              
        int SelectedRow=tbl_DocGia.getSelectedRow();//lấy dòng được chọn

        txt_DocGia_MaDocGia.setText((String)model_DocGia.getValueAt(SelectedRow,0));
        txt_DocGia_TenDocGia.setText((String)model_DocGia.getValueAt(SelectedRow,1));
        txt_DocGia_DiaChi.setText((String)model_DocGia.getValueAt(SelectedRow, 2));

        if(model_DocGia.getValueAt(SelectedRow, 3).equals("Nam"))
        {
            rdbtn_DocGia_Nam.setSelected(true);
        }
        else
        {
            rdbtn_DocGia_Nam.setSelected(false);
        }
        Date_DocGia_NgaySinh.setDate((Date)model_DocGia.getValueAt(SelectedRow, 4));
        txt_DocGia_SDT.setText((String)model_DocGia.getValueAt(SelectedRow,5));
    }//GEN-LAST:event_tbl_DocGiaMouseClicked

    private void txt_DocGia_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_DocGia_TimKiemCaretUpdate

        if(txt_DocGia_TimKiem.getText().isBlank())
            tbl_DocGia.setModel(model_DocGia);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String Column[] = {"Mã độc giả", "Tên độc giả", "Địa chỉ",
                 "Giới tính", "Ngày sinh", "Số điện thoại"};
            
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_DocGia_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã sách
            {
                ArrayList<DocGia> DanhSachDocGia = docGia_Service.get_DocGia_ByMaDocGia(txt_DocGia_TimKiem.getText());
                for (DocGia docgia : DanhSachDocGia) 
                {
                    model_TimKiem.addRow(new Object[]{docgia.getMaDocGia(), docgia.getTenDocGia(), docgia.getDiaChi(),
                        docgia.getGioiTinh(), docgia.getNgaySinh(), docgia.getSDT()});
                }
                tbl_DocGia.setModel(model_TimKiem);
            }
            else if (cbb_DocGia_TimKiem.getSelectedIndex() == 1)//đây là phần tìm theo tên sách
            {
                ArrayList<DocGia> DanhSachDocGia = docGia_Service.get_DocGia_ByTenDocGia(txt_DocGia_TimKiem.getText());
                for (DocGia docgia : DanhSachDocGia) 
                {
                    model_TimKiem.addRow(new Object[]{docgia.getMaDocGia(), docgia.getTenDocGia(), docgia.getDiaChi(),
                        docgia.getGioiTinh(), docgia.getNgaySinh(), docgia.getSDT()});
                }
                tbl_DocGia.setModel(model_TimKiem);
            }
            else
            {
                tbl_DocGia.setModel(model_DocGia);
            }            
        }

    }//GEN-LAST:event_txt_DocGia_TimKiemCaretUpdate

    private void btn_DocGia_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocGia_ThemActionPerformed
        
        DocGia docGia=new DocGia();

        //Đây là khúc kiểm tra xem các thông tin có bị bỏ trống hay không
        if(txt_DocGia_TenDocGia.getText().isBlank())//nếu tên độc giả bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_DocGia_TenDocGia, "Tên độc giả không được để trống");
            return;
        }        
        if(txt_DocGia_SDT.getText().isBlank())//nếu số điện thoại độc giả bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_DocGia_SDT, "Số điện thoại độc giả không được để trống");
            return;
        }        
        if(txt_DocGia_DiaChi.getText().isBlank())//nếu địa chỉ độc giả bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_DocGia_DiaChi, "Địa chỉ độc giả không được để trống");
            return;
        }        
        if(Date_DocGia_NgaySinh.getDate()==null)//nếu ngày sinh độc giả bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_DocGia_DiaChi, "Ngày sinh độc giả không được để trống");
            return;
        }

        //Đây là khúc thêm độc giả
        docGia.setMaDocGia(txt_DocGia_MaDocGia.getText());
        docGia.setTenDocGia(txt_DocGia_TenDocGia.getText());
        docGia.setDiaChi(txt_DocGia_DiaChi.getText());
        docGia.setSDT(txt_DocGia_SDT.getText());
        if(rdbtn_DocGia_Nam.isSelected())
        {
            docGia.setGioiTinh(rdbtn_DocGia_Nam.getText());
        }
        else
        {
            docGia.setGioiTinh(rdbtn_DocGia_Nu.getText());
        }
        
        //phần lấy dữ liệu date của độc giả
        docGia.setNgaySinh((Date)checkLoi.ChuyenDate(Date_DocGia_NgaySinh.getDate()));
        
        docGia_Service.add_DocGia(docGia, this);
        KhoiTao_tbl_DocGia();
        
        set_PhieuMuon_cbb_MaDocGia();
        KhoiTao_tbl_PhieuMuon();
        
        
    }//GEN-LAST:event_btn_DocGia_ThemActionPerformed

    private void btn_DocGia_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocGia_SuaActionPerformed
        
        if(tbl_DocGia.getSelectedRow()==-1)//nếu table ko chọn dòng nào thì trả về
            return;

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        DocGia docGia=new DocGia();
        docGia.setMaDocGia(txt_DocGia_MaDocGia.getText());
        docGia.setTenDocGia(txt_DocGia_TenDocGia.getText());
        docGia.setDiaChi(txt_DocGia_DiaChi.getText());
        if(rdbtn_DocGia_Nam.isSelected())
        {
            docGia.setGioiTinh(rdbtn_DocGia_Nam.getText());
        }
        else
        {
            docGia.setGioiTinh(rdbtn_DocGia_Nu.getText());
        }
        docGia.setNgaySinh((Date)checkLoi.ChuyenDate(Date_DocGia_NgaySinh.getDate()));
        docGia.setSDT(txt_DocGia_SDT.getText());
        
        //đây là phần thực hiện sửa dữ liệu trong database
        docGia_Service.Sua_DocGia(docGia, btn_DocGia_Sua);

        //đây là phần thực hiện thay đổi dữ liệu trong tblDocGia
        KhoiTao_tbl_DocGia();
        
    }//GEN-LAST:event_btn_DocGia_SuaActionPerformed

    private void btn_DocGia_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocGia_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_DocGia);
        
    }//GEN-LAST:event_btn_DocGia_ExcelActionPerformed

    private void btn_DocGia_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DocGia_XoaActionPerformed
        
        if(cbb_DocGia_Xoa.getSelectedIndex()==0)//xóa độc giả theo mã độc giả
        {

            if(txt_DocGia_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_DocGia_Xoa,"Thông tin cần xóa không được để trống");
                return;
            }

            String MaDocGia=txt_DocGia_Xoa.getText();
            
            docGia_Service.Xoa_DocGia_ByMaDocGia(MaDocGia, txt_DocGia_Xoa);

            KhoiTao_tbl_DocGia();

            return;
        }
        
        if(cbb_DocGia_Xoa.getSelectedIndex()==1)//xóa độc giả theo tên độc giả
        {

            if(txt_DocGia_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_DocGia_Xoa,"Thông tin cần xóa không được để trống");
                return;
            }

            String TenDocGia=txt_DocGia_Xoa.getText();
            
            docGia_Service.Xoa_DocGia_ByTenDocGia(TenDocGia, txt_DocGia_Xoa);

            KhoiTao_tbl_DocGia();

            return;
        }

        if(cbb_DocGia_Xoa.getSelectedIndex()==2)//xóa độc giả theo dòng được chọn
        {
            if(tbl_DocGia.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(txt_DocGia_Xoa,"Không có dòng nào được chọn cả");
                return;
            }

            int SelectedRow=tbl_DocGia.getSelectedRow();//lấy số dòng được chọn
            String MaDocGia=(String)model_DocGia.getValueAt(SelectedRow,0);
            docGia_Service.Xoa_DocGia_ByMaDocGia(MaDocGia,txt_DocGia_Xoa);

            KhoiTao_tbl_DocGia();
        }
        
        set_PhieuMuon_cbb_MaDocGia();
        KhoiTao_tbl_PhieuMuon();
        
    }//GEN-LAST:event_btn_DocGia_XoaActionPerformed

    private void btn_ThongKeSach_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongKeSach_TimKiemActionPerformed

        if(Date_ThongKeSach_TimKiem.getDate()==null)
        {
            JOptionPane.showMessageDialog(Date_ThongKeSach_TimKiem,"Ngày chọn không được để trống");
            return;
        }

        Date NgayMuon=(Date) checkLoi.ChuyenDate(Date_ThongKeSach_TimKiem.getDate());//lấy giá trị ngày

        if(cbb_ThongKeSach_TimKiem.getSelectedIndex()==0)
        {
            System.out.println("Tìm sách mượn nhiều nhất theo ngày");
            try {
                ResultSet rs = thongKe_Service.get_Sach_MuonNhieuNhat_ByNgay(NgayMuon, Date_ThongKeSach_TimKiem);
                set_TableData_ThongKe_Sach_MuonNhieuNhat(rs);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else if(cbb_ThongKeSach_TimKiem.getSelectedIndex()==1)
        {
            System.out.println("Tìm sách mượn nhiều nhất theo tháng");
            try {
                ResultSet rs = thongKe_Service.get_Sach_MuonNhieuNhat_ByThang(NgayMuon, Date_ThongKeSach_TimKiem);
                set_TableData_ThongKe_Sach_MuonNhieuNhat(rs);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_ThongKeSach_TimKiemActionPerformed

    private void btn_ThongKeDocGia_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongKeDocGia_TimKiemActionPerformed

        //phần khởi tạo mới tbl
        DefaultTableModel model_TimKiem=new DefaultTableModel();
        tbl_ThongKe_DocGia.setModel(model_TimKiem);

        //phần xử lý thông tin lọc
        switch (cbb_ThongKeDocGia_TimKiem.getSelectedIndex()) {
            //độc giả chưa trả sách
            case 0:
            set_TableData_ThongKe_DocGia_ChuaTraSach();
            break;
            //độc giả trễ hạn trả sách
            case 1:
            set_TableData_ThongKe_DocGia_TreHanTra();
            break;
            //độc giả mượn nhiều nhất by ngày
            case 2:
            set_TableData_ThongKe_DocGia_MuonNhieuNhatByNgay();
            break;
            //độc giả mượn nhiều nhất by tháng
            case 3:
            set_TableData_ThongKe_DocGia_MuonNhieuNhatByThang();
            break;
            //độc giả có tiền phạt
            case 4:
            set_TableData_ThongKe_DocGia_TienPhat();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_btn_ThongKeDocGia_TimKiemActionPerformed

    private void tbl_NhanVientbl_QuanLyNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhanVientbl_QuanLyNVMouseClicked

        
        int SelectedRow=tbl_NhanVien.getSelectedRow();

        txt_NhanVien_MaNhanVien.setText(String.valueOf(model_NhanVien.getValueAt(SelectedRow,0)));
        txt_NhanVien_TenNhanVien.setText(String.valueOf(model_NhanVien.getValueAt(SelectedRow,1)));
        Date_NhanVien_NgaySinh.setDate((Date)model_NhanVien.getValueAt(SelectedRow,2));
        txt_NhanVien_SDT.setText(String.valueOf(model_NhanVien.getValueAt(SelectedRow,3)));
        txt_NhanVien_Email.setText(String.valueOf(model_NhanVien.getValueAt(SelectedRow,4)));
        cbb_NhanVien_GioiTinh.setSelectedItem(model_NhanVien.getValueAt(SelectedRow, 5));
        txt_NhanVien_QueQuan.setText(String.valueOf(model_NhanVien.getValueAt(SelectedRow,6)));
        txt_NhanVien_GhiChu.setText(String.valueOf(model_NhanVien.getValueAt(SelectedRow, 7)));

    }//GEN-LAST:event_tbl_NhanVientbl_QuanLyNVMouseClicked

    private void txt_NhanVien_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_NhanVien_TimKiemCaretUpdate
        
        if(txt_NhanVien_TimKiem.getText().isBlank())
            tbl_NhanVien.setModel(model_NhanVien);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String[] Column={"Mã nhân viên","Họ tên","Ngày sinh","Điện thoại",
            "Email","Giới tính","Quê quán","Ghi chú"};
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_NhanVien_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã nhân viên
            {
                ArrayList<NhanVien> DanhSachNhanVien = nhanVien_Service.get_NhanVien_ByMaNhanVien(txt_NhanVien_TimKiem.getText());
                for (NhanVien nhanVien : DanhSachNhanVien) 
                {
                    model_TimKiem.addRow(new Object[] {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getNgaySinh(),nhanVien.getSDT(),
            nhanVien.getEmail(),nhanVien.getGioiTinh(),nhanVien.getQueQuan(),nhanVien.getGhiChu()});
                }
                tbl_NhanVien.setModel(model_TimKiem);
            } 
            else if (cbb_NhanVien_TimKiem.getSelectedIndex() == 1)//đây là phần tìm theo tên sách
            {
                ArrayList<NhanVien> DanhSachNhanVien = nhanVien_Service.get_NhanVien_ByTenNhanVien(txt_NhanVien_TimKiem.getText());
                for (NhanVien nhanVien : DanhSachNhanVien) 
                {
                    model_TimKiem.addRow(new Object[] {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getNgaySinh(),nhanVien.getSDT(),
            nhanVien.getEmail(),nhanVien.getGioiTinh(),nhanVien.getQueQuan(),nhanVien.getGhiChu()});
                }
                tbl_NhanVien.setModel(model_TimKiem);
            }
            else
            {
                tbl_NhanVien.setModel(model_NhanVien);
            }
        }
        
    }//GEN-LAST:event_txt_NhanVien_TimKiemCaretUpdate

    private void btn_NhanVien_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVien_ThemActionPerformed
        
        NhanVien nhanVien = new NhanVien();

        if (txt_NhanVien_TenNhanVien.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_NhanVien_TenNhanVien, "Tên nhân viên không được để trống");
            return;
        }
        if (Date_NhanVien_NgaySinh.getDate()==null) {
            JOptionPane.showMessageDialog(Date_NhanVien_NgaySinh, "Ngày sinh nhân viên không được để trống");
            return;
        }
        if (txt_NhanVien_QueQuan.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_NhanVien_QueQuan, "Quê quán nhân viên không được để trống");
            return;
        }
        if (txt_NhanVien_SDT.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_NhanVien_SDT, "Số điện thoại nhân viên không được để trống");
            return;
        }
        if (txt_NhanVien_Email.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_NhanVien_Email,"Email nhân viên không được để trống");
            return;
        }
        if (txt_NhanVien_GhiChu.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_NhanVien_GhiChu, "Ghi chú về nhân viên không được để trống");
            return;
        }
        
        nhanVien.setTenNhanVien(txt_NhanVien_TenNhanVien.getText());
        nhanVien.setNgaySinh((Date)checkLoi.ChuyenDate(Date_NhanVien_NgaySinh.getDate()));
        nhanVien.setSDT(txt_NhanVien_SDT.getText());
        nhanVien.setEmail(txt_NhanVien_Email.getText());
        nhanVien.setGioiTinh((String)cbb_NhanVien_GioiTinh.getSelectedItem());
        nhanVien.setQueQuan(txt_NhanVien_QueQuan.getText());
        nhanVien.setGhiChu(txt_NhanVien_GhiChu.getText());
        
        nhanVien_Service.add_NhanVien(nhanVien, this);
        KhoiTao_tbl_NhanVien();
        
        set_PhieuNhap_cbb_MaNhanVien();
        KhoiTao_tbl_QuanLyPhieuNhap();
        set_PhieuMuon_cbb_MaNhanVien();
        KhoiTao_tbl_PhieuMuon();
        
    }//GEN-LAST:event_btn_NhanVien_ThemActionPerformed

    private void btn_NhanVien_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVien_SuaActionPerformed
        
        if (tbl_NhanVien.getSelectedRow()==-1)
            return;
        
        //int SelectedRow=tbl_QuanLyNV.getSelectedRow();//lấy số dòng được chọn
        //đây là phần khởi tạo thông tin sách lấy dữ liệu từ các Text và combobox
        NhanVien nhanVien=new NhanVien();
        nhanVien.setMaNhanVien(txt_NhanVien_MaNhanVien.getText());
        nhanVien.setTenNhanVien(txt_NhanVien_TenNhanVien.getText());
        nhanVien.setNgaySinh((Date)checkLoi.ChuyenDate(Date_NhanVien_NgaySinh.getDate()));
        nhanVien.setSDT(txt_NhanVien_SDT.getText());
        nhanVien.setEmail(txt_NhanVien_Email.getText());
        nhanVien.setGioiTinh((String)cbb_NhanVien_GioiTinh.getSelectedItem());
        nhanVien.setQueQuan(txt_NhanVien_QueQuan.getText());
        nhanVien.setGhiChu(txt_NhanVien_GhiChu.getText());
        
        //đây là phần thực hiện sửa dữ liệu trong database
        nhanVien_Service.Sua_NhanVien(nhanVien, btn_NhanVien_Sua);

        //đây là phần thực hiện thay đổi dữ liệu trong tblQuanLySach
        KhoiTao_tbl_NhanVien();
        
    }//GEN-LAST:event_btn_NhanVien_SuaActionPerformed

    private void btn_NhanVien_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVien_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_NhanVien);
        
    }//GEN-LAST:event_btn_NhanVien_ExcelActionPerformed

    private void btn_NhanVien_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhanVien_XoaActionPerformed
        
        if(cbb_NhanVien_Xoa.getSelectedIndex()==0)//xóa nhân viên theo mã nhân viên
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_NhanVien_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_NhanVien_Xoa,"Thông tin cần xóa không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa sách
            nhanVien_Service.Xoa_NhanVien_ByMaNhanVien(txt_NhanVien_Xoa.getText(), txt_NhanVien_Xoa);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_NhanVien();
            return;
        }
        
        if(cbb_NhanVien_Xoa.getSelectedIndex()==1)//xóa nhân viên theo tên nhân viên
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_NhanVien_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_NhanVien_Xoa, "Thông tin xóa tên nhân viên không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa sách
            nhanVien_Service.Xoa_NhanVien_ByTenNhanVien(txt_NhanVien_Xoa.getText(),txt_NhanVien_Xoa);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_NhanVien();
        }

        if(cbb_NhanVien_Xoa.getSelectedIndex()==2)//xóa nhân viên theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_NhanVien.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(txt_NhanVien_Xoa,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa nhân viên
            int SelectedRow=tbl_NhanVien.getSelectedRow();//lấy số dòng được chọn
            String MaNhanVien=(String)model_NhanVien.getValueAt(SelectedRow,0);
            nhanVien_Service.Xoa_NhanVien_ByMaNhanVien(MaNhanVien, txt_NhanVien_Xoa);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_NhanVien();
        }
        
        set_PhieuNhap_cbb_MaNhanVien();
        KhoiTao_tbl_QuanLyPhieuNhap();
        set_PhieuMuon_cbb_MaNhanVien();
        KhoiTao_tbl_PhieuMuon();
        
    }//GEN-LAST:event_btn_NhanVien_XoaActionPerformed

    private void txt_PhieuMuon_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_PhieuMuon_TimKiemCaretUpdate
        
        if(txt_PhieuMuon_TimKiem.getText().isBlank())
            tbl_PhieuMuon.setModel(model_PhieuMuon);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String[] Column={"Mã phiếu mượn","Mã nhân viên","Mã độc giả","Ngày mượn","Ngày trả","Tình trạng"};
            
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_PhieuMuon_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã phiếu nhập
            {
                ArrayList<PhieuMuon> DanhSachPhieuMuon = phieuMuon_Service.get_PhieuMuon_ByMaPhieuMuon(txt_PhieuMuon_TimKiem.getText());
                for (PhieuMuon phieuMuon : DanhSachPhieuMuon) 
                {
                    String TinhTrang;
                    if (phieuMuon.getTinhTrang() == 0) 
                    {
                        TinhTrang = "Chưa trả";
                    } 
                    else 
                    {
                        TinhTrang = "Đã trả";
                    }
                    model_TimKiem.addRow(new Object[]{phieuMuon.getMaPhieuMuon(), phieuMuon.getMaNhanVien(),
                         phieuMuon.getMaDocGia(), phieuMuon.getNgayMuon(), phieuMuon.getNgayTra(), TinhTrang});
                }
                tbl_PhieuMuon.setModel(model_TimKiem);
            } 
            else
            {
                tbl_PhieuMuon.setModel(model_PhieuMuon);
            }
        }
        
    }//GEN-LAST:event_txt_PhieuMuon_TimKiemCaretUpdate

    private void txt_DocGia_TimKiem2CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_DocGia_TimKiem2CaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DocGia_TimKiem2CaretUpdate

    private void btn_PhieuMuon_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuMuon_XoaActionPerformed
        
        if(cbb_PhieuMuon_Xoa.getSelectedIndex()==0)//xóa phiếu mượn theo mã phiếu mượn
        {
            //đây là phần kiểm tra xem dữ liệu txt có trống hay không
            if(txt_PhieuMuon_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(this,"Thông tin cần xóa không được để trống");
                return;
            }
            
            //đây là phần thực hiện xóa nhà cung cấp
            phieuMuon_Service.Xoa_PhieuMuon_ByMaPhieuMuon(txt_PhieuMuon_Xoa.getText(), this);
            
            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_PhieuMuon();

            return;
        }

        if(cbb_PhieuMuon_Xoa.getSelectedIndex()==1)//xóa phiếu nhập theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_PhieuMuon.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa phiếu nhập
            int SelectedRow=tbl_PhieuMuon.getSelectedRow();//lấy số dòng được chọn
            String MaPhieuMuon=(String)model_PhieuMuon.getValueAt(SelectedRow,0);
            
            phieuMuon_Service.Xoa_PhieuMuon_ByMaPhieuMuon(MaPhieuMuon, this);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_PhieuMuon();
        }
        
        set_ChiTietPhieuMuon_cbb_MaPhieuMuon();
        KhoiTao_tbl_ChiTietPhieuMuon();
        
    }//GEN-LAST:event_btn_PhieuMuon_XoaActionPerformed

    private void tbl_PhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhieuMuonMouseClicked
                
        int SelectedRow=tbl_PhieuMuon.getSelectedRow();

        txt_PhieuMuon_MaPhieuMuon.setText(String.valueOf(model_PhieuMuon.getValueAt(SelectedRow,0)));
        cbb_PhieuMuon_MaNhanVien.setSelectedItem(model_PhieuMuon.getValueAt(SelectedRow,1));
        cbb_PhieuMuon_MaDocGia.setSelectedItem(model_PhieuMuon.getValueAt(SelectedRow,2));
        Date_PhieuMuon_NgayMuon.setDate((Date)model_PhieuMuon.getValueAt(SelectedRow,3));
        Date_PhieuMuon_NgayTra.setDate((Date)model_PhieuMuon.getValueAt(SelectedRow,4));
        int TinhTrang;
        if(model_PhieuMuon.getValueAt(SelectedRow, 5).toString().equals("Đã trả"))
        {
            TinhTrang=1;
        }
        else
        {
            TinhTrang=0;
        }
        cbb_PhieuMuon_TinhTrang.setSelectedIndex(TinhTrang);
                
    }//GEN-LAST:event_tbl_PhieuMuonMouseClicked

    private void btn_PhieuMuon_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuMuon_ThemActionPerformed
        
        if(Date_PhieuMuon_NgayMuon.getDate()==null)
        {
            JOptionPane.showMessageDialog(this,"Ngày mượn không được để trống");
            return;
        }
        if(Date_PhieuMuon_NgayTra.getDate()==null)
        {
            JOptionPane.showMessageDialog(this,"Ngày trả không được để trống");
            return;
        }
        if(Date_PhieuMuon_NgayTra.getDate().compareTo(Date_PhieuMuon_NgayMuon.getDate())<0)
        {
            JOptionPane.showMessageDialog(this,"Ngày trả không được bé hơn ngày mượn");
            return;
        }
        
        PhieuMuon phieuMuon=new PhieuMuon();
        phieuMuon.setMaDocGia(cbb_PhieuMuon_MaDocGia.getSelectedItem().toString());
        phieuMuon.setMaNhanVien(cbb_PhieuMuon_MaNhanVien.getSelectedItem().toString());
        phieuMuon.setNgayMuon((Date)checkLoi.ChuyenDate(Date_PhieuMuon_NgayMuon.getDate()));
        phieuMuon.setNgayTra((Date)checkLoi.ChuyenDate(Date_PhieuMuon_NgayTra.getDate()));
        phieuMuon.setTinhTrang(cbb_PhieuMuon_TinhTrang.getSelectedIndex());
        
        phieuMuon_Service.Add_PhieuMuon(phieuMuon, this);
        KhoiTao_tbl_PhieuMuon();
        
        set_ChiTietPhieuMuon_cbb_MaPhieuMuon();
        set_PhieuMuon2_cbb_MaPhieuMuon();
        
    }//GEN-LAST:event_btn_PhieuMuon_ThemActionPerformed

    private void btn_PhieuMuon_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuMuon_SuaActionPerformed
        
        if(tbl_PhieuMuon.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn");
            return;
        }
        
        PhieuMuon phieuMuon=new PhieuMuon();
        phieuMuon.setMaPhieuMuon(txt_PhieuMuon_MaPhieuMuon.getText());
        phieuMuon.setMaDocGia(cbb_PhieuMuon_MaDocGia.getSelectedItem().toString());
        phieuMuon.setMaNhanVien(cbb_PhieuMuon_MaNhanVien.getSelectedItem().toString());
        phieuMuon.setNgayMuon((Date)checkLoi.ChuyenDate(Date_PhieuMuon_NgayMuon.getDate()));
        phieuMuon.setNgayTra((Date)checkLoi.ChuyenDate(Date_PhieuMuon_NgayTra.getDate()));
        phieuMuon.setTinhTrang(cbb_PhieuMuon_TinhTrang.getSelectedIndex());
        
        phieuMuon_Service.Sua_PhieuMuon(phieuMuon,this);
        KhoiTao_tbl_PhieuMuon();
        
    }//GEN-LAST:event_btn_PhieuMuon_SuaActionPerformed

    private void btn_ChiTietPhieuMuon_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuMuon_ThemActionPerformed
        
        ChiTietPhieuMuon chiTietPhieuMuon=new ChiTietPhieuMuon();
        chiTietPhieuMuon.setMaPhieuMuon(cbb_PhieuMuon2_MaPhieuMuon.getSelectedItem().toString());
        chiTietPhieuMuon.setMaSach(cbb_PhieuMuon2_MaSach.getSelectedItem().toString());
        chiTietPhieuMuon.setSoLuong(Integer.parseInt(Spinner_PhieuMuon2_SoLuong.getValue().toString()));
        chiTietPhieuMuon.setTinhTrangSach(0);//sách bình thường
        chiTietPhieuMuon.setTienPhat(0);//tiền phạt =0        
        
        chiTietPhieuMuon_Service.Add_ChiTietPhieuMuon(chiTietPhieuMuon,this);        
        KhoiTao_tbl_Sach();
        KhoiTao_tbl_PhieuMuon();
        KhoiTao_tbl_ChiTietPhieuMuon();
        
    }//GEN-LAST:event_btn_ChiTietPhieuMuon_ThemActionPerformed

    private void btn_ChiTietPhieuMuon_TraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuMuon_TraActionPerformed
                
        int SelectedRow=tbl_ChiTietPhieuMuon.getSelectedRow();
        if(model_ChiTietPhieuMuon.getValueAt(SelectedRow,3)!=null)
        {
            JOptionPane.showMessageDialog(this,"Chi tiết phiếu mượn này đã trả rồi");
            return;
        }
        if(tbl_ChiTietPhieuMuon.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn");
            return;
        }
        if(Date_ChiTietPhieuMuon_NgayTra.getDate()==null)
        {
            JOptionPane.showMessageDialog(this,"Ngày trả không được để trống");
            return;
        }
        
        ChiTietPhieuMuon chiTietPhieuMuon=new ChiTietPhieuMuon();
        chiTietPhieuMuon.setMaPhieuMuon(model_ChiTietPhieuMuon.getValueAt(SelectedRow,0).toString());
        chiTietPhieuMuon.setMaSach(model_ChiTietPhieuMuon.getValueAt(SelectedRow,1).toString());
        chiTietPhieuMuon.setNgayTra((Date)checkLoi.ChuyenDate(Date_ChiTietPhieuMuon_NgayTra.getDate()));
        chiTietPhieuMuon.setSoLuong(Integer.parseInt(model_ChiTietPhieuMuon.getValueAt(SelectedRow,2).toString()));
        int TinhTrangSach;
        if(cbb_ChiTietPhieuMuon_TinhTrangSach.getSelectedItem().toString().equalsIgnoreCase("Bình thường"))
        {
            TinhTrangSach=0;
        }
        else
        {
            TinhTrangSach=1;
        }
        chiTietPhieuMuon.setTinhTrangSach(TinhTrangSach);
        chiTietPhieuMuon.setTienPhat(Float.parseFloat(model_ChiTietPhieuMuon.getValueAt(SelectedRow,5).toString()));
        
        chiTietPhieuMuon_Service.Tra_ChiTietPhieuMuon(chiTietPhieuMuon,this);
        KhoiTao_tbl_ChiTietPhieuMuon();
        KhoiTao_tbl_PhieuMuon();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btn_ChiTietPhieuMuon_TraActionPerformed

    private void btn_ChiTietPhieuMuon_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuMuon_XoaActionPerformed
                
        if(cbb_ChiTietPhieuMuon_Xoa.getSelectedIndex()==0)//xóa chi tiết phiếu mượn theo dòng được chọn
        {
            //đây là phần kiểm tra xem có dòng nào được chọn hay không
            if(tbl_ChiTietPhieuMuon.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn cả");
                return;
            }

            //đây là phần thực hiện xóa phiếu nhập
            int SelectedRow=tbl_ChiTietPhieuMuon.getSelectedRow();//lấy số dòng được chọn
            String MaPhieuMuon=(String)model_ChiTietPhieuMuon.getValueAt(SelectedRow,0);
            String MaSach=(String)model_ChiTietPhieuMuon.getValueAt(SelectedRow, 1);
            chiTietPhieuMuon_Service.Xoa_ChiTietPhieuMuon_ByMaPhieuMuonAndMaSach(MaPhieuMuon,MaSach, this);

            //đây là phần khởi tạo lại dữ liệu cho table
            KhoiTao_tbl_PhieuMuon();
        }
    }//GEN-LAST:event_btn_ChiTietPhieuMuon_XoaActionPerformed

    private void btn_ChiTietPhieuMuon_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuMuon_SuaActionPerformed
        
        if(tbl_ChiTietPhieuMuon.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this,"Không có dòng nào được chọn cả");
            return;
        }
        
        ChiTietPhieuMuon chiTietPhieuMuon=new ChiTietPhieuMuon();
        chiTietPhieuMuon.setMaPhieuMuon(cbb_ChiTietPhieuMuon_MaPhieuMuon.getSelectedItem().toString());
        chiTietPhieuMuon.setMaSach(cbb_ChiTietPhieuMuon_MaSach.getSelectedItem().toString());
        
        if(model_ChiTietPhieuMuon.getValueAt(tbl_ChiTietPhieuMuon.getSelectedRow(), 3)==null)
        {
            chiTietPhieuMuon.setNgayTra((Date)model_ChiTietPhieuMuon.getValueAt(tbl_ChiTietPhieuMuon.getSelectedRow(), 3));
        }
        else
        {
            chiTietPhieuMuon.setNgayTra((Date)checkLoi.ChuyenDate(Date_ChiTietPhieuMuon_NgayTra.getDate()));
        }
        
        chiTietPhieuMuon.setSoLuong(Integer.parseInt(Spinner_ChiTietPhieuMuon_SoLuong.getValue().toString()));
        chiTietPhieuMuon.setTinhTrangSach(cbb_ChiTietPhieuMuon_TinhTrangSach.getSelectedIndex());
        chiTietPhieuMuon.setTienPhat(Float.parseFloat(txt_ChiTietPhieuMuon_TienPhat.getText()));
        
        chiTietPhieuMuon_Service.Sua_ChiTietPhieuMuon(chiTietPhieuMuon,this);
        KhoiTao_tbl_ChiTietPhieuMuon();
        
    }//GEN-LAST:event_btn_ChiTietPhieuMuon_SuaActionPerformed

    private void tbl_ChiTietPhieuMuonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ChiTietPhieuMuonMouseClicked
        
        int SelectedRow=tbl_ChiTietPhieuMuon.getSelectedRow();
        
        //phần này là khi nhấn chọn dòng đưa dữ liệu txtfield
        cbb_ChiTietPhieuMuon_MaPhieuMuon.setSelectedItem(model_ChiTietPhieuMuon.getValueAt(SelectedRow, 0));
        cbb_ChiTietPhieuMuon_MaSach.setSelectedItem(model_ChiTietPhieuMuon.getValueAt(SelectedRow, 1));
        Spinner_ChiTietPhieuMuon_SoLuong.setValue(model_ChiTietPhieuMuon.getValueAt(SelectedRow, 2));
        Date_ChiTietPhieuMuon_NgayTra.setDate((Date)model_ChiTietPhieuMuon.getValueAt(SelectedRow, 3));
        int TinhTrang;
        if(model_ChiTietPhieuMuon.getValueAt(SelectedRow, 4)=="Bình thường")
        {
            TinhTrang=0;
        }
        else
        {
            TinhTrang=1;
        }
        cbb_ChiTietPhieuMuon_TinhTrangSach.setSelectedIndex(TinhTrang);
        txt_ChiTietPhieuMuon_TienPhat.setText(model_ChiTietPhieuMuon.getValueAt(SelectedRow, 5).toString());
        
    }//GEN-LAST:event_tbl_ChiTietPhieuMuonMouseClicked

    private void btn_PhieuMuon_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuMuon_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_PhieuMuon);
        
    }//GEN-LAST:event_btn_PhieuMuon_ExcelActionPerformed

    private void btn_ChiTietPhieuMuon_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChiTietPhieuMuon_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_ChiTietPhieuMuon);
        
    }//GEN-LAST:event_btn_ChiTietPhieuMuon_ExcelActionPerformed

    private void btn_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangXuatActionPerformed
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dispose();
        
        DangNhap dn=new DangNhap();
        dn.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dn.setLocationRelativeTo(null);
        dn.setVisible(true);
        
    }//GEN-LAST:event_btn_DangXuatActionPerformed

    private void cbb_Sach_MaTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_Sach_MaTacGiaActionPerformed

        if(cbb_Sach_MaTacGia.getSelectedItem()!=null)
        {
            ArrayList<TacGia> DanhSachTacGia=tacGia_Service.get_TacGia_ByMaTacGia(cbb_Sach_MaTacGia.getSelectedItem().toString());
            txt_Sach_TenTacGia.setText(DanhSachTacGia.get(0).getTenTacGia());
        }
        
    }//GEN-LAST:event_cbb_Sach_MaTacGiaActionPerformed

    private void cbb_Sach_MaNhaXuatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_Sach_MaNhaXuatBanActionPerformed
        
        if(cbb_Sach_MaNhaXuatBan.getSelectedItem()!=null)
        {
            ArrayList<NhaXuatBan> DanhSachNhaXuatBan=nhaXuatBan_Service.getNXBByMaNXB(cbb_Sach_MaNhaXuatBan.getSelectedItem().toString());
            txt_Sach_TenNhaXuatBan.setText(DanhSachNhaXuatBan.get(0).getTenNXB());
        }
        
    }//GEN-LAST:event_cbb_Sach_MaNhaXuatBanActionPerformed
    
    //thiết lập dữ liệu cho tbl Quản lý nhà cung cấp
    private void KhoiTao_tbl_QuanLyNhaCungCap()
    {
        model_NhaCungCap= new DefaultTableModel();//tạo mới model

        String Column[]={"Mã nhà cung cấp","Tên nhà cung cấp","Địa chỉ","Email","Số điện thoại"};
        
        model_NhaCungCap.setColumnIdentifiers(Column);
        
        try{
            ArrayList<NhaCungCap> DanhSachNhaCungCap=nhaCungCap_Service.get_NhaCungCap_All();
            set_TableData_QuanLyNhaCungCap(DanhSachNhaCungCap);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_NhaCungCap.setModel(model_NhaCungCap);
    }
    
    //thiết lập dữ liệu cho tbl Quản lý phiếu nhập
    private void KhoiTao_tbl_QuanLyPhieuNhap()
    {
        model_PhieuNhap= new DefaultTableModel();//tạo mới model

        String Column[]={"Mã phiếu nhập","Mã nhân viên","Mã nhà cung cấp","Ngày nhập","Thành tiền"};
        
        model_PhieuNhap.setColumnIdentifiers(Column);
        
        try{
            ArrayList<PhieuNhap> DanhSachPhieuNhap=phieuNhap_Service.get_PhieuNhap_All();
            set_TableData_QuanLyPhieuNhap(DanhSachPhieuNhap);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_PhieuNhap.setModel(model_PhieuNhap);
    }
    
    //thiết lập dữ liệu cho tbl Quản lý chi tiết phiếu nhập
    private void KhoiTao_tbl_QuanLyChiTietPhieuNhap()
    {
        model_ChiTietPhieuNhap= new DefaultTableModel();//tạo mới model

        String Column[]={"Mã phiếu nhập","Mã sách","Số lượng","Đơn giá"};
        
        model_ChiTietPhieuNhap.setColumnIdentifiers(Column);
        
        try{
            ArrayList<ChiTietPhieuNhap> DanhSachChiTietPhieuNhap=chiTietPhieuNhap_Service.get_ChiTietPhieuNhap_All();
            set_TableData_QuanLyChiTietPhieuNhap(DanhSachChiTietPhieuNhap);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_ChiTietPhieuNhap.setModel(model_ChiTietPhieuNhap);
        
        //thiết lập thành tiền cho phiếu nhập
        chiTietPhieuNhap_Service.CapNhat_PhieuNhap_ThanhTien();
        KhoiTao_tbl_QuanLyPhieuNhap();
    }
    
    //thiết lập dữ liệu cho tbl Quản lý chi tiết phiếu nhập
    private void KhoiTao_tbl_ChiTietPhieuMuon()
    {
        model_ChiTietPhieuMuon= new DefaultTableModel();//tạo mới model

        String[] Column={"Mã Phiếu Mượn","Mã sách", "Số Lượng" ,"Ngày Trả","Tình trạng sách", "Tiền Phạt"};
        
        model_ChiTietPhieuMuon.setColumnIdentifiers(Column);
        
        try{
            ArrayList<ChiTietPhieuMuon> DanhSachChiTietPhieuMuon=chiTietPhieuMuon_Service.get_ChiTietPhieuMuon_All();
            set_TableData_QuanLyChiTietPhieuMuon(DanhSachChiTietPhieuMuon);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_ChiTietPhieuMuon.setModel(model_ChiTietPhieuMuon);
    }
    
    //Đây là phần khởi tạo dữ liệu cho cái Table Quản lý sách
    private void KhoiTao_tbl_Sach()
    {
        model_Sach= new DefaultTableModel();//tạo mới model
        
        
        String Column[]={"Mã sách","Tên sách","Mã thể loại","Mã nhà xuất bản",
            "Mã tác giả","Số lượng sách còn lại","Thông tin sách"};
        
        model_Sach.setColumnIdentifiers(Column);
        
        try{
            ArrayList<Sach> DanhSachSach=sach_Service.get_Sach_All();
            set_TableData_Sach(DanhSachSach);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_Sach.setModel(model_Sach);
    }
    
    //Đây là phần khởi tạo dữ liệu cho cái Table Quản lý sách
    private void KhoiTao_tbl_DocGia()
    {
        model_DocGia= new DefaultTableModel();//tạo mới model
        
        
        String Column[]={"Mã độc giả","Tên độc giả","Địa chỉ"
                ,"Giới tính","Ngày sinh","Số điện thoại"};
        
        model_DocGia.setColumnIdentifiers(Column);
        
        try{
            ArrayList<DocGia> DanhSachDocGia=docGia_Service.get_DocGia_All();
            set_TableData_DocGia(DanhSachDocGia);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_DocGia.setModel(model_DocGia);
    }
    
    
    private void KhoiTao_tbl_ThongKe_Sach()
    {
        model_ThongKe_Sach= new DefaultTableModel();//tạo mới model
        
        String Column[]={"Mã sách","Tên sách","Ngày mượn","Số lượng"};
        
        model_ThongKe_Sach.setColumnIdentifiers(Column);//thiết lập cột
        
        
        tbl_ThongKe_Sach.setModel(model_ThongKe_Sach);//set up model
    }
    
    
    private void KhoiTao_tbl_NhanVien()
    {
        model_NhanVien= new DefaultTableModel();//tạo mới model
        
        
        String[] Column={"Mã nhân viên","Họ tên","Ngày sinh","Điện thoại",
            "Email","Giới tính","Quê quán","Ghi chú"};
        
        model_NhanVien.setColumnIdentifiers(Column);
        
        try{
            ArrayList<NhanVien> DanhSachNhanVien=nhanVien_Service.get_NhanVien_All();
            set_TableData_NhanVien(DanhSachNhanVien);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_NhanVien.setModel(model_NhanVien);
    }
    
    private void KhoiTao_tbl_PhieuMuon()
    {
        model_PhieuMuon= new DefaultTableModel();//tạo mới model        
        
        String[] Column={"Mã phiếu mượn","Mã nhân viên","Mã độc giả","Ngày mượn","Ngày trả","Tình trạng"};
        
        model_PhieuMuon.setColumnIdentifiers(Column);
        
        try{
            ArrayList<PhieuMuon> DanhSachPhieuMuon=phieuMuon_Service.get_PhieuMuon_All();
            set_TableData_QuanLyPhieuMuon(DanhSachPhieuMuon);//hàm này dùng để set dữ liệu zô cái model
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        tbl_PhieuMuon.setModel(model_PhieuMuon);
    }
    
    public void set_TableData_NhanVien(ArrayList<NhanVien> DanhSachNhanVien)
    {
        for(NhanVien nhanVien:DanhSachNhanVien)
        {
            model_NhanVien.addRow(new Object[] {nhanVien.getMaNhanVien(),nhanVien.getTenNhanVien(),nhanVien.getNgaySinh(),nhanVien.getSDT(),
            nhanVien.getEmail(),nhanVien.getGioiTinh(),nhanVien.getQueQuan(),nhanVien.getGhiChu()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin độc giả vào model của Table Quản lý độc giả
    public void set_TableData_DocGia(ArrayList<DocGia> DanhSachDocGia)
    {
        for(DocGia docgia:DanhSachDocGia)
        {
            model_DocGia.addRow(new Object[]{docgia.getMaDocGia(),docgia.getTenDocGia(),docgia.getDiaChi(),
                         docgia.getGioiTinh(),docgia.getNgaySinh(),docgia.getSDT()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý nhà cung cấp
    private void set_TableData_QuanLyNhaCungCap(ArrayList<NhaCungCap> DanhSachNhaCungCap)
    {
        for(NhaCungCap nhaCungCap:DanhSachNhaCungCap)
        {
            model_NhaCungCap.addRow(new Object[]{nhaCungCap.getMaNhaCungCap(),nhaCungCap.getTenNhaCungCap()
            ,nhaCungCap.getDiaChi(),nhaCungCap.getEmail(),nhaCungCap.getSDT()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý phiếu nhập
    private void set_TableData_QuanLyPhieuNhap(ArrayList<PhieuNhap> DanhSachPhieuNhap)
    {
        for(PhieuNhap phieuNhap:DanhSachPhieuNhap)
        {
            model_PhieuNhap.addRow(new Object[]{phieuNhap.getMaPhieuNhap(),phieuNhap.getMaNhanVien()
            ,phieuNhap.getMaNhaCungCap(),phieuNhap.getNgayNhap(),phieuNhap.getThanhTien()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý phiếu nhập
    private void set_TableData_QuanLyPhieuMuon(ArrayList<PhieuMuon> DanhSachPhieuMuon)
    {
        for(PhieuMuon phieuMuon:DanhSachPhieuMuon)
        {
            String TinhTrang;
            if(phieuMuon.getTinhTrang()==0)
            {
                TinhTrang="Chưa trả";
            }
            else
            {
                TinhTrang="Đã trả";
            }
            model_PhieuMuon.addRow(new Object[]{phieuMuon.getMaPhieuMuon(),phieuMuon.getMaNhanVien()
            ,phieuMuon.getMaDocGia(),phieuMuon.getNgayMuon(),phieuMuon.getNgayTra(),TinhTrang});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý  chi tiết phiếu nhập
    private void set_TableData_QuanLyChiTietPhieuNhap(ArrayList<ChiTietPhieuNhap> DanhSachChiTietPhieuNhap)
    {
        for(ChiTietPhieuNhap chiTietPhieuNhap:DanhSachChiTietPhieuNhap)
        {
            model_ChiTietPhieuNhap.addRow(new Object[]{chiTietPhieuNhap.getMaPhieuNhap(),chiTietPhieuNhap.getMaSach()
            ,chiTietPhieuNhap.getSoLuong(),chiTietPhieuNhap.getDonGia()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý  chi tiết phiếu nhập
    private void set_TableData_QuanLyChiTietPhieuMuon(ArrayList<ChiTietPhieuMuon> DanhSachChiTietPhieuMuon)
    {
        for(ChiTietPhieuMuon chiTietPhieuMuon:DanhSachChiTietPhieuMuon)
        {
            String TinhTrangSach;//0 là bình thường 1 là bị hư hỏng
            if(chiTietPhieuMuon.getTinhTrangSach()==0)
            {
                TinhTrangSach="Bình thường";
            }
            else
            {
                TinhTrangSach="Hư hỏng";
            }
            model_ChiTietPhieuMuon.addRow(new Object[]{chiTietPhieuMuon.getMaPhieuMuon(),chiTietPhieuMuon.getMaSach()
            ,chiTietPhieuMuon.getSoLuong(),chiTietPhieuMuon.getNgayTra(),TinhTrangSach,chiTietPhieuMuon.getTienPhat()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý sách
    public void set_TableData_Sach(ArrayList<Sach> DanhSachSach)
    {
        for(Sach sach:DanhSachSach)
        {
            model_Sach.addRow(new Object[]{sach.getMaSach(),sach.getTenSach(),sach.getMaTheLoai(),
                                          sach.getMaNXB(),sach.getMaTacGia(),sach.getSoLuongCon(),sach.getThongTinSach()});
        }
    }
    
    //hàm dùng để set dữ liệu thông tin sách vào model của Table Thống kê sách
    public void set_TableData_ThongKe_Sach_MuonNhieuNhat(ResultSet rs)
    {
        KhoiTao_tbl_ThongKe_Sach();
        try{
            while(rs.next())
            {
                model_ThongKe_Sach.addRow(new Object[]{rs.getString("MaSach"),rs.getString("TenSach")
                ,rs.getDate("NgayMuon"),rs.getInt("SoLuongSachMuon")});
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    //đây là hàm set dữ liệu những độc giả chưa trả sách lên table thống kê
    public void set_TableData_ThongKe_DocGia_ChuaTraSach()
    {
        //phần khởi tạo mới tbl
        DefaultTableModel model_TimKiem=new DefaultTableModel();
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
        
        String[] Column = {"Mã độc giả", "Tên độc giả"};
        model_TimKiem.setColumnIdentifiers(Column);

        ResultSet rs = thongKe_Service.get_DocGia_ChuaTraSach(cbb_ThongKeDocGia_TimKiem);
        try {
            while (rs.next()) {
                model_TimKiem.addRow(new Object[]{rs.getString("MaDocGia"), rs.getString("TenDocGia")});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
    }
    
    //đây là hàm set dữ liệu những độc giả trễ hạn trả sách lên table thống kê
    public void set_TableData_ThongKe_DocGia_TreHanTra()
    {
        //phần khởi tạo mới tbl
        DefaultTableModel model_TimKiem=new DefaultTableModel();
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
        
        String[] Column = {"Mã độc giả", "Tên độc giả", "Ngày Mượn", "Ngày Trả", "Ngày Thực Trả", "Số ngày trễ"};
        model_TimKiem.setColumnIdentifiers(Column);
        
        ResultSet rs = thongKe_Service.get_DocGia_TreHanTra(cbb_ThongKeDocGia_TimKiem);
        try {
            while (rs.next()) 
            {
                model_TimKiem.addRow(new Object[]{rs.getString("MaDocGia"),rs.getString("TenDocGia")
                ,rs.getDate("NgayMuon"),rs.getDate("NgayTra"),rs.getDate("NgayThucTra"),rs.getInt("SoNgayTreHan")});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
    }
    
    //đây là hàm set dữ liệu những độc giả mượn nhiều nhất theo ngày lên table thống kê
    public void set_TableData_ThongKe_DocGia_MuonNhieuNhatByNgay()
    {
        //phần khởi tạo mới tbl
        DefaultTableModel model_TimKiem=new DefaultTableModel();
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
        
        String[] Column = {"Mã độc giả", "Số lần mượn"};
        model_TimKiem.setColumnIdentifiers(Column);
        
        if(Date_ThongKeDocGia_TimKiem.getDate()==null)
        {
            JOptionPane.showMessageDialog(Date_ThongKeDocGia_TimKiem, "Ngày không được để trống");
            return;
        }
        
        Date NgayMuon=(Date) checkLoi.ChuyenDate(Date_ThongKeDocGia_TimKiem.getDate());//ép kiểu java sang sql
        
        ResultSet rs = thongKe_Service.get_DocGia_MuonNhieuNhat_ByNgay(NgayMuon, Date_ThongKeDocGia_TimKiem);
        
        try {
            while (rs.next()) 
            {
                model_TimKiem.addRow(new Object[]{rs.getString("MaDocGia"),rs.getString("SoLanMuon")});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
    }
    
    //đây là hàm set dữ liệu những độc giả mượn nhiều nhất theo tháng lên table thống kê
    public void set_TableData_ThongKe_DocGia_MuonNhieuNhatByThang()
    {
        //phần khởi tạo mới tbl
        DefaultTableModel model_TimKiem=new DefaultTableModel();
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
        
        String[] Column = {"Mã độc giả", "Số lần mượn"};
        model_TimKiem.setColumnIdentifiers(Column);
        
        if(Date_ThongKeDocGia_TimKiem.getDate()==null)
        {
            JOptionPane.showMessageDialog(Date_ThongKeDocGia_TimKiem, "Ngày không được để trống");
            return;
        }
        
        Date NgayMuon=(Date) checkLoi.ChuyenDate(Date_ThongKeDocGia_TimKiem.getDate());//ép kiểu java sang sql
        
        ResultSet rs = thongKe_Service.get_DocGia_MuonNhieuNhat_ByThang(NgayMuon, Date_ThongKeDocGia_TimKiem);
        
        try {
            while (rs.next()) 
            {
                model_TimKiem.addRow(new Object[]{rs.getString("MaDocGia"),rs.getString("SoLanMuon")});
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
    }
    
    //đây là hàm set dữ liệu những độc giả mượn nhiều nhất theo tháng lên table thống kê
    public void set_TableData_ThongKe_DocGia_TienPhat()
    {
        //phần khởi tạo mới tbl
        DefaultTableModel model_TimKiem=new DefaultTableModel();
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
        
        String[] Column = {"Mã độc giả", "Tên độc giả","Số tiền phạt"};
        model_TimKiem.setColumnIdentifiers(Column);
        
        ResultSet rs = thongKe_Service.get_DocGia_TienPhat(cbb_ThongKeDocGia_TimKiem);
        
        try {
            while (rs.next()) 
            {
                if(rs.getFloat("SoTienPhat")>0)
                {
                    model_TimKiem.addRow(new Object[]{rs.getString("MaDocGia"),rs.getString("TenDocGia"),rs.getFloat("SoTienPhat")});
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        tbl_ThongKe_DocGia.setModel(model_TimKiem);
    }
    
    private void set_PhieuNhap_cbb_MaNhanVien()
    {
        cbb_PhieuNhap_MaNhanVien.removeAllItems();
        ArrayList<NhanVien> DanhSachNhanVien=nhanVien_Service.get_NhanVien_All();
        for(NhanVien nhanVien:DanhSachNhanVien)
        {
            cbb_PhieuNhap_MaNhanVien.addItem(nhanVien.getMaNhanVien());
        }
    }
    
    private void set_PhieuNhap_cbb_MaNhaCungCap()
    {
        cbb_PhieuNhap_MaNhaCungCap.removeAllItems();
        ArrayList<NhaCungCap> DanhSachNhaCungCap=nhaCungCap_Service.get_NhaCungCap_All();
        for(NhaCungCap ncc:DanhSachNhaCungCap)
        {
            cbb_PhieuNhap_MaNhaCungCap.addItem(ncc.getMaNhaCungCap());
        }
    }
    
    private void set_ChiTietPhieuNhap_cbb_MaPhieuNhap()
    {
        cbb_ChiTietPhieuNhap_MaPhieuNhap.removeAllItems();
        ArrayList<PhieuNhap> DanhSachPhieuNhap=phieuNhap_Service.get_PhieuNhap_All();
        for(PhieuNhap phieuNhap:DanhSachPhieuNhap)
        {
            cbb_ChiTietPhieuNhap_MaPhieuNhap.addItem(phieuNhap.getMaPhieuNhap());
        }
    }
    
    private void set_Sach_cbb_MaTheLoai()
    {
        cbb_Sach_MaTheLoai.removeAllItems();
        ArrayList<TheLoai> DanhSachTheLoai=theLoai_Service.get_TheLoai_All();
        for(TheLoai theLoai:DanhSachTheLoai)
        {
            cbb_Sach_MaTheLoai.addItem(theLoai.getMaTheLoai());
        }
    }
    
    private void set_Sach_cbb_MaTacGia()
    {
        cbb_Sach_MaTacGia.removeAllItems();
        ArrayList<TacGia> DanhSachTacGia=tacGia_Service.get_tacGia_All();
        for(TacGia tacGia:DanhSachTacGia)
        {
            cbb_Sach_MaTacGia.addItem(tacGia.getMaTacGia());
        }
    }
    
    private void set_Sach_cbb_MaNhaXuatBan()
    {
        cbb_Sach_MaNhaXuatBan.removeAllItems();
        ArrayList<NhaXuatBan> DanhSachNhaXuatBan=nhaXuatBan_Service.get_NXB_All();
        for(NhaXuatBan nhaXuatBan:DanhSachNhaXuatBan)
        {
            cbb_Sach_MaNhaXuatBan.addItem(nhaXuatBan.getMaNXB());
        }
    }
    
    private void set_ChiTietPhieuNhap_cbb_MaSach()
    {
        cbb_ChiTietPhieuNhap_MaSach.removeAllItems();
        ArrayList<Sach> DanhSachSach=sach_Service.get_Sach_All();
        for(Sach sach:DanhSachSach)
        {
            cbb_ChiTietPhieuNhap_MaSach.addItem(sach.getMaSach());
        }
    }
    
    private void set_PhieuMuon_cbb_MaDocGia()
    {
        cbb_PhieuMuon_MaDocGia.removeAllItems();
        ArrayList<DocGia> DanhSachDocGia=docGia_Service.get_DocGia_All();
        for(DocGia docGia:DanhSachDocGia)
        {
            cbb_PhieuMuon_MaDocGia.addItem(docGia.getMaDocGia());
        }
    }
    
    private void set_PhieuMuon_cbb_MaNhanVien()
    {
        cbb_PhieuMuon_MaNhanVien.removeAllItems();
        ArrayList<NhanVien> DanhSachNhanVien=nhanVien_Service.get_NhanVien_All();
        for(NhanVien nhanVien:DanhSachNhanVien)
        {
            cbb_PhieuMuon_MaNhanVien.addItem(nhanVien.getMaNhanVien());
        }
    }
    
    private void set_PhieuMuon2_cbb_MaPhieuMuon()
    {
        cbb_PhieuMuon2_MaPhieuMuon.removeAllItems();
        ArrayList<PhieuMuon> DanhSachPhieuMuon=phieuMuon_Service.get_PhieuMuon_All();
        for(PhieuMuon phieuMuon :DanhSachPhieuMuon)
        {
            cbb_PhieuMuon2_MaPhieuMuon.addItem(phieuMuon.getMaPhieuMuon());
        }
    }
    
    private void set_PhieuMuon2_cbb_MaSach()
    {
        cbb_PhieuMuon2_MaSach.removeAllItems();
        ArrayList<Sach> DanhSachSach=sach_Service.get_Sach_All();
        for(Sach sach:DanhSachSach)
        {
            cbb_PhieuMuon2_MaSach.addItem(sach.getMaSach());
        }
    }
    
    private void set_ChiTietPhieuMuon_cbb_MaPhieuMuon()
    {
        cbb_ChiTietPhieuMuon_MaPhieuMuon.removeAllItems();
        ArrayList<PhieuMuon> DanhSachPhieuMuon=phieuMuon_Service.get_PhieuMuon_All();
        for(PhieuMuon phieuMuon :DanhSachPhieuMuon)
        {
            cbb_ChiTietPhieuMuon_MaPhieuMuon.addItem(phieuMuon.getMaPhieuMuon());
        }
    }
    
    private void set_ChiTietPhieuMuon_cbb_MaSach()
    {
        cbb_ChiTietPhieuMuon_MaSach.removeAllItems();
        ArrayList<Sach> DanhSachSach=sach_Service.get_Sach_All();
        for(Sach sach:DanhSachSach)
        {
            cbb_ChiTietPhieuMuon_MaSach.addItem(sach.getMaSach());
        }
    }
    
    private void set_PhieuMuon_TrangThai()
    {
        ArrayList<ChiTietPhieuMuon> DanhSachChiTietPhieuMuon=chiTietPhieuMuon_Service.get_ChiTietPhieuMuon_All();
        for(ChiTietPhieuMuon chiTietPhieuMuon :DanhSachChiTietPhieuMuon)
        {
            chiTietPhieuMuon_Service.set_PhieuMuon_TrangThaiLucMuon(chiTietPhieuMuon.getMaPhieuMuon());
            chiTietPhieuMuon_Service.set_PhieuMuon_TrangThaiLucTra(chiTietPhieuMuon.getMaPhieuMuon());
        }
        KhoiTao_tbl_PhieuMuon();
    }
    
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrangChuQuanLy ql=new TrangChuQuanLy();
                ql.setLocationRelativeTo(null);
                ql.setDefaultCloseOperation(EXIT_ON_CLOSE);
                ql.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_ChiTietPhieuMuon_NgayTra;
    private com.toedter.calendar.JDateChooser Date_DocGia_NgaySinh;
    private com.toedter.calendar.JDateChooser Date_NhanVien_NgaySinh;
    private com.toedter.calendar.JDateChooser Date_PhieuMuon_NgayMuon;
    private com.toedter.calendar.JDateChooser Date_PhieuMuon_NgayTra;
    private com.toedter.calendar.JDateChooser Date_PhieuNhap_NgayNhap;
    private com.toedter.calendar.JDateChooser Date_ThongKeDocGia_TimKiem;
    private com.toedter.calendar.JDateChooser Date_ThongKeSach_TimKiem;
    private javax.swing.JPanel Panel_ChiTietPhieuNhap;
    private javax.swing.JPanel Panel_DocGia;
    private javax.swing.JPanel Panel_NhaCungCap;
    private javax.swing.JPanel Panel_PhieuNhap;
    private javax.swing.JPanel Panel_Sach;
    private javax.swing.JSpinner Spinner_ChiTietPhieuMuon_SoLuong;
    private javax.swing.JSpinner Spinner_ChiTietPhieuNhap_SoLuong;
    private javax.swing.JSpinner Spinner_PhieuMuon2_SoLuong;
    private javax.swing.JSpinner Spinner_Sach_SoLuong;
    private javax.swing.ButtonGroup btnGroup_GioiTinh;
    private javax.swing.JButton btn_ChiTietPhieuMuon_Excel;
    private javax.swing.JButton btn_ChiTietPhieuMuon_Sua;
    private javax.swing.JButton btn_ChiTietPhieuMuon_Them;
    private javax.swing.JButton btn_ChiTietPhieuMuon_Tra;
    private javax.swing.JButton btn_ChiTietPhieuMuon_Xoa;
    private javax.swing.JButton btn_ChiTietPhieuNhap_Excel;
    private javax.swing.JButton btn_ChiTietPhieuNhap_Sua;
    private javax.swing.JButton btn_ChiTietPhieuNhap_Them;
    private javax.swing.JButton btn_ChiTietPhieuNhap_Xoa;
    private javax.swing.JButton btn_DangXuat;
    private javax.swing.JButton btn_DocGia_Excel;
    private javax.swing.JButton btn_DocGia_Sua;
    private javax.swing.JButton btn_DocGia_Them;
    private javax.swing.JButton btn_DocGia_Xoa;
    private javax.swing.JButton btn_NhaCungCap_Excel;
    private javax.swing.JButton btn_NhaCungCap_Sua;
    private javax.swing.JButton btn_NhaCungCap_Them;
    private javax.swing.JButton btn_NhaCungCap_Xoa;
    private javax.swing.JButton btn_NhanVien_Excel;
    private javax.swing.JButton btn_NhanVien_Sua;
    private javax.swing.JButton btn_NhanVien_Them;
    private javax.swing.JButton btn_NhanVien_Xoa;
    private javax.swing.JButton btn_PhieuMuon_Excel;
    private javax.swing.JButton btn_PhieuMuon_Sua;
    private javax.swing.JButton btn_PhieuMuon_Them;
    private javax.swing.JButton btn_PhieuMuon_Xoa;
    private javax.swing.JButton btn_PhieuNhap_Excel;
    private javax.swing.JButton btn_PhieuNhap_Sua;
    private javax.swing.JButton btn_PhieuNhap_Them;
    private javax.swing.JButton btn_PhieuNhap_Xoa;
    private javax.swing.JButton btn_Sach_Excel;
    private javax.swing.JButton btn_Sach_Sua;
    private javax.swing.JButton btn_Sach_Them;
    private javax.swing.JButton btn_Sach_Xoa;
    private javax.swing.JButton btn_ThongKeDocGia_TimKiem;
    private javax.swing.JButton btn_ThongKeSach_TimKiem;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuMuon_MaPhieuMuon;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuMuon_MaSach;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuMuon_TinhTrangSach;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuMuon_Xoa;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuNhap_MaPhieuNhap;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuNhap_MaSach;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuNhap_TimKiem;
    private javax.swing.JComboBox<String> cbb_ChiTietPhieuNhap_Xoa;
    private javax.swing.JComboBox<String> cbb_DocGia_TimKiem;
    private javax.swing.JComboBox<String> cbb_DocGia_Xoa;
    private javax.swing.JComboBox<String> cbb_NhaCungCap_TimKiem;
    private javax.swing.JComboBox<String> cbb_NhaCungCap_Xoa;
    private javax.swing.JComboBox<String> cbb_NhanVien_GioiTinh;
    private javax.swing.JComboBox<String> cbb_NhanVien_TimKiem;
    private javax.swing.JComboBox<String> cbb_NhanVien_Xoa;
    private javax.swing.JComboBox<String> cbb_PhieuMuon2_MaPhieuMuon;
    private javax.swing.JComboBox<String> cbb_PhieuMuon2_MaSach;
    private javax.swing.JComboBox<String> cbb_PhieuMuon_MaDocGia;
    private javax.swing.JComboBox<String> cbb_PhieuMuon_MaNhanVien;
    private javax.swing.JComboBox<String> cbb_PhieuMuon_TimKiem;
    private javax.swing.JComboBox<String> cbb_PhieuMuon_TinhTrang;
    private javax.swing.JComboBox<String> cbb_PhieuMuon_Xoa;
    private javax.swing.JComboBox<String> cbb_PhieuNhap_MaNhaCungCap;
    private javax.swing.JComboBox<String> cbb_PhieuNhap_MaNhanVien;
    private javax.swing.JComboBox<String> cbb_PhieuNhap_TimKiem;
    private javax.swing.JComboBox<String> cbb_PhieuNhap_Xoa;
    private javax.swing.JComboBox<String> cbb_Sach_MaNhaXuatBan;
    private javax.swing.JComboBox<String> cbb_Sach_MaTacGia;
    private javax.swing.JComboBox<String> cbb_Sach_MaTheLoai;
    private javax.swing.JComboBox<String> cbb_Sach_TimKiem;
    private javax.swing.JComboBox<String> cbb_Sach_Xoa;
    private javax.swing.JComboBox<String> cbb_ThongKeDocGia_TimKiem;
    private javax.swing.JComboBox<String> cbb_ThongKeSach_TimKiem;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton rdbtn_DocGia_Nam;
    private javax.swing.JRadioButton rdbtn_DocGia_Nu;
    private javax.swing.JTable tbl_ChiTietPhieuMuon;
    private javax.swing.JTable tbl_ChiTietPhieuNhap;
    private javax.swing.JTable tbl_DocGia;
    private javax.swing.JTable tbl_NhaCungCap;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTable tbl_PhieuMuon;
    private javax.swing.JTable tbl_PhieuNhap;
    private javax.swing.JTable tbl_Sach;
    private javax.swing.JTable tbl_ThongKe_DocGia;
    private javax.swing.JTable tbl_ThongKe_Sach;
    private javax.swing.JTextField txt_ChiTietPhieuMuon_TienPhat;
    private javax.swing.JTextField txt_ChiTietPhieuMuon_Xoa;
    private javax.swing.JTextField txt_ChiTietPhieuNhap_DonGia;
    private javax.swing.JTextField txt_ChiTietPhieuNhap_TimKiem;
    private javax.swing.JTextField txt_DocGia_DiaChi;
    private javax.swing.JTextField txt_DocGia_MaDocGia;
    private javax.swing.JTextField txt_DocGia_SDT;
    private javax.swing.JTextField txt_DocGia_TenDocGia;
    private javax.swing.JTextField txt_DocGia_TimKiem;
    private javax.swing.JTextField txt_DocGia_TimKiem2;
    private javax.swing.JTextField txt_DocGia_Xoa;
    private javax.swing.JTextField txt_NhaCungCap_DiaChi;
    private javax.swing.JTextField txt_NhaCungCap_Email;
    private javax.swing.JTextField txt_NhaCungCap_MaNhaCungCap;
    private javax.swing.JTextField txt_NhaCungCap_SDT;
    private javax.swing.JTextField txt_NhaCungCap_TenNhaCungCap;
    private javax.swing.JTextField txt_NhaCungCap_TimKiem;
    private javax.swing.JTextField txt_NhaCungCap_Xoa;
    private javax.swing.JTextField txt_NhanVien_Email;
    private javax.swing.JTextArea txt_NhanVien_GhiChu;
    private javax.swing.JTextField txt_NhanVien_MaNhanVien;
    private javax.swing.JTextField txt_NhanVien_QueQuan;
    private javax.swing.JTextField txt_NhanVien_SDT;
    private javax.swing.JTextField txt_NhanVien_TenNhanVien;
    private javax.swing.JTextField txt_NhanVien_TimKiem;
    private javax.swing.JTextField txt_NhanVien_Xoa;
    private javax.swing.JTextField txt_PhieuMuon_MaPhieuMuon;
    private javax.swing.JTextField txt_PhieuMuon_TimKiem;
    private javax.swing.JTextField txt_PhieuMuon_Xoa;
    private javax.swing.JTextField txt_PhieuNhap_MaPhieuNhap;
    private javax.swing.JTextField txt_PhieuNhap_ThanhTien;
    private javax.swing.JTextField txt_PhieuNhap_TimKiem;
    private javax.swing.JTextField txt_PhieuNhap_Xoa;
    private javax.swing.JTextField txt_Sach_MaSach;
    private javax.swing.JTextField txt_Sach_TenNhaXuatBan;
    private javax.swing.JTextField txt_Sach_TenSach;
    private javax.swing.JTextField txt_Sach_TenTacGia;
    private javax.swing.JTextField txt_Sach_TenTheLoai;
    private javax.swing.JTextArea txt_Sach_ThongTinSach;
    private javax.swing.JTextField txt_Sach_TimKiem;
    private javax.swing.JTextField txt_Sach_Xoa;
    // End of variables declaration//GEN-END:variables
}
