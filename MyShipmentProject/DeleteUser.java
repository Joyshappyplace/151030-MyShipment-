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
public class DeleteUser {

    private String user;

    void doDelete() {
        //Check if username supplied
        if (user != null) {
            int numRows;
            try {
                //Instantiate DbConnection class to use the connection
                DBConnection stayconnected = new DBConnection();
                stayconnected.getConnection();
                //Create the statement object for executing queries
                Statement stmt = stayconnected.con.createStatement();
                //Execute the delete statement and assigned number of affected rows to numRows
                numRows = stmt.executeUpdate("DELETE FROM logins WHERE userName ='" + user + "'");
                if (numRows > 0) {
                    System.out.println("User " + user + " deleted successfully");
                } else {
                    System.out.println("User " + user + " was not found. Delete failed");
                }
                //Close the connection
                stayconnected.con.close();
                ViewUsers goToUserList = new ViewUsers();
                goToUserList.doList();
            } catch (SQLException e) {
                System.out.println("Error! See below details \n");
                System.out.println(e);
            }
        } else {
            System.out.println("You must provide a username to delete a user");
        }
    }

    public void setUserDetails(String userName) {
        this.user = userName;
        doDelete();
    
    }
}

