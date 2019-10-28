/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Coba;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author TOSHIBA
 */
public class koneksi {
    private static Connection con;
    public static Connection getConnection()throws SQLException {

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/employee","root","");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal");
        }
                
    
        return con;
}

}
