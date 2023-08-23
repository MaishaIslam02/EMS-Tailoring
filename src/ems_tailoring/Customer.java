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
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public Customer() {
        initComponents();
        show_customer();
    }

   
    public ArrayList<Customers> customerList(){
        ArrayList<Customers> customerList= new ArrayList<>();
        try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query1 = "SELECT * FROM Customer";
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(query1);
    Customers customer;
    while(rs.next()){
        customer= new Customers(rs.getInt("CustomerId"),rs.getInt("Phone"),rs.getInt("ProductId"),rs.getString("FirstName"),rs.getString("LastName"),rs.getString("C_Address"),rs.getString("Email"),rs.getString("Gender"),rs.getString("Order_Due_Date"));
        customerList.add(customer);
    }
    
        }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
        return customerList;
        
    }
    public void show_customer(){
        ArrayList<Customers> list = customerList();
        DefaultTableModel model=(DefaultTableModel) jTable_Customer.getModel();
        Object[] row = new Object[9];
        for(int i=0; i<list.size();i++){
            row[0]=list.get(i).getCustomerId();
            row[1]=list.get(i).getFirstName();
            row[2]=list.get(i).getLastName();
            row[3]=list.get(i).getAddress();
            row[4]=list.get(i).getEmail();
            row[5]=list.get(i).getPhone();
            row[6]=list.get(i).getGender();
            row[7]=list.get(i).getProductId();
            row[8]=list.get(i).getOrder_Due_Date();
            model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Customer = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ProductId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Order_Due_Date = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        homebtn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Gender = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        searchid = new javax.swing.JTextField();
        CustomerId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/plus.png"))); // NOI18N
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1268, 852, -1, -1));

        editbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/edit.png"))); // NOI18N
        editbtn.setText("EDIT");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        getContentPane().add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1583, 852, -1, -1));

        jTable_Customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerId", "FirstName", "LastName", "Address", "Email", "Phone", "Gender", "ProductId", "Order_Due_Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Short.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Customer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 1110, 420));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/customer-review.png"))); // NOI18N
        jLabel1.setText("MANAGE CUSTOMERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("CustomerId");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 270, -1, -1));
        getContentPane().add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 378, 132, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("LastName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 452, -1, -1));
        getContentPane().add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 486, 132, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 560, -1, -1));
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 589, 169, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Email");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 667, -1, -1));
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 696, 149, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 270, -1, -1));
        getContentPane().add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 310, 145, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("ProductId");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 450, -1, -1));
        getContentPane().add(ProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1570, 490, 91, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Order_Due_Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 560, -1, -1));
        getContentPane().add(Order_Due_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 590, 94, -1));

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/button.png"))); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1415, 852, -1, -1));

        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/restart.png"))); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1730, 852, -1, -1));

        homebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/home.png"))); // NOI18N
        homebtn.setText("Go To Homepage");
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });
        getContentPane().add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 60, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 380, 90, -1));

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
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        searchid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchidKeyReleased(evt);
            }
        });
        getContentPane().add(searchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 170, 40));

        CustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIdActionPerformed(evt);
            }
        });
        getContentPane().add(CustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 310, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("FirstName");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 350, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems_tailoring/design-space-paper-textured-background (1).jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
                  //ConnectMSSQL cnObj = new ConnectMSSQL();
                 // cnObj.connectDB();
                 try{
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    String query = "insert into Customer(FirstName,LastName,C_Address,Email,Phone,Gender,ProductId,Order_Due_Date) values(?,?,?,?,?,?,?,?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, FirstName.getText());
    pst.setString(2, LastName.getText());
    pst.setString(3, Address.getText());
    pst.setString(4, Email.getText());
    pst.setString(5, Phone.getText());
    pst.setString(6, Gender.getText());
    pst.setString(7, ProductId.getText());
    pst.setString(8, Order_Due_Date.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Customer.getModel();
    model.setRowCount(0);
    show_customer();
    JOptionPane.showMessageDialog(null, "Added Successfully!");
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
                 
        
    }//GEN-LAST:event_addbtnActionPerformed

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
            String sql = "SELECT * FROM Customer WHERE CustomerId=?";
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, searchid.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
            {
                String setid = rs.getString("CustomerId");
                CustomerId.setText(setid);
                String setfname = rs.getString("FirstName");
                FirstName.setText(setfname);
                String setlname = rs.getString("LastName");
                LastName.setText(setlname);
                String setadd = rs.getString("C_Address");
                Address.setText(setadd);
                String setem = rs.getString("Email");
                Email.setText(setem);
                String setph = rs.getString("Phone");
                Phone.setText(setph);
                String setgen = rs.getString("Gender");
                Gender.setText(setgen);
                String setpid = rs.getString("ProductId");
                ProductId.setText(setpid);
                String setodd = rs.getString("Order_Due_Date");
                Order_Due_Date.setText(setodd);
                

            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchidKeyReleased

    private void CustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIdActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
                try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    int row = jTable_Customer.getSelectedRow();
    String value= (jTable_Customer.getModel().getValueAt(row, 0).toString());
    String query = "DELETE FROM Customer WHERE CustomerId="+value;
    PreparedStatement pst= con.prepareStatement(query);
    pst.executeUpdate();
         }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    DefaultTableModel model = (DefaultTableModel) jTable_Customer.getModel();
    model.setRowCount(0);
    show_customer();
    JOptionPane.showMessageDialog(null, "Deleted Successfully!");
   
}
      
    }//GEN-LAST:event_deletebtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
           try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=EMSTailors;user=sa;password=123456";
    Connection con = DriverManager.getConnection(url);
    //int row = jTable_Product.getSelectedRow();
   // String value= (jTable_Product.getModel().getValueAt(row, 0).toString());
    String value = CustomerId.getText();
    String query = "UPDATE Customer SET FirstName=?, LastName=?, C_Address=? ,Email=?,Phone=?, Gender=?,ProductId=?,Order_Due_Date=? where CustomerId="+value;
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, FirstName.getText());
    pst.setString(2, LastName.getText());
    pst.setString(3, Address.getText());
    pst.setString(4, Email.getText());
    pst.setString(5, Phone.getText());
    pst.setString(6, Gender.getText());
    pst.setString(7, ProductId.getText());
    pst.setString(8, Order_Due_Date.getText());
    pst.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable_Customer.getModel();
    model.setRowCount(0);
    show_customer();
    JOptionPane.showMessageDialog(null, "Updated Successfully!");
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
   
}
    }//GEN-LAST:event_editbtnActionPerformed

    private void jTable_CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CustomerMouseClicked
        // TODO add your handling code here:
         int i = jTable_Customer.getSelectedRow();
        TableModel model = jTable_Customer.getModel();
        CustomerId.setText(model.getValueAt(i, 0).toString());
        FirstName.setText(model.getValueAt(i, 1).toString());
        LastName.setText(model.getValueAt(i, 2).toString());
        Address.setText(model.getValueAt(i, 3).toString());
        Email.setText(model.getValueAt(i, 4).toString());
        Phone.setText(model.getValueAt(i, 5).toString());
        Gender.setText(model.getValueAt(i, 6).toString());
        ProductId.setText(model.getValueAt(i, 7).toString());
        Order_Due_Date.setText(model.getValueAt(i, 8).toString());
    }//GEN-LAST:event_jTable_CustomerMouseClicked

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        CustomerId.setText("");
        FirstName.setText("");
        LastName.setText("");
        Address.setText("");
        Email.setText("");
        Phone.setText("");
        Gender.setText("");
        ProductId.setText("");
        Order_Due_Date.setText("");
        
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField CustomerId;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField Gender;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField Order_Due_Date;
    private javax.swing.JTextField Phone;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Customer;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchid;
    // End of variables declaration//GEN-END:variables
}
