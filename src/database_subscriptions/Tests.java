/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brendanmcantosh
 */
/*public class Tests {
    
    public static void main(String []args ) throws SQLException
    {
             
            DBcommands cmd = new DBcommands();
            String Table = "MAGAZINE";
            String Attributes = "Name, Mfrequency";
            String Values = "'Times', '235 weeks'";
            String Whereu = "Name = 'Times'";  // name Times must be in single quotes
            String Whered = "Name = 'Yimes'";
            String Set = "Name = 'Yimes'";
            cmd.insert(Table, Attributes, Values);
            cmd.update(Table, Set, Whereu);
            cmd.delete(Table, Whered);
      */   
import java.sql.*;
import javax.swing.*;



public class Tests {

    Connection connected = null;
    
    public Connection getConn()
    {
             Connection conn;    
             String url = "jdbc:mysql://localhost:3306/databaseschema_5318";
             String user = "root";
             String password = "1234";
         try
         {
            conn = DriverManager.getConnection(url,user,password);
            
            return conn;
         }
         catch(SQLException e)
                    {
                        System.out.println("Connection Unsucessful");
                    }
         return null;
    }
    
 
}
    
    

