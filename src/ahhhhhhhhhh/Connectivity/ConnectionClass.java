/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahhhhhhhhhh.Connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erik
 */
public class ConnectionClass {
    
    public Connection connection;
    
    public Connection getConncection() {
        
        String dbName="MovieDatabase";
        String userName="root";
        String password="";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName, userName, password);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionClass.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
        return connection;
    }
    
}
