/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTATION.view;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class frmThemLoaiPhong extends javax.swing.JFrame {

    public frmLoaiPhong csLoaiPhong;

    /**
     * Creates new form frmThemMonAn
     */
    public frmThemLoaiPhong() {
        initComponents();
    }

    public boolean ktso(String so) {
        try {
            float i = Float.parseFloat(so);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenLoaiPhong = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM LOẠI PHÒNG");

        jLabel2.setText("Tên phòng:");

        jLabel3.setText("Đơn giá:");

        btnThem.setText("Thêm món");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 113,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74,
                                                        Short.MAX_VALUE)
                                                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 117,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(txtTenLoaiPhong)
                                                        .addComponent(txtDonGia, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                225, Short.MAX_VALUE))))
                                .addContainerGap(56, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtTenLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(56, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int generateRandomIdPhong() {
        Random random = new Random();
        int min = 111111111; // Giá trị nhỏ nhất của khoảng số ngẫu nhiên
        int max = 999999999; // Giá trị lớn nhất của khoảng số ngẫu nhiên
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        int getID = generateRandomIdPhong();
        String tenPhong = this.txtTenLoaiPhong.getText();
        String dongGia = this.txtDonGia.getText();
        if (tenPhong.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập loai phong");
            return;
        }
        if (dongGia.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập đơn giá");
            return;
        }
        if (ktso(dongGia) == false) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số");
            return;
        }

        int ketqua = DATABASE.tbPhong.ThemPhong(getID, tenPhong, Float.parseFloat(dongGia));
        if (ketqua == -1) {
            JOptionPane.showMessageDialog(this, "Loi ket noi sql");
            return;
        } else if (ketqua == -2) {
            JOptionPane.showMessageDialog(this, "Loi sql");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            this.dispose();
            csLoaiPhong.HienThiDSPhong();
        }
    }// GEN-LAST:event_btnThemActionPerformed

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }// GEN-LAST:event_btnDongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmThemLoaiPhong.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmThemLoaiPhong.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmThemLoaiPhong.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmThemLoaiPhong.class.getName()).log(java.util.logging.Level.SEVERE,
                    null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmThemLoaiPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtTenLoaiPhong;
    // End of variables declaration//GEN-END:variables
}
