package ems;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

public class SplashScreenJFrame extends javax.swing.JFrame {

    pbThread r1;

    public SplashScreenJFrame() {
        initComponents();
        Image icon = new ImageIcon(this.getClass().getResource("ems.png")).getImage();
        this.setIconImage(icon);
        r1 = new pbThread(progressBar);
        r1.start();
    }

    class pbThread extends Thread {
        pbThread(JProgressBar pBar) {}
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SplashTitle1 = new javax.swing.JLabel();
        SplashTitle2 = new javax.swing.JLabel();
        SplashTitle3 = new javax.swing.JLabel();
        EMS_icon = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        progressBarValue = new javax.swing.JLabel();
        progressBarLabel = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SplashTitle1.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        SplashTitle1.setForeground(new java.awt.Color(237, 250, 255));
        SplashTitle1.setText("Employee");
        jPanel1.add(SplashTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 50));

        SplashTitle2.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        SplashTitle2.setForeground(new java.awt.Color(237, 250, 255));
        SplashTitle2.setText("Management");
        jPanel1.add(SplashTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 50));

        SplashTitle3.setFont(new java.awt.Font("Arial", 1, 44)); // NOI18N
        SplashTitle3.setForeground(new java.awt.Color(237, 250, 255));
        SplashTitle3.setText("System");
        jPanel1.add(SplashTitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        EMS_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/icon_transparent_resize2.png"))); // NOI18N
        EMS_icon.setPreferredSize(new java.awt.Dimension(449, 556));
        jPanel1.add(EMS_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 280));

        progressBar.setBackground(new java.awt.Color(255, 255, 255));
        progressBar.setForeground(new java.awt.Color(185, 224, 255));
        progressBar.setBorderPainted(false);
        jPanel1.add(progressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 390, 720, -1));

        progressBarValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        progressBarValue.setForeground(new java.awt.Color(255, 255, 255));
        progressBarValue.setText("0%");
        jPanel1.add(progressBarValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 30, -1));

        progressBarLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        progressBarLabel.setForeground(new java.awt.Color(255, 255, 255));
        progressBarLabel.setText("Loading...");
        jPanel1.add(progressBarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ems/SplashScreen/Assets/blue_gradient_resized.jpg"))); // NOI18N
        BackgroundImage.setText("jLabel1");
        jPanel1.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 700, 400));

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

    public static void main(String args[]) {
        //</editor-fold>
        SplashScreenJFrame sp = new SplashScreenJFrame();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sp.setVisible(true);
            }
        });
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                sp.progressBar.setValue(i);
                sp.progressBarValue.setText(String.valueOf(i) + "%");
                if (i == 10) {
                    sp.progressBarLabel.setText("Turning On Modules...");
                }
                if (i == 20) {
                    sp.progressBarLabel.setText("Loading Modules...");
                }
                if (i == 50) {
                    sp.progressBarLabel.setText("Connecting To Database...");
                }
                if (i == 70) {
                    sp.progressBarLabel.setText("Connection Successful!");
                }
                if (i == 80) {
                    sp.progressBarLabel.setText("Launching Application...");
                }
                if (i == 100) {
                    sp.setVisible(false);
                    LoginJframe lgJframe = new LoginJframe();
                    lgJframe.show();
                    sp.dispose();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(SplashScreenJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel EMS_icon;
    private javax.swing.JLabel SplashTitle1;
    private javax.swing.JLabel SplashTitle2;
    private javax.swing.JLabel SplashTitle3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel progressBarLabel;
    private javax.swing.JLabel progressBarValue;
    // End of variables declaration//GEN-END:variables
}
