
package ems;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Add_Leave extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    public Add_Leave() throws ClassNotFoundException, SQLException {
        initComponents();
         Class.forName("com.mysql.cj.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/ems_database", "enrollment", "enrollment");
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jConfirmBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtLT = new javax.swing.JTextField();
        txtDA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cancelActionBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 900));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jConfirmBtn.setBackground(new java.awt.Color(56, 149, 255));
        jConfirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        jConfirmBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/check_2.png"))); // NOI18N
        jConfirmBtn.setText("Confirm");
        jConfirmBtn.setFocusPainted(false);
        jConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConfirmBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jConfirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Leave Type:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 350, 40));
        jPanel1.add(txtLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 350, 40));

        txtDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDAActionPerformed(evt);
            }
        });
        jPanel1.add(txtDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 350, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Employee ID:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Number of Days Allowed:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        cancelActionBtn.setBackground(new java.awt.Color(55, 178, 255));
        cancelActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelActionBtn.setText("Cancel");
        cancelActionBtn.setFocusPainted(false);
        cancelActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 130, 40));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setOpaque(true);
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Leave Type:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
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

    private void txtDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDAActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConfirmBtnActionPerformed

            try{
                pst = con.prepareStatement("INSERT INTO leave_table VALUES (NULL, ?, ?, ?)");
                pst.setInt(1, Integer.parseInt(txtID.getText()));
                pst.setString(2, txtLT.getText());
                pst.setInt(3, Integer.parseInt(txtDA.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Leave Added Successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
            }
            dispose();
            Leave lv = new Leave();
            lv.show();
        
    }//GEN-LAST:event_jConfirmBtnActionPerformed

    private void cancelActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionBtnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelActionBtnActionPerformed

    public static void main(String args[]) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelActionBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.ButtonGroup genderGrp;
    private javax.swing.JButton jConfirmBtn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDA;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLT;
    // End of variables declaration//GEN-END:variables
}
