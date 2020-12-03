import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Login extends  JFrame {
    //ArrayList<User> Users;
    JFrame frame;
    JButton loginButton;
    JPanel loginPanel;
    JTextField user;
    JTextField pass;
    JLabel username;
    JLabel password;
    JButton newUser;

    JPanel newUserPanel;
    JTextField newUsername;
    JTextField newPassword;
    JTextField age;
    JTextField gender;
    JTextField usersFirstName;
    JTextField usersLastName;
    JLabel usernameLabel;
    JLabel passwordLabel;
    JLabel ageLabel;
    JLabel genderLabel;
    JLabel firstNameLabel;
    JLabel lastNameLabel;
    JButton addUser;
    JButton goBack;



    public Login() {
        super("ChatNet");
        frame = new JFrame("Message Simulator");
        loginButton = new JButton("Login");
        loginPanel = new JPanel();
        user = new JTextField(15);
        pass = new JPasswordField(15);
        newUser = new JButton("New User?");
        username = new JLabel("User: ");
        password = new JLabel("Password: ");

        loginPanel.setSize(300, 200);
        loginPanel.setLocation(500, 200);
        loginPanel.setLayout(null);
        frame.setSize(400,300);
        user.setBounds(90, 30, 150, 20);
        pass.setBounds(90, 65, 150, 20);
        loginButton.setBounds(110, 100, 100, 20);
        newUser.setBounds(110, 135, 100, 20);
        username.setBounds(20, 28, 80, 20);
        password.setBounds(20, 63, 80, 20);

        loginPanel.add(loginButton);
        loginPanel.add(user);
        loginPanel.add(pass);
        loginPanel.add(newUser);
        loginPanel.add(username);
        loginPanel.add(password);
        frame.add(loginPanel);

        frame.setVisible(true);
        loginPanel.setVisible(true);


        newUserPanel = new JPanel();
        newUserPanel.setSize(600,400);
        newUsername = new JTextField(15);
        newPassword = new JTextField(15);
        age = new JTextField(15);
        gender = new JTextField(15);
        usersFirstName = new JTextField(15);
        usersLastName = new JTextField(15);
        usernameLabel = new JLabel("Username:");
        passwordLabel = new JLabel("Password:");
        ageLabel = new JLabel("Age:");
        genderLabel = new JLabel("Gender:");
        firstNameLabel = new JLabel("First Name:");
        lastNameLabel = new JLabel("Last Name");
        addUser = new JButton("Add User");
        goBack = new JButton("Go Back");


        newUserPanel.setSize(600, 400);
        newUserPanel.setLocation(500, 200);
        newUserPanel.setLayout(null);
        usernameLabel.setBounds(70,30,150,20);
        passwordLabel.setBounds(70,60,150,20);
        ageLabel.setBounds(70,90,150,20);
        genderLabel.setBounds(70,120,150,20);
        firstNameLabel.setBounds(70,150,150,20);
        lastNameLabel.setBounds(70,180,150,20);
        newUsername.setBounds(150,30,150,20);
        newPassword.setBounds(150,60,150,20);
        age.setBounds(150,90,150,20);
        gender.setBounds(150,120,150,20);
        usersFirstName.setBounds(150,150,150,20);
        usersLastName.setBounds(150,180,150,20);
        addUser.setBounds(70, 210, 100, 20);
        goBack.setBounds(200, 210, 100, 20);


        newUserPanel.add(newUsername);
        newUserPanel.add(newPassword);
        newUserPanel.add(age);
        newUserPanel.add(gender);
        newUserPanel.add(usersFirstName);
        newUserPanel.add(usersLastName);
        newUserPanel.add(usernameLabel);
        newUserPanel.add(passwordLabel);
        newUserPanel.add(ageLabel);
        newUserPanel.add(genderLabel);
        newUserPanel.add(firstNameLabel);
        newUserPanel.add(lastNameLabel);
        newUserPanel.add(addUser);
        newUserPanel.add(goBack);
        frame.add(newUserPanel);
        newUserPanel.setVisible(false);



        Writer writer = null;
        File check = new File("userPass.txt");
        if (check.exists()) {

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
                    Scanner scan = new Scanner(file);
                    ;
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
                    if (puname.equals("") && ppaswd.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please insert Username and Password");
                    } else {

                        JOptionPane.showMessageDialog(null, "Wrong Username / Password");
                        user.setText("");
                        pass.setText("");
                        user.requestFocus();
                    }
                } catch (IOException d) {
                    d.printStackTrace();
                }

            }
        });

      newUser.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e) {
               loginPanel.setVisible(false);
               newUserPanel.setVisible(true);
               goBack.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                       loginPanel.setVisible(true);
                       newUserPanel.setVisible(false);
                   }

               });
               addUser.addActionListener(new ActionListener() {
                   @Override

                   // NEW PANELS FOR NULL STUFF
                   public void actionPerformed(ActionEvent e) {
                       String username = newUsername.getText();
                       String password = newPassword.getText();

                   }
               });
           }
      });


}
}