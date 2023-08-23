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
 * @author HP
 */
public class Measurements extends javax.swing.JFrame {

    /**
     * Creates new form Measurements
     */
    public Measurements() {
        initComponents();
        show_measure();
    }

    public ArrayList<Measure> measureList(){
        ArrayList<Measure> measureList= new ArrayList<>();
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM Measurement";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    Measure measure;
    while(rs.next()){
        measure= new Measure(rs.getInt("MeasurementId"),rs.getInt("ProductId"),rs.getFloat("Waist"),rs.getFloat("Bust"),rs.getFloat("Sleeve"),rs.getFloat("Shoulder"),rs.getFloat("Neck"),rs.getFloat("Length"));
        measureList.add(measure);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return measureList;
        
    }
    public void show_measure(){
        ArrayList<Measure> list = measureList();
        DefaultTableModel model=(DefaultTableModel) jTable_Measure.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getMeasurementId();
            row[1]=list.get(i).getProductId();
            row[2]=list.get(i).getWaist();
            row[3]=list.get(i).getBust();
            row[4]=list.get(i).getSleeve();
            row[5]=list.get(i).getShoulder();
            row[6]=list.get(i).getNeck();
            row[7]=list.get(i).getLength();
            model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Measure = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        homebtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ProductId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Waist = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Bust = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Sleeve = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Shoulder = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Neck = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Length = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        searchid = new javax.swing.JTextField();
        MeasurementId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Measure.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MeasurementId", "ProductId", "Waist", "Bust", "Sleeve", "Shoulder", "Neck", "Length"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Long.class, java.lang.Long.class, java.lang.Float.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Measure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_MeasureMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Measure);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 358, 687, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\EMS_Tailoring_Images\\measuring.png")); // NOI18N
        jLabel1.setText("Measurements");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 135, -1, -1));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("MeasurementId");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, -1, -1));
        getContentPane().add(ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 338, 135, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Waist");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 420, -1, -1));
        getContentPane().add(Waist, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 454, 102, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Bust");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 536, -1, -1));
        getContentPane().add(Bust, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 570, 102, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Sleeve");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 652, -1, -1));
        getContentPane().add(Sleeve, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 686, 102, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Shoulder");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 304, -1, -1));
        getContentPane().add(Shoulder, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 338, 124, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Neck");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 420, -1, -1));
        getContentPane().add(Neck, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 454, 124, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Length");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 536, -1, -1));
        getContentPane().add(Length, new org.netbeans.lib.awtextra.AbsoluteConstraints(1408, 570, 124, -1));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 860, -1, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 860, -1, -1));

        editbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        getContentPane().add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 860, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 860, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/search.png"))); // NOI18N
        jButton5.setText("Search By Measurement Id");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 130, 30));
        getContentPane().add(MeasurementId, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("ProductId");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(918, 304, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query = "insert into Measurement(ProductId,Waist,Bust,Sleeve,Shoulder,Neck,Length) values(?,?,?,?,?,?,?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, ProductId.getText());
    pst.setString(2, Waist.getText());
    pst.setString(3, Bust.getText());
    pst.setString(4, Sleeve.getText());
    pst.setString(5, Shoulder.getText());
    pst.setString(6, Neck.getText());
    pst.setString(7, Length.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Measure.getModel();
    model.setRowCount(0);
    show_measure();
    JOptionPane.showMessageDialog(null, "Added Successfully!");
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
    }//GEN-LAST:event_addbtnActionPerformed

    private void jTable_MeasureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_MeasureMouseClicked
        // TODO add your handling code here:
        int i = jTable_Measure.getSelectedRow();
        TableModel model = jTable_Measure.getModel();
        searchid.setText(model.getValueAt(i, 0).toString());
        ProductId.setText(model.getValueAt(i, 1).toString());
        Waist.setText(model.getValueAt(i, 2).toString());
        Bust.setText(model.getValueAt(i, 3).toString());
        Sleeve.setText(model.getValueAt(i, 4).toString());
        Shoulder.setText(model.getValueAt(i, 5).toString());
        Neck.setText(model.getValueAt(i, 6).toString());
        Length.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_jTable_MeasureMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
                 try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    int row = jTable_Measure.getSelectedRow();
    String value= (jTable_Measure.getModel().getValueAt(row, 0).toString());
    String query = "DELETE FROM Measurement WHERE MeasurementId="+value;
    PreparedStatement pst= con.prepareStatement(query);
    pst.executeUpdate();
         }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    DefaultTableModel model = (DefaultTableModel) jTable_Measure.getModel();
    model.setRowCount(0);
    show_measure();
    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
   
}
    }//GEN-LAST:event_deletebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
   // int row = jTable_Product.getSelectedRow();
    //String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
    String value = searchid.getText();
    String query = "UPDATE Measurement SET ProductId=?, Waist=?, Bust=?,Sleeve=?,Shoulder=?,Neck=?,Length=? where MeasurementId="+value;
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, ProductId.getText());
    pst.setString(2, Waist.getText());
    pst.setString(3, Bust.getText());
    pst.setString(4, Sleeve.getText());
    pst.setString(5, Shoulder.getText());
    pst.setString(6, Neck.getText());
    pst.setString(7, Length.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Measure.getModel();
    model.setRowCount(0);
    show_measure();
    JOptionPane.showMessageDialog(null, "Updated Successfully!");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
    }//GEN-LAST:event_editbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        searchid.setText("");
        ProductId.setText("");
        Waist.setText("");
        Bust.setText("");
        Sleeve.setText("");
        Shoulder.setText("");
        Neck.setText("");
        Length.setText("");
       
       
    }//GEN-LAST:event_resetbtnActionPerformed

    private void searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidKeyReleased
        // TODO add your handling code here:
             try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String sql = "SELECT * FROM Measurement WHERE MeasurementId=?";
    PreparedStatement pst= con.prepareStatement(sql);
    pst.setString(1, searchid.getText());
    ResultSet rs = pst.executeQuery();
    if(rs.next())
    {
        String setid = rs.getString("MeasurementId");
        MeasurementId.setText(setid);
        String setpid = rs.getString("ProductId");
        ProductId.setText(setpid);
        String setwst= rs.getString("Waist");
        Waist.setText(setwst);
        String setbst = rs.getString("Bust");
        Bust.setText(setbst);
        String setslv = rs.getString("Sleeve");
        Sleeve.setText(setslv);
        String setsld = rs.getString("Shoulder");
        Shoulder.setText(setsld);
        String setnk = rs.getString("Neck");
        Neck.setText(setnk);
        String setlnt = rs.getString("Length");
        Length.setText(setlnt);
        
        
        
    }
        }
         catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
         }
        
    }//GEN-LAST:event_searchidKeyReleased

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        // TODO add your handling code here:
        HomePage field = new HomePage();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homebtnMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchidActionPerformed

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
            java.util.logging.Logger.getLogger(Measurements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Measurements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Measurements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Measurements.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Measurements().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bust;
    private javax.swing.JTextField Length;
    private javax.swing.JTextField MeasurementId;
    private javax.swing.JTextField Neck;
    private javax.swing.JTextField ProductId;
    private javax.swing.JTextField Shoulder;
    private javax.swing.JTextField Sleeve;
    private javax.swing.JTextField Waist;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Measure;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
