/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package dairy_m;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Table;

/**
 *
 * @author 91975
 */
public class Milk_information extends javax.swing.JDialog {

    /**
     * Creates new form Milk_information
     */
    public Milk_information(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public Milk_information() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Milk_information dialog = new Milk_information(new javax.swing.JFrame(), true);
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
        jLabel5 = new javax.swing.JLabel();
        Fat = new javax.swing.JTextField();
        Farmer_id = new javax.swing.JTextField();
        Date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Existing Milk Detail ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 310, -1));

        back.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        back.setText("Back ");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Farmar_ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 114, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Fat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 114, 32, -1));
        getContentPane().add(Fat, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 157, 82, 40));

        Farmer_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Farmer_idActionPerformed(evt);
            }
        });
        getContentPane().add(Farmer_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 124, 40));

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }

            private void DateActionPerformed(ActionEvent evt) {
            }
        });
        getContentPane().add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 157, 124, 40));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 124, 40));

        Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Farmer_Name", "Farmer_ID", "Date", "Time", "Type_of_milk", "Quantity", "Fat"
                }) {
            Class[] types = new Class[] {
                    java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 868, 320));

        clear.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        search.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static DefaultTableModel tbm;

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchActionPerformed
        int id = Integer.parseInt((Farmer_id.getText()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dairy_management_system", "root",
                    "2412");
            String query = "Select f.farmer_name,m.farmer_id, m.datee ,m.timee, m.type_of_milk, m.quantity , m.fat from milk m  join farmer f ON f.farmer_id = m.farmer_id ";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet r = pst.executeQuery(query);
            while (r.next()) {
                String Farmer_name = r.getString(1);
                String farmer_id = r.getString(2);
                String Date = r.getString(3);
                String Time = r.getString(4);
                String Type_of_Milk = r.getString(5);
                String Quantity = r.getString(6);
                String Fat = r.getString(7);

                String tb[] = { Farmer_name, farmer_id, Date, Time, Type_of_Milk, Quantity, Fat
                };
                tbm = (DefaultTableModel) Table.getModel();
                tbm.addRow(tb);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, null, 0);
        }
    }// GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_clearActionPerformed
        Farmer_id.setText(null);
        Date.setText(null);
        time.setText(null);
        Fat.setText(null);
        tbm.setRowCount(0);

    }// GEN-LAST:event_clearActionPerformed

    private void Farmer_idActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Farmer_idActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_Farmer_idActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backActionPerformed
        Milk m = new Milk();
        dispose();
    }// GEN-LAST:event_backActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Farmer_id;
    private javax.swing.JTextField Fat;
    private javax.swing.JTable Table;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
