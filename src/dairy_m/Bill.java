/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package dairy_m;

/**
 *
 * @author 91975
 */
public class Bill extends javax.swing.JDialog {

    /**
     * Creates new form Bill
     */
    public Bill(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Bill() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Bill dialog = new Bill(new javax.swing.JFrame(), true);
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        paymentstatus = new javax.swing.JButton();
        back = new javax.swing.JButton();
        preparebill = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill's");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        paymentstatus.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        paymentstatus.setText("Payment Status");
        paymentstatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paymentstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentstatusActionPerformed(evt);
            }
        });
        getContentPane().add(paymentstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 193, 190, 40));

        back.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 193, 120, 40));

        preparebill.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        preparebill.setText("Prepare Bill ");
        preparebill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        preparebill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preparebillActionPerformed(evt);
            }
        });
        getContentPane().add(preparebill, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 193, 136, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 760, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentstatusActionPerformed
        CheckBill cb = new CheckBill();
        dispose();
    }//GEN-LAST:event_paymentstatusActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backActionPerformed
        Dashboard ds = new Dashboard();
        dispose();
    }// GEN-LAST:event_backActionPerformed

    private void preparebillActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_preparebillActionPerformed
        Preparebill pb = new Preparebill();
        dispose();
    }// GEN-LAST:event_preparebillActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton paymentstatus;
    private javax.swing.JButton preparebill;
    // End of variables declaration//GEN-END:variables
}
