/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gymapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
/**
 *
 * @author Mohammad Alqasem
 */
public class LoginMJFrame extends GymApplication {

    /**
     * Creates new form LoginMJFrame
     */
    
  public LoginMJFrame() {
        initComponents();
        // أضف مستمع الأحداث لزر الدخول هنا
        
        loginToGym.addActionListener(e -> {
            // قم بتحديث المتغيرات من حقول النص قبل استدعاء الدالة login
            
            MemberID = EnterIDMemberForLogin.getText();
            Password = EnterPasswordMemberForLogin.getText();
            
         
            
                
             if (MemberID == null || MemberID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your Member ID.");
            return;
        }
        if (Password == null || Password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your password.");
            return;
        }
           login();
        });
    }
private  String MemberID ;
private String Password;
private LocalDate subscriptionDate;

private LocalDate subscriptionExpiration;

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelLoginMember = new javax.swing.JLabel();
        loginToGym = new java.awt.Button();
        backTOMemberJFrame = new java.awt.Button();
        EnterIDMemberForLogin = new javax.swing.JTextField();
        LabelforIDMember = new javax.swing.JLabel();
        LabelForMemberPassword = new javax.swing.JLabel();
        EnterPasswordMemberForLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 57, 66));
        jPanel1.setForeground(new java.awt.Color(26, 41, 62));

        LabelLoginMember.setBackground(new java.awt.Color(255, 255, 255));
        LabelLoginMember.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LabelLoginMember.setForeground(new java.awt.Color(255, 255, 255));
        LabelLoginMember.setText("Login Member");

        loginToGym.setActionCommand("Login_to_gym");
        loginToGym.setBackground(new java.awt.Color(203, 22, 45));
        loginToGym.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginToGym.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        loginToGym.setForeground(new java.awt.Color(255, 255, 255));
        loginToGym.setLabel("Login");
        loginToGym.setName(""); // NOI18N
        loginToGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginToGymActionPerformed(evt);
            }
        });

        backTOMemberJFrame.setActionCommand("Back");
        backTOMemberJFrame.setBackground(new java.awt.Color(203, 22, 45));
        backTOMemberJFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backTOMemberJFrame.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        backTOMemberJFrame.setForeground(new java.awt.Color(255, 255, 255));
        backTOMemberJFrame.setLabel("Back");
        backTOMemberJFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backTOMemberJFrameActionPerformed(evt);
            }
        });

        EnterIDMemberForLogin.setBackground(new java.awt.Color(110, 110, 111));
        EnterIDMemberForLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnterIDMemberForLogin.setForeground(new java.awt.Color(255, 255, 255));
        EnterIDMemberForLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterIDMemberForLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterIDMemberForLoginActionPerformed(evt);
            }
        });

        LabelforIDMember.setBackground(new java.awt.Color(110, 110, 111));
        LabelforIDMember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelforIDMember.setForeground(new java.awt.Color(255, 255, 255));
        LabelforIDMember.setText("   ID Member :");

        LabelForMemberPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelForMemberPassword.setForeground(new java.awt.Color(255, 255, 255));
        LabelForMemberPassword.setText("Password :");

        EnterPasswordMemberForLogin.setBackground(new java.awt.Color(110, 110, 111));
        EnterPasswordMemberForLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnterPasswordMemberForLogin.setForeground(new java.awt.Color(255, 255, 255));
        EnterPasswordMemberForLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EnterPasswordMemberForLogin.setToolTipText("*");
        EnterPasswordMemberForLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterPasswordMemberForLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(LabelforIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EnterIDMemberForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(LabelForMemberPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(EnterPasswordMemberForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLoginMember, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backTOMemberJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginToGym, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelLoginMember, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelforIDMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterIDMemberForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelForMemberPassword)
                    .addComponent(EnterPasswordMemberForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(loginToGym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(backTOMemberJFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void loginToGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginToGymActionPerformed
        // TODO add your handling code here:
        /*
              
       if (CID == null || CID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your Member ID.");
            return;
        }
        if (CPass == null || CPass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your password.");
            return;
        }
     */
        
    }//GEN-LAST:event_loginToGymActionPerformed
   
    private void backTOMemberJFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backTOMemberJFrameActionPerformed
        // TODO add your handling code here:
          MemberJFrame mem = new MemberJFrame();  
      mem.setVisible(true);
        setVisible(false);
       
    }//GEN-LAST:event_backTOMemberJFrameActionPerformed

    private void EnterIDMemberForLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterIDMemberForLoginActionPerformed
        // TODO add your handling code here:
          MemberID = EnterIDMemberForLogin.getText(); // تعيين الحقل ليكون قابل للتحرير
    
        
    }//GEN-LAST:event_EnterIDMemberForLoginActionPerformed

    private void EnterPasswordMemberForLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterPasswordMemberForLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterPasswordMemberForLoginActionPerformed
 
    public void login() {
       
      String FName = "";
        String SName = "";
        String LName = "";
        String pass = "2---";
        String phoneNumber = "";
        String subscription = "";
        String CName1 = "";
        String CName2 = "";
      
        boolean found = false;
    
        try (BufferedReader reader = new BufferedReader(new FileReader("Members list.txt"))) {
          
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split("\\s+");
                if (fields[0].equals(MemberID)) {
                    found = true;
                    FName = fields[1];
                    SName = fields[2];
                    LName = fields[3];
                    pass = fields[4];
                    phoneNumber = fields[5];
                    subscription = fields[6];
                    CName1 = fields[7];
                    CName2 = fields[8];
                    subscriptionDate = LocalDate.parse(fields[9] + " " + fields[10] + " " + fields[11], DateTimeFormatter.ofPattern("yyyy M d"));
                    subscriptionExpiration = LocalDate.parse(fields[12] + " " + fields[13] + " " + fields[14], DateTimeFormatter.ofPattern("yyyy M d"));
                    
      
                    break;
                }
            }

   
            if (found) {
             
                
               

                if (Password.equals(pass)) {
                    String message = "Welcome " + FName + " " + SName + " " + LName + "<br>" + check_Subscription() + "<br>" +
                    "Subscription date: " + subscriptionDate + "<br>" + "Subscription expiration: " + subscriptionExpiration + "<br>" +
                    "Your phone number: " + phoneNumber + "<br>" + "Your coach name: " + CName1 + " " + CName2;
                    JOptionPane optionPane = new JOptionPane("<html><p style='font-size:14px'>" + message + "</p></html>", JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionPane.createDialog(null, "Hive Gym");
                    dialog.setSize(715, 370);
                    dialog.setLocationRelativeTo(null);
                    dialog.setLocation(300, 200);
                    setVisible(false);
                    dialog.setVisible(true); // عرض الـ JDialog 
                    GYMJFrame Gym = new GYMJFrame();  
                    Gym.setVisible(true);
                  //      printInfo();
                  
                    }
            }
            else {
                JOptionPane.showMessageDialog(this,"Sorry, there is no personal identifier like this.");
            }
        } catch (IOException e) {
              JOptionPane.showMessageDialog(this,"The file you try to access does not exist!! ");
        }
    }
    String check_Subscription() {
    LocalDate now = LocalDate.now();
    int year = now.getYear();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();

    if (subscriptionExpiration.getYear() == year) {
        if (subscriptionExpiration.getMonthValue() == month) {
            if (subscriptionExpiration.getDayOfMonth() >= day) {
                return "Subscription.";
            }
            else {
                return "Subscription expired.";
            }
        } 
        else if (subscriptionExpiration.getMonthValue() > month) {
            return "Subscription.";
        } 
        else {
            return "Subscription expired.";
        }
    }
    else if (subscriptionExpiration.getYear() > year) {
        return "Subscription.";
    } 
    else {
        return "Subscription expired.";
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
            java.util.logging.Logger.getLogger(LoginMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterIDMemberForLogin;
    private javax.swing.JPasswordField EnterPasswordMemberForLogin;
    private javax.swing.JLabel LabelForMemberPassword;
    private javax.swing.JLabel LabelLoginMember;
    private javax.swing.JLabel LabelforIDMember;
    private java.awt.Button backTOMemberJFrame;
    private javax.swing.JPanel jPanel1;
    private java.awt.Button loginToGym;
    // End of variables declaration//GEN-END:variables
}
