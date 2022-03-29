package socketprogramming;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Client {
    private Socket socket = null;
    private DataOutputStream dataOutputStream = null;
    private DataInputStream dataInputStream = null;

    public Client(String address, int port){
        try {
            socket = new Socket(address, port);
            if(socket.isConnected()){
                System.out.println("Connected");
            }
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataInputStream = new DataInputStream(socket.getInputStream());


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            byte[] arr = {
                    (byte)0x00, (byte)0x01, (byte)0x00, (byte)0x10, (byte)0x00, (byte)0x01,
                    (byte)0x00, (byte)0x1F, (byte)0x60, (byte)0x1D, (byte)0xA1, (byte)0x09,
                    (byte)0x06, (byte)0x07, (byte)0x60, (byte) 0x85, (byte)0x74, (byte)0x05,
                    (byte) 0x08, (byte)0x01, (byte)0x01, (byte)0xBE, (byte)0x10, (byte)0x04,
                    (byte)0x0E, (byte)0x01, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x06,
                    (byte)0x5F, (byte)0x1F, (byte)0x04, (byte)0x00, (byte)0x00, (byte)0x18,
                    (byte)0x1D, (byte)0xFF, (byte)0xFF
            };
            dataOutputStream.write(arr);

            String req = Arrays.toString(arr);
            System.out.println("Sent to server : " + req);

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte buffer[] = new byte[1024];
            baos.write(buffer, 0 , dataInputStream.read(buffer));
            byte result[] = baos.toByteArray();

            String res = Arrays.toString(result);
            System.out.println("Recieved from server : " + res);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // input.close();
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 5000);
    }
}
