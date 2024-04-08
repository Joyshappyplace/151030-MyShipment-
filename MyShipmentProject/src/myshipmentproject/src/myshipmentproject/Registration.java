/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*; 


public class Registration extends JPanel {
    CardLayout crd;

    JLabel title = new JLabel("CREATE ACCOUNT", JLabel.CENTER);
    JPanel inputJPanel = new JPanel();
    JTextField usernamTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton saveButton = new JButton("SAVE");

    public Registration(CardLayout crd) {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crd.show(getParent(), "login");
            }
        });

        this.crd = crd;
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.gridx = 0;
        gbc.gridy = 0;
        title.setFont(new Font("Helvetica Neue", Font.PLAIN, 18));
        add(title, gbc);

        gbc.gridy++;
        initInputPanel();
        add(inputJPanel, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        add(saveButton, gbc);
    }

    private void initInputPanel() {
        inputJPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        gbc.gridx = 0;
        gbc.gridy = 0;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 1;
        inputJPanel.add(new JLabel("Username"), gbc);

        gbc.gridx = 2;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 3;
        inputJPanel.add(usernamTextField, gbc);

        gbc.gridx = 4;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0.5;
        gbc.gridwidth = 5;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        inputJPanel.add(new JLabel("Password"), gbc);

        gbc.gridx = 2;
        inputJPanel.add(new Container(), gbc);

        gbc.gridx = 3;
        inputJPanel.add(passwordField, gbc);

        gbc.gridx = 4;
        inputJPanel.add(new Container(), gbc);
    }
}

