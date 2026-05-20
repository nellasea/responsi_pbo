/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DatabaseConnection {
    
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnnection(){
        
        Connection conn = null;
        try{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        
        }catch(ClassNotFoundException e){
        
            System.err.println("Driver MySQL tidak ditemukan :"+ e.getMessage());
        }catch(SQLException e){
            System.err.println("Koneksi Database gagal :"+ e.getMessage());
        
        }
      
        return conn;
    
    }
    
    

    
    
    
    
    
    
}
