import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("connection avec serveur");
        Socket sc = new Socket("127.0.0.1",1450);
        InputStream is=sc.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        System.out.println("le serveur ma envoye : "+s);
        sc.close();
    }
}
