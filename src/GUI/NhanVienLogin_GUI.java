
package GUI;

import DTO.CheckLoi;
import DTO.DBConnection;
import DTO.DocGia;
import DTO.NhaCungCap;
import DTO.NhaXuatBan;
import DTO.TacGia;
import DTO.Excel;
import DTO.Sach;
import DTO.TheLoai;
import BUS.DocGia_Service;
import BUS.NhaCungCap_Service;
import BUS.NhaXuatBan_Service;
import BUS.TacGia_Service;
import BUS.Sach_Service;
import BUS.TheLoai_Service;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class NhanVienLogin_GUI extends javax.swing.JFrame {

    private DefaultTableModel model_NhaCungCap=new DefaultTableModel();
    private DefaultTableModel model_TacGia = new DefaultTableModel();
    private DefaultTableModel model_NhaXuatBan = new DefaultTableModel();
    private DefaultTableModel model_Sach=new DefaultTableModel();
    private DefaultTableModel model_DocGia=new DefaultTableModel();
    private DefaultTableModel model_TheLoai=new DefaultTableModel();
    
    private final Sach_Service sach_Service=new Sach_Service();
    private final TacGia_Service tacGia_Service = new TacGia_Service();
    private final NhaXuatBan_Service nhaXuatBan_Service = new NhaXuatBan_Service();
    private final NhaCungCap_Service nhaCungCap_Service=new NhaCungCap_Service();
    private final TheLoai_Service theLoai_Service=new TheLoai_Service();
    private final DocGia_Service docGia_Service=new DocGia_Service();
    
    private final Connection connection = DBConnection.GetConnection();
    private final CheckLoi checkLoi = new CheckLoi();
    private final Excel excel=new Excel();
    
    public NhanVienLogin_GUI() {
        initComponents();
        KhoiTao_tbl_QuanLyNhaCungCap();
        KhoiTao_tbl_TacGia();
        KhoiTao_tbl_DocGia();
        KhoiTaotbl_NhaXuatBan();
        KhoiTao_tbl_Sach();
        KhoiTao_tbl_TheLoai();
        
        set_Sach_cbb_MaNhaXuatBan();
        set_Sach_cbb_MaTacGia();
        set_Sach_cbb_MaTheLoai();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txt_TacGia_TenTacGia = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_TacGia = new javax.swing.JTable();
        btnThem_TacGia = new javax.swing.JButton();
        btnSua_TacGia = new javax.swing.JButton();
        btnXoa_TacGia = new javax.swing.JButton();
        txtXoa_TacGia = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cbbox_TacGia_GioiTinh = new javax.swing.JComboBox<>();
        txt_TacGia_Email = new javax.swing.JTextField();
        txt_TacGia_DiaChi = new javax.swing.JTextField();
        txt_TacGia_MaTacGia = new javax.swing.JTextField();
        cbboxXoa_TacGia = new javax.swing.JComboBox<>();
        txtTimKiem_TacGia = new javax.swing.JTextField();
        cbboxTimKiem_TacGia = new javax.swing.JComboBox<>();
        Date_TacGia_NgaySinh = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        btn_TacGia_Excel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Panel_NhaCungCap1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_NhaCungCap_MaNhaCungCap = new javax.swing.JTextField();
        txt_NhaCungCap_TenNhaCungCap = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_NhaCungCap_DiaChi = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_NhaCungCap_Email = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_NhaCungCap_SDT = new javax.swing.JTextField();
        btn_NhaCungCap_Them = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_NhaCungCap = new javax.swing.JTable();
        btn_NhaCungCap_Xoa = new javax.swing.JButton();
        btn_NhaCungCap_Sua = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txt_NhaCungCap_TimKiem = new javax.swing.JTextField();
        cbb_NhaCungCap_Xoa = new javax.swing.JComboBox<>();
        txt_NhaCungCap_Xoa = new javax.swing.JTextField();
        cbb_NhaCungCap_TimKiem = new javax.swing.JComboBox<>();
        btn_NhaCungCap_Excel = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_SortNXB_TenNXB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_SortNXB = new javax.swing.JTable();
        btn_SortNXB_Add = new javax.swing.JButton();
        txt_SortNXB_DiaChi = new javax.swing.JTextField();
        txt_SortNXB_Email = new javax.swing.JTextField();
        txt_SortNXB_SDT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_SortNXB_Sua = new javax.swing.JButton();
        btn_SortNXB_Xoa = new javax.swing.JButton();
        txt_SortNXB_TimKiem = new javax.swing.JTextField();
        txt_SortNXB_MaNXB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbb_SortNXB_TimKiem = new javax.swing.JComboBox<>();
        cbb_SortNXB_Xoa = new javax.swing.JComboBox<>();
        txt_SortNXB_Xoa = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_NhaXuatBan_Excel = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_Sach = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        txt_Sach_TimKiem = new javax.swing.JTextField();
        cbb_Sach_TimKiem = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_Sach_ThongTinSach = new javax.swing.JTextArea();
        txt_Sach_TenSach = new javax.swing.JTextField();
        cbb_Sach_MaTheLoai = new javax.swing.JComboBox<>();
        txt_Sach_TenTheLoai = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
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
        jPanel7 = new javax.swing.JPanel();
        Panel_DocGia = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_DocGia_MaDocGia = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbl_DocGia = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
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
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TheLoai = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txt_TheLoai_MaTheLoai = new javax.swing.JTextField();
        txt_TheLoai_TenTheLoai = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txt_TheLoai_TimKiem = new javax.swing.JTextField();
        cbb_TheLoai_TimKiem = new javax.swing.JComboBox<>();
        btn_TheLoai_Them = new javax.swing.JButton();
        btn_TheLoai_Xoa = new javax.swing.JButton();
        cbb_TheLoai_Xoa = new javax.swing.JComboBox<>();
        btn_TheLoai_Sua = new javax.swing.JButton();
        btn_TheLoai_Excel = new javax.swing.JButton();
        txt_TheLoai_Xoa = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        btn_DangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel26.setText("Tên tác giả:");

        tbl_TacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã tác giả", "Tên tác giả", "Ngày sinh", "Giới tính", "Email", "Địa chỉ"
            }
        ));
        tbl_TacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TacGiaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_TacGia);

        btnThem_TacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btnThem_TacGia.setText("Thêm");
        btnThem_TacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem_TacGiaActionPerformed(evt);
            }
        });

        btnSua_TacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btnSua_TacGia.setText("Sửa");
        btnSua_TacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua_TacGiaActionPerformed(evt);
            }
        });

        btnXoa_TacGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btnXoa_TacGia.setText("Xóa");
        btnXoa_TacGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa_TacGiaActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NgaySinh(Chung)_25px.png"))); // NOI18N
        jLabel27.setText("Ngày sinh:");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_GioiTinh(Chung)_25px_2.png"))); // NOI18N
        jLabel28.setText("Giới tính:");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Email(Chung)_25px_2.png"))); // NOI18N
        jLabel29.setText("Email:");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TacGia_DiaChi_25px.png"))); // NOI18N
        jLabel30.setText("Địa chỉ:");

        cbbox_TacGia_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        txt_TacGia_MaTacGia.setEnabled(false);

        cbboxXoa_TacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tác giả", "Tên tác giả", "Dòng được chọn" }));

        txtTimKiem_TacGia.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiem_TacGiaCaretUpdate(evt);
            }
        });

        cbboxTimKiem_TacGia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã tác giả", "Tên tác giả", "Không có" }));

        Date_TacGia_NgaySinh.setDateFormatString("yyyy-MM-dd");

        jLabel21.setText("Từ khóa:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel1.setText("Mã tác giả:");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel70.setText("Tìm kiếm");

        btn_TacGia_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_TacGia_Excel.setText("Excel");
        btn_TacGia_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TacGia_ExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTimKiem_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbboxTimKiem_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbbox_TacGia_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel70))
                                            .addComponent(txt_TacGia_MaTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(txt_TacGia_TenTacGia))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel29)
                                                    .addComponent(jLabel30))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_TacGia_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_TacGia_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnThem_TacGia)
                                                    .addComponent(btnSua_TacGia))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtXoa_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(btnXoa_TacGia)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cbboxXoa_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(Date_TacGia_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(336, 336, 336)))
                                .addGap(10, 10, 10)
                                .addComponent(btn_TacGia_Excel)))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TacGia_MaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel1)
                            .addComponent(txt_TacGia_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(txt_TacGia_TenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addComponent(jLabel27))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel30)
                                .addComponent(txt_TacGia_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Date_TacGia_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbox_TacGia_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(btnThem_TacGia)
                    .addComponent(btnXoa_TacGia)
                    .addComponent(cbboxXoa_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua_TacGia)
                            .addComponent(txtXoa_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_TacGia_Excel))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbboxTimKiem_TacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản Lý Tác Giả", jPanel4);

        Panel_NhaCungCap1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel9.setText("Mã nhà cung cấp:");
        jLabel9.setFocusable(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel16.setText("Tên nhà cung cấp:");
        jLabel16.setFocusable(false);

        txt_NhaCungCap_MaNhaCungCap.setEnabled(false);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TacGia_DiaChi_25px.png"))); // NOI18N
        jLabel17.setText("Địa chỉ:");
        jLabel17.setFocusable(false);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Email(Chung)_25px_2.png"))); // NOI18N
        jLabel18.setText("Email:");
        jLabel18.setFocusable(false);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_DienThoai_25px.png"))); // NOI18N
        jLabel19.setText("Số điện thoại:");
        jLabel19.setFocusable(false);

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
        jScrollPane3.setViewportView(tbl_NhaCungCap);

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

        jLabel20.setText("Từ khóa:");
        jLabel20.setFocusable(false);

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

        javax.swing.GroupLayout Panel_NhaCungCap1Layout = new javax.swing.GroupLayout(Panel_NhaCungCap1);
        Panel_NhaCungCap1.setLayout(Panel_NhaCungCap1Layout);
        Panel_NhaCungCap1Layout.setHorizontalGroup(
            Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                        .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_NhaCungCap_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                            .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_NhaCungCap1Layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addGap(18, 18, 18))
                                                .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                                    .addComponent(jLabel17)
                                                    .addGap(71, 71, 71)))
                                            .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txt_NhaCungCap_TenNhaCungCap)
                                                .addComponent(txt_NhaCungCap_DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                                    .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel68)))
                                .addGap(67, 67, 67)
                                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_NhaCungCap_Them)
                                    .addComponent(jLabel19)
                                    .addComponent(btn_NhaCungCap_Sua)
                                    .addComponent(jLabel18)))
                            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txt_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_NhaCungCap_SDT, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txt_NhaCungCap_Email))
                            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                        .addComponent(btn_NhaCungCap_Xoa)
                                        .addGap(37, 37, 37)
                                        .addComponent(cbb_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_NhaCungCap_Excel))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        Panel_NhaCungCap1Layout.setVerticalGroup(
            Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_NhaCungCap_MaNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_NhaCungCap_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_NhaCungCap_TenNhaCungCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NhaCungCap_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_NhaCungCap_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_NhaCungCap_Them)
                    .addComponent(btn_NhaCungCap_Xoa)
                    .addComponent(cbb_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_NhaCungCap_Sua)
                            .addComponent(txt_NhaCungCap_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(Panel_NhaCungCap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txt_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbb_NhaCungCap_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_NhaCungCap_Excel))))
                    .addGroup(Panel_NhaCungCap1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel68)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_NhaCungCap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Panel_NhaCungCap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý nhà cung cấp", jPanel3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel10.setText("Tên nhà xuất bản:");

        tbl_SortNXB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NXB", "Tên NXB", "Địa Chỉ", "Email", "SĐT"
            }
        ));
        tbl_SortNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SortNXBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_SortNXB);

        btn_SortNXB_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_SortNXB_Add.setText("Thêm");
        btn_SortNXB_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SortNXB_AddActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TacGia_DiaChi_25px.png"))); // NOI18N
        jLabel11.setText("Địa Chỉ:");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Email(Chung)_25px_2.png"))); // NOI18N
        jLabel12.setText("Email:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_DienThoai_25px.png"))); // NOI18N
        jLabel13.setText("Số điện thoại:");

        btn_SortNXB_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_SortNXB_Sua.setText("Sửa");
        btn_SortNXB_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SortNXB_SuaActionPerformed(evt);
            }
        });

        btn_SortNXB_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_SortNXB_Xoa.setText("Xóa");
        btn_SortNXB_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SortNXB_XoaActionPerformed(evt);
            }
        });

        txt_SortNXB_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_SortNXB_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_SortNXB_TimKiemCaretUpdate(evt);
            }
        });

        txt_SortNXB_MaNXB.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel2.setText("Mã NXB:");

        jLabel14.setText("Từ khóa:");

        cbb_SortNXB_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà xuất bản", "Tên nhà xuất bản", "Không có" }));

        cbb_SortNXB_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã nhà xuất bản", "Tên nhà xuất bản", "Dòng được chọn" }));

        txt_SortNXB_Xoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setToolTipText("");

        btn_NhaXuatBan_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_NhaXuatBan_Excel.setText("Excel");
        btn_NhaXuatBan_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NhaXuatBan_ExcelActionPerformed(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel69.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_SortNXB_MaNXB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txt_SortNXB_DiaChi)
                                    .addComponent(txt_SortNXB_SDT))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_SortNXB_TenNXB, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(txt_SortNXB_Email)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_SortNXB_Add)
                                            .addComponent(btn_SortNXB_Sua)
                                            .addComponent(btn_NhaXuatBan_Excel))
                                        .addGap(61, 61, 61)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_SortNXB_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn_SortNXB_Xoa)
                                                .addGap(24, 24, 24)
                                                .addComponent(cbb_SortNXB_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_SortNXB_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_SortNXB_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel69)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(199, 199, 199))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_SortNXB_TenNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SortNXB_MaNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_SortNXB_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txt_SortNXB_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_SortNXB_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_SortNXB_Add)
                            .addComponent(btn_SortNXB_Xoa)
                            .addComponent(cbb_SortNXB_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_SortNXB_Sua)
                            .addComponent(txt_SortNXB_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_NhaXuatBan_Excel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_SortNXB_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_SortNXB_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Quản Lý Nhà Xuất Bản", jPanel2);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

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
        jScrollPane5.setViewportView(tbl_Sach);

        jLabel31.setText("Từ khóa:");
        jLabel31.setFocusable(false);

        txt_Sach_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_Sach_TimKiemCaretUpdate(evt);
            }
        });

        cbb_Sach_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã sách", "Tên sách", "Không có" }));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_GhiChu_25px.png"))); // NOI18N
        jLabel32.setText("Thông tin sách:");

        txt_Sach_ThongTinSach.setColumns(20);
        txt_Sach_ThongTinSach.setRows(5);
        jScrollPane6.setViewportView(txt_Sach_ThongTinSach);

        cbb_Sach_MaTheLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbb_Sach_MaTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_Sach_MaTheLoaiActionPerformed(evt);
            }
        });

        txt_Sach_TenTheLoai.setEnabled(false);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel33.setText("Mã tác giả:");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel34.setText("Tên tác giả:");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel35.setText("Mã nhà xuất bản:");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel36.setText("Tên nhà xuất bản:");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_estimates_25px.png"))); // NOI18N
        jLabel37.setText("Số lượng:");

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

        Spinner_Sach_SoLuong.setEnabled(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel44.setText("Tìm kiếm");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6)
                                    .addComponent(cbb_Sach_MaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Sach_TenTheLoai)
                                    .addComponent(txt_Sach_TenSach)
                                    .addComponent(txt_Sach_MaSach)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel44)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Sach_Sua, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Sach_Them, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Sach_Excel)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(btn_Sach_Xoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbb_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel35))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbb_Sach_MaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Sach_TenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbb_Sach_MaNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel37))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Sach_TenNhaXuatBan)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(Spinner_Sach_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbb_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel33)
                    .addComponent(cbb_Sach_MaTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Sach_MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Sach_TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(txt_Sach_TenTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(cbb_Sach_MaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(cbb_Sach_MaNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Sach_TenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(txt_Sach_TenNhaXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel37))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Spinner_Sach_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Sach_Them)
                            .addComponent(btn_Sach_Xoa)
                            .addComponent(cbb_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(txt_Sach_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txt_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_Sach_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Sach_Excel)
                            .addComponent(btn_Sach_Sua))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel5);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel38.setText("Mã độc giả:");

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_HoTen(Chung)_25px_1.png"))); // NOI18N
        jLabel39.setText("Tên độc giả:");

        txt_DocGia_MaDocGia.setEnabled(false);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_GioiTinh(Chung)_25px_2.png"))); // NOI18N
        jLabel40.setText("Giới tính:");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NhanVien_DienThoai_25px.png"))); // NOI18N
        jLabel41.setText("Số điện thoại:");

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TacGia_DiaChi_25px.png"))); // NOI18N
        jLabel42.setText("Địa chỉ:");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_NgaySinh(Chung)_25px.png"))); // NOI18N
        jLabel43.setText("Ngày sinh:");

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
        jScrollPane7.setViewportView(tbl_DocGia);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel45.setText("Tìm kiếm");

        jLabel46.setText("Từ khóa:");

        txt_DocGia_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_DocGia_TimKiemCaretUpdate(evt);
            }
        });

        cbb_DocGia_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã độc giả", "Tên độc giả", "Không có" }));

        buttonGroup1.add(rdbtn_DocGia_Nu);
        rdbtn_DocGia_Nu.setText("Nữ");

        buttonGroup1.add(rdbtn_DocGia_Nam);
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txt_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cbb_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel45)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(rdbtn_DocGia_Nam)
                                        .addGap(52, 52, 52)
                                        .addComponent(rdbtn_DocGia_Nu))
                                    .addComponent(txt_DocGia_MaDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txt_DocGia_TenDocGia)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DocGia_SDT)
                                    .addComponent(txt_DocGia_DiaChi)
                                    .addComponent(Date_DocGia_NgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(134, 134, 134)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btn_DocGia_Excel)
                                .addGap(277, 277, 277))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_DocGia_Them)
                                    .addComponent(btn_DocGia_Sua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(btn_DocGia_Xoa)
                                        .addGap(32, 32, 32)
                                        .addComponent(cbb_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(95, 95, 95))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane7)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt_DocGia_MaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_DocGia_TenDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbtn_DocGia_Nam)
                            .addComponent(rdbtn_DocGia_Nu)
                            .addComponent(jLabel40))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(txt_DocGia_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(txt_DocGia_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_DocGia_Xoa)
                                .addComponent(cbb_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addComponent(txt_DocGia_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(btn_DocGia_Them)
                            .addGap(30, 30, 30)
                            .addComponent(btn_DocGia_Sua)
                            .addGap(30, 30, 30)
                            .addComponent(btn_DocGia_Excel))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(Date_DocGia_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(cbb_DocGia_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_DocGiaLayout = new javax.swing.GroupLayout(Panel_DocGia);
        Panel_DocGia.setLayout(Panel_DocGiaLayout);
        Panel_DocGiaLayout.setHorizontalGroup(
            Panel_DocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Panel_DocGiaLayout.setVerticalGroup(
            Panel_DocGiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel_DocGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel_DocGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý độc giả", jPanel7);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setText("Mã thể loại:");

        tbl_TheLoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã thể loại", "Tên thể loại"
            }
        ));
        tbl_TheLoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TheLoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_TheLoai);

        jLabel4.setText("Tên thể loại:");

        txt_TheLoai_MaTheLoai.setEnabled(false);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_TimKiem(Chung)_25px.png"))); // NOI18N
        jLabel47.setText("Tìm kiếm");

        jLabel48.setText("Từ khóa:");

        txt_TheLoai_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_TheLoai_TimKiemCaretUpdate(evt);
            }
        });

        cbb_TheLoai_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã thể loại", "Tên thể loại", "Không có" }));

        btn_TheLoai_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Them(Chung)_25px.png"))); // NOI18N
        btn_TheLoai_Them.setText("Thêm");
        btn_TheLoai_Them.setFocusable(false);
        btn_TheLoai_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TheLoai_ThemActionPerformed(evt);
            }
        });

        btn_TheLoai_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Xoa(Chung)_25px.png"))); // NOI18N
        btn_TheLoai_Xoa.setText("Xóa");
        btn_TheLoai_Xoa.setFocusable(false);
        btn_TheLoai_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TheLoai_XoaActionPerformed(evt);
            }
        });

        cbb_TheLoai_Xoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã thể loại", "Tên thể loại", "Dòng được chọn" }));

        btn_TheLoai_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Sua(Chung)_25px.png"))); // NOI18N
        btn_TheLoai_Sua.setText("Sửa");
        btn_TheLoai_Sua.setFocusable(false);
        btn_TheLoai_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TheLoai_SuaActionPerformed(evt);
            }
        });

        btn_TheLoai_Excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_microsoft_excel_25px.png"))); // NOI18N
        btn_TheLoai_Excel.setText("Excel");
        btn_TheLoai_Excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TheLoai_ExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(txt_TheLoai_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(cbb_TheLoai_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel47))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_TheLoai_MaTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(txt_TheLoai_TenTheLoai))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btn_TheLoai_Excel)
                                .addGap(277, 277, 277))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_TheLoai_Them)
                                    .addComponent(btn_TheLoai_Sua))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_TheLoai_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(btn_TheLoai_Xoa)
                                        .addGap(32, 32, 32)
                                        .addComponent(cbb_TheLoai_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(132, 132, 132)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_TheLoai_MaTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TheLoai_TenTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel47))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_TheLoai_Xoa)
                                    .addComponent(cbb_TheLoai_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(txt_TheLoai_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(btn_TheLoai_Them)
                                .addGap(30, 30, 30)
                                .addComponent(btn_TheLoai_Sua)
                                .addGap(30, 30, 30)
                                .addComponent(btn_TheLoai_Excel)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TheLoai_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(cbb_TheLoai_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Quản lý thể loại sách", jPanel9);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));

        btn_DangXuat.setText("Quay về");
        btn_DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_DangXuat)
                .addContainerGap(806, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btn_DangXuat)
                .addContainerGap(514, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Đăng xuất", jPanel11);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void tbl_SortNXBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SortNXBMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbl_SortNXB.getModel();
        int SelectedRow = tbl_SortNXB.getSelectedRow();
        txt_SortNXB_MaNXB.setText(String.valueOf(tbl_SortNXB.getValueAt(SelectedRow, 0)));
        txt_SortNXB_TenNXB.setText(String.valueOf(tbl_SortNXB.getValueAt(SelectedRow, 1)));
        txt_SortNXB_DiaChi.setText(String.valueOf(tbl_SortNXB.getValueAt(SelectedRow, 2)));
        txt_SortNXB_Email.setText(String.valueOf(tbl_SortNXB.getValueAt(SelectedRow, 3)));
        txt_SortNXB_SDT.setText(String.valueOf(tbl_SortNXB.getValueAt(SelectedRow, 4)));
    }//GEN-LAST:event_tbl_SortNXBMouseClicked

    private void btn_SortNXB_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SortNXB_AddActionPerformed
        // TODO add your handling code here:
        NhaXuatBan nxb = new NhaXuatBan();
        if (txt_SortNXB_TenNXB.getText().isBlank() && txt_SortNXB_DiaChi.getText().isBlank() && txt_SortNXB_Email.getText().isBlank()
            && txt_SortNXB_SDT.getText().isBlank())

        {
            JOptionPane.showMessageDialog(this, "Hãy điền đầy đủ thông tin");
            return;
        }

        nxb.setTenNXB(txt_SortNXB_TenNXB.getText());
        nxb.setDiaChi(txt_SortNXB_DiaChi.getText());
        nxb.setEmail(txt_SortNXB_Email.getText());
        nxb.setSDT(txt_SortNXB_SDT.getText());
        // nhaXuatBan_Service.addNXB(nxb,this);
        nhaXuatBan_Service.addNXB(nxb, this);
        model_NhaXuatBan.addRow(new Object[]{nxb.getMaNXB(), nxb.getTenNXB(), nxb.getDiaChi(), nxb.getEmail(), nxb.getSDT()});

        txt_SortNXB_TenNXB.setText("");
        txt_SortNXB_DiaChi.setText("");
        txt_SortNXB_Email.setText("");
        txt_SortNXB_SDT.setText("");
        
        set_Sach_cbb_MaNhaXuatBan();
        KhoiTao_tbl_Sach();
        KhoiTaotbl_NhaXuatBan();
        
    }//GEN-LAST:event_btn_SortNXB_AddActionPerformed

    private void btn_SortNXB_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SortNXB_SuaActionPerformed
        // TODO add your handling code here:
        if (tbl_SortNXB.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn sách muốn sửa");
            return;
        }

        int SelectedRow = tbl_SortNXB.getSelectedRow();

        NhaXuatBan nxb = new NhaXuatBan();
        nxb.setMaNXB(txt_SortNXB_MaNXB.getText());
        nxb.setTenNXB(txt_SortNXB_TenNXB.getText());
        nxb.setDiaChi(txt_SortNXB_DiaChi.getText());
        nxb.setEmail(txt_SortNXB_Email.getText());
        nxb.setSDT(txt_SortNXB_SDT.getText());

        // Thực hiện sửa dữ liệu trong database
        nhaXuatBan_Service.UpdateNXB(nxb, btn_SortNXB_Sua, "Sửa thành công");

        //thay đổi dữ liệu trong tbl
        //    model.setValueAt(nxb.getMaNXB(), SelectedRow, 0);
        model_NhaXuatBan.setValueAt(nxb.getTenNXB(), SelectedRow, 1);
        model_NhaXuatBan.setValueAt(nxb.getDiaChi(), SelectedRow, 2);
        model_NhaXuatBan.setValueAt(nxb.getEmail(), SelectedRow, 3);
        model_NhaXuatBan.setValueAt(nxb.getSDT(), SelectedRow, 4);

        tbl_SortNXB.setModel(model_NhaXuatBan);
        KhoiTao_tbl_Sach();
    }//GEN-LAST:event_btn_SortNXB_SuaActionPerformed

    private void btn_SortNXB_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SortNXB_XoaActionPerformed
        NhaXuatBan nxb = new NhaXuatBan();

        if (cbb_SortNXB_Xoa.getSelectedIndex() == 2)//Xóa theo dòng
        {
            if (tbl_SortNXB.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(tbl_SortNXB, "Không có dòng nào được chọn cả");
                return;
            }

            int SelectedRow = tbl_SortNXB.getSelectedRow();
            String MaNXB = (String) model_NhaXuatBan.getValueAt(SelectedRow, 0);
            nhaXuatBan_Service.XoaNXBTheoMaNXB(MaNXB, tbl_SortNXB, "Xóa thành công");

            KhoiTaotbl_NhaXuatBan();
            return;
        }

        if (cbb_SortNXB_Xoa.getSelectedIndex() == 0)//Xóa theo mã
        {
            if (txt_SortNXB_Xoa.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào mã bạn muốn xóa");
                return;
            }
            String MaNXB = txt_SortNXB_Xoa.getText();
            nhaXuatBan_Service.XoaNXBTheoMaNXB(MaNXB, txt_SortNXB_Xoa, "Xóa thành công");
            txt_SortNXB_Xoa.setText("");

            KhoiTaotbl_NhaXuatBan();
            return;

        }

        if (cbb_SortNXB_Xoa.getSelectedIndex() == 1)//Xóa theo tên NXB
        {
            if (txt_SortNXB_Xoa.getText().isBlank()) {
                JOptionPane.showMessageDialog(this, "Hãy nhập vào tên nhà xuất bản bạn muốn xóa");
                return;
            }

            String TenNXB = txt_SortNXB_Xoa.getText();
            nhaXuatBan_Service.XoaNXBTheoTenNXB(TenNXB, txt_SortNXB_Xoa, "Xóa thành công");
            txt_SortNXB_Xoa.setText("");

            KhoiTaotbl_NhaXuatBan();
            return;
        }
        
        set_Sach_cbb_MaNhaXuatBan();
        KhoiTao_tbl_Sach();
        
        KhoiTaotbl_NhaXuatBan();

    }//GEN-LAST:event_btn_SortNXB_XoaActionPerformed

    private void txt_SortNXB_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_SortNXB_TimKiemCaretUpdate
        // TODO add your handling code here:
        if (txt_SortNXB_TimKiem.getText().isBlank())
        {
            tbl_SortNXB.setModel(model_NhaXuatBan);
        }
        else
        {
            DefaultTableModel model_TimKiem = new DefaultTableModel();

            String Column[] = {"Mã NXB", "Tên NXB", "Địa Chỉ", "Email", "SĐT"};
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_SortNXB_TimKiem.getSelectedIndex() == 1)// Tìm kiếm theo tên nxb
            {
                ArrayList<NhaXuatBan> DanhSachNXB = nhaXuatBan_Service.getNXBByTenNXB(txt_SortNXB_TimKiem.getText());
                for (NhaXuatBan nxb : DanhSachNXB) 
                {
                    model_TimKiem.addRow(new Object[]{nxb.getMaNXB(), nxb.getTenNXB(), nxb.getDiaChi(),
                        nxb.getEmail(), nxb.getSDT()});
                }

                tbl_SortNXB.setModel(model_TimKiem);
            }
            else if (cbb_SortNXB_TimKiem.getSelectedIndex() == 0)//Tìm kiếm theo mã nxb
            {
                ArrayList<NhaXuatBan> DanhSachNXB = nhaXuatBan_Service.getNXBByMaNXB(txt_SortNXB_TimKiem.getText());
                for (NhaXuatBan nxb : DanhSachNXB) 
                {
                    model_TimKiem.addRow(new Object[]{nxb.getMaNXB(), nxb.getTenNXB(), nxb.getDiaChi(),
                        nxb.getEmail(), nxb.getSDT()});
                }

                tbl_SortNXB.setModel(model_TimKiem);
            }
            else
            {
                tbl_SortNXB.setModel(model_NhaXuatBan);
            }
        }
    }//GEN-LAST:event_txt_SortNXB_TimKiemCaretUpdate

    private void tbl_TacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TacGiaMouseClicked
        DefaultTableModel tblQuanLyTacGia = (DefaultTableModel) tbl_TacGia.getModel();//lấy model của Table Quản lý sách
        int SelectedRow = tbl_TacGia.getSelectedRow();

        txt_TacGia_MaTacGia.setText(String.valueOf(tblQuanLyTacGia.getValueAt(SelectedRow, 0)));
        txt_TacGia_TenTacGia.setText(String.valueOf(tblQuanLyTacGia.getValueAt(SelectedRow, 1)));
        Date_TacGia_NgaySinh.setDate((Date) model_TacGia.getValueAt(SelectedRow, 2));
        cbbox_TacGia_GioiTinh.setSelectedItem(tblQuanLyTacGia.getValueAt(SelectedRow, 3));
        txt_TacGia_Email.setText(String.valueOf(tblQuanLyTacGia.getValueAt(SelectedRow, 4)));
        txt_TacGia_DiaChi.setText(String.valueOf(tblQuanLyTacGia.getValueAt(SelectedRow, 5)));
    }//GEN-LAST:event_tbl_TacGiaMouseClicked

    private void btnThem_TacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem_TacGiaActionPerformed
        TacGia tacgia = new TacGia();

        if (txt_TacGia_TenTacGia.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_TacGia_TenTacGia, "Tên tác giả không được để trống");
            return;
        }

        if (txt_TacGia_Email.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_TacGia_Email, "Email tác giả không được để trống");
            return;
        }

        if (txt_TacGia_DiaChi.getText().isBlank()) {
            JOptionPane.showMessageDialog(txt_TacGia_DiaChi, "Địa chỉ tác giả không được để trống");
            return;
        }

        if (Date_TacGia_NgaySinh.getDate() == null)//nếu ngày sinh độc giả bị để trống thì sẽ hiện ra thông báo
        {
            JOptionPane.showMessageDialog(txt_TacGia_DiaChi, "Ngày sinh tác giả không được để trống");
            return;
        }

        tacgia.setMaTacGia(txt_TacGia_MaTacGia.getText());
        tacgia.setTenTacGia(txt_TacGia_TenTacGia.getText());
        tacgia.setNgaySinh((java.sql.Date) (Date) checkLoi.ChuyenDate(Date_TacGia_NgaySinh.getDate()));
        tacgia.setGioiTinh((String) cbbox_TacGia_GioiTinh.getSelectedItem());
        tacgia.setEmail(txt_TacGia_Email.getText());
        tacgia.setDiaChi(txt_TacGia_DiaChi.getText());

        tacGia_Service.add_tacGia(tacgia, this);
        model_TacGia.addRow(new Object[]{tacgia.getMaTacGia(), tacgia.getTenTacGia(), tacgia.getNgaySinh(), tacgia.getGioiTinh(),
            tacgia.getEmail(), tacgia.getDiaChi()});
        
        KhoiTao_tbl_TacGia();
        
        set_Sach_cbb_MaTacGia();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btnThem_TacGiaActionPerformed

    private void btnSua_TacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua_TacGiaActionPerformed
        if (tbl_TacGia.getSelectedRow() == -1)//nếu table ko chọn dòng nào thì trả về
        {
            return;
        }

        int SelectedRow = tbl_TacGia.getSelectedRow();//lấy số dòng được chọn

        //đây là phần khởi tạo thông tin độc giả lấy dữ liệu từ các Text và combobox
        TacGia tacgia = new TacGia();
        tacgia.setMaTacGia(txt_TacGia_MaTacGia.getText());
        tacgia.setTenTacGia(txt_TacGia_TenTacGia.getText());
        tacgia.setNgaySinh((java.sql.Date) (Date) checkLoi.ChuyenDate(Date_TacGia_NgaySinh.getDate()));
        tacgia.setGioiTinh((String) cbbox_TacGia_GioiTinh.getSelectedItem());
        tacgia.setEmail(txt_TacGia_Email.getText());
        tacgia.setDiaChi(txt_TacGia_DiaChi.getText());

        //đây là phần thực hiện sửa dữ liệu trong database
        tacGia_Service.Sua_TacGia(tacgia, btnSua_TacGia);

        //đây là phần thực hiện thay đổi dữ liệu trong tblQuanLyDocGia
        KhoiTao_tbl_TacGia();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btnSua_TacGiaActionPerformed

    private void btnXoa_TacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa_TacGiaActionPerformed
        if (cbboxXoa_TacGia.getSelectedIndex() == 0)//xóa độc giả theo mã tác giả
        {

            if (txtXoa_TacGia.getText().isBlank()) {
                JOptionPane.showMessageDialog(txtXoa_TacGia, "Hãy điền vào ô trống!!");
                return;
            }

            String MaTacGia = txtXoa_TacGia.getText();

            tacGia_Service.delete_tacGia_ByMaTacGia(MaTacGia, txtXoa_TacGia);

            KhoiTao_tbl_TacGia();

            return;
        }

        if (cbboxXoa_TacGia.getSelectedIndex() == 1)//xóa độc giả theo tên tác giả
        {

            if (txtXoa_TacGia.getText().isBlank()) {
                JOptionPane.showMessageDialog(txtXoa_TacGia, "Hãy điền vào ô trống!!");
                return;
            }
            String TenTacGia = txtXoa_TacGia.getText();

            tacGia_Service.delete_tacGia_ByTenTacGia(TenTacGia, txtXoa_TacGia);

            KhoiTao_tbl_TacGia();

            return;
        }
        if (cbboxXoa_TacGia.getSelectedIndex() == 2)//xóa độc giả theo dòng được chọn
        {
            if (tbl_TacGia.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(txtXoa_TacGia, "Hãy chọn dòng mong muốn!!!");
                return;
            }

            int SelectedRow = tbl_TacGia.getSelectedRow();
            System.out.println(SelectedRow);
            String maTacGia = (String) model_TacGia.getValueAt(SelectedRow, 0);
            tacGia_Service.delete_tacGia_ByMaTacGia(maTacGia, txtXoa_TacGia);

            KhoiTao_tbl_TacGia();
        }
        
        set_Sach_cbb_MaTacGia();
        KhoiTao_tbl_TacGia();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btnXoa_TacGiaActionPerformed

    private void txtTimKiem_TacGiaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiem_TacGiaCaretUpdate
        if(txtTimKiem_TacGia.getText().isBlank())
            tbl_TacGia.setModel(model_TacGia);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String[] Column = {"Mã tác giả", "Tên tác giả", "Ngày sinh", "Giới tính", "Email", "Địa chỉ"};
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbboxTimKiem_TacGia.getSelectedIndex() == 0)//đây là phần tìm theo mã tác giả
            {
                ArrayList<TacGia> DanhSachTacGia = tacGia_Service.get_TacGia_ByMaTacGia(txtTimKiem_TacGia.getText());
                for (TacGia tacgia1 : DanhSachTacGia)
                {
                    model_TimKiem.addRow(new Object[]{tacgia1.getMaTacGia(), tacgia1.getTenTacGia(), tacgia1.getNgaySinh(), tacgia1.getGioiTinh(),
                        tacgia1.getEmail(), tacgia1.getDiaChi()});

                }
                tbl_TacGia.setModel(model_TimKiem);
            }
            else if (cbboxTimKiem_TacGia.getSelectedIndex() == 1)//đây là phần tìm theo tên tác giả
            {
                ArrayList<TacGia> DanhSachTacGia = tacGia_Service.get_TacGia_ByTenTacGia(txtTimKiem_TacGia.getText());
                for (TacGia tacgia1 : DanhSachTacGia)
                {
                    model_TimKiem.addRow(new Object[]{tacgia1.getMaTacGia(), tacgia1.getTenTacGia(), tacgia1.getNgaySinh(), tacgia1.getGioiTinh(),
                        tacgia1.getEmail(), tacgia1.getDiaChi()});
                }
                tbl_TacGia.setModel(model_TimKiem);
            }
            else
            {
                tbl_TacGia.setModel(model_TacGia);
            }
        }
    }//GEN-LAST:event_txtTimKiem_TacGiaCaretUpdate

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

    }//GEN-LAST:event_btn_NhaCungCap_ThemActionPerformed

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

    private void btn_NhaCungCap_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhaCungCap_ExcelActionPerformed

        excel.ExportDatatoExcel(model_NhaCungCap);

    }//GEN-LAST:event_btn_NhaCungCap_ExcelActionPerformed

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

    private void cbb_Sach_MaTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_Sach_MaTheLoaiActionPerformed

        if(cbb_Sach_MaTheLoai.getSelectedItem()!=null)
        {
            ArrayList<TheLoai> DanhSachTheLoai=theLoai_Service.get_TheLoai_ByMaTheLoai(cbb_Sach_MaTheLoai.getSelectedItem().toString());
            txt_Sach_TenTheLoai.setText(DanhSachTheLoai.get(0).getTenTheLoai());
        }

    }//GEN-LAST:event_cbb_Sach_MaTheLoaiActionPerformed

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
            rdbtn_DocGia_Nu.setSelected(true);
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

    }//GEN-LAST:event_btn_DocGia_XoaActionPerformed

    private void btn_TacGia_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TacGia_ExcelActionPerformed
       
        excel.ExportDatatoExcel(model_TacGia);
        
    }//GEN-LAST:event_btn_TacGia_ExcelActionPerformed

    private void btn_NhaXuatBan_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NhaXuatBan_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_NhaXuatBan);
        
    }//GEN-LAST:event_btn_NhaXuatBan_ExcelActionPerformed

    private void txt_TheLoai_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_TheLoai_TimKiemCaretUpdate
        
        if(txt_TheLoai_TimKiem.getText().isBlank())
            tbl_TheLoai.setModel(model_TheLoai);
        else
        {
            DefaultTableModel model_TimKiem=new DefaultTableModel();
            String Column[] = {"Mã thể loại","Tên thể loại"};

            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_TheLoai_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo mã thể loại
            {
                ArrayList<TheLoai> DanhSachTheLoai = theLoai_Service.get_TheLoai_ByMaTheLoai(txt_TheLoai_TimKiem.getText());
                for (TheLoai theLoai : DanhSachTheLoai)
                {
                    model_TimKiem.addRow(new Object[]{theLoai.getMaTheLoai(),theLoai.getTenTheLoai()});
                }   
                tbl_TheLoai.setModel(model_TimKiem);
            }
            else if (cbb_TheLoai_TimKiem.getSelectedIndex() == 1)//đây là phần tìm theo tên thể loại
            {
                ArrayList<TheLoai> DanhSachTheLoai = theLoai_Service.get_TheLoai_ByTenTheLoai(txt_TheLoai_TimKiem.getText());
                for (TheLoai theLoai : DanhSachTheLoai)
                {
                    model_TimKiem.addRow(new Object[]{theLoai.getMaTheLoai(),theLoai.getTenTheLoai()});
                }   
                tbl_TheLoai.setModel(model_TimKiem);
            }
            else
            {
                tbl_TheLoai.setModel(model_TheLoai);
            }
        }
        
    }//GEN-LAST:event_txt_TheLoai_TimKiemCaretUpdate

    private void btn_TheLoai_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TheLoai_ThemActionPerformed
        
        if(txt_TheLoai_TenTheLoai.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this, "Tên thể loại không được để trống");
            return;
        }
        
        TheLoai theLoai=new TheLoai();
        theLoai.setTenTheLoai(txt_TheLoai_TenTheLoai.getText());
        
        theLoai_Service.Add_TheLoai(theLoai,this);
        
        set_Sach_cbb_MaTheLoai();
        KhoiTao_tbl_Sach();
        
        KhoiTao_tbl_TheLoai();
        
    }//GEN-LAST:event_btn_TheLoai_ThemActionPerformed

    private void btn_TheLoai_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TheLoai_XoaActionPerformed
        
        if(cbb_TheLoai_Xoa.getSelectedIndex()==0)//xóa độc giả theo mã độc giả
        {

            if(txt_TheLoai_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_TheLoai_Xoa,"Thông tin cần xóa không được để trống");
                return;
            }

            String MaTheLoai=txt_TheLoai_Xoa.getText();

            theLoai_Service.Xoa_TheLoai_ByMaTheLoai(MaTheLoai, txt_TheLoai_Xoa);

            KhoiTao_tbl_TheLoai();

            return;
        }

        if(cbb_TheLoai_Xoa.getSelectedIndex()==1)//xóa độc giả theo tên độc giả
        {

            if(txt_TheLoai_Xoa.getText().isBlank())
            {
                JOptionPane.showMessageDialog(txt_TheLoai_Xoa,"Thông tin cần xóa không được để trống");
                return;
            }

            String TenTheLoai=txt_TheLoai_Xoa.getText();

            theLoai_Service.Xoa_TheLoai_ByTenTheLoai(TenTheLoai, txt_TheLoai_Xoa);

            KhoiTao_tbl_TheLoai();

            return;
        }

        if(cbb_TheLoai_Xoa.getSelectedIndex()==2)//xóa độc giả theo dòng được chọn
        {
            if(tbl_TheLoai.getSelectedRow()==-1)
            {
                JOptionPane.showMessageDialog(txt_TheLoai_Xoa,"Không có dòng nào được chọn cả");
                return;
            }

            int SelectedRow=tbl_TheLoai.getSelectedRow();//lấy số dòng được chọn
            String MaTheLoai=(String)model_TheLoai.getValueAt(SelectedRow,0);
            theLoai_Service.Xoa_TheLoai_ByMaTheLoai(MaTheLoai,txt_TheLoai_Xoa);

            KhoiTao_tbl_TheLoai();
        }
        
        set_Sach_cbb_MaTheLoai();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btn_TheLoai_XoaActionPerformed

    private void btn_TheLoai_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TheLoai_SuaActionPerformed
        
        if(tbl_TheLoai.getSelectedRow()==-1)//nếu table ko chọn dòng nào thì trả về
            return;

        //đây là phần khởi tạo thông tin thể loại lấy dữ liệu từ các Text và combobox
        TheLoai theLoai=new TheLoai();
        theLoai.setMaTheLoai(txt_TheLoai_MaTheLoai.getText());
        theLoai.setTenTheLoai(txt_TheLoai_TenTheLoai.getText());

        //đây là phần thực hiện sửa dữ liệu trong database
        theLoai_Service.Sua_TheLoai(theLoai, btn_TheLoai_Sua);

        //đây là phần thực hiện thay đổi dữ liệu trong tblDocGia
        KhoiTao_tbl_TheLoai();
        
        set_Sach_cbb_MaTheLoai();
        KhoiTao_tbl_Sach();
        
    }//GEN-LAST:event_btn_TheLoai_SuaActionPerformed

    private void btn_TheLoai_ExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TheLoai_ExcelActionPerformed
        
        excel.ExportDatatoExcel(model_TheLoai);
        
    }//GEN-LAST:event_btn_TheLoai_ExcelActionPerformed

    private void tbl_TheLoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TheLoaiMouseClicked
        
        int SelectedRow=tbl_TheLoai.getSelectedRow();//lấy dòng được chọn

        txt_TheLoai_MaTheLoai.setText((String)model_TheLoai.getValueAt(SelectedRow,0));
        txt_TheLoai_TenTheLoai.setText((String)model_TheLoai.getValueAt(SelectedRow,1));        
        
    }//GEN-LAST:event_tbl_TheLoaiMouseClicked

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

    private void btn_DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangXuatActionPerformed
        
        DangNhap dn=new DangNhap();
        dn.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dn.setLocationRelativeTo(null);
        dn.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_DangXuatActionPerformed
 
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
    
    private void KhoiTaotbl_NhaXuatBan() 
    {
        model_NhaXuatBan = new DefaultTableModel();
        String[] Column = {"Mã nhà xuất bản", "Tên nhà xuất bản", "Địa Chỉ", "Email", "SĐT"};
        model_NhaXuatBan.setColumnIdentifiers(Column);

        try {
            ArrayList<NhaXuatBan> DanhSachNhaXuatBan = nhaXuatBan_Service.get_NXB_All();
            set_TableData_NXB(DanhSachNhaXuatBan);//hàm này dùng để set dữ liệu zô cái model
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tbl_SortNXB.setModel(model_NhaXuatBan);
    }

    
    //Tac gia form
    private void KhoiTao_tbl_TacGia() 
    {
        model_TacGia = new DefaultTableModel();//tạo mới model

        String[] Column = {"Mã tác giả", "Tên tác giả", "Ngày sinh", "Giới tính", "Email", "Địa chỉ"};

        model_TacGia.setColumnIdentifiers(Column);

        try {
            ArrayList<TacGia> DanhSachTacGia = tacGia_Service.get_tacGia_All();
            set_TableData_TacGia(DanhSachTacGia);//hàm này dùng để set dữ liệu zô cái model
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tbl_TacGia.setModel(model_TacGia);
    }

    //Tac gia form
    private void KhoiTao_tbl_TheLoai() 
    {
        model_TheLoai = new DefaultTableModel();//tạo mới model

        String[] Column = {"Mã thể loại","Tên thể loại"};

        model_TheLoai.setColumnIdentifiers(Column);

        try {
            ArrayList<TheLoai> DanhSachTheLoai = theLoai_Service.get_TheLoai_All();
            set_TableData_TheLoai(DanhSachTheLoai);//hàm này dùng để set dữ liệu zô cái model
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tbl_TheLoai.setModel(model_TheLoai);
    }
    
    //hàm dùng để set dữ liệu thông tin độc giả vào model của Table Quản lý độc giả
    public void set_TableData_TheLoai(ArrayList<TheLoai> DanhSachTheLoai)
    {
        for(TheLoai theLoai :DanhSachTheLoai)
        {
            model_TheLoai.addRow(new Object[]{theLoai.getMaTheLoai(),theLoai.getTenTheLoai()});
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
    
    public void set_TableData_TacGia(ArrayList<TacGia> DanhSachTacGia) 
    {
        for (TacGia tg : DanhSachTacGia) {
            model_TacGia.addRow(new Object[]{tg.getMaTacGia(), tg.getTenTacGia(), tg.getNgaySinh(), tg.getGioiTinh(),
                 tg.getEmail(), tg.getDiaChi()});
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
    
    public void set_TableData_NXB(ArrayList<NhaXuatBan> DanhSachNhaXuatBan) 
    {
        for (NhaXuatBan nxb : DanhSachNhaXuatBan) {
            model_NhaXuatBan.addRow(new Object[]{nxb.getMaNXB(), nxb.getTenNXB(), nxb.getDiaChi(), nxb.getEmail(), nxb.getSDT()});
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
        
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienLogin_GUI nhanVienLogin_GUI=new NhanVienLogin_GUI();
                nhanVienLogin_GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
                nhanVienLogin_GUI.setLocationRelativeTo(null);
                nhanVienLogin_GUI.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date_DocGia_NgaySinh;
    private com.toedter.calendar.JDateChooser Date_TacGia_NgaySinh;
    private javax.swing.JPanel Panel_DocGia;
    private javax.swing.JPanel Panel_NhaCungCap1;
    private javax.swing.JSpinner Spinner_Sach_SoLuong;
    private javax.swing.JButton btnSua_TacGia;
    private javax.swing.JButton btnThem_TacGia;
    private javax.swing.JButton btnXoa_TacGia;
    private javax.swing.JButton btn_DangXuat;
    private javax.swing.JButton btn_DocGia_Excel;
    private javax.swing.JButton btn_DocGia_Sua;
    private javax.swing.JButton btn_DocGia_Them;
    private javax.swing.JButton btn_DocGia_Xoa;
    private javax.swing.JButton btn_NhaCungCap_Excel;
    private javax.swing.JButton btn_NhaCungCap_Sua;
    private javax.swing.JButton btn_NhaCungCap_Them;
    private javax.swing.JButton btn_NhaCungCap_Xoa;
    private javax.swing.JButton btn_NhaXuatBan_Excel;
    private javax.swing.JButton btn_Sach_Excel;
    private javax.swing.JButton btn_Sach_Sua;
    private javax.swing.JButton btn_Sach_Them;
    private javax.swing.JButton btn_Sach_Xoa;
    private javax.swing.JButton btn_SortNXB_Add;
    private javax.swing.JButton btn_SortNXB_Sua;
    private javax.swing.JButton btn_SortNXB_Xoa;
    private javax.swing.JButton btn_TacGia_Excel;
    private javax.swing.JButton btn_TheLoai_Excel;
    private javax.swing.JButton btn_TheLoai_Sua;
    private javax.swing.JButton btn_TheLoai_Them;
    private javax.swing.JButton btn_TheLoai_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_DocGia_TimKiem;
    private javax.swing.JComboBox<String> cbb_DocGia_Xoa;
    private javax.swing.JComboBox<String> cbb_NhaCungCap_TimKiem;
    private javax.swing.JComboBox<String> cbb_NhaCungCap_Xoa;
    private javax.swing.JComboBox<String> cbb_Sach_MaNhaXuatBan;
    private javax.swing.JComboBox<String> cbb_Sach_MaTacGia;
    private javax.swing.JComboBox<String> cbb_Sach_MaTheLoai;
    private javax.swing.JComboBox<String> cbb_Sach_TimKiem;
    private javax.swing.JComboBox<String> cbb_Sach_Xoa;
    private javax.swing.JComboBox<String> cbb_SortNXB_TimKiem;
    private javax.swing.JComboBox<String> cbb_SortNXB_Xoa;
    private javax.swing.JComboBox<String> cbb_TheLoai_TimKiem;
    private javax.swing.JComboBox<String> cbb_TheLoai_Xoa;
    private javax.swing.JComboBox<String> cbboxTimKiem_TacGia;
    private javax.swing.JComboBox<String> cbboxXoa_TacGia;
    private javax.swing.JComboBox<String> cbbox_TacGia_GioiTinh;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdbtn_DocGia_Nam;
    private javax.swing.JRadioButton rdbtn_DocGia_Nu;
    private javax.swing.JTable tbl_DocGia;
    private javax.swing.JTable tbl_NhaCungCap;
    private javax.swing.JTable tbl_Sach;
    private javax.swing.JTable tbl_SortNXB;
    private javax.swing.JTable tbl_TacGia;
    private javax.swing.JTable tbl_TheLoai;
    private javax.swing.JTextField txtTimKiem_TacGia;
    private javax.swing.JTextField txtXoa_TacGia;
    private javax.swing.JTextField txt_DocGia_DiaChi;
    private javax.swing.JTextField txt_DocGia_MaDocGia;
    private javax.swing.JTextField txt_DocGia_SDT;
    private javax.swing.JTextField txt_DocGia_TenDocGia;
    private javax.swing.JTextField txt_DocGia_TimKiem;
    private javax.swing.JTextField txt_DocGia_Xoa;
    private javax.swing.JTextField txt_NhaCungCap_DiaChi;
    private javax.swing.JTextField txt_NhaCungCap_Email;
    private javax.swing.JTextField txt_NhaCungCap_MaNhaCungCap;
    private javax.swing.JTextField txt_NhaCungCap_SDT;
    private javax.swing.JTextField txt_NhaCungCap_TenNhaCungCap;
    private javax.swing.JTextField txt_NhaCungCap_TimKiem;
    private javax.swing.JTextField txt_NhaCungCap_Xoa;
    private javax.swing.JTextField txt_Sach_MaSach;
    private javax.swing.JTextField txt_Sach_TenNhaXuatBan;
    private javax.swing.JTextField txt_Sach_TenSach;
    private javax.swing.JTextField txt_Sach_TenTacGia;
    private javax.swing.JTextField txt_Sach_TenTheLoai;
    private javax.swing.JTextArea txt_Sach_ThongTinSach;
    private javax.swing.JTextField txt_Sach_TimKiem;
    private javax.swing.JTextField txt_Sach_Xoa;
    private javax.swing.JTextField txt_SortNXB_DiaChi;
    private javax.swing.JTextField txt_SortNXB_Email;
    private javax.swing.JTextField txt_SortNXB_MaNXB;
    private javax.swing.JTextField txt_SortNXB_SDT;
    private javax.swing.JTextField txt_SortNXB_TenNXB;
    private javax.swing.JTextField txt_SortNXB_TimKiem;
    private javax.swing.JTextField txt_SortNXB_Xoa;
    private javax.swing.JTextField txt_TacGia_DiaChi;
    private javax.swing.JTextField txt_TacGia_Email;
    private javax.swing.JTextField txt_TacGia_MaTacGia;
    private javax.swing.JTextField txt_TacGia_TenTacGia;
    private javax.swing.JTextField txt_TheLoai_MaTheLoai;
    private javax.swing.JTextField txt_TheLoai_TenTheLoai;
    private javax.swing.JTextField txt_TheLoai_TimKiem;
    private javax.swing.JTextField txt_TheLoai_Xoa;
    // End of variables declaration//GEN-END:variables
}
