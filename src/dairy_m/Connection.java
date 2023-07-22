package dairy_m;

import java.sql.*;
import javax.swing.JOptionPane;;

public class Connection {
    public Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dairy_management_system",
                    "root", "2412");
            String sql = "insert into(farmer_id, farmer_name , farmer_address) farmer values(?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(2, Integer.parseInt(farmerid.getText()));
            pstmt.setString(3, farmername.getText());
            pstmt.setString(4, farmeraddress.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insertion Successfull");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, null, 0);
        }
    }
}
