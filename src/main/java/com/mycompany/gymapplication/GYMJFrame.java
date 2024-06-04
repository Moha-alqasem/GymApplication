/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gymapplication;

/**
 *
 * @author Mohammad Alqasem
 */
public class GYMJFrame extends GymApplication {

    /**
     * Creates new form GYMJFrame
     */
    public GYMJFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        Label1ForGym = new javax.swing.JLabel();
        EnterForAdmin = new java.awt.Button();
        EnterForMember = new java.awt.Button();
        Exit1 = new java.awt.Button();
        EnterForCoach1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 57, 66));
        jPanel1.setForeground(new java.awt.Color(26, 41, 62));

        Label1ForGym.setBackground(new java.awt.Color(255, 255, 255));
        Label1ForGym.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label1ForGym.setForeground(new java.awt.Color(255, 255, 255));
        Label1ForGym.setText("Welcome in Hive GYM");

        EnterForAdmin.setActionCommand("Admin");
        EnterForAdmin.setBackground(new java.awt.Color(203, 22, 45));
        EnterForAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnterForAdmin.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EnterForAdmin.setForeground(new java.awt.Color(255, 255, 255));
        EnterForAdmin.setLabel("Admin");
        EnterForAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterForAdminActionPerformed(evt);
            }
        });

        EnterForMember.setActionCommand("Member");
        EnterForMember.setBackground(new java.awt.Color(203, 22, 45));
        EnterForMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnterForMember.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EnterForMember.setForeground(new java.awt.Color(255, 255, 255));
        EnterForMember.setLabel("Member");
        EnterForMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterForMemberActionPerformed(evt);
            }
        });

        Exit1.setActionCommand("Exit");
        Exit1.setBackground(new java.awt.Color(203, 22, 45));
        Exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exit1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Exit1.setForeground(new java.awt.Color(255, 255, 255));
        Exit1.setLabel("Exit");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });

        EnterForCoach1.setActionCommand("Coach");
        EnterForCoach1.setBackground(new java.awt.Color(203, 22, 45));
        EnterForCoach1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EnterForCoach1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        EnterForCoach1.setForeground(new java.awt.Color(255, 255, 255));
        EnterForCoach1.setLabel("Coach");
        EnterForCoach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterForCoach1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(Label1ForGym, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnterForCoach1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterForMember, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterForAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Label1ForGym, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(EnterForAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(EnterForCoach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(EnterForMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Exit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void EnterForMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterForMemberActionPerformed
        // TODO add your handling code here:
         MemberJFrame memberFrame = new MemberJFrame();
         
         
        
      // جعل MemberJFrame مرئيًا
      memberFrame.setVisible(true);
      setVisible(false);
    }//GEN-LAST:event_EnterForMemberActionPerformed

    private void EnterForCoach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterForCoach1ActionPerformed
        // TODO add your handling code here:
         CoachJFrame coachJFrame = new CoachJFrame();
          
        coachJFrame.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_EnterForCoach1ActionPerformed

    private void EnterForAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterForAdminActionPerformed
        // TODO add your handling code here:
        AdminJFrame AdminJFrame = new  AdminJFrame();

        AdminJFrame.setVisible(true);
       setVisible(false);
    }//GEN-LAST:event_EnterForAdminActionPerformed



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
            java.util.logging.Logger.getLogger(GYMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GYMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GYMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GYMJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GYMJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button EnterForAdmin;
    private java.awt.Button EnterForCoach1;
    private java.awt.Button EnterForMember;
    private java.awt.Button Exit1;
    private javax.swing.JLabel Label1ForGym;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
