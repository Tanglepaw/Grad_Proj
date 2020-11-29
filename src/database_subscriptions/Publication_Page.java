/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

import database_subscriptions.MainMenu;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Em-kun
 */
public class Publication_Page extends javax.swing.JFrame {

    /**
     * Creates new form Publication_Page
     * 
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    String Database = "databaseschema_5318";
    String User = "root";
    String Password = "1234";
    
    public Publication_Page() {
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

        Publications_Label = new javax.swing.JLabel();
        Publication_Back_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_Display_Info_Table = new javax.swing.JTable();
        CustID_Label = new javax.swing.JLabel();
        Pub_Text_Field = new javax.swing.JTextField();
        FirstName_Label = new javax.swing.JLabel();
        PubAddress_Text_Field = new javax.swing.JTextField();
        MiddleName_Label = new javax.swing.JLabel();
        Insert_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Type_jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        MagNews_Table = new javax.swing.JTable();
        TableControl = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Rate_Text_Field = new javax.swing.JTextField();
        PubNameVar_Label1 = new javax.swing.JLabel();
        PubVar_Text_Field = new javax.swing.JTextField();
        Frequency_Label1 = new javax.swing.JLabel();
        Insert_ButtonVar = new javax.swing.JButton();
        Update_ButtonVar = new javax.swing.JButton();
        Delete_ButtonVar = new javax.swing.JButton();
        FrequencyComBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Publications_Label.setText("PUBLICATIONS");

        Publication_Back_Button.setText("Main Menu");
        Publication_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Publication_Back_ButtonActionPerformed(evt);
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

        CustID_Label.setText("Publication Name");

        FirstName_Label.setText("Address");

        PubAddress_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PubAddress_Text_FieldActionPerformed(evt);
            }
        });

        MiddleName_Label.setText("Type");

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

        Type_jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Magazine", "Newspaper" }));

        MagNews_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(MagNews_Table);

        TableControl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Magazine", "Newspaper" }));
        TableControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableControlActionPerformed(evt);
            }
        });

        jLabel1.setText("Rate");

        Rate_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rate_Text_FieldActionPerformed(evt);
            }
        });

        PubNameVar_Label1.setText("Publication Name");

        Frequency_Label1.setText("Frequency");

        Insert_ButtonVar.setText("INSERT");
        Insert_ButtonVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_ButtonVarActionPerformed(evt);
            }
        });

        Update_ButtonVar.setText("UPDATE");
        Update_ButtonVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonVarActionPerformed(evt);
            }
        });

        Delete_ButtonVar.setText("DELETE");
        Delete_ButtonVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonVarActionPerformed(evt);
            }
        });

        FrequencyComBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Weekly", "Monthly", "Quarterly" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(Publications_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TableControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(MiddleName_Label)
                    .addComponent(FirstName_Label)
                    .addComponent(CustID_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pub_Text_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(PubAddress_Text_Field)
                    .addComponent(Type_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rate_Text_Field))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Publication_Back_Button)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Frequency_Label1)
                            .addComponent(PubNameVar_Label1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PubVar_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FrequencyComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Insert_ButtonVar)
                        .addGap(40, 40, 40)
                        .addComponent(Update_ButtonVar)
                        .addGap(44, 44, 44)
                        .addComponent(Delete_ButtonVar)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(Insert_Button)
                        .addGap(40, 40, 40)
                        .addComponent(Update_Button)
                        .addGap(44, 44, 44)
                        .addComponent(Delete_Button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(Publications_Label)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TableControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustID_Label)
                            .addComponent(Pub_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstName_Label)
                            .addComponent(PubAddress_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MiddleName_Label)
                            .addComponent(Type_jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Insert_ButtonVar)
                                .addComponent(Update_ButtonVar)
                                .addComponent(Delete_ButtonVar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(Rate_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PubNameVar_Label1)
                            .addComponent(PubVar_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Frequency_Label1)
                            .addComponent(FrequencyComBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_Button)
                    .addComponent(Update_Button)
                    .addComponent(Delete_Button))
                .addGap(17, 17, 17)
                .addComponent(Publication_Back_Button)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Publication_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Publication_Back_ButtonActionPerformed
        // TODO add your handling code here:

        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Publication_Back_ButtonActionPerformed

    private void Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonActionPerformed

        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO `" + Database +"`.`PUBLICATION` "
            + "(Name, Address, Type, Rate) "
            + "VALUES (?, ?, ?, ?)";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
            pst = conn.prepareStatement(sql);
            pst.setString(1,Pub_Text_Field.getText());
            pst.setString(2,PubAddress_Text_Field.getText());
            pst.setString(3, (String) Type_jComboBox1.getSelectedItem());
            pst.setString(4,Rate_Text_Field.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //Refresh DB
        showTableData();
    }//GEN-LAST:event_Insert_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "UPDATE `"+ Database +"`.`PUBLICATION` SET Address=?, Rate =? Where Name = ? AND Type = ?";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
            pst = conn.prepareStatement(sql);

            pst.setString(3,Pub_Text_Field.getText());
            pst.setString(1,PubAddress_Text_Field.getText());
            pst.setString(4,(String) Type_jComboBox1.getSelectedItem());
            pst.setString(2,Rate_Text_Field.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //Refresh
        showTableData();
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM `"+ Database +"`.`PUBLICATION` WHERE Name =? AND Type = ?";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
            pst = conn.prepareStatement(sql);
            pst.setString(1,Pub_Text_Field.getText());
            pst.setString(2,(String) Type_jComboBox1.getSelectedItem());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

        //Refresh
        showTableData();

    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void PubAddress_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PubAddress_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PubAddress_Text_FieldActionPerformed

    private void Rate_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rate_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rate_Text_FieldActionPerformed

    private void Insert_ButtonVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonVarActionPerformed
        // TODO add your handling code here:
        try {
            String Frequency;
            String Table = (String) TableControl.getSelectedItem();
            if (Table.equals("Magazine"))
                Frequency = "Mfrequency";
            else   
                Frequency = "Nfrequency";
            
            String sql = "INSERT INTO `" + Database +"`.`"+Table+"` "
            + "(Name, "+Frequency+" ) "
            + "VALUES (?, ?)";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
            pst = conn.prepareStatement(sql);
            pst.setString(1,PubVar_Text_Field.getText());
            pst.setString(2,(String)FrequencyComBox.getSelectedItem());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //Refresh DB
        showTableData();
    }//GEN-LAST:event_Insert_ButtonVarActionPerformed

    private void Update_ButtonVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonVarActionPerformed
        // TODO add your handling code here:
        try {
            String Frequency;
            String Table = (String) TableControl.getSelectedItem();
            if (Table.equals("Magazine"))
                Frequency = "Mfrequency";
            else   
                Frequency = "Nfrequency";
            String sql = "UPDATE `"+ Database +"`.`"+Table+"` SET "+Frequency+"=? Where Name = ?";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
            pst = conn.prepareStatement(sql);

            pst.setString(2,PubVar_Text_Field.getText());
            pst.setString(1,(String)FrequencyComBox.getSelectedItem());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }//GEN-LAST:event_Update_ButtonVarActionPerformed

    private void Delete_ButtonVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonVarActionPerformed
        try {
            String Frequency;
            String Table = (String) TableControl.getSelectedItem();
            if (Table.equals("Magazine"))
                Frequency = "Mfrequency";
            else   
                Frequency = "Nfrequency";
            String sql = "DELETE FROM `"+ Database +"`.`"+Table+"` WHERE Name =?";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
            pst = conn.prepareStatement(sql);
            pst.setString(1,PubVar_Text_Field.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        }
        catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        showTableData();
    }//GEN-LAST:event_Delete_ButtonVarActionPerformed

    private void TableControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableControlActionPerformed
        // TODO add your handling code here:
        //Change frequency combo box depending on magazine or newspaper
        DefaultComboBoxModel mag = new DefaultComboBoxModel(new String[]{"7", "30", "90"});
        DefaultComboBoxModel news = new DefaultComboBoxModel(new String[]{"1", "7"});
        if ("Magazine".equals(TableControl.getSelectedItem()))
        {
            FrequencyComBox.setModel(mag);
        }
        else
        {
            FrequencyComBox.setModel(news);
        }
        showTableData();
    }//GEN-LAST:event_TableControlActionPerformed

                                                     
                                           
    public void showTableData()
    {
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Password);
             String sql = "SELECT * FROM `"+ Database + "`.`PUBLICATION`";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             Customer_Display_Info_Table.setModel(DbUtils.resultSetToTableModel(rs));
             
             String Table = (String) TableControl.getSelectedItem();;
             sql = "Select * FROM `" + Database + "`.`" + Table + "`";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             MagNews_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
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
            java.util.logging.Logger.getLogger(Publication_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publication_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publication_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publication_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publication_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustID_Label;
    private javax.swing.JTable Customer_Display_Info_Table;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Delete_ButtonVar;
    private javax.swing.JLabel FirstName_Label;
    private javax.swing.JComboBox<String> FrequencyComBox;
    private javax.swing.JLabel Frequency_Label1;
    private javax.swing.JButton Insert_Button;
    private javax.swing.JButton Insert_ButtonVar;
    private javax.swing.JTable MagNews_Table;
    private javax.swing.JLabel MiddleName_Label;
    private javax.swing.JTextField PubAddress_Text_Field;
    private javax.swing.JLabel PubNameVar_Label1;
    private javax.swing.JTextField PubVar_Text_Field;
    private javax.swing.JTextField Pub_Text_Field;
    private javax.swing.JButton Publication_Back_Button;
    private javax.swing.JLabel Publications_Label;
    private javax.swing.JTextField Rate_Text_Field;
    private javax.swing.JComboBox<String> TableControl;
    private javax.swing.JComboBox<String> Type_jComboBox1;
    private javax.swing.JButton Update_Button;
    private javax.swing.JButton Update_ButtonVar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
