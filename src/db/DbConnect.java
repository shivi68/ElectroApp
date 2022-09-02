
package db;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sivangi gupta
 */
public class DbConnect {
    static public Connection c;
    static public Statement st;
    public DbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//Optional
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electro","root","saloni");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
