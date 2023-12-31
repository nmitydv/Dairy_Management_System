
package dairy_m;

import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 91975
 */
public class New_Farmer extends javax.swing.JDialog {

    /**
     * Creates new form New_Farmer
     */
    public New_Farmer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public New_Farmer() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(New_Farmer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Farmer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Farmer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Farmer.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                New_Farmer dialog = new New_Farmer(new javax.swing.JFrame(), true);
                dialog.setLocation(550, 230);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        farmeraddress = new javax.swing.JTextField();
        farmerid = new javax.swing.JTextField();
        farmername = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" New Farmer's  Detail ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 17, -1, -1));

        back.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        back.setText(" Back ");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        jLabel2.setText("Farmer ID ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 126, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        jLabel3.setText("Farmer Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 126, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 17)); // NOI18N
        jLabel4.setText("Farmer Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 126, -1, -1));
        getContentPane().add(farmeraddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 174, 157, 43));

        farmerid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmeridActionPerformed(evt);
            }
        });
        getContentPane().add(farmerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 174, 157, 43));
        getContentPane().add(farmername, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 174, 157, 43));

        clear.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        clear.setText("Clear");
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 82, 39));

        insert.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        insert.setText("Insert");
        insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        getContentPane().add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 82, 39));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 840, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insert1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_insert1ActionPerformed

    private void farmeridActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_farmeridActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_farmeridActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_farmeridActionPerformed
        farmerid.setText(null);
        farmername.setText(null);
        farmeraddress.setText(null);
    }// GEN-LAST:event_farmeridActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_insertActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dairy_management_system",
                    "root", "2412");
            String sql = "insert into farmer values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(farmerid.getText()));
            pstmt.setString(2, farmername.getText());
            pstmt.setString(3, farmeraddress.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertion Successfull");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, null, 0);
        }

    }// GEN-LAST:event_insertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backActionPerformed
        Farmer f = new Farmer();
        dispose();
    }// GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JTextField farmeraddress;
    private javax.swing.JTextField farmerid;
    private javax.swing.JTextField farmername;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
