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
public class FCustomer extends javax.swing.JFrame {

    /**
     * Creates new form FCustomer
     */
    public FCustomer() {
        initComponents();
        show_fcus();
    }

       public ArrayList<FCus> fcusList(){
        ArrayList<FCus> fcusList= new ArrayList<>();
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM FCUSTOMER";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    FCus fcus;
    while(rs.next()){
        fcus= new FCus(rs.getInt("FID"),rs.getInt("CustomerId"),rs.getInt("MeasurementId"));
        fcusList.add(fcus);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return fcusList;
        
    }
    public void show_fcus(){
        ArrayList<FCus> list = fcusList();
        DefaultTableModel model=(DefaultTableModel) jTable_FC.getModel();
        Object[] row = new Object[3];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getFID();
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
        jTable_FC = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        FID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CustomerId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        MeasurementId = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        searchid = new javax.swing.JTextField();
        homebtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/woman.png"))); // NOI18N
        jLabel1.setText("MANAGE FEMALE CUSTOMERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 91, -1, -1));

        jTable_FC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FID", "CustomerId", "MeasurementId"
            }
        ));
        jTable_FC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_FCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_FC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 296, 712, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("FID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 313, -1, -1));

        FID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDActionPerformed(evt);
            }
        });
        getContentPane().add(FID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 311, 106, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CustomerId");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 389, -1, -1));

        CustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 384, 106, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("MeasurementId");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 465, -1, -1));

        MeasurementId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeasurementIdActionPerformed(evt);
            }
        });
        getContentPane().add(MeasurementId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 460, 106, -1));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1063, 664, -1, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 664, -1, -1));

        EDITBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EDITBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        EDITBTN.setText("Edit");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EDITBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1433, 664, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1622, 664, -1, -1));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/search.png"))); // NOI18N
        searchbtn.setText("Search Female Customer By Id:");
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
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 216, -1, -1));

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
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 217, 170, 40));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1686, 52, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIDActionPerformed

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
            String query = "insert into FCUSTOMER(CustomerId,MeasurementId) values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, CustomerId.getText());
            pst.setString(2, MeasurementId.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable_FC.getModel();
            model.setRowCount(0);
            show_fcus();
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
            int row = jTable_FC.getSelectedRow();
            String value= (jTable_FC.getModel().getValueAt(row, 0).toString());
            String query = "DELETE FROM FCUSTOMER WHERE FID="+value;
            PreparedStatement pst= con.prepareStatement(query);
            pst.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            DefaultTableModel model = (DefaultTableModel) jTable_FC.getModel();
            model.setRowCount(0);
            show_fcus();
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
            String value = FID.getText();
            String query = "UPDATE FCUSTOMER SET CustomerId=?, MeasurementId=? where FID="+value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, CustomerId.getText());
            pst.setString(2,MeasurementId.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable_FC.getModel();
            model.setRowCount(0);
            show_fcus();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_EDITBTNActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        FID.setText("");
        CustomerId.setText("");
        MeasurementId.setText("");
       

    }//GEN-LAST:event_resetbtnActionPerformed

    private void jTable_FCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_FCMouseClicked
        // TODO add your handling code here:
        int i = jTable_FC.getSelectedRow();
        TableModel model = jTable_FC.getModel();
        FID.setText(model.getValueAt(i, 0).toString());
        CustomerId.setText(model.getValueAt(i, 1).toString());
        MeasurementId.setText(model.getValueAt(i, 2).toString());
       
    }//GEN-LAST:event_jTable_FCMouseClicked

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbtnKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_searchbtnKeyReleased

    private void searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidKeyReleased
        // TODO add your handling code here:
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM FCUSTOMER WHERE FID=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, searchid.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                String setid = rs.getString("FID");
                FID.setText(setid);
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

    private void searchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchidActionPerformed

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
            java.util.logging.Logger.getLogger(FCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerId;
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField FID;
    private javax.swing.JTextField MeasurementId;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_FC;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
