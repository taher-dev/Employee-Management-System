
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

public class Leave extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
   
    public Leave() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ems_database", "enrollment", "enrollment");

        Statement st = con.createStatement();
        String sql = "SELECT lt.leave_id, e.id AS EmployeeId,CONCAT(e.f_name, ' ', e.l_name) AS EmployeeName,lt.leave_type AS "
                + "LeaveType,lt.days_allowed AS NumberOfDaysAllowed FROM leave_table lt INNER JOIN emp_info e ON lt.emp_id = e.id;";
        ResultSet rs = st.executeQuery(sql);
        
        while(rs.next()) {
            String leave_id = rs.getString("leave_id");
            String id = rs.getString("EmployeeId");
            String name = rs.getString("EmployeeName");
            String leave_type = rs.getString("LeaveType");
            String days_allowed = rs.getString("NumberOfDaysAllowed");
            
            String tbData[] = {leave_id, id,name, leave_type, days_allowed};
            DefaultTableModel tblModel = (DefaultTableModel)jEmpInfoTable.getModel();
            
            tblModel.addRow(tbData);
        }
        
        con.close();
} catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jAddActionBtn = new javax.swing.JButton();
        deleteActionBtn = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        jEmpInfoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDeleteBtn = new javax.swing.JToggleButton();
        jShowBtn = new javax.swing.JToggleButton();
        jUpdateBtn = new javax.swing.JToggleButton();
        jAddBtn = new javax.swing.JToggleButton();
        jLogoutBtn = new javax.swing.JButton();
        jLeaveBtn = new javax.swing.JToggleButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAddActionBtn.setBackground(new java.awt.Color(56, 149, 255));
        jAddActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAddActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        jAddActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/add_1.png"))); // NOI18N
        jAddActionBtn.setText("Add Leave");
        jAddActionBtn.setFocusPainted(false);
        jAddActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jAddActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 130, 130, 40));

        deleteActionBtn.setBackground(new java.awt.Color(255, 78, 78));
        deleteActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/delete_1.png"))); // NOI18N
        deleteActionBtn.setText("Delete");
        deleteActionBtn.setFocusPainted(false);
        deleteActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 130, 40));

        JScrollPane.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jEmpInfoTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEmpInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Leave ID", "Employee ID", "Name", "Leave Type", "Numbe of Days Allowed"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jEmpInfoTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jEmpInfoTable.setRowHeight(22);
        JScrollPane.setViewportView(jEmpInfoTable);
        if (jEmpInfoTable.getColumnModel().getColumnCount() > 0) {
            jEmpInfoTable.getColumnModel().getColumn(1).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(3).setPreferredWidth(0);
        }

        jPanel1.add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 670, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/profile1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText(" Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

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

        jUpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
        jUpdateBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jUpdateBtn.setSelected(true);
        jUpdateBtn.setText("Update Employee");
        jUpdateBtn.setBorder(null);
        jUpdateBtn.setFocusPainted(false);
        jUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jUpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 60));

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

        jLeaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        jLeaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLeaveBtn.setText("Leave Management");
        jLeaveBtn.setBorder(null);
        jLeaveBtn.setFocusPainted(false);
        jLeaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLeaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jLeaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 240, 60));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setOpaque(true);
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 600));

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

    private void jAddActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionBtnActionPerformed
        try {
            Add_Leave al = new Add_Leave();
            al.show();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jAddActionBtnActionPerformed

    private void deleteActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob = (DefaultTableModel) jEmpInfoTable.getModel();
        int SelectedRows = jEmpInfoTable.getSelectedRow();
        int int_id, deleteItem;

        if(SelectedRows == -1) {
            JOptionPane.showMessageDialog(this, "No Record Selected");
        } else {
            try {
                int_id = Integer.parseInt(ob.getValueAt(SelectedRows, 0).toString());
                deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete record?", "Warning", JOptionPane.YES_NO_OPTION);
                if(deleteItem == JOptionPane.YES_OPTION){
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost/ems_database", "enrollment", "enrollment");
                    pst = con.prepareStatement("delete from leave_table where leave_id =?");
                    pst.setInt(1, int_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Record Updated");
                    // REFRESH TABLE
                    dispose();
                    Leave lv = new Leave();
                    lv.show();

                } else {
                    // REFRESH TABLE
                    dispose();
                    Leave lv = new Leave();
                    lv.show();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Leave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_deleteActionBtnActionPerformed

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Delete dlt = new Delete();
        dlt.show();
    }//GEN-LAST:event_jDeleteBtnActionPerformed

    private void jShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Show sh = new Show();
        sh.show();
    }//GEN-LAST:event_jShowBtnActionPerformed

    private void jUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Update up = new Update();
        up.show();
    }//GEN-LAST:event_jUpdateBtnActionPerformed

    private void jLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        LoginJframe lgJframe = new LoginJframe();
        lgJframe.show();
    }//GEN-LAST:event_jLogoutBtnActionPerformed

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

    private void jLeaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLeaveBtnActionPerformed
        // TODO add your handling code here:
        jAddBtn.setEnabled(false);
    }//GEN-LAST:event_jLeaveBtnActionPerformed

    public static void main(String args[]) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton deleteActionBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jAddActionBtn;
    private javax.swing.JToggleButton jAddBtn;
    private javax.swing.JToggleButton jDeleteBtn;
    private javax.swing.JTable jEmpInfoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jLeaveBtn;
    private javax.swing.JButton jLogoutBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jShowBtn;
    private javax.swing.JToggleButton jUpdateBtn;
    // End of variables declaration//GEN-END:variables
}