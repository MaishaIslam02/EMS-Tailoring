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
public class TailorsInfo extends javax.swing.JFrame {

    /**
     * Creates new form TailorsInfo
     */
    public TailorsInfo() {
        initComponents();
        show_tailor();
    }

     public ArrayList<Tailor> tailorList(){
        ArrayList<Tailor> tailorList= new ArrayList<>();
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM Tailor";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    Tailor tailor;
    while(rs.next()){
        tailor= new Tailor(rs.getInt("TailorId"),rs.getInt("Phone"),rs.getInt("SYear"),rs.getInt("OrderId"),rs.getInt("TDProducts"),rs.getString("FirstName"),rs.getString("LastName"),rs.getString("Email"));
        tailorList.add(tailor);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return tailorList;
        
    }
    public void show_tailor(){
        ArrayList<Tailor> list = tailorList();
        DefaultTableModel model=(DefaultTableModel) jTable_Tailor.getModel();
        Object[] row = new Object[8];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getTailorId();
            row[1]=list.get(i).getFirstName();
            row[2]=list.get(i).getLastName();
            row[3]=list.get(i).getEmail();
            row[4]=list.get(i).getPhone();
            row[5]=list.get(i).getSYear();
            row[6]=list.get(i).getOrderId();
            row[7]=list.get(i).getTDProducts();
            model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Tailor = new javax.swing.JTable();
        homebtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        OrderId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TDProducts = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TailorId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        searchid = new javax.swing.JTextField();
        SYear = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/tailor.png"))); // NOI18N
        jLabel1.setText("TAILORS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 65, -1, -1));

        jTable_Tailor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TailorId", "FirstName", "LastName", "Email", "Phone", "SYear", "OrderId", "TDProducts"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Tailor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TailorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Tailor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 360, 798, 326));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1710, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("FirstName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 408, -1, -1));
        getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 437, 219, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("LastName");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 495, -1, -1));
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 539, 219, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 591, -1, -1));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 625, 219, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 682, -1, -1));
        getContentPane().add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 726, 219, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("StartingYear");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1427, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("AssignedOrderId");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1427, 408, -1, -1));
        getContentPane().add(OrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1427, 437, 151, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("TotalDeliveredProducts");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1427, 495, -1, -1));
        getContentPane().add(TDProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1427, 539, 151, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/search.png"))); // NOI18N
        jButton1.setText("Search By Tailor Id");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 243, -1, -1));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 872, -1, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1146, 877, -1, -1));

        editbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        getContentPane().add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1424, 877, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1672, 877, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        TailorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TailorIdActionPerformed(evt);
            }
        });
        getContentPane().add(TailorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 354, 118, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("TailorId");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, -1, -1));

        searchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchidKeyReleased(evt);
            }
        });
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 244, 105, 43));
        getContentPane().add(SYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1427, 354, 151, -1));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1311, 159, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void TailorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TailorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TailorIdActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:  
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query = "insert into Tailor(FirstName,LastName,Email,Phone,SYear,OrderId,TDProducts) values(?,?,?,?,?,?,?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, FirstName.getText());
    pst.setString(2, LastName.getText());
    pst.setString(3, Email.getText());
    pst.setString(4, Phone.getText());
    pst.setString(5, SYear.getText());
    pst.setString(6, OrderId.getText());
    pst.setString(7, TDProducts.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Tailor.getModel();
    model.setRowCount(0);
    show_tailor();
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
    int row = jTable_Tailor.getSelectedRow();
    String value= (jTable_Tailor.getModel().getValueAt(row, 0).toString());
    String query = "DELETE FROM Tailor WHERE TailorId="+value;
    PreparedStatement pst= con.prepareStatement(query);
    pst.executeUpdate();
         }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    DefaultTableModel model = (DefaultTableModel) jTable_Tailor.getModel();
    model.setRowCount(0);
    show_tailor();
    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
   
}
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jTable_TailorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TailorMouseClicked
        // TODO add your handling code here:
          int i = jTable_Tailor.getSelectedRow();
        TableModel model = jTable_Tailor.getModel();
        TailorId.setText(model.getValueAt(i, 0).toString());
        FirstName.setText(model.getValueAt(i, 1).toString());
        LastName.setText(model.getValueAt(i, 2).toString());
        Email.setText(model.getValueAt(i, 3).toString());
        Phone.setText(model.getValueAt(i, 4).toString());
        SYear.setText(model.getValueAt(i, 5).toString());
        OrderId.setText(model.getValueAt(i, 6).toString());
        TDProducts.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_jTable_TailorMouseClicked

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
         try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
   // int row = jTable_Product.getSelectedRow();
    //String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
    String value = TailorId.getText();
    String query = "UPDATE Tailor SET FirstName=?, LastName=?, Email=?,Phone=?,SYear=?,OrderId=?,TDProducts=? where TailorId="+value;
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, FirstName.getText());
    pst.setString(2, LastName.getText());
    pst.setString(3, Email.getText());
    pst.setString(4, Phone.getText());
    pst.setString(5, SYear.getText());
    pst.setString(6, OrderId.getText());
    pst.setString(7, TDProducts.getText());
    
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Tailor.getModel();
    model.setRowCount(0);
    show_tailor();
    JOptionPane.showMessageDialog(null, "Updated Successfully!");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        
    }//GEN-LAST:event_editbtnActionPerformed

    private void searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidKeyReleased
        // TODO add your handling code here:
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            String sql = "SELECT * FROM Tailor WHERE TailorId=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, searchid.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                String setid = rs.getString("TailorId");
                TailorId.setText(setid);
                String setfname = rs.getString("FirstName");
                FirstName.setText(setfname);
                String setlname = rs.getString("LastName");
                LastName.setText(setlname);
                String setem = rs.getString("Email");
                Email.setText(setem);
                String setph = rs.getString("Phone");
                Phone.setText(setph);
                String setsy = rs.getString("SYear");
                SYear.setText(setsy);
                String setoid = rs.getString("OrderId");
                OrderId.setText(setoid);
                String settdp = rs.getString("TDProducts");
                TDProducts.setText(settdp);
                

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_searchidKeyReleased

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        TailorId.setText("");
        FirstName.setText("");
        LastName.setText("");
        Email.setText("");
        Phone.setText("");
        SYear.setText("");
        OrderId.setText("");
        TDProducts.setText("");
    }//GEN-LAST:event_resetbtnActionPerformed

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        // TODO add your handling code here:
        HomePage field = new HomePage();
        field.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homebtnMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TailorsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TailorsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TailorsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TailorsInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TailorsInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField OrderId;
    private javax.swing.JTextField Phone;
    private javax.swing.JTextField SYear;
    private javax.swing.JTextField TDProducts;
    private javax.swing.JTextField TailorId;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Tailor;
    private javax.swing.JButton resetbtn;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
