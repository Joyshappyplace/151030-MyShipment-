/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myshipmentproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JPanel {

    CardLayout crd;

    JLabel title = new JLabel("MyShipment", JLabel.CENTER);
    JPanel inputJPanel = new JPanel();
    JTextField usernamTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");

    // @Override
    // protected void paintComponent(Graphics g) {
    //     super.paintComponent(g);
    //     g.setColor(Color.RED);
    //     g.fillRect(0, 0, 800, 600);
    //     try {
    //         Image i = ImageIO.read(new File("river gorge.jpg"));
    //         g.drawImage(i, 0, 0, null);
    //     } catch (Exception e) {}
    // }
    public LoginForm(CardLayout crd) {
        // Initialize button actions
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Login.doLogin(usernamTextField.getText(), new String(passwordField.getPassword()))) {
                    Main.lastUser = usernamTextField.getText();
                    mainPanel.add("user", new UserForm(crd));
                    crd.show(getParent(), "user");
                }
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
        title.setFont(new Font("Helvetica Neue", Font.PLAIN, 36));
        add(title, gbc);

        gbc.gridy++;
        initInputPanel();
        add(inputJPanel, gbc);

        gbc.gridy++;
        gbc.fill = GridBagConstraints.NONE;
        add(loginButton, gbc);
    }

    private void initInputPanel() {
        inputJPanel.setLayout(new GridBagLayout());
        inputJPanel.setBackground(new Color(0, 0, 0, 0));
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

    private static class mainPanel {

        private static void add(String user, UserForm userForm) {
            throw new UnsupportedOperationException("Not supported yet.");}

        public mainPanel() {
        }
    }

}

