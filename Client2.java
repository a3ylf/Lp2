
import java.io.*;
import java.net.*;
import java.util.Scanner;


public class Client2{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 6969);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        String fromserver;
        String mode;
        String fromuser;

        while(true){
            mode = in.readUTF();
            if(mode.equals("break")) break;

            fromserver = in.readUTF();
            if(!fromserver.isEmpty())
                System.out.println(fromserver);

            if (mode.equals("write")) {
                fromuser = sc.nextLine();
                out.writeUTF(fromuser);
            }

            if (mode.equals("read")){}

        }
    }
}

