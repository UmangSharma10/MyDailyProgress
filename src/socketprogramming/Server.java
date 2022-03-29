package socketprogramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Map;

public class Server {
    private Socket   socket = null;
    private ServerSocket server = null;
    private InputStream in  = null;
    private OutputStream out = null;

    public Server(int port){
        try {
            server = new ServerSocket(port);
            System.out.println("Server Started");
            System.out.println("Waiting for a client ...");
            socket = server.accept();
            System.out.println("Client Accepted");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //Receiving Data from Client
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte buffer[] = new byte[1024];
            baos.write(buffer, 0 , in.read(buffer));

            byte[] result = baos.toByteArray();

            String str = Arrays.toString(result);

            System.out.println("Recieved from client : "+str);

            out.write(result);
            System.out.println("Closing Connection");

            socket.close();
            in.close();




        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server(5000);
    }

}
