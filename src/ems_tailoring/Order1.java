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
public class Order1 extends javax.swing.JFrame {

    /**
     * Creates new form Order1
     */
    public Order1() {
        initComponents();
        show_order();
    }

     public ArrayList<Orders> orderList(){
        ArrayList<Orders> orderList= new ArrayList<>();
        try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM OrderManagement";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    Orders order;
    while(rs.next()){
        order= new Orders(rs.getInt("OrderId"),rs.getInt("CustomerId"),rs.getInt("ProductId"),rs.getString("OrderName"),rs.getString("OrderPlacementDate"),rs.getString("OrderState"),rs.getString("OrderPrice"),rs.getString("Order_Due_Date"),rs.getString("Gender_of_Customer"));
        orderList.add(order);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return orderList;
        
    }
    public void show_order(){
        ArrayList<Orders> list = orderList();
        DefaultTableModel model=(DefaultTableModel) jTable_Order.getModel();
        Object[] row = new Object[9];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getOrderId();
            row[1]=list.get(i).getOrderName();
            row[2]=list.get(i).getCustomerId();
            row[3]=list.get(i).getProductId();
            row[4]=list.get(i).getOrderPlacementDate();
            row[5]=list.get(i).getOrderState();
            row[6]=list.get(i).getOrderPrice();
            row[7]=list.get(i).getOrder_Due_Date();
            row[8]=list.get(i).getGender();
            
            
            model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Order = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        CustomerId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        OrderName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ProductId = new javax.swing.JTextField();
        OrderPlacementDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        OrderState = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        OrderPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Order_Due_Date = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        OrderId = new javax.swing.JTextField();
        searchid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/customer-review.png"))); // NOI18N
        jLabel1.setText("MANAGE ORDERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 60, -1, -1));

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/search.png"))); // NOI18N
        search.setText("Search By Order Id");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jTable_Order.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "OrderName", "CustomerId", "ProductId", "OrderPlacementDate", "OrderState", "OrderPrice", "OrderDueDate", "GenderOfCustomer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_OrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Order);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 1117, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("CustomerId");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 180, -1, -1));
        getContentPane().add(CustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 220, 205, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("ProductId");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 260, -1, -1));

        OrderName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderNameActionPerformed(evt);
            }
        });
        getContentPane().add(OrderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 150, 205, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("OrderPlacementDate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 330, -1, -1));

        ProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIdActionPerformed(evt);
            }
        });
        getContentPane().add(ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 290, 205, -1));
        getContentPane().add(OrderPlacementDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 370, 205, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("OrderState");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 410, -1, -1));

        OrderState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderStateActionPerformed(evt);
            }
        });
        getContentPane().add(OrderState, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 440, 205, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 640, -1, -1));
        getContentPane().add(OrderPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 520, 156, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("OrderDueDate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 560, -1, -1));

        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 670, 113, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("OrderId");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("OrderPrice");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 480, -1, -1));
        getContentPane().add(Order_Due_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 600, 113, -1));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 760, -1, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 760, -1, -1));

        editbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        getContentPane().add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 760, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("Reset");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 760, -1, -1));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1703, 32, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("OrderName");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 120, -1, -1));

        OrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderIdActionPerformed(evt);
            }
        });
        getContentPane().add(OrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 90, 110, -1));

        searchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchidKeyReleased(evt);
            }
        });
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 140, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void OrderNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderNameActionPerformed

    private void ProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIdActionPerformed

    private void OrderStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderStateActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            String query = "insert into OrderManagement(OrderName,CustomerId,ProductId,OrderPlacementDate,OrderState,OrderPrice,Order_Due_Date,Gender_of_Customer) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, OrderName.getText());
            pst.setString(2, CustomerId.getText());
            pst.setString(3, ProductId.getText());
            pst.setString(4, OrderPlacementDate.getText());
            pst.setString(5, OrderState.getText());
            pst.setString(6, OrderPrice.getText());
            pst.setString(7, Order_Due_Date.getText());
            pst.setString(8, Gender.getText());
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable_Order.getModel();
            model.setRowCount(0);
            show_order();
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
    int row = jTable_Order.getSelectedRow();
    String value= (jTable_Order.getModel().getValueAt(row, 0).toString());
    String query = "DELETE FROM OrderManagement WHERE OrderId="+value;
    PreparedStatement pst= con.prepareStatement(query);
    pst.executeUpdate();
         }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    DefaultTableModel model = (DefaultTableModel) jTable_Order.getModel();
    model.setRowCount(0);
    show_order();
    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
   
}
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jTable_OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_OrderMouseClicked
        // TODO add your handling code here:
        int i = jTable_Order.getSelectedRow();
        TableModel model = jTable_Order.getModel();
        OrderId.setText(model.getValueAt(i, 0).toString());
        OrderName.setText(model.getValueAt(i, 1).toString());
        CustomerId.setText(model.getValueAt(i, 2).toString());
        ProductId.setText(model.getValueAt(i, 3).toString());
        OrderPlacementDate.setText(model.getValueAt(i, 4).toString());
        OrderState.setText(model.getValueAt(i, 5).toString());
        OrderPrice.setText(model.getValueAt(i, 6).toString());
        Order_Due_Date.setText(model.getValueAt(i, 7).toString());
        Gender.setText(model.getValueAt(i, 8).toString());
    }//GEN-LAST:event_jTable_OrderMouseClicked

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void OrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderIdActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
           try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
   // int row = jTable_Product.getSelectedRow();
    //String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
    String value = OrderId.getText();
    String query = "UPDATE OrderManagement SET OrderName=?, CustomerId=?,ProductId=?,OrderState=?,OrderPrice=?,Order_Due_Date=?, Gender_of_Customer=? where OrderId="+value;
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, OrderName.getText());
    pst.setString(2, CustomerId.getText());
    pst.setString(3, ProductId.getText());
    pst.setString(4, OrderPlacementDate.getText());
    pst.setString(5, OrderState.getText());
    pst.setString(6, OrderPrice.getText());
    pst.setString(7, Order_Due_Date.getText());
    pst.setString(8, Gender.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Order.getModel();
    model.setRowCount(0);
    show_order();
    JOptionPane.showMessageDialog(null, "Updated Successfully!");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
    }//GEN-LAST:event_editbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        OrderId.setText("");
        OrderName.setText("");
        CustomerId.setText("");
        ProductId.setText("");
        OrderPlacementDate.setText("");
        OrderState.setText("");
        OrderPrice.setText("");
        Order_Due_Date.setText("");
        Gender.setText("");
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void searchidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidKeyReleased
        // TODO add your handling code here:
        try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String sql = "SELECT * FROM OrderManagement WHERE OrderId=?";
    PreparedStatement pst= con.prepareStatement(sql);
    pst.setString(1, searchid.getText());
    ResultSet rs = pst.executeQuery();
    if(rs.next())
    {
        String setid = rs.getString("OrderId");
        OrderId.setText(setid);
        String setname = rs.getString("OrderName");
        OrderName.setText(setname);
        String setcid = rs.getString("CustomerId");
        CustomerId.setText(setcid);
        String setpid = rs.getString("ProductId");
        ProductId.setText(setpid);
        String setpd = rs.getString("OrderPlacementDate");
        OrderPlacementDate.setText(setpd);
        String setst = rs.getString("OrderState");
        OrderState.setText(setst);
        String setpr = rs.getString("OrderPrice");
        OrderPrice.setText(setpr);
        String setodd = rs.getString("Order_Due_Date");
        Order_Due_Date.setText(setodd);
        String setgen = rs.getString("Gender_of_Customer");
        Gender.setText(setgen);
        
        
        
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
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerId;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField OrderId;
    private javax.swing.JTextField OrderName;
    private javax.swing.JTextField OrderPlacementDate;
    private javax.swing.JTextField OrderPrice;
    private javax.swing.JTextField OrderState;
    private javax.swing.JTextField Order_Due_Date;
    private javax.swing.JTextField ProductId;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel homebtn;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Order;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
