/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aabrakadabra;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anubha
 */
public class Database {

    Connection con;

    public Connection Coment() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","");
             
        } 
    
        catch (Exception e) {
            
        }
        return con;
    }

}
