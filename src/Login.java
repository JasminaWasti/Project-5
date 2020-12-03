import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Login extends  JFrame {
    JButton loginButton;
    JPanel loginPanel;
    JTextField user;
    JTextField pass;
    JLabel username;
    JLabel password;
    JButton newUser;

    public Login() {
        super ("ChatNet");

        loginButton = new JButton("Login");
        loginPanel = new JPanel();
        user = new JTextField(15);
        pass = new JPasswordField(15);
        newUser = new JButton("New User?");
        username = new JLabel("User: ");
        password = new JLabel("Password: ");

        setSize(300, 200);
        setLocation(500, 200);
        loginPanel.setLayout(null);

        user.setBounds(70, 30, 150, 20);
        pass.setBounds(70, 65, 150, 20);
        loginButton.setBounds(110,100,80,20);
        newUser.setBounds(110,135,80,20);
        username.setBounds(20,28,80,20);
        password.setBounds(20,63,80,20);

        loginPanel.add(loginButton);
        loginPanel.add(user);
        loginPanel.add(pass);
        loginPanel.add(newUser);
        loginPanel.add(username);
        loginPanel.add(password);

        getContentPane().add(loginPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Writer writer = null;
        File check = new File("userPass.txt");
        if(check.exists()){

        } else {
            try {
                File texting = new File("userPass.txt");
                writer = new BufferedWriter(new FileWriter(texting));
                writer.write("message");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("userPass.txt");
                    Scanner scan = new Scanner(file);;
                    String line = null;
                    FileWriter filewrite = new FileWriter(file, true);

                    String usertxt = " ";
                    String passtxt = " ";
                    String puname = user.getText();
                    String ppaswd = pass.getText();


                    while (scan.hasNext()) {
                        usertxt = scan.nextLine();
                        passtxt = scan.nextLine();

                    }




                    while (scan.hasNext()) {
                        usertxt = scan.nextLine();
                        passtxt = scan.nextLine();
                    }
                    if(puname.equals("") && ppaswd.equals("")){
                        JOptionPane.showMessageDialog(null,"Please insert Username and Password");
                    }
                    else {

                        JOptionPane.showMessageDialog(null,"Wrong Username / Password");
                        user.setText("");
                        pass.setText("");
                        user.requestFocus();
                    }
                } catch (IOException d) {
                    d.printStackTrace();
                }

            }
        });

//        newUser.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//                User user = new User();
//                dispose();
//
//            }
        });
    }
}