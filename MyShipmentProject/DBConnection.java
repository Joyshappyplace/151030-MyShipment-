/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

import java.sql.*;
/**
 *
 * @author User
 */
public class DBConnection {
   //Declare a connection object
    Connection con;
    
    //Connection method. Returns the DB connection
    public Connection getConnection() {
        //Use try {...}catch(Exception e){} to test for any DB connection errors
        try {
            //STEP 1: Load the mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //STEP 2: Create the database connection
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/MyShipment", "root", "");
            System.out.println("Database Connection successful");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection failed. See error below.");
            System.out.println(e);
            return null;
        }
    }
}
