
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Show extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
   
    public Show() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/ems_database", "enrollment", "enrollment");

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
            
            String tbData[] = {id,f_name+" "+l_name, designation, gender, address, email, salary};
            DefaultTableModel tblModel = (DefaultTableModel)jEmpInfoTable.getModel();
            
            tblModel.addRow(tbData);
        }
        
        con.close();
} catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Show.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jShowBtn = new javax.swing.JToggleButton();
        JScrollPane = new javax.swing.JScrollPane();
        jEmpInfoTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchActionBtn = new javax.swing.JButton();
        refreshActionBtn = new javax.swing.JButton();
        jAddBtn = new javax.swing.JToggleButton();
        jDeleteBtn = new javax.swing.JToggleButton();
        jUpdateBtn = new javax.swing.JToggleButton();
        jLeaveBtn = new javax.swing.JToggleButton();
        jLogoutBtn = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jShowBtn.setBackground(new java.awt.Color(255, 255, 255));
        jShowBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jShowBtn.setText("Show Employee");
        jShowBtn.setBorder(null);
        jShowBtn.setFocusPainted(false);
        jShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 60));

        JScrollPane.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jEmpInfoTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEmpInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Name", "Designation", "Gender", "Address", "Email", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jEmpInfoTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jEmpInfoTable.setRowHeight(22);
        JScrollPane.setViewportView(jEmpInfoTable);
        if (jEmpInfoTable.getColumnModel().getColumnCount() > 0) {
            jEmpInfoTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(4).setPreferredWidth(0);
            jEmpInfoTable.getColumnModel().getColumn(6).setPreferredWidth(0);
        }

        jPanel1.add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 960, 510));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 420, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/profile1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText(" Admin");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        searchActionBtn.setBackground(new java.awt.Color(56, 149, 255));
        searchActionBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchActionBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchActionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/search_1.png"))); // NOI18N
        searchActionBtn.setText("Search");
        searchActionBtn.setFocusPainted(false);
        searchActionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 130, 40));

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
        jPanel1.add(refreshActionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 130, 40));

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

    private void jShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jShowBtnActionPerformed
        // TODO add your handling code here:
        jShowBtn.setEnabled(false);
    }//GEN-LAST:event_jShowBtnActionPerformed

    private void searchActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionBtnActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jEmpInfoTable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jEmpInfoTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter("(?i)"+txtSearch.getText()));
    }//GEN-LAST:event_searchActionBtnActionPerformed

    private void refreshActionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionBtnActionPerformed
        dispose();
        Show sh = new Show();
        sh.show();
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

    private void jUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        Update up = new Update();
        up.show();
    }//GEN-LAST:event_jUpdateBtnActionPerformed

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

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        switch (evt.getKeyCode()) {
            case 10:    // ENTER
                DefaultTableModel ob = (DefaultTableModel) jEmpInfoTable.getModel();
                TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
                jEmpInfoTable.setRowSorter(obj);
                obj.setRowFilter(RowFilter.regexFilter("(?i)"+txtSearch.getText()));
                break;
         }
    }//GEN-LAST:event_txtSearchKeyPressed

    public static void main(String args[]) {}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.Box.Filler filler1;
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
    private javax.swing.JButton refreshActionBtn;
    private javax.swing.JButton searchActionBtn;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
