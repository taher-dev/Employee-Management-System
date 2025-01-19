
package ems;

import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginJframe extends javax.swing.JFrame {

   
    public LoginJframe() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
    }   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SplashTitle1 = new javax.swing.JLabel();
        EMS_icon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jUsername = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jShowPass = new javax.swing.JCheckBox();
        jLoginBtn = new javax.swing.JButton();
        progressBarLabel = new javax.swing.JLabel();
        progressBarLabel1 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplashTitle1.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        SplashTitle1.setForeground(new java.awt.Color(237, 250, 255));
        SplashTitle1.setText("Login");
        jPanel1.add(SplashTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, 50));

        EMS_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/icon_transparent_resize2.png"))); // NOI18N
        EMS_icon.setPreferredSize(new java.awt.Dimension(449, 556));
        jPanel1.add(EMS_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 200, 280));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 240, 30));

        jUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameActionPerformed(evt);
            }
        });
        jUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUsernameKeyPressed(evt);
            }
        });
        jPanel1.add(jUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 260, 30));

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 260, 30));

        jShowPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jShowPass.setForeground(new java.awt.Color(255, 255, 255));
        jShowPass.setText("Show Password");
        jShowPass.setOpaque(false);
        jShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowPassActionPerformed(evt);
            }
        });
        jPanel1.add(jShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jLoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLoginBtn.setText("Login");
        jLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 260, 30));

        progressBarLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        progressBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        progressBarLabel.setText(" Username:");
        jPanel1.add(progressBarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        progressBarLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        progressBarLabel1.setForeground(new java.awt.Color(255, 255, 255));
        progressBarLabel1.setText(" Password:");
        jPanel1.add(progressBarLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/blue_gradient_resized.jpg"))); // NOI18N
        BackgroundImage.setText("jLabel1");
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -80, 800, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginBtnActionPerformed
// TODO add your handling code here:
            if (jUsername.getText().equals("admin") && jPassword.getText().equals("admin")) {
            try {
                dispose();
                Add add = new Add();
                add.setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
        }
    }//GEN-LAST:event_jLoginBtnActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameActionPerformed

    private void jShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowPassActionPerformed
        // TODO add your handling code here:
        if (jShowPass.isSelected()) {
            jPassword.setEchoChar((char)0);
        }
        else {
            jPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jShowPassActionPerformed

    private void jUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==40 || evt.getKeyCode()==10){
            jPassword.requestFocus();
        }
    }//GEN-LAST:event_jUsernameKeyPressed

    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==38){
            jUsername.requestFocus();
        } else if (evt.getKeyCode()==10) {
            if (jUsername.getText().equals("admin") && jPassword.getText().equals("admin")) {
                try {
                    dispose();
                    Add add = new Add();
                    add.setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
            }
        }
    }//GEN-LAST:event_jPasswordKeyPressed

    public static void main(String args[]) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel EMS_icon;
    private javax.swing.JLabel SplashTitle1;
    private javax.swing.JButton jLoginBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox jShowPass;
    private javax.swing.JTextField jUsername;
    private javax.swing.JLabel progressBarLabel;
    private javax.swing.JLabel progressBarLabel1;
    // End of variables declaration//GEN-END:variables
}
