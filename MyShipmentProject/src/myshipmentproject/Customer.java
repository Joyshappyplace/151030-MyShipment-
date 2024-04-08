/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

import java.util.List;
import java.sql.*; 

/**
 *
 * @author User
 */
public class Customer {
//class Customer
    private String customerId;
    private String userName;
    private String address;
    private String email;
    private String passWord;
    private String phoneNumber;

    public boolean login(String username, String password) {
        // Login functionality
        // Implementation details not provided
        return false;
    }

    public List<Shipment> viewShipmentHistory() {
        // View shipment history for the customer
        // Implementation details not provided
        return null;
    }

    public void updateProfile() {
        // Update customer profile
        // Implementation details not provided
    }

    public Shipment placeOrder() {
        // Place an order for a package
        // Implementation details not provided
        return null;
    }

    public void cancelOrder(Shipment shipment) {
        // Cancel an order
        // Implementation details not provided
    }

    public void logout() {
        // Logout functionality
        // Implementation details not provided
    }
}
