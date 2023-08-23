
package GUI;
import DTO.NhanVien;
import DTO.TaiKhoan;
import BUS.TaiKhoan_Service;
import BUS.NhanVien_Service;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class DangKy extends javax.swing.JFrame {

    TaiKhoan_Service taiKhoan_Service=new TaiKhoan_Service();
    NhanVien_Service nhanVien_Service=new NhanVien_Service();
    
    
    public DangKy() {
        initComponents();
        set_DangKy_cbb_MaNhanVien();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_DangKy_TaiKhoan = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_DangKy_MatKhau = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_DangKy_DangKy = new javax.swing.JButton();
        btn_DangKy_TroVe = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cbb_DangKy_MaNhanVien = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbb_DangKy_Quyen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoSample_ByTailorBrands (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_books_100px.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_25px.png"))); // NOI18N
        jLabel2.setText("Tài khoản:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_lock_25px_1.png"))); // NOI18N
        jLabel3.setText("Mật khẩu:");

        txt_DangKy_TaiKhoan.setBackground(new java.awt.Color(204, 204, 255));
        txt_DangKy_TaiKhoan.setText("Tài khoản");
        txt_DangKy_TaiKhoan.setBorder(null);

        txt_DangKy_MatKhau.setBackground(new java.awt.Color(204, 204, 255));
        txt_DangKy_MatKhau.setText("Mật khẩu");
        txt_DangKy_MatKhau.setBorder(null);

        btn_DangKy_DangKy.setBackground(new java.awt.Color(204, 204, 255));
        btn_DangKy_DangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_25px.png"))); // NOI18N
        btn_DangKy_DangKy.setText("Đăng ký");
        btn_DangKy_DangKy.setBorder(null);
        btn_DangKy_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangKy_DangKyActionPerformed(evt);
            }
        });

        btn_DangKy_TroVe.setBackground(new java.awt.Color(204, 204, 255));
        btn_DangKy_TroVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_back_25px_1.png"))); // NOI18N
        btn_DangKy_TroVe.setText("Trở về");
        btn_DangKy_TroVe.setBorder(null);
        btn_DangKy_TroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangKy_TroVeActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Ma(Chung)_25px.png"))); // NOI18N
        jLabel6.setText("Mã nhân viên:");

        cbb_DangKy_MaNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Quyền:");

        cbb_DangKy_Quyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btn_DangKy_TroVe)
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_DangKy_DangKy)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DangKy_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(txt_DangKy_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_DangKy_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cbb_DangKy_Quyen, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btn_DangKy_TroVe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_DangKy_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_DangKy_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_DangKy_MaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbb_DangKy_Quyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_DangKy_DangKy)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DangKy_TroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangKy_TroVeActionPerformed
        
        DangNhap dn=new DangNhap();
        dn.setLocationRelativeTo(null);
        dn.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dn.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btn_DangKy_TroVeActionPerformed

    private void btn_DangKy_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangKy_DangKyActionPerformed
        
        //phần này để check dữ liệu đầu vào
        if(txt_DangKy_TaiKhoan.getText().isBlank())
        {
            System.out.println("Tên tài khoản không được để trống");
            return;
        }
        if(txt_DangKy_MatKhau.getText().isBlank())
        {
            System.out.println("Mật khẩu không được để trống");
            return;
        }
        
        //phần này là phần khởi tạo dữ liệu cho tài khoản
        TaiKhoan tk=new TaiKhoan();
        tk.setMaNhanVien(cbb_DangKy_MaNhanVien.getSelectedItem().toString());
        tk.setTenTaiKhoan(txt_DangKy_TaiKhoan.getText());
        tk.setMatKhau(txt_DangKy_MatKhau.getText());
        tk.setQuyen(cbb_DangKy_Quyen.getSelectedIndex());
        
        //phần này là phần thêm vào cơ sở dữ liệu
        taiKhoan_Service.add_TaiKhoan(tk,this);
        
    }//GEN-LAST:event_btn_DangKy_DangKyActionPerformed

    //đây là nơi xử lý khi đóng cửa sổ đăng ký
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        dispose();
        
        DangNhap dn=new DangNhap();
        dn.setLocationRelativeTo(null);
        dn.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dn.setVisible(true);
        
    }//GEN-LAST:event_formWindowClosing
    
    private void set_DangKy_cbb_MaNhanVien()
    {
        cbb_DangKy_MaNhanVien.removeAllItems();
        ArrayList<NhanVien> DanhSachNhanVien=nhanVien_Service.get_NhanVien_All();
        for(NhanVien nhanVien:DanhSachNhanVien)
        {
            cbb_DangKy_MaNhanVien.addItem(nhanVien.getMaNhanVien());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangKy dk=new DangKy();
                dk.setLocationRelativeTo(null);
                dk.setDefaultCloseOperation(EXIT_ON_CLOSE);
                dk.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangKy_DangKy;
    private javax.swing.JButton btn_DangKy_TroVe;
    private javax.swing.JComboBox<String> cbb_DangKy_MaNhanVien;
    private javax.swing.JComboBox<String> cbb_DangKy_Quyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txt_DangKy_MatKhau;
    private javax.swing.JTextField txt_DangKy_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
