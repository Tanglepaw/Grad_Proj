/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

/**
 *
 * @author Em-kun
 */
public class Newspaper_Subscription_Page extends javax.swing.JFrame {

    /**
     * Creates new form Newspaper_Subscription_Page
     */
    public Newspaper_Subscription_Page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Insert_Button = new javax.swing.JButton();
        CustID_Label = new javax.swing.JLabel();
        Update_Button = new javax.swing.JButton();
        CustID_Text_Field = new javax.swing.JTextField();
        Delete_Button = new javax.swing.JButton();
        FirstName_Label = new javax.swing.JLabel();
        FirstName_Text_Field = new javax.swing.JTextField();
        MiddleName_Label = new javax.swing.JLabel();
        MiddleName_Text_Field = new javax.swing.JTextField();
        LastName_Label = new javax.swing.JLabel();
        Customers_Label = new javax.swing.JLabel();
        LastName_Text_Field = new javax.swing.JTextField();
        Customers_Back_Button = new javax.swing.JButton();
        Address_Text_Field = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Customer_Display_Info_Table = new javax.swing.JTable();
        Address_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        FirstName_Label.setText("First Name");

        FirstName_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstName_Text_FieldActionPerformed(evt);
            }
        });

        MiddleName_Label.setText("Middle Name");

        LastName_Label.setText("Last Name");

        Customers_Label.setText("NEWSPAPER SUBSCRIPTION");

        LastName_Text_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastName_Text_FieldActionPerformed(evt);
            }
        });

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

        Address_Label.setText("Address");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(Customers_Back_Button)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonActionPerformed

        // TODO add your handling code here:
        // price = 
        

    }//GEN-LAST:event_Insert_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
  

    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void FirstName_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstName_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstName_Text_FieldActionPerformed

    private void LastName_Text_FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastName_Text_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastName_Text_FieldActionPerformed

    private void Customers_Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Customers_Back_ButtonActionPerformed
        // TODO add your handling code here:

        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Customers_Back_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Newspaper_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newspaper_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newspaper_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newspaper_Subscription_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newspaper_Subscription_Page().setVisible(true);
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
