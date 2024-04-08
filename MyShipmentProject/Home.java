/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;
import java.util.*;


public class Home {

    static String user, pass;
    static int choice;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        begin();
    }

    static void begin() {
        //Ask the user what to do
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose what to do:");
        System.out.println("Enter 1 to login.");
        System.out.println("Enter 2 to register a user.");
        choice = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (choice == 2) {
            System.out.println("...User Registration...");
            System.out.println("Please enter a username: ");
            user = sc.nextLine();
            System.out.println("Please enter a password: ");
            pass = sc.nextLine();

            //Jump to AddUser.java
            AddUser adduserobject = new AddUser();
            adduserobject.setUserDetails(user, pass);
        } else if (choice == 1) {
            System.out.println("...User Login...");
            System.out.println("Enter login username: ");
            user = sc.nextLine();
            System.out.println("Enter login password: ");
            pass = sc.nextLine();

            //Jump to Login.java
            Login loginObject = new Login();
            loginObject.setUserDetails(user, pass);
        } else {
            System.out.println("Invalid choice");
            main(null);
        }
    }
}

