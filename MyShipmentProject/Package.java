
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
public class Package {
    //class Package 

    public String packageId, name, description, location;

    public Package(ResultSet rs) {
        try {
            packageId = rs.getString(1);
            name = rs.getString(3);
            description = rs.getString(4);
            location = rs.getString(5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String[] getArray() {
        String arr[] = {packageId, name, description, location};
        return arr;
    }

    public String trackPackage() {
        // Track the package
        // Implementation details not provided
        return null;
    }

    public Date estimateDeliveryTime() {
        // Estimate the delivery time for the package
        // Implementation details not provided
        return null;
    }

    public double calculateShippingCost() {
        // Calculate the shipping cost for the package
        // Implementation details not provided
        return 0.0;
    }
}
