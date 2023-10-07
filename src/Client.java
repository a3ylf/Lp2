
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 6969);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        System.out.println(in.readUTF());
        while(true){
            String fromuser = sc.nextLine();
            out.writeUTF(fromuser);
            String fromserver = in.readUTF();
            if (fromserver.equals("break")) break;
            else System.out.println(fromserver);
    }
    }
}
