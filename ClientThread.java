import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientThread extends Thread{

    Socket socket;
    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        super.run();

        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

            double width = dis.readDouble();
            double heigth = dis.readDouble();
            double area = width * heigth;
            dos.writeDouble(area);


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
