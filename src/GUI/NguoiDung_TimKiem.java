
package GUI;

import DTO.CheckLoi;
import DTO.DBConnection;
import DTO.Sach;
import javax.swing.table.DefaultTableModel;
import BUS.Sach_Service;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;


public class NguoiDung_TimKiem extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
    Sach_Service sach_Service = new Sach_Service();
    Connection connection = DBConnection.GetConnection();
    CheckLoi checkLoi = new CheckLoi();

    public NguoiDung_TimKiem() {
        initComponents();
        KhoiTaoQuanLySachTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_QuanLySach = new javax.swing.JTable();
        btn_ThongTinSach = new javax.swing.JButton();
        cbb_TimKiem = new javax.swing.JComboBox<>();
        txt_TimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Thư viện");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Trường đại học Sài Gòn");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("273 An Dương Vương, Phường 3, Quận 5, Thành phố Hồ Chí Minh");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel3)
                .addGap(0, 271, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Quay lại");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tbl_QuanLySach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Mã Tác giả", "Mã thể loại", "Mã NXB", "Số lượng"
            }
        ));
        jScrollPane1.setViewportView(tbl_QuanLySach);

        btn_ThongTinSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ThongTinSach.setText("Thông tin sách");
        btn_ThongTinSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThongTinSachActionPerformed(evt);
            }
        });

        cbb_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tìm kiếm theo tên sách", "Tìm kiếm theo tên tác giả" }));

        txt_TimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_TimKiemCaretUpdate(evt);
            }
        });
        txt_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179)
                        .addComponent(btn_ThongTinSach)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(44, 44, 44))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbb_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btn_ThongTinSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbb_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        TrangChu_DocGia tc=new TrangChu_DocGia();
        tc.setLocationRelativeTo(null);
        tc.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        tc.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void btn_ThongTinSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThongTinSachActionPerformed
                
        int SelectedRow = tbl_QuanLySach.getSelectedRow();
        
        //kiểm tra xem có dòng nào được chọn hay không
        if (SelectedRow == -1) 
        {
            JOptionPane.showMessageDialog(this, "Chọn một cuốn sách để xem");
        } 
        else 
        {
            String MaSachChon = String.valueOf(tbl_QuanLySach.getValueAt(SelectedRow, 0));
            ArrayList<Sach> DanhSachSach = sach_Service.get_Sach_ByMaSach(MaSachChon);

            Sach_ChiTiet sct=new Sach_ChiTiet(DanhSachSach.get(0));
            sct.setLocationRelativeTo(null);
            sct.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            sct.setVisible(true);
        }
    }//GEN-LAST:event_btn_ThongTinSachActionPerformed

    private void txt_TimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_TimKiemCaretUpdate
        
        //nếu txt trống thì set model cơ bản
        if (txt_TimKiem.getText().isBlank())
            tbl_QuanLySach.setModel(model);
        else 
        {
            
            DefaultTableModel model_TimKiem = new DefaultTableModel();// tạo mới bảng
            String Column[] = {"Mã sách", "Tên sách", "Mã thể loại", "Mã nhà xuất bản", "Mã tác giả", "Số lượng sách còn lại"};
            model_TimKiem.setColumnIdentifiers(Column);

            if (cbb_TimKiem.getSelectedIndex() == 0)//đây là phần tìm theo tên sách
            {
                ArrayList<Sach> DanhSachSach = sach_Service.get_Sach_ByTenSach(txt_TimKiem.getText());
                for (Sach sach : DanhSachSach) 
                {
                    model_TimKiem.addRow(new Object[]{sach.getMaSach(), sach.getTenSach(), sach.getMaTheLoai(),
                        sach.getMaNXB(), sach.getMaTacGia(), sach.getSoLuongCon()});

                }
                tbl_QuanLySach.setModel(model_TimKiem);
            } 
            
            else if (cbb_TimKiem.getSelectedIndex() == 1)//đây là phần tìm theo tên tác giả
            {
                ArrayList<Sach> DanhSachSach = sach_Service.get_Sach_ByTenTacGia(txt_TimKiem.getText());
                for (Sach sach : DanhSachSach) 
                {
                    model_TimKiem.addRow(new Object[]{sach.getMaSach(), sach.getTenSach(), sach.getMaTheLoai(),
                        sach.getMaNXB(), sach.getMaTacGia(), sach.getSoLuongCon()});

                }
                tbl_QuanLySach.setModel(model_TimKiem);
            }
        }
    }//GEN-LAST:event_txt_TimKiemCaretUpdate

    private void txt_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TimKiemActionPerformed

     private void KhoiTaoQuanLySachTable() {
        model = new DefaultTableModel();//tạo mới model
        tbl_QuanLySach.setModel(model);

        String Column[] = {"Mã sách", "Tên sách", "Mã thể loại", "Mã nhà xuất bản", "Mã tác giả", "Số lượng sách còn lại"};
        model.setColumnIdentifiers(Column);
        try {
            ArrayList<Sach> DanhSachSach = sach_Service.get_Sach_All();
            setTableDataQuanLySach(DanhSachSach);//hàm này dùng để set dữ liệu zô cái model
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        tbl_QuanLySach.setModel(model);
    }

    //hàm dùng để set dữ liệu thông tin sách vào model của Table Quản lý sách
    public void setTableDataQuanLySach(ArrayList<Sach> DanhSachSach) {
        for (Sach sach : DanhSachSach) {
            model.addRow(new Object[]{sach.getMaSach(), sach.getTenSach(), sach.getMaTheLoai(),
                sach.getMaNXB(), sach.getMaTacGia(), sach.getSoLuongCon()});
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NguoiDung_TimKiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ThongTinSach;
    private javax.swing.JComboBox<String> cbb_TimKiem;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_QuanLySach;
    private javax.swing.JTextField txt_TimKiem;
    // End of variables declaration//GEN-END:variables
}
