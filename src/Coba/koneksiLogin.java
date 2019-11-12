/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Coba;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class koneksiLogin {
private static Connection conn;
    public static Connection getConnection()throws SQLException {

        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/login","root","");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal");
        }


        return conn;
}

}
