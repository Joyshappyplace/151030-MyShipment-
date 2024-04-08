/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

import java.beans.Statement;
import java.sql.*; 

/**
 *
 * @author User
 */
public class UpdateUser {
 private String userHere,pass;
    ViewUsers goToUserList = new ViewUsers();

    void doUpdate() {
        //Check if username supplied
        if (userHere != null) {
            int numRows = 0;
            try {
                //Instantiate DbConnection class to use the connection
                DBConnection stayconnected = new DBConnection();
                stayconnected.getConnection();
                //Create the statement object for executing queries
                Statement stmt = (Statement) stayconnected.con.createStatement();
                //Execute the delete statement and assigned number of affected rows to numRows
                if (numRows > 0) {
                    System.out.println("Password for"+userHere+" changed successfully");
                } else {
                    System.out.println("Password change failed. Try again");
                    goToUserList.doList();
                    
                }
                //Close the connection
                stayconnected.con.close();
                goToUserList.doList();
            } catch (SQLException e) {
                System.out.println("Error! See below details \n");
                System.out.println(e);
            }
        } else {
            System.out.println("You must provide a username to update user details");
        }
    }

    public void setUserDetails(String user,String pass) {
        this.userHere = user;
        this.pass = pass;
        doUpdate();
    }

    private void Update(String string) {
        throw new UnsupportedOperationException("Not supported yet."); }
    }
