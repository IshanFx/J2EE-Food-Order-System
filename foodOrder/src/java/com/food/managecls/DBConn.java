/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.food.managecls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author IshanFX
 */
public class DBConn {
    public static Connection dbConn(){
        
        Connection conn = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddb", "root", "");
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return conn;
    
    } 
}
