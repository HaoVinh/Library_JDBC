
package GUI;
import java.sql.*;

import DTO.TaiKhoan;
import BUS.TaiKhoan_Service;

public class DangNhap extends javax.swing.JFrame {
    TaiKhoan_Service taiKhoan_Service=new TaiKhoan_Service();
    
    public DangNhap() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_DangNhap_TaiKhoan = new javax.swing.JTextField();
        txt_DangNhap_MatKhau = new javax.swing.JTextField();
        btn_DangNhap_DangKy = new javax.swing.JButton();
        btn_DangNhap_DangNhap = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_DangNhap_DocGia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LogoSample_ByTailorBrands (1).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_25px.png"))); // NOI18N
        jLabel1.setText("Tài khoản:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_lock_25px_1.png"))); // NOI18N
        jLabel2.setText("Mật khẩu:");

        txt_DangNhap_TaiKhoan.setBackground(new java.awt.Color(204, 204, 255));
        txt_DangNhap_TaiKhoan.setText("User");
        txt_DangNhap_TaiKhoan.setBorder(null);

        txt_DangNhap_MatKhau.setBackground(new java.awt.Color(204, 204, 255));
        txt_DangNhap_MatKhau.setText("Password");
        txt_DangNhap_MatKhau.setBorder(null);

        btn_DangNhap_DangKy.setBackground(new java.awt.Color(204, 204, 255));
        btn_DangNhap_DangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_plus_25px.png"))); // NOI18N
        btn_DangNhap_DangKy.setText("Đăng ký");
        btn_DangNhap_DangKy.setBorder(null);
        btn_DangNhap_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhap_DangKyActionPerformed(evt);
            }
        });

        btn_DangNhap_DangNhap.setBackground(new java.awt.Color(204, 204, 255));
        btn_DangNhap_DangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_open_door_25px.png"))); // NOI18N
        btn_DangNhap_DangNhap.setText("Đăng nhập");
        btn_DangNhap_DangNhap.setBorder(null);
        btn_DangNhap_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhap_DangNhapActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 204));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_books_100px.png"))); // NOI18N

        btn_DangNhap_DocGia.setText("Đăng nhập với tư cách độc giả");
        btn_DangNhap_DocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhap_DocGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_DangNhap_DangNhap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_DangNhap_DangKy))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_DangNhap_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_DangNhap_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_DangNhap_DocGia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_DangNhap_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_DangNhap_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_DangNhap_DangNhap)
                    .addComponent(btn_DangNhap_DangKy))
                .addGap(56, 56, 56)
                .addComponent(btn_DangNhap_DocGia)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DangNhap_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhap_DangKyActionPerformed
               
        DangKy dk=new DangKy();
        dk.setLocationRelativeTo(null);
        dk.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dk.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_DangNhap_DangKyActionPerformed

    private void btn_DangNhap_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhap_DangNhapActionPerformed
        
        //đây 
        TaiKhoan taiKhoan=new TaiKhoan();
        taiKhoan.setTenTaiKhoan(txt_DangNhap_TaiKhoan.getText());
        taiKhoan.setMatKhau(txt_DangNhap_MatKhau.getText());
        
        if(taiKhoan_Service.check_Login(taiKhoan, this))
        {
            if(taiKhoan.getQuyen()==0)
            {
                TrangChuQuanLy ql = new TrangChuQuanLy();
                ql.setLocationRelativeTo(null);
                ql.setDefaultCloseOperation(EXIT_ON_CLOSE);
                ql.setVisible(true);

                dispose();
            }
            else
            {
                NhanVienLogin_GUI nhanVienLogin_GUI=new NhanVienLogin_GUI();
                nhanVienLogin_GUI.setLocationRelativeTo(null);
                nhanVienLogin_GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
                nhanVienLogin_GUI.setVisible(true);
                
                dispose();
            }
        }
        
    }//GEN-LAST:event_btn_DangNhap_DangNhapActionPerformed

    private void btn_DangNhap_DocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhap_DocGiaActionPerformed
        
        dispose();
        
        TrangChu_DocGia trangChu_DocGia=new TrangChu_DocGia();
        trangChu_DocGia.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        trangChu_DocGia.setLocationRelativeTo(null);
        trangChu_DocGia.setVisible(true);
        
    }//GEN-LAST:event_btn_DangNhap_DocGiaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhap dn=new DangNhap();
                dn.setLocationRelativeTo(null);
                dn.setDefaultCloseOperation(EXIT_ON_CLOSE);
                dn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DangNhap_DangKy;
    private javax.swing.JButton btn_DangNhap_DangNhap;
    private javax.swing.JButton btn_DangNhap_DocGia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_DangNhap_MatKhau;
    private javax.swing.JTextField txt_DangNhap_TaiKhoan;
    // End of variables declaration//GEN-END:variables
}
