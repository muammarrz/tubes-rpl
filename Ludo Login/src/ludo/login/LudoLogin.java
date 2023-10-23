/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ludo.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LudoLogin extends javax.swing.JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    
    public LudoLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(1570, 971);
        setResizable(false);
        
        // Create the layered pane
        JLayeredPane layeredPane = new JLayeredPane();
        setContentPane(layeredPane);
        

        
        
        
        // Create a white background panel 
        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setOpaque(true);
        whitePanel.setBounds(0, 0, getWidth(), getHeight());
        layeredPane.add(whitePanel, JLayeredPane.DEFAULT_LAYER);
        
        // Create Username label and textbox
            //username label
        ImageIcon image1 = new ImageIcon("images/line1.png");
        JLabel username = new JLabel(image1);
        username.setBounds(554, 382, image1.getIconWidth(), image1.getIconHeight());
        username.setOpaque(false);
        layeredPane.add(username, JLayeredPane.PALETTE_LAYER);
            //username textbox
        usernameField = new JTextField("");
        usernameField.setBounds(554, 342,image1.getIconWidth(),31);
        usernameField.setFont(new Font("Inder", Font.PLAIN, 26));
        usernameField.setBorder(null);
        usernameField.setOpaque(false);
        layeredPane.add(usernameField,JLayeredPane.PALETTE_LAYER);
        // Create Password label and textbox
            //password label
        JLabel password = new JLabel(image1);
        password.setBounds(554, 486, image1.getIconWidth(), image1.getIconHeight());
        password.setOpaque(false);
        layeredPane.add(password, JLayeredPane.PALETTE_LAYER);
            //password textbox
        passwordField = new JPasswordField();
        passwordField.setBounds(554, 446,image1.getIconWidth(),31);
        passwordField.setFont(new Font("Inder", Font.PLAIN, 26));
        passwordField.setBorder(null);
        passwordField.setOpaque(false);
        layeredPane.add(passwordField,JLayeredPane.PALETTE_LAYER);
        
        // button
            // button Loogin
        ImageIcon image2 = new ImageIcon("images/rectangle.png");
        JLabel login = new JLabel("LOGIN");
        login.setForeground(Color.white);
        login.setFont(new Font("Inder", Font.PLAIN, 36));
        login.setBounds(677, 597 - 5, 104 + 10, 62 + 10);
        layeredPane.add(login,JLayeredPane.PALETTE_LAYER);
        JButton loginButton = new JButton();
        loginButton.setBounds(614, 601,image2.getIconWidth(), image2.getIconHeight());
        loginButton.setBorder(null);
        loginButton.setContentAreaFilled(false);
        loginButton.setIcon(image2);
        layeredPane.add(loginButton,JLayeredPane.PALETTE_LAYER);
                //button action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                
                if (username.equals("your_username") && password.equals("your_password")) {
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed. Please try again.");
                }
            }
        });
            //button forgotten Password
        JButton forget = new JButton("Forgotten Password?");
        forget.setForeground(Color.gray);
        forget.setBounds(608, 670, 344 , 27);
        forget.setFont(new Font("Inter", Font.PLAIN, 24));
        forget.setHorizontalAlignment(SwingConstants.LEFT);
        forget.setBorder(null);
        forget.setContentAreaFilled(false);
        layeredPane.add(forget,JLayeredPane.MODAL_LAYER);
            // create a new account
        JButton create = new JButton("Or Create a New Account");
        create.setForeground(Color.gray);
        create.setBounds(608, 704, 242 , 33);
        create.setFont(new Font("Inter", Font.PLAIN, 20));
        create.setHorizontalAlignment(SwingConstants.LEFT);
        create.setBorder(null);
        create.setContentAreaFilled(false);
        layeredPane.add(create,JLayeredPane.MODAL_LAYER);
        // union
        ImageIcon image3 = new ImageIcon("images/union1.png");
        JLabel union1 = new JLabel(image3);
        union1.setBounds(729, 264, image3.getIconWidth(), image3.getIconHeight());
        layeredPane.add(union1, JLayeredPane.PALETTE_LAYER);
        
        ImageIcon image4 = new ImageIcon("images/union2.png");
        JLabel union2 = new JLabel(image4);
        union2.setBounds(-98,-78, image4.getIconWidth(), image4.getIconHeight());
        layeredPane.add(union2, JLayeredPane.PALETTE_LAYER);
        
        // Text
        JLabel Welcome = new JLabel("Welcome Back!");
        Welcome.setForeground(Color.black);
        Welcome.setFont(new Font("Inter", Font.BOLD, 96));
        Welcome.setBounds(307, 84, 844, 128);
        layeredPane.add(Welcome,JLayeredPane.MODAL_LAYER);
        
        JLabel enter = new JLabel("Enter Your Username & Password");
        enter.setForeground(Color.gray);
        enter.setBounds(366, 183, 725, 81);
        enter.setFont(new Font("Inder", Font.PLAIN, 40));
        layeredPane.add(enter,JLayeredPane.MODAL_LAYER);
        
        
        
        setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LudoLogin();
        });
    }
}


