/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gymapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Mohammad Alqasem
 */
public class AdminJFrame extends GymApplication {

    /**
     * Creates new form AdminJFrame
     */
    
    public AdminJFrame() {
        initComponents();
        // أضف مستمع الأحداث لزر الدخول هنا
        
        loginToGymF.addActionListener(e -> {
            // قم بتحديث المتغيرات من حقول النص قبل استدعاء الدالة login
            
            AdminID = EnterIDAdminForLogin.getText();
            Password = EnterPasswordAdminForLogin.getText();
            
         
            
               
                  
             if (AdminID == null || AdminID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your Member ID.");
            return;
        }
        if (Password == null || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your password.");
            return;
        }
                System.out.print(AdminID);
           login();
        });       
        
        
       
    }

    private String AdminID ;
    private String Password;
    
     
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        LabelLoginAdmin = new javax.swing.JLabel();
        loginToGymF = new java.awt.Button();
        backTOGymJFrame = new java.awt.Button();
        EnterIDAdminForLogin = new javax.swing.JTextField();
        LabelforIDAdmin = new javax.swing.JLabel();
        LabelForAdminPassword = new javax.swing.JLabel();
        EnterPasswordAdminForLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(55, 57, 66));
        jPanel2.setForeground(new java.awt.Color(26, 41, 62));

        LabelLoginAdmin.setBackground(new java.awt.Color(255, 255, 255));
        LabelLoginAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelLoginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        LabelLoginAdmin.setText("Login Admin");

        loginToGymF.setActionCommand("Login_to_gym");
        loginToGymF.setBackground(new java.awt.Color(203, 22, 45));
        loginToGymF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginToGymF.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        loginToGymF.setForeground(new java.awt.Color(255, 255, 255));
        loginToGymF.setLabel("Login");
        loginToGymF.setName(""); // NOI18N
        loginToGymF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginToGymActionPerformed(evt);
            }
        });

        backTOGymJFrame.setActionCommand("Back");
        backTOGymJFrame.setBackground(new java.awt.Color(203, 22, 45));
        backTOGymJFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backTOGymJFrame.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backTOGymJFrame.setForeground(new java.awt.Color(255, 255, 255));
        backTOGymJFrame.setLabel("Back");
        backTOGymJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTOGymJFrameActionPerformed(evt);
            }
        });

        EnterIDAdminForLogin.setBackground(new java.awt.Color(110, 110, 111));
        EnterIDAdminForLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnterIDAdminForLogin.setForeground(new java.awt.Color(255, 255, 255));
        EnterIDAdminForLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterIDAdminForLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterIDAdminForLoginActionPerformed(evt);
            }
        });

        LabelforIDAdmin.setBackground(new java.awt.Color(110, 110, 111));
        LabelforIDAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelforIDAdmin.setForeground(new java.awt.Color(255, 255, 255));
        LabelforIDAdmin.setText("   ID Admin :");

        LabelForAdminPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelForAdminPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelForAdminPassword.setText("Password :");

        EnterPasswordAdminForLogin.setBackground(new java.awt.Color(110, 110, 111));
        EnterPasswordAdminForLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnterPasswordAdminForLogin.setForeground(new java.awt.Color(255, 255, 255));
        EnterPasswordAdminForLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterPasswordAdminForLogin.setToolTipText("*");
        EnterPasswordAdminForLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPasswordAdminForLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(LabelforIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EnterIDAdminForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(LabelForAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EnterPasswordAdminForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backTOGymJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginToGymF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelforIDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EnterIDAdminForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EnterPasswordAdminForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelForAdminPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(loginToGymF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(backTOGymJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backTOGymJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTOGymJFrameActionPerformed
        // TODO add your handling code here:
      GYMJFrame Gym = new GYMJFrame();  
      Gym.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backTOGymJFrameActionPerformed

    private void EnterIDAdminForLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterIDAdminForLoginActionPerformed
        // TODO add your handling code here:
      

    }//GEN-LAST:event_EnterIDAdminForLoginActionPerformed

    private void loginToGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginToGymActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginToGymActionPerformed

    private void EnterPasswordAdminForLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPasswordAdminForLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterPasswordAdminForLoginActionPerformed

    
    public void login() {

    String AdminFName="", AdminLName="",ID,password="";
        boolean found = false;
      try (BufferedReader reader = new BufferedReader(new FileReader("Admin list.txt"))) {
          
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\s+");
                if (fields[0].equals(AdminID)) {
                    found = true;
                    AdminFName = fields[1];
                    AdminLName = fields[2];
                    password = fields[3];
                    break;
                }
            }

            if (found) {
                            
               if (Password.equals(password)) {
                    LocalDateTime currentTime = LocalDateTime.now();
                          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss yyyy");
                          String formattedTime = currentTime.format(formatter);
                    String message = "Welcome " + AdminFName + " " + AdminLName +"<br>"+"You are logged in now at: " + formattedTime ;
            
                          JOptionPane optionPane = new JOptionPane("<html><p style='font-size:14px'>" + message + "</p></html>", JOptionPane.INFORMATION_MESSAGE);
                          JDialog dialog = optionPane.createDialog(null, "Hive Gym");
                          dialog.setSize(715, 370);
                          dialog.setLocationRelativeTo(null);
                          dialog.setLocation(300, 200);
                          setVisible(false);
                          dialog.setVisible(true); // عرض الـ JDialog 
                          GYMJFrame Gym = new GYMJFrame();  
                          Gym.setVisible(true);  
                  
                    }
               else {
                   
                    EnterPasswordAdminForLogin.setText("");
                     JOptionPane.showMessageDialog(this, "Incorrect password, try again");
              
               }
            }
            else {
                 EnterPasswordAdminForLogin.setText("");
                  EnterIDAdminForLogin.setText("");
                JOptionPane.showMessageDialog(this,"Sorry, there is no personal identifier like this.");
                
            }
        } catch (IOException e) {
              JOptionPane.showMessageDialog(this,"The file you try to access does not exist!! ");
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
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterIDAdminForLogin;
    private javax.swing.JTextField EnterIDMemberForLogin;
    private javax.swing.JPasswordField EnterPasswordAdminForLogin;
    private javax.swing.JTextField EnterPasswordMemberForLogin;
    private javax.swing.JLabel LabelForAdminPassword;
    private javax.swing.JLabel LabelForMemberPassword;
    private javax.swing.JLabel LabelLoginAdmin;
    private javax.swing.JLabel LabelLoginMember;
    private javax.swing.JLabel LabelforIDAdmin;
    private javax.swing.JLabel LabelforIDMember;
    private java.awt.Button backTOGymJFrame;
    private java.awt.Button backTOMemberJFrame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Button loginToGym;
    private java.awt.Button loginToGymF;
    // End of variables declaration//GEN-END:variables
}
