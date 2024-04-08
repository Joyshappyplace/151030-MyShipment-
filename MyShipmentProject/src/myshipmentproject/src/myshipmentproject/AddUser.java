/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

/**
 *
 * @author User
 */
import java.sql.*;

/**
 *
 * @author fbarasa
 */
public final class AddUser {

    private String user, pass;
    int roleID = 1;

    void doAdd() {
        //Check if username or password supplied
        if (user != null || pass!=null) {
   
            try {
                //Instantiate DbConnection class to use the connection
                DBConnection stayconnected = new DBConnection();
                stayconnected.getConnection();
                //Create the statement object for executing queries
                Statement stmt = stayconnected.con.createStatement();
                //Execute the statement
                stmt.executeUpdate("INSERT INTO logins VALUES('" + user + "','" + pass + "','" + roleID + "')");
                System.out.println("User details added successfully \n");
                //Close the connection
                stayconnected.con.close();
            } catch (SQLException e) {
                System.out.println("Error! See below details \n");
                System.out.println(e);
            }
        } else {
            System.out.println("Username or password can not be blank");
        }
    }

    public void setUserDetails(String userName, String password) {
        this.user = userName;
        this.pass = password;
        doAdd();
    }

}
