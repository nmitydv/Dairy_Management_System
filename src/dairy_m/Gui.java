
package dairy_m;

public class Gui extends javax.swing.JDialog {

    public Gui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public Gui() {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gui dialog = new Gui(new javax.swing.JFrame(), true);
                dialog.setSize(901, 588);
                dialog.setResizable(false);
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

    @SuppressWarnings("unchecked")

    private void initComponents() {

        Title = new javax.swing.JLabel();
        farmer_detail = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        bills = new javax.swing.JButton();
        milk_information = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("Segoe UI", 3, 36));
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText(" Sant Singaji Dairy ");
        Title.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Title);
        Title.setBounds(290, 30, 340, 62);

        farmer_detail.setFont(new java.awt.Font("Segoe UI", 3, 18));
        farmer_detail.setText("Farmer's Detail ");
        farmer_detail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        farmer_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farmer_detailActionPerformed(evt);
            }
        });
        getContentPane().add(farmer_detail);
        farmer_detail.setBounds(20, 140, 170, 50);

        exit.setFont(new java.awt.Font("Segoe UI", 3, 18));
        exit.setText("Exit");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(710, 140, 150, 50);

        bills.setFont(new java.awt.Font("Segoe UI", 3, 18));
        bills.setText("Bill's");
        bills.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsActionPerformed(evt);
            }
        });
        getContentPane().add(bills);
        bills.setBounds(500, 140, 150, 50);

        milk_information.setFont(new java.awt.Font("Segoe UI", 3, 18));
        milk_information.setText("Milk Information");
        milk_information.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        milk_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milk_informationActionPerformed(evt);
            }
        });
        getContentPane().add(milk_information);
        milk_information.setBounds(240, 140, 180, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.jpg")));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 590);

        pack();
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {

        System.exit(0);
    }

    private void milk_informationActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void billsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void farmer_detailActionPerformed(java.awt.event.ActionEvent evt) {
        Farmer f = new Farmer();
        dispose();
    }

    private javax.swing.JLabel Title;
    private javax.swing.JButton bills;
    private javax.swing.JButton exit;
    private javax.swing.JButton farmer_detail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton milk_information;

}
