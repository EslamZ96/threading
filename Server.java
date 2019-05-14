import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        try {
            ServerSocket server = new ServerSocket(9090);

            while(true ) {
                try {
                    Socket socket = server.accept();
                    ClientThread thread = new ClientThread(socket);
                    thread.start();

                }catch (IOException e) {
                    System.out.println(e);
                }

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
