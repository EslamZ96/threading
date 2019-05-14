import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        Socket socket = new Socket("localhost", 9090);
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        System.out.println("Enter Height: ");
        double height = scan.nextDouble();
        dos.writeDouble(height);

        System.out.println("Enter width: ");
        double width = scan.nextDouble();
        dos.writeDouble(width);

        double area = dis.readDouble();
        System.out.println("area is: " + area);

    }
}
