/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tran Nhan Nghia
 */
public class ManagerDVD extends javax.swing.JFrame {

    /**
     * Creates new form ManagerDVD
     */
    public ManagerDVD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnConnect = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDVD = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnConnect.setText("Connect");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnGetData.setText("Get Data");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        btnDisconnect.setText("Disconnect");
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        tblDVD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DVDCodeNo", "DVD Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDVD);

        jLabel1.setText("Code");

        jLabel2.setText("Title");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnSave.setText("Save");

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConnect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGetData)
                        .addGap(98, 98, 98)
                        .addComponent(btnDisconnect))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtTitle))))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addGap(62, 62, 62)
                .addComponent(btnSave)
                .addGap(56, 56, 56)
                .addComponent(btnDel)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConnect)
                    .addComponent(btnGetData)
                    .addComponent(btnDisconnect))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsert)
                    .addComponent(btnSave)
                    .addComponent(btnDel))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con;
    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl= "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DVDLibrary;user=test;password=1234567890";
            con=DriverManager.getConnection(dbUrl);
            JOptionPane.showMessageDialog(this, "Connected!", "Dialog",JOptionPane.INFORMATION_MESSAGE);
//            Statement s = con.createStatement();
//            ResultSet rs = s.executeQuery("select * from DVD");
//            while(rs.next()){
//                System.out.println("DVDCodeNo "+rs.getInt(1)+" DVD Title "+rs.getString(2));
//            }
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_btnConnectActionPerformed
    
    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        // TODO add your handling code here:
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl= "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DVDLibrary;user=test;password=1234567890";
            con=DriverManager.getConnection(dbUrl);
            if (con==null) {
                return;
            }
            con.close();
            JOptionPane.showMessageDialog(this, "Disconnected!", "Dialog",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnDisconnectActionPerformed

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetDataActionPerformed
        // TODO add your handling code here:
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl= "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DVDLibrary;user=test;password=1234567890";
            con=DriverManager.getConnection(dbUrl);
            
            if(con==null || con.isClosed()){            
                JOptionPane.showMessageDialog(this, "Connection closed!", "Dialog",JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select * from DVD");
            String ss="";
            DefaultTableModel m=new DefaultTableModel(new Object[]{"DVDCodeNo","DVDTitle"}, 0);
               tblDVD.setModel(m);
            while (rs.next()) {
                ((DefaultTableModel)tblDVD.getModel()).addRow(new Object[]{rs.getInt(1), rs.getString("DVDTitle")}); 
                ss+="DVDCodeNo " + rs.getInt(1) + " DVD Title " + rs.getString("DVDTitle")+"\n\r";
            }
            jTextArea1.setText(ss); 

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnGetDataActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl= "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DVDLibrary;user=test;password=1234567890";
            con=DriverManager.getConnection(dbUrl);
            
            if (con==null || con.isClosed()) {
                JOptionPane.showMessageDialog(this, "Connection closed!", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Statement s = con.createStatement();
            //int r=s.executeUpdate("insert into DVD values("+txtCode.getText()+",'"+txtTitle.getText()+"')");
            int r=s.executeUpdate("INSERT INTO DVD VALUES("+txtCode.getText()+",'"+txtTitle.getText()+"','Vietnamese','Yes',520000);");
            JOptionPane.showMessageDialog(this, "Insert "+r+" row", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            btnGetDataActionPerformed(evt);
             

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    
    
    
    private DefaultTableModel tableModel = new DefaultTableModel();

    
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbUrl= "jdbc:sqlserver://MSI\\SQLEXPRESS:1433;databaseName=DVDLibrary;user=test;password=1234567890";
            Connection con = DriverManager.getConnection(dbUrl);
            Statement s = con.createStatement();
            
            int r=tblDVD.getSelectedRow();
            Object id=tblDVD.getValueAt(r,0);
            JOptionPane.showMessageDialog(this, id, "Dialog", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(r+" "+id);
            s.execute("Delete DVD where DVDCodeNo="+id);
            btnGetDataActionPerformed(evt);
            
            con.close();
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}

        
    }//GEN-LAST:event_btnDelActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerDVD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerDVD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblDVD;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
