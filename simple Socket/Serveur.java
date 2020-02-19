
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) throws IOException {
        ServerSocket sc=new ServerSocket(1450);
        System.out.println("server is waiting connection");
        Socket socket=sc.accept();
        OutputStream os=socket.getOutputStream();
        PrintWriter pw = new PrintWriter(os,true);
        pw.println("bonjour je suis GT1");
        System.out.println("message envoye");
        sc.close();
    }
}
