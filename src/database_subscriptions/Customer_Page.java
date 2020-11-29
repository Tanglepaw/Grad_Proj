/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Em-kun
 */
public class Customer_Page extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Page
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    
    public Customer_Page() {
        initComponents();
        showTableData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Customers_Label = new javax.swing.JLabel();
        Customers_Back_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_Display_Info_Table = new javax.swing.JTable();
        CustID_Label = new javax.swing.JLabel();
        CustID_Text_Field = new javax.swing.JTextField();
        FirstName_Label = new javax.swing.JLabel();
        FirstName_Text_Field = new javax.swing.JTextField();
        MiddleName_Label = new javax.swing.JLabel();
        MiddleName_Text_Field = new javax.swing.JTextField();
        LastName_Label = new javax.swing.JLabel();
        LastName_Text_Field = new javax.swing.JTextField();
        Address_Text_Field = new javax.swing.JTextField();
        Address_Label = new javax.swing.JLabel();
        Insert_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Customers_Label.setText("CUSTOMERS");

        Customers_Back_Button.setText("Main Menu");
        Customers_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Customers_Back_ButtonActionPerformed(evt);
            }
        });

        Customer_Display_Info_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "First Name", "Middle Name", "Last Name", "Address"
            }
        ));
        jScrollPane1.setViewportView(Customer_Display_Info_Table);

        CustID_Label.setText("Cust ID");

        FirstName_Label.setText("First Name");

        FirstName_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_Text_FieldActionPerformed(evt);
            }
        });

        MiddleName_Label.setText("Middle Name");

        LastName_Label.setText("Last Name");

        LastName_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_Text_FieldActionPerformed(evt);
            }
        });

        Address_Label.setText("Address");

        Insert_Button.setText("INSERT");
        Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setText("UPDATE");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setText("DELETE");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(580, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Customers_Label)
                        .addGap(583, 583, 583))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Update_Button)
                                .addGap(130, 130, 130)
                                .addComponent(Delete_Button)
                                .addGap(271, 271, 271))
                            .addComponent(Customers_Back_Button))
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LastName_Label)
                    .addComponent(MiddleName_Label)
                    .addComponent(FirstName_Label)
                    .addComponent(CustID_Label)
                    .addComponent(Address_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CustID_Text_Field)
                    .addComponent(FirstName_Text_Field)
                    .addComponent(MiddleName_Text_Field)
                    .addComponent(LastName_Text_Field)
                    .addComponent(Address_Text_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(135, 135, 135)
                .addComponent(Insert_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(Customers_Label)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustID_Label)
                    .addComponent(CustID_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName_Label)
                    .addComponent(FirstName_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MiddleName_Label)
                    .addComponent(MiddleName_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_Button)
                    .addComponent(Update_Button)
                    .addComponent(Delete_Button))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName_Label)
                    .addComponent(LastName_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Customers_Back_Button)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Customers_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customers_Back_ButtonActionPerformed
        // TODO add your handling code here:
        
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Customers_Back_ButtonActionPerformed

    private void FirstName_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_Text_FieldActionPerformed

    private void LastName_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName_Text_FieldActionPerformed

    private void Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonActionPerformed

            // TODO add your handling code here:
        try {
            String sql = "INSERT INTO `databaseschema_5318`.`customer` "
            + "(`IDnum`, `Fname`, `Minit`, `Lname`, `Address`) "
            + "VALUES (?, ?, ?, ?, ?)";
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseschema_5318", "root", "1234");
            pst = conn.prepareStatement(sql);
            pst.setString(1,CustID_Text_Field.getText());
            pst.setString(2,FirstName_Text_Field.getText());
            pst.setString(3,MiddleName_Text_Field.getText());
            pst.setString(4,LastName_Text_Field.getText());
            pst.setString(5,Address_Text_Field.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //Refresh DB
        showTableData();
    }//GEN-LAST:event_Insert_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
                try {
            String sql = "DELETE FROM `databaseschema_5318`.`customer` WHERE IDnum =?";
 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseschema_5318", "root", "1234");
            pst = conn.prepareStatement(sql);
            pst.setString(1,CustID_Text_Field.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
         
        //Refresh
        showTableData();
        
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE `databaseschema_5318`.`customer` SET Fname=?, Minit=?, Lname=?, Address=? WHERE IDnum=?";
       
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseschema_5318", "root", "1234");
            pst = conn.prepareStatement(sql);
            
            pst.setString(5,CustID_Text_Field.getText());
            pst.setString(1,FirstName_Text_Field.getText());
            pst.setString(2,MiddleName_Text_Field.getText());
            pst.setString(3,LastName_Text_Field.getText());
            pst.setString(4,Address_Text_Field.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //Refresh
        showTableData();
    }//GEN-LAST:event_Update_ButtonActionPerformed

    public void showTableData()
    {
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseschema_5318", "root", "1234");
             String sql = "SELECT * FROM `databaseschema_5318`.`customer`";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             Customer_Display_Info_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String  args[]) { 
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
            java.util.logging.Logger.getLogger(Customer_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address_Label;
    private javax.swing.JTextField Address_Text_Field;
    private javax.swing.JLabel CustID_Label;
    private javax.swing.JTextField CustID_Text_Field;
    private javax.swing.JTable Customer_Display_Info_Table;
    private javax.swing.JButton Customers_Back_Button;
    private javax.swing.JLabel Customers_Label;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JTextField FirstName_Text_Field;
    private javax.swing.JButton Insert_Button;
    private javax.swing.JLabel LastName_Label;
    private javax.swing.JTextField LastName_Text_Field;
    private javax.swing.JLabel MiddleName_Label;
    private javax.swing.JTextField MiddleName_Text_Field;
    private javax.swing.JButton Update_Button;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
