/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_subscriptions;
import java.sql.*;

/**
 *
 * @author brendanmcantosh
 */
public class DBcommands {
    
    /* getConn will be called whenever a statement is used */
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
    
    /*Inserts into table */
    public void insert(String Table, String Attributes, String Values) throws SQLException
    {
        try (Connection conn = getConn()) {
            Statement myStmt = conn.createStatement();
            /* Get the arguments from the user with the application */
            String Sql = "Insert into " + Table + " (" + Attributes
                      + ") values (" + Values + ")";
            myStmt.executeUpdate(Sql);
            System.out.println("Insert Complete");
            
            conn.close();
        }
    }
    /* Deletes from table */
    public void delete(String Table, String Where) throws SQLException
    {
        try (Connection conn = getConn())
        {
            Statement myStmt = conn.createStatement();
            String Sql = "DELETE FROM "  + Table
                    + " WHERE (" + Where + ");";
            int rowsAffected = myStmt.executeUpdate(Sql);
            
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Deletion Complete");
            
            conn.close();
        }
    }
    /* Updates a table */
    public void update(String Table, String Set, String Where) throws SQLException
    {
        
        try (Connection conn = getConn())
        {
            Statement myStmt = conn.createStatement();
            String Sql = "update " + Table 
                    + " set " + Set 
                    + " where " + Where;
            
            myStmt.executeUpdate(Sql);
            System.out.println("Update Complete");
            
            conn.close();
        }
        
    }
    // Select needs to be overloaded in case the where is optional
    public class select
    {
        public String[][] select(String Select, String From, String Where) throws SQLException
        {
            int rowCount = 0;
            int clmCount = 0;
            String [][] result;
            if (Where.isBlank() || Where.isEmpty())
            {
                result = select(Select,From);
                return result;
            }
            try (Connection conn = getConn())
            {
                Statement myStmt = conn.createStatement();
                String SQL = "Select " + Select 
                        + " From "  + From
                        + " Where " + Where;
                
                ResultSet resultSet = myStmt.executeQuery(SQL);
                ResultSetMetaData rsmd = resultSet.getMetaData();
                clmCount = rsmd.getColumnCount();
                
                if (resultSet.last())
                {
                    rowCount = resultSet.getRow();
                    resultSet.beforeFirst();
                }
                result = new String [rowCount][clmCount];
                
                for (int r=0; r < rowCount; r++)
                {
                    for (int c = 0; c < clmCount; c++)
                    {
                        result[r][c] = resultSet.getString(c);
                    }
                }
                
                
            }           
            
            return result;
        }
        
        public String[][] select(String Select, String From) throws SQLException
        {
            int rowCount = 0;
            int clmCount = 0;
            String [][] result;
            try (Connection conn = getConn())
            {
                Statement myStmt = conn.createStatement();
                String SQL = "Select " + Select 
                        + " From "  + From;
                
                ResultSet resultSet = myStmt.executeQuery(SQL);
                ResultSetMetaData rsmd = resultSet.getMetaData();
                clmCount = rsmd.getColumnCount();
                
                if (resultSet.last())
                {
                    rowCount = resultSet.getRow();
                    resultSet.beforeFirst();
                }
                result = new String [rowCount][clmCount];
                
                for (int r=0; r < rowCount; r++)
                {
                    for (int c = 0; c < clmCount; c++)
                    {
                        result[r][c] = resultSet.getString(c);
                    }
                }
                
                
            }           
            
            return result;
        }
    }
    
}
