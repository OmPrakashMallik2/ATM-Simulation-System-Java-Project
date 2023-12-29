package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardInput;
    JPasswordField pinInput;
    Login (){
        setTitle("Automated Teller Machine");

        setLayout(null);

        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image image2 = image1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel jLabel = new JLabel(image3);
        jLabel.setBounds(70,10,100,100);
        add(jLabel);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardNumber = new JLabel("Card No: ");
        cardNumber.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNumber.setBounds(120, 150, 150, 30);
        add(cardNumber);

        cardInput = new JTextField();
        cardInput.setBounds(300, 150, 250, 30);
        cardInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardInput);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 400, 30);
        add(pin);

        pinInput = new JPasswordField();
        pinInput.setBounds(300, 220, 250, 30);
        pinInput.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinInput);

        // login button
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        // Clear button
        clear = new JButton("CLEAR");
        clear.setBounds(450, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        // sign up button
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 360, 250, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setVisible(true);
        setLocation(360, 200);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear){
            cardInput.setText("");
            pinInput.setText("");
        } else if (ae.getSource() == signup){

        } else if (ae.getSource() == login){

        }
    }

    public static void main(String[] args) {
        System.out.println("ATM simulation system");
        new Login();
    }

}
