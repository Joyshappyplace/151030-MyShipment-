package myshipmentproject;

import javax.swing.*;

import myshipmentproject.LoginForm;
import myshipmentproject.Registration;
import myshipmentproject.UserForm;
import java.sql.*; 

import java.awt.*;

/**
 * Main
 */
public class Main extends JFrame {

    static String lastUser;
    JPanel mainPanel = new JPanel();
    CardLayout crd = new CardLayout();

    Main() {
        mainPanel.setLayout(crd);
        mainPanel.add("registration", new Registration(crd));
        mainPanel.add("login", new LoginForm(crd));
        mainPanel.add("user", new UserForm(crd));
        
        

        setTitle("Login");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(mainPanel);
    }

    public static void main(String[] args) {
        new Main();
    }
    
}