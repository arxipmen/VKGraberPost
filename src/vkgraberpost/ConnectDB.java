package vkgraberpost;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConnectDB {
    private static final String DB = "vkgraberpost_db.s3db";
    private static final String DRIVERNAME = "org.sqlite.JDBC";
    private static Connection con = null;
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;
    
    public static Connection connect() {
        try{
        Class.forName(DRIVERNAME);
        Connection con = DriverManager.getConnection("jdbc:sqlite:res/" + DB);
        System.out.println("Connect DB!!!");
        return con;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    public static void close() throws SQLException {
        rs.close();
        pst.close();
        con.close();
    }
}
