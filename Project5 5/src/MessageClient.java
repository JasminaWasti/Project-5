

import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class MessageClient {
    public static void main(String[] args) throws IOException {
        JOptionPane.showMessageDialog(null, "Welcome to message simulator! Connecting Now!",
                "Message Simulator", JOptionPane.INFORMATION_MESSAGE);
            Socket socket = new Socket("localhost", 4242);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            // LOGIN STARTS HERE. ONCE CLIENT CONNECTS THE SERVER SENDS THE LOG IN GUI
    }
}
