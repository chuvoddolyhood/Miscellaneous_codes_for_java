/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import javax.swing.JOptionPane;

/**
 *
 * @author Tran Nhan Nghia
 */
public class BangThanhToan extends javax.swing.JFrame {

    /**
     * Creates new form BangThanhToan
     */
    public BangThanhToan() {
        initComponents();
        this.setLocationRelativeTo(null);  
    }
    
    private boolean confirmInfo() {
        boolean check=true;
        try{
            if(txtSoHoaDon.getText().length()!=4){
                JOptionPane.showMessageDialog(rootPane, "So Hoa Don phai la 4 chu so");
                check=false;
                return check;
            }  
            String maKH=txtMaKhachHang.getText();
            if(maKH.equals("")){
                JOptionPane.showMessageDialog(rootPane, "Chua nhap Ma khach hang");
                check=false;
                return check;
            }
            if  (!maKH.substring(0, 3).equals("PN-")){
                JOptionPane.showMessageDialog(rootPane, "Ma Khach Hang phai bat dau la PN-");
                check=false;
                return check;
            }
            if(txtTenKhachHang.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Chua nhap ten khach hang");
                check=false;
                return check;
            }
            if(txtCMND.getText().length()!=9){
                JOptionPane.showMessageDialog(rootPane, "CMND phai la 9 chu so");
                check=false;
                return check;
            }
            if(txtSoTien.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Chua nhap so tien");
                check=false;
                return check;
            }
            if(checkMoney()==false){
                JOptionPane.showMessageDialog(rootPane, "So tien khong hop le");
                check=false;
                return check;
            }
                
        }catch(Exception ex){
            System.out.print(ex);
        }
        return check;
    }
    
    //Kiem tra tien nhap vao co ky tu chu cai hay ko
    private Boolean checkMoney(){
        boolean check=true;
        String money=txtSoTien.getText(); //Lay chuoi nhap vao
        int doDaiChuoi=money.length(); //Tinh chieu dai chuoi
        String[] kyTu=new String[doDaiChuoi];
        char checkChar; //Chuyen String sang char -> để chuyển đổi sang ký tự số UNICODE
        for(int i=0;i<doDaiChuoi;i++){
            kyTu[i]=money.substring(i, i+1);
            checkChar=kyTu[i].charAt(0);
            if(Integer.valueOf(checkChar)>=65){ //a=65
                //System.out.println("Co ky tu chu cai");
                check=false;
            }
        }
        return check;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSoHoaDon = new javax.swing.JTextField();
        txtMaKhachHang = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSoTien = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        cmbSoPhong = new javax.swing.JComboBox<>();
        btnDongY = new javax.swing.JButton();
        btnHuyBo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("So hoa don");

        jLabel2.setText("Ma khach hang");

        jLabel3.setText("Ten khach hang");

        jLabel4.setText("Bang Thanh Toan");

        jLabel5.setText("So phong");

        jLabel6.setText("So tien thanh toan");

        jLabel7.setText("So CMND");

        cmbSoPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "201", "301" }));

        btnDongY.setText("Dong Y");
        btnDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongYActionPerformed(evt);
            }
        });

        btnHuyBo.setText("Huy Bo");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(71, 71, 71)
                                .addComponent(txtSoTien))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoHoaDon)
                                    .addComponent(txtMaKhachHang)
                                    .addComponent(txtTenKhachHang)
                                    .addComponent(txtCMND)
                                    .addComponent(cmbSoPhong, 0, 135, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnDongY)
                        .addGap(58, 58, 58)
                        .addComponent(btnHuyBo)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSoHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSoTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDongY)
                    .addComponent(btnHuyBo))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongYActionPerformed
        // TODO add your handling code here:
        if(confirmInfo()==true) 
            JOptionPane.showMessageDialog(rootPane, "Tat Ca Thong Tin Duoc Dong Y");
        
    }//GEN-LAST:event_btnDongYActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        // TODO add your handling code here:
        txtSoHoaDon.setText("");
        txtMaKhachHang.setText("");
        txtTenKhachHang.setText("");
        txtCMND.setText("");
        cmbSoPhong.setSelectedIndex(0);
        txtSoTien.setText("");
    }//GEN-LAST:event_btnHuyBoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BangThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BangThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BangThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BangThanhToan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangThanhToan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDongY;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JComboBox<String> cmbSoPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoHoaDon;
    private javax.swing.JTextField txtSoTien;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables


}