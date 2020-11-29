/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Em-kun
 */
public class Magazine_Subscription_Page extends javax.swing.JFrame {

    /**
     * Creates new form Subscription_Page
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String Database = "databaseschema_5318";
    String User = "root";
    String Pass = "1234";
    
    public Magazine_Subscription_Page() {
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

        Subscription_Label = new javax.swing.JLabel();
        Subscription_Back_Button = new javax.swing.JButton();
        Insert_Button = new javax.swing.JButton();
        CustID_Label = new javax.swing.JLabel();
        Update_Button = new javax.swing.JButton();
        CustID_Text_Field = new javax.swing.JTextField();
        Delete_Button = new javax.swing.JButton();
        Pname = new javax.swing.JLabel();
        Pname_Text_Field = new javax.swing.JTextField();
        NoOfIssues = new javax.swing.JLabel();
        NoOfIssues_Text_Field = new javax.swing.JTextField();
        EndDate = new javax.swing.JLabel();
        EndDate_Text_Field = new javax.swing.JTextField();
        StartDate_Text_Field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Magazine_Display_Info_Table = new javax.swing.JTable();
        StartDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Subscription_Label.setText("MAGAZINE SUBSCRIPTIONS");

        Subscription_Back_Button.setText("Main Menu");
        Subscription_Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Subscription_Back_ButtonActionPerformed(evt);
            }
        });

        Insert_Button.setText("INSERT");
        Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_ButtonActionPerformed(evt);
            }
        });

        CustID_Label.setText("Cust ID");

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

        Pname.setText("Publication Name");

        Pname_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pname_Text_FieldActionPerformed(evt);
            }
        });

        NoOfIssues.setText("Number of Issues");

        EndDate.setText("End Date");

        EndDate_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndDate_Text_FieldActionPerformed(evt);
            }
        });

        Magazine_Display_Info_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Pname", "No of Issue", "End Date", "Start Date", "Price"
            }
        ));
        jScrollPane1.setViewportView(Magazine_Display_Info_Table);

        StartDate.setText("Start Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(529, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Subscription_Back_Button)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Subscription_Label)
                        .addGap(556, 556, 556))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(618, 618, 618)
                            .addComponent(Update_Button)
                            .addGap(130, 130, 130)
                            .addComponent(Delete_Button))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EndDate)
                                .addComponent(NoOfIssues)
                                .addComponent(Pname)
                                .addComponent(CustID_Label)
                                .addComponent(StartDate))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CustID_Text_Field)
                                .addComponent(Pname_Text_Field)
                                .addComponent(NoOfIssues_Text_Field)
                                .addComponent(EndDate_Text_Field)
                                .addComponent(StartDate_Text_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addGap(135, 135, 135)
                            .addComponent(Insert_Button)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Subscription_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 606, Short.MAX_VALUE)
                .addComponent(Subscription_Back_Button)
                .addGap(49, 49, 49))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CustID_Label)
                        .addComponent(CustID_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pname)
                        .addComponent(Pname_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NoOfIssues)
                        .addComponent(NoOfIssues_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Insert_Button)
                        .addComponent(Update_Button)
                        .addComponent(Delete_Button))
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EndDate)
                        .addComponent(EndDate_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StartDate_Text_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StartDate))
                    .addContainerGap(150, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Subscription_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Subscription_Back_ButtonActionPerformed
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Subscription_Back_ButtonActionPerformed

    
    public int Calculate_Price(){
        int rate = 0;
        int price = 0;
        int No_Of_Issues = 0;
        try {
            String PubName = Pname_Text_Field.getText();
            No_Of_Issues = Integer.parseInt(NoOfIssues_Text_Field.getText());
            String sqlrate = "SELECT Rate FROM publication WHERE Name IN ('" + PubName +  "')" + " AND Type = `Magazine`";
            pst = conn.prepareStatement(sqlrate);
            rs = pst.executeQuery(sqlrate);  
            
            while(rs.next()){
                rate = rs.getInt("Rate");
            }
      
            price = No_Of_Issues * rate;
            
            
            
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
    }
        return price;
    }
    
    public LocalDate calculateDate() throws SQLException
            {
                LocalDate StartDate = null;
                StartDate.parse(StartDate_Text_Field.getText());
                LocalDate EndDate= null;
                String PubName = Pname_Text_Field.getText();
                String sql = "SELECT Rate FROM publication WHERE Name IN ('" + PubName +  "')"; //+ " AND Type = Magazine";
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery(sql); 
              
                
                
                return EndDate;
            }
    
    private void Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonActionPerformed

        
        
        try {

            int price = Calculate_Price();
            
            String sql = "INSERT INTO msub "
            + "(`IDnum`, `Pname`, `No_Of_Issues`, `End_Date`, `Start_Date`, `Price`) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

            //Price = No of issues * Rate(Dollar amount per item)
            //End_Date = Start Date + No of Issues 
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, "root", "1234");
            pst = conn.prepareStatement(sql);
            
            LocalDate EndDate = calculateDate();

            pst.setString(1,CustID_Text_Field.getText());
            pst.setString(2,Pname_Text_Field.getText());
            pst.setString(3,NoOfIssues_Text_Field.getText());
            pst.setObject(4,EndDate);
            pst.setString(5,StartDate_Text_Field.getText());
            pst.setInt(6,price);
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
            
            int price = Calculate_Price();
                
            String sql = "UPDATE msub SET No_Of_Issues=?, Start_Date=?, Price=? WHERE IDnum=? AND Pname=?";
       
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Pass);
            pst = conn.prepareStatement(sql);
            
            pst.setString(4,CustID_Text_Field.getText());
            pst.setString(5,Pname_Text_Field.getText());
            pst.setString(1,NoOfIssues_Text_Field.getText());
            pst.setString(2,StartDate_Text_Field.getText());
            pst.setInt(3,price);

           
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
            String sql = "DELETE FROM msub WHERE IDnum =? AND Pname=?";
 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Pass);
            pst = conn.prepareStatement(sql);
            pst.setString(1,CustID_Text_Field.getText());
            pst.setString(2,Pname_Text_Field.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        }catch(SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
         
        //Refresh
        showTableData();
                

    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void Pname_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pname_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pname_Text_FieldActionPerformed

    private void EndDate_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndDate_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndDate_Text_FieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public void showTableData()
    {
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Database, User, Pass);
             String sql = "SELECT * FROM `"+Database+"`.`msub`";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             Magazine_Display_Info_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Magazine_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Magazine_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Magazine_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Magazine_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Magazine_Subscription_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustID_Label;
    private javax.swing.JTextField CustID_Text_Field;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JLabel EndDate;
    private javax.swing.JTextField EndDate_Text_Field;
    private javax.swing.JButton Insert_Button;
    private javax.swing.JTable Magazine_Display_Info_Table;
    private javax.swing.JLabel NoOfIssues;
    private javax.swing.JTextField NoOfIssues_Text_Field;
    private javax.swing.JLabel Pname;
    private javax.swing.JTextField Pname_Text_Field;
    private javax.swing.JLabel StartDate;
    private javax.swing.JTextField StartDate_Text_Field;
    private javax.swing.JButton Subscription_Back_Button;
    private javax.swing.JLabel Subscription_Label;
    private javax.swing.JButton Update_Button;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Switch(LocalDate StartDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
