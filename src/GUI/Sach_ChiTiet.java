
package GUI;

import DTO.NhaXuatBan;
import DTO.Sach;
import DTO.TacGia;
import DTO.TheLoai;
import BUS.NhaXuatBan_Service;
import BUS.TacGia_Service;
import BUS.TheLoai_Service;
import java.util.ArrayList;


public class Sach_ChiTiet extends javax.swing.JFrame {
    
    private final TacGia_Service tacGia_Service=new TacGia_Service();
    private final NhaXuatBan_Service nhaXuatBan_Service=new NhaXuatBan_Service();
    private final TheLoai_Service theLoai_Service=new TheLoai_Service();
    
    
    public Sach_ChiTiet(Sach sach) {
        initComponents();
        
        KhoiTao(sach);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_TenSach = new javax.swing.JLabel();
        lbl_TenTacGia = new javax.swing.JLabel();
        lbl_TenNhaXuatBan = new javax.swing.JLabel();
        lbl_TenTheLoai = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblNoiDung = new javax.swing.JTextArea();
        Sach_Sach_ChiTiet_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Thông tin sách");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tên sách:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên tác giả:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nhà xuất bản:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Thể loại:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nội dung:");

        lbl_TenSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TenSach.setText("lblTenSach");

        lbl_TenTacGia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TenTacGia.setText("lblTacGia");

        lbl_TenNhaXuatBan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TenNhaXuatBan.setText("lblNXB");

        lbl_TenTheLoai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_TenTheLoai.setText("lblTheLoai");

        lblNoiDung.setColumns(20);
        lblNoiDung.setRows(5);
        jScrollPane1.setViewportView(lblNoiDung);

        Sach_Sach_ChiTiet_exit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Sach_Sach_ChiTiet_exit.setText("Thoát");
        Sach_Sach_ChiTiet_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sach_Sach_ChiTiet_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_TenSach, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(lbl_TenTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_TenTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_TenNhaXuatBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sach_Sach_ChiTiet_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_TenSach))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TenTacGia))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbl_TenNhaXuatBan))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_TenTheLoai))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(Sach_Sach_ChiTiet_exit)
                .addContainerGap(87, Short.MAX_VALUE))
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

    private void Sach_Sach_ChiTiet_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sach_Sach_ChiTiet_exitActionPerformed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_Sach_Sach_ChiTiet_exitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        dispose();
        
    }//GEN-LAST:event_formWindowClosing

    private void KhoiTao(Sach sach)    
    {
        ArrayList<TacGia> DanhSachTacGia=tacGia_Service.get_TacGia_ByMaTacGia(sach.getMaTacGia());
        ArrayList<NhaXuatBan> DanhSachNhaXuatBan=nhaXuatBan_Service.getNXBByMaNXB(sach.getMaNXB());
        ArrayList<TheLoai> DanhSachTheLoai=theLoai_Service.get_TheLoai_ByMaTheLoai(sach.getMaTheLoai());
        
        if(DanhSachTacGia.isEmpty())
            lbl_TenTacGia.setText("Không tồn tại do đã xóa");
        else
            lbl_TenTacGia.setText(DanhSachTacGia.get(0).getTenTacGia());
        if(DanhSachNhaXuatBan.isEmpty())
            lbl_TenNhaXuatBan.setText("không tồn tại do đã xóa");
        else
            lbl_TenNhaXuatBan.setText(DanhSachNhaXuatBan.get(0).getTenNXB());
        if(DanhSachTheLoai.isEmpty())
            lbl_TenTheLoai.setText("Không tồn tại do đã xóa");
        else
            lbl_TenTheLoai.setText(DanhSachTheLoai.get(0).getTenTheLoai());
        lbl_TenSach.setText(sach.getTenSach());
        lblNoiDung.setText(sach.getThongTinSach());
        
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sach_Sach_ChiTiet_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblNoiDung;
    private javax.swing.JLabel lbl_TenNhaXuatBan;
    private javax.swing.JLabel lbl_TenSach;
    private javax.swing.JLabel lbl_TenTacGia;
    private javax.swing.JLabel lbl_TenTheLoai;
    // End of variables declaration//GEN-END:variables
}
