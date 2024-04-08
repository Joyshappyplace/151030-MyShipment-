/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

import java.util.Date;
import java.sql.*; 

/**
 *
 * @author User
 */
public class Shipment {
//class Shipment {
    private String trackingNumber;
    private String origin;
    private String destination;
    private String currentStatus;
    private Date deliveryDate;

    public void updateStatus(String newStatus) {
        // Update the status of the shipment
        this.currentStatus = newStatus;
    }

    public Date calculateETA() {
        // Calculate the estimated time of arrival for the shipment
        // Implementation details not provided
        return null;
    }

    public String getTrackingInformation() {
        // Retrieve tracking information for the shipment
        // Implementation details not provided
        return null;
    }

    public java.sql.ResultSet executeQuery() {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();
        
        try {
          Statement stmt = con.createStatement();  
          return stmt.executeQuery("select * from Customers;");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
}

