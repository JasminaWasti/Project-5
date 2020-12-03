import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MessageServer extends Thread{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4242);
        Socket socket = serverSocket.accept();
        // HERE USER HAS CONNECTED SO WE WILL NOW SEND THEM THE LOGIN AND CREATE ACCOUNT GUIS.
        // VINNY HAS LOGIN AND CREATE ACCOUNT GUIS.
        // I THINK THAT THREADS ARE CREATED AFTER USER PRESSES LOGIN.


    }
}
