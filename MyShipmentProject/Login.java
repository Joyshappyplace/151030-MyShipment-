/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

import java.awt.CardLayout;
import java.sql.*;

/**
 *
 * @author User
 */
public class Login {

    public Login(CardLayout crd) {
    }

    public static boolean doLogin(String customerId, String pass) {
        //Instantiate DBConnection class to begin DB connection
        DBConnection dBConnect = new DBConnection();
        dBConnect.getConnection();

        boolean loggedIn = false;
        try {
            //STEP 3. CREATE a Statement object to help access query execution methods
            Shipment shipmnt;
            shipmnt = new Shipment();

            //STEP 4. Execute SQL Query
            // Execute a SELECT query
            java.sql.ResultSet resultSet;
            resultSet = shipmnt.executeQuery();

            //STEP 5. Process the resultset
            // Process the ResultSet
            while (resultSet.next()) {
                //Get database values and store them in local variables
                String dbusername = resultSet.getString(1);
                String dbpassword = resultSet.getString(3);
                if (customerId.equalsIgnoreCase(dbusername) && pass.equals(dbpassword)) {
                    System.out.println("Login successful");
                    System.out.println("Write the logic for next actions here");
                    loggedIn = true;
                    break;
                } else {
                    System.out.println("Login failed. Incorrect username or password");
                }
            }
            //STEP 6. Close the DB Connection when done using it
            dBConnect.con.close();
        } catch (SQLException e) {
            System.err.println("SQL Exception: " + e.getMessage());
        }
        return loggedIn;
    }

    Login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Shipment dBConnect() {
        return new Shipment();
    }

    void setUserDetails(String user, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
