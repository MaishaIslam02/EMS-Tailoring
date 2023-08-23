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
public class Products extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        show_product();
    }

    public ArrayList<Product> productList(){
        ArrayList<Product> productList= new ArrayList<>();
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM Product";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    Product product;
    while(rs.next()){
        product= new Product(rs.getInt("ProductId"),rs.getInt("Total_Number_of_Products"),rs.getString("ProductName"),rs.getString("Gender_Of_Customer"));
        productList.add(product);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return productList;
        
    }
    public void show_product(){
        ArrayList<Product> list = productList();
        DefaultTableModel model=(DefaultTableModel) jTable_Product.getModel();
        Object[] row = new Object[4];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getProductId();
            row[1]=list.get(i).getProductName();
            row[2]=list.get(i).getTotal_Number_of_Products();
            row[3]=list.get(i).getGender_Of_Customer();
            model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Product = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TotalNumberofProducts = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        EDITBTN = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GenderofCustomer = new javax.swing.JTextField();
        ProductId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/received.png"))); // NOI18N
        jLabel1.setText("MANAGE PRODUCTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 57, -1, -1));

        jTable_Product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductId", "ProductName", "Total_Number_of_Products", "Gender_Of_Customer"
            }
        ));
        jTable_Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Product);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 702, 490));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ProductId");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 140, -1, -1));
        getContentPane().add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 252, 370, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("GenderofCustomer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 389, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("TotalNumberofProducts");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 305, -1, -1));
        getContentPane().add(TotalNumberofProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 340, 240, -1));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 680, -1, -1));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/search.png"))); // NOI18N
        searchbtn.setText("Search Product By Id:");
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
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 680, -1, -1));

        EDITBTN.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        EDITBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        EDITBTN.setText("Edit");
        EDITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EDITBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 680, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 680, -1, -1));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 70, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(GenderofCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 430, 210, -1));
        getContentPane().add(ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 180, 190, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ProductName");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 220, -1, -1));

        searchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchidKeyReleased(evt);
            }
        });
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 170, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
          try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query = "insert into Product(ProductName,Total_Number_of_Products,Gender_Of_Customer) values(?,?,?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, ProductName.getText());
    pst.setString(2, TotalNumberofProducts.getText());
    pst.setString(3, GenderofCustomer.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Product.getModel();
    model.setRowCount(0);
    show_product();
    JOptionPane.showMessageDialog(null, "Added Successfully!");
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
    }//GEN-LAST:event_addbtnActionPerformed

    private void jTable_ProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ProductMouseClicked
        // TODO add your handling code here:
        int i = jTable_Product.getSelectedRow();
        TableModel model = jTable_Product.getModel();
        ProductId.setText(model.getValueAt(i, 0).toString());
        ProductName.setText(model.getValueAt(i, 1).toString());
        TotalNumberofProducts.setText(model.getValueAt(i, 2).toString());
        GenderofCustomer.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable_ProductMouseClicked

    private void EDITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBTNActionPerformed
        // TODO add your handling code here:
    try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
   // int row = jTable_Product.getSelectedRow();
    //String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
    String value = ProductId.getText();
    String query = "UPDATE Product SET ProductName=?, Total_Number_of_Products=?, Gender_Of_Customer=? where ProductId="+value;
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, ProductName.getText());
    pst.setString(2, TotalNumberofProducts.getText());
    pst.setString(3, GenderofCustomer.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Product.getModel();
    model.setRowCount(0);
    show_product();
    JOptionPane.showMessageDialog(null, "Updated Successfully!");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        
    }//GEN-LAST:event_EDITBTNActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
         try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    int row = jTable_Product.getSelectedRow();
    String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
    String query = "DELETE FROM Product WHERE ProductId="+value;
    PreparedStatement pst= con.prepareStatement(query);
    pst.executeUpdate();
         }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    DefaultTableModel model = (DefaultTableModel) jTable_Product.getModel();
    model.setRowCount(0);
    show_product();
    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
   
}
        
    }//GEN-LAST:event_deletebtnActionPerformed

    private void searchbtnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbtnKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_searchbtnKeyReleased

    private void searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidKeyReleased
        // TODO add your handling code here:
        try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String sql = "SELECT * FROM Product WHERE ProductId=?";
    PreparedStatement pst= con.prepareStatement(sql);
    pst.setString(1, searchid.getText());
    ResultSet rs = pst.executeQuery();
    if(rs.next())
    {
        String setid = rs.getString("ProductId");
        ProductId.setText(setid);
        String setname = rs.getString("ProductName");
        ProductName.setText(setname);
        String settotal = rs.getString("Total_Number_of_Products");
        TotalNumberofProducts.setText(settotal);
        String setgender = rs.getString("Gender_Of_Customer");
        GenderofCustomer.setText(setname);
        
        
    }
        }
         catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_searchidKeyReleased

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        ProductId.setText("");
        ProductName.setText("");
        TotalNumberofProducts.setText("");
        GenderofCustomer.setText("");
        
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EDITBTN;
    private javax.swing.JTextField GenderofCustomer;
    private javax.swing.JTextField ProductId;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField TotalNumberofProducts;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Product;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
