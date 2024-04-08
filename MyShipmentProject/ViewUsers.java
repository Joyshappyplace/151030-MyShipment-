/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;
 
import java.sql.*;
import java.util.*;
import static myshipmentproject.Main.main;

/**
 *
 * @author fbarasa
 */
public class ViewUsers {

    private String userHere, passHere;
    int choiceHere;

    void doList() {
        //Check if username or password supplied
        try {
            //Instantiate DbConnection class to use the connection
            DBConnection stayconnected = new DBConnection();
            stayconnected.getConnection();
            //Create the statement object for executing queries
            Statement stmt = stayconnected.con.createStatement();
            //Execute the statement
            ResultSet rs = stmt.executeQuery("SELECT * FROM login");
            //Handle the results set
            System.out.format("%s, %s\n", "User", "Role ID");
            while (rs.next()) {
                //System.out.println("User "+userNumber);
                System.out.format("%s, %s\n", rs.getString("userName"), rs.getInt("CustomerID"));
            }
            //Close the connection
            stayconnected.con.close();
            beginAfterView();
        } catch (SQLException e) {
            System.out.println("Error! See below details \n");
            System.out.println(e);
        }
    }

    void beginAfterView() {
        //Ask the user what to do
        Scanner sc = new Scanner(System.in);
        System.out.println("Do more: ");
        System.out.println("Enter 1 to Update user details.");
        System.out.println("Enter 2 to Delete a user.");
        System.out.println("Enter 3 to Logout a user.");
        choiceHere = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (choiceHere == 1) {
            System.out.println("...Update User...");
            System.out.println("Enter username to select a user: ");
            userHere = sc.nextLine();
            System.out.println("Enter a new password for user "+userHere+"");
            passHere = sc.nextLine();
            //Jump to UpdateUser.java
            UpdateUser updateUserObject = new UpdateUser();
            updateUserObject.setUserDetails(userHere, passHere);
        } else if (choiceHere == 2) {
            System.out.println("...Remove a User...");
            System.out.println("Please enter the username to remove: ");
            userHere = sc.nextLine();
            //Jump to DeleteUser.java
            DeleteUser deleteuserobject = new DeleteUser();
            deleteuserobject.setUserDetails(userHere);
        } else if (choiceHere == 3) {
            System.out.println("You are now logged out...");
            main(null);
        } else {
            System.out.println("Invalid choice");
            beginAfterView();
        }
        
    }
    
}
  
    
