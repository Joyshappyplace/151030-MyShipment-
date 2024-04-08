/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;

import java.sql.*;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

/**
 * User
 */
public class UserForm extends JPanel {

    JTable table;
    String columnTitles[] = {"Package ID", "Name", "Description", "Quantity"};
    ArrayList<String[]> packages = new ArrayList();
 

    public UserForm(CardLayout crd) {
        /// Connect to db

        /*
         * select * from Packages where customerID = '1279389';
         */
        Connection con = new DBConnection().getConnection();

        try {
            PreparedStatement stmt = con.prepareStatement("select * from Packages where customerId = ?;");
            stmt.setString(1, Main.lastUser);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Package p = new Package(rs);
                packages.add(p.getArray());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String data[][] = packages.toArray(new String[][] {});

        table = new JTable(data, columnTitles);
        table.setBounds(0, 0, 500, 500);

        JScrollPane sp = new JScrollPane(table);
        add(sp);
    }

}