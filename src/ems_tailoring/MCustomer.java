/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems_tailoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asus
 */
public class MCustomer extends javax.swing.JFrame {

    /**
     * Creates new form MCustomer
     */
    public MCustomer() {
        initComponents();
    }

         public ArrayList<MCus> mcusList(){
        ArrayList<MCus> mcusList= new ArrayList<>();
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM MCUSTOMER";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    MCus mcus;
    while(rs.next()){
        mcus= new MCus(rs.getInt("MID"),rs.getInt("CustomerId"),rs.getInt("MeasurementId"));
        mcusList.add(mcus);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return mcusList;
        
    }
    public void show_mcus(){
        ArrayList<MCus> list = mcusList();
        DefaultTableModel model=(DefaultTableModel) jTable_MC.getModel();
        Object[] row = new Object[3];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getMID();
            row[1]=list.get(i).getCustomerId();
            row[2]=list.get(i).getMeasurementId();
            model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_MC = new javax.swing.JTable();
        searchid = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        MID = new javax.swing.JTextField();
        CustomerId = new javax.swing.JTextField();
        MeasurementId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/man.png"))); // NOI18N
        jLabel1.setText("MANAGE MALE CUSTOMERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 89, -1, -1));

        jTable_MC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MID", "CustomerId", "MeasurementId"
            }
        ));
        jTable_MC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_MCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_MC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 299, 845, -1));

        searchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchidActionPerformed(evt);
            }
        });
        searchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchidKeyReleased(evt);
            }
        });
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 222, 170, 40));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/search.png"))); // NOI18N
        searchbtn.setText("Search Male Customer By Id:");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        searchbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbtnKeyReleased(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 221, -1, -1));

        MID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDActionPerformed(evt);
            }
        });
        getContentPane().add(MID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 374, 124, -1));

        CustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1358, 459, 124, -1));

        MeasurementId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasurementIdActionPerformed(evt);
            }
        });
        getContentPane().add(MeasurementId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1364, 550, 118, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 376, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CustomerId");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 461, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MeasurementId");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 552, -1, -1));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1109, 747, -1, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1293, 747, -1, -1));

        EDITBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EDITBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        EDITBTN.setText("Edit");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EDITBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1493, 747, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1674, 747, -1, -1));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1686, 105, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 160, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_MCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_MCMouseClicked
        // TODO add your handling code here:
        int i = jTable_MC.getSelectedRow();
        TableModel model = jTable_MC.getModel();
        MID.setText(model.getValueAt(i, 0).toString());
        CustomerId.setText(model.getValueAt(i, 1).toString());
        MeasurementId.setText(model.getValueAt(i, 2).toString());

    }//GEN-LAST:event_jTable_MCMouseClicked

    private void searchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchidActionPerformed

    private void searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidKeyReleased
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM MCUSTOMER WHERE MID=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, searchid.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                String setid = rs.getString("MID");
                MID.setText(setid);
                String setcid = rs.getString("CustomerId");
                CustomerId.setText(setcid);
                String setmid = rs.getString("MeasurementId");
                MeasurementId.setText(setmid);

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchidKeyReleased

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbtnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnKeyReleased

    private void MIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIDActionPerformed

    private void CustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIdActionPerformed

    private void MeasurementIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeasurementIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeasurementIdActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
           try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into MCUSTOMER(CustomerId,MeasurementId) values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, CustomerId.getText());
            pst.setString(2, MeasurementId.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable_MC.getModel();
            model.setRowCount(0);
            show_mcus();
            JOptionPane.showMessageDialog(null, "Added Successfully!");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
      
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            int row = jTable_MC.getSelectedRow();
            String value= (jTable_MC.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM MCUSTOMER WHERE MID="+value;
            PreparedStatement pst= con.prepareStatement(query);
            pst.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            DefaultTableModel model = (DefaultTableModel) jTable_MC.getModel();
            model.setRowCount(0);
            show_mcus();
            JOptionPane.showMessageDialog(null, "Deleted Successfully!");

        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void EDITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBTNActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            // int row = jTable_Product.getSelectedRow();
            //String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
            String value = MID.getText();
            String query = "UPDATE MCUSTOMER SET CustomerId=?, MeasurementId=? where MID="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, CustomerId.getText());
            pst.setString(2,MeasurementId.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable_MC.getModel();
            model.setRowCount(0);
            show_mcus();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_EDITBTNActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        MID.setText("");
        CustomerId.setText("");
        MeasurementId.setText("");

    }//GEN-LAST:event_resetbtnActionPerformed

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        // TODO add your handling code here:
        HomePage field = new HomePage();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homebtnMouseClicked

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
            java.util.logging.Logger.getLogger(MCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerId;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField MID;
    private javax.swing.JTextField MeasurementId;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_MC;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
