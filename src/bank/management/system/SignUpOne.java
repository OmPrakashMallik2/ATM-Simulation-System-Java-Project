package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignUpOne extends JFrame {
    SignUpOne (){

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs(ran.nextLong() % 9000L)+1000L;

        // heading
        JLabel form1 = new JLabel("APPLICATION FORM No: "+random);
        form1.setFont(new Font("Raleway", Font.BOLD, 38));
        form1.setBounds(120, 20, 600, 40);
        add(form1);

        // Personal details 1
        JLabel personalDetails = new JLabel("Form 1: Personal Details ");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(260, 80, 400, 30);
        add(personalDetails);

        // Personal details 1 : name
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        // Personal details 1 :father's name
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        // Personal details 1 : DOB
        JLabel dob = new JLabel("Date of birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        // Personal details 1 : gender
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        // Personal details 1 : email
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        // Personal details 1 : martial
        JLabel martial = new JLabel("Martial status: ");
        martial.setFont(new Font("Raleway", Font.BOLD, 20));
        martial.setBounds(100, 390, 200, 30);
        add(martial);

        // Personal details 1 : Address
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        // Personal details 1 : city
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        // Personal details 1 : state
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        // Personal details 1 : pin code
        JLabel pinCode = new JLabel("Pin code: ");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);

        getContentPane().setBackground(Color.white);

        setSize(800, 800);
        setLocation(350, 10);
        setVisible(true);
    }


    public static void main(String[] args) {
        new SignUpOne();
    }
}
