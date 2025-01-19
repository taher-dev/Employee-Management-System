
package ems;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Update extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
   
    public Update() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ems_database", "enrollment", "enrollment");
            
// ===============================================================

        Statement st = con.createStatement();
        String sql = "select * from emp_info";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()) {
            String id = rs.getString("id");
            String f_name = rs.getString("f_name");
            String l_name = rs.getString("l_name");
            String designation = rs.getString("designation");
            String gender = rs.getString("gender");
            String address = rs.getString("address");
            String email = rs.getString("email");
            String salary = rs.getString("salary");
            
            String tbData[] = {id, f_name, l_name, designation, gender, address, email, salary};
            DefaultTableModel tblModel = (DefaultTableModel)jEmpInfoTable.getModel();
            
            tblModel.addRow(tbData);
        }
        
//        con.close();
// ---------------------------------------------------------------
} catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
     
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jUpdateBtn = new javax.swing.JToggleButton();
        searchEmpTable = new javax.swing.JScrollPane();
        jEmpInfoTable = new javax.swing.JTable();
        updateActionBtn = new javax.swing.JButton();
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        rbOthers = new javax.swing.JRadioButton();
        refreshActionBtn = new javax.swing.JButton();
        jAddBtn = new javax.swing.JToggleButton();
        jDeleteBtn = new javax.swing.JToggleButton();
        jShowBtn = new javax.swing.JToggleButton();
        jLeaveBtn = new javax.swing.JToggleButton();
        jLogoutBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jUpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        jUpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jUpdateBtn.setText("Update Employee");
        jUpdateBtn.setBorder(null);
        jUpdateBtn.setFocusPainted(false);
        jUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 60));

        searchEmpTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jEmpInfoTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEmpInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Designation", "Gender", "Address", "Email", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jEmpInfoTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jEmpInfoTable.setRowHeight(22);
        jEmpInfoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmpInfoTableMouseClicked(evt);
            }
        });
        searchEmpTable.setViewportView(jEmpInfoTable);
        if (jEmpInfoTable.getColumnModel().getColumnCount() > 0) {
            jEmpInfoTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(1).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(4).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(7).setPreferredWidth(0);
        }

        jPanel1.add(searchEmpTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 240));

        updateActionBtn.setBackground(new java.awt.Color(56, 149, 255));
        updateActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateActionBtn.setText("Update");
        updateActionBtn.setFocusPainted(false);
        updateActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 130, 40));
        jPanel1.add(txtFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 220, 40));
        jPanel1.add(txtLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 220, 40));

        txtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignationActionPerformed(evt);
            }
        });
        jPanel1.add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 220, 40));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, 350, 40));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 350, 40));
        jPanel1.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 220, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Salary:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Last Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Designation:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Address:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Email:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, -1, -1));

        genderGrp.add(rbMale);
        rbMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMale.setText("Male ");
        rbMale.setContentAreaFilled(false);
        rbMale.setFocusPainted(false);
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        jPanel1.add(rbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        genderGrp.add(rbFemale);
        rbFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFemale.setText("Female");
        rbFemale.setContentAreaFilled(false);
        rbFemale.setFocusPainted(false);
        rbFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemaleActionPerformed(evt);
            }
        });
        jPanel1.add(rbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, -1, -1));

        genderGrp.add(rbOthers);
        rbOthers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbOthers.setText("Others");
        rbOthers.setContentAreaFilled(false);
        rbOthers.setFocusPainted(false);
        rbOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOthersActionPerformed(evt);
            }
        });
        jPanel1.add(rbOthers, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        refreshActionBtn.setBackground(new java.awt.Color(55, 178, 255));
        refreshActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        refreshActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/refresh_1.png"))); // NOI18N
        refreshActionBtn.setText("Refresh");
        refreshActionBtn.setFocusPainted(false);
        refreshActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(refreshActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 130, 40));

        jAddBtn.setBackground(new java.awt.Color(255, 255, 255));
        jAddBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jAddBtn.setSelected(true);
        jAddBtn.setText("Add Employee");
        jAddBtn.setBorder(null);
        jAddBtn.setFocusPainted(false);
        jAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 60));

        jDeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        jDeleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jDeleteBtn.setSelected(true);
        jDeleteBtn.setText("Delete Employee");
        jDeleteBtn.setBorder(null);
        jDeleteBtn.setFocusPainted(false);
        jDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 60));

        jShowBtn.setBackground(new java.awt.Color(255, 255, 255));
        jShowBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jShowBtn.setSelected(true);
        jShowBtn.setText("Show Employee");
        jShowBtn.setBorder(null);
        jShowBtn.setFocusPainted(false);
        jShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 60));

        jLeaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        jLeaveBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLeaveBtn.setSelected(true);
        jLeaveBtn.setText("Leave Management");
        jLeaveBtn.setBorder(null);
        jLeaveBtn.setFocusPainted(false);
        jLeaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jLeaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 240, 60));

        jLogoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/logout_2.png"))); // NOI18N
        jLogoutBtn.setText("Logout");
        jLogoutBtn.setFocusPainted(false);
        jLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 200, 40));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setOpaque(true);
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/profile1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText(" Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/bg_add.png"))); // NOI18N
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

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

    private void jUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateBtnActionPerformed
        // TODO add your handling code here:
        jUpdateBtn.setEnabled(false);
    }//GEN-LAST:event_jUpdateBtnActionPerformed

    private void txtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationActionPerformed

    private void updateActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionBtnActionPerformed
        // TODO add your handling code here:
         try{
             DefaultTableModel ob = (DefaultTableModel) jEmpInfoTable.getModel();
            int row = jEmpInfoTable.getSelectedRow();
            int int_id = Integer.parseInt(ob.getValueAt(row, 0).toString());
            pst = con.prepareStatement("UPDATE emp_info SET f_name=?, l_name=?, designation=?, gender=?, address=?, email=?, salary=? WHERE id="+int_id);
            pst.setString(1, txtFName.getText());
            pst.setString(2, txtLName.getText());
            pst.setString(3, txtDesignation.getText());
            pst.setString(4, gender);
            pst.setString(5, txtAddress.getText());
            pst.setString(6, txtEmail.getText());
            pst.setInt(7, Integer.parseInt(txtSalary.getText()));
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee Updated Successfully");
            // REFRESH TABLE
            ob.setRowCount(0);
            
            Statement st = con.createStatement();
            String sql = "select * from emp_info";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                String id = rs.getString("id");
                String f_name = rs.getString("f_name");
                String l_name = rs.getString("l_name");
                String designation = rs.getString("designation");
                String gender = rs.getString("gender");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String salary = rs.getString("salary");
            
                String tbData[] = {id, f_name, l_name, designation, gender, address, email, salary};
                DefaultTableModel tblModel = (DefaultTableModel)jEmpInfoTable.getModel();
            
                tblModel.addRow(tbData);
            }
            
            } catch (SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionBtnActionPerformed

    private void jEmpInfoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmpInfoTableMouseClicked
        // TODO add your handling code here:
        
        int row = jEmpInfoTable.getSelectedRow();
        TableModel model = jEmpInfoTable.getModel();
        txtFName.setText(model.getValueAt(row, 1).toString());
        txtLName.setText(model.getValueAt(row, 2).toString());
        txtDesignation.setText(model.getValueAt(row, 3).toString());
        String genderSelected = model.getValueAt(row, 4).toString();
        if(genderSelected.equals("Male ")) {
            rbMale.setSelected(true);
            gender = "Male ";
        } else if(genderSelected.equals("Female")) {
            rbFemale.setSelected(true);
            gender = "Female";
        } else {
            rbOthers.setSelected(true);
            gender = "Others";
        }
        txtAddress.setText(model.getValueAt(row, 5).toString());
        txtEmail.setText(model.getValueAt(row, 6).toString());
        txtSalary.setText(model.getValueAt(row, 7).toString());
    }//GEN-LAST:event_jEmpInfoTableMouseClicked
    String gender;
    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
        gender = rbMale.getText();
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemaleActionPerformed
        // TODO add your handling code here:
        gender = rbFemale.getText();
    }//GEN-LAST:event_rbFemaleActionPerformed

    private void rbOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOthersActionPerformed
        // TODO add your handling code here:
        gender = rbOthers.getText();
    }//GEN-LAST:event_rbOthersActionPerformed

    private void refreshActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionBtnActionPerformed
        dispose();
        Update up = new Update();
        up.show();
    }//GEN-LAST:event_refreshActionBtnActionPerformed

    private void jAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddBtnActionPerformed
        try {
            // TODO add your handling code here:
            dispose();
            Add add = new Add();
            add.show();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jAddBtnActionPerformed

    private void jShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Show sh = new Show();
        sh.show();
    }//GEN-LAST:event_jShowBtnActionPerformed

    private void jLeaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeaveBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Leave lv = new Leave();
        lv.show();
    }//GEN-LAST:event_jLeaveBtnActionPerformed

    private void jLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginJframe lgJframe = new LoginJframe();
        lgJframe.show();
    }//GEN-LAST:event_jLogoutBtnActionPerformed

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Delete dlt = new Delete();
        dlt.show();
    }//GEN-LAST:event_jDeleteBtnActionPerformed

    public static void main(String args[]) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.Box.Filler filler1;
    private javax.swing.ButtonGroup genderGrp;
    private javax.swing.JToggleButton jAddBtn;
    private javax.swing.JToggleButton jDeleteBtn;
    private javax.swing.JTable jEmpInfoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jLeaveBtn;
    private javax.swing.JButton jLogoutBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jShowBtn;
    private javax.swing.JToggleButton jUpdateBtn;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbOthers;
    private javax.swing.JButton refreshActionBtn;
    private javax.swing.JScrollPane searchEmpTable;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JButton updateActionBtn;
    // End of variables declaration//GEN-END:variables
}
