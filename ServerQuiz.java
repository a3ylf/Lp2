import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class ServerQuiz {
    public static void main(String[] args) throws IOException {
        Executor exec = Executors.newCachedThreadPool();
        try (ServerSocket s = new ServerSocket(6969)) {
            while (true) {
                Socket ns = s.accept();
                exec.execute(new protocolServer(ns));
            }
        }
    
    }
}

class protocolServer implements Runnable {
    Socket s;
    DataInputStream in;
    DataOutputStream out;

    public protocolServer(Socket ns) throws IOException {
        s = ns;
        in = new DataInputStream(s.getInputStream());
        out = new DataOutputStream(s.getOutputStream());
    }

    public void run() {
        try {
            menu(s,in,out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void menu(Socket s, DataInputStream in, DataOutputStream out) throws IOException {
        out.writeUTF("\nConexão feita! Bem-vindo ao quiz lp2!\n\n" +
                "Escolha o que você deseja fazer:\n" +
                "1 - Start\n" +
                "2 - Ranking\n" +
                "3 - Leave\n");

        String userInput;
        do {
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> {
                    Quiz.quiz(in,out);
                }

                case "2" -> {
                    out.writeUTF("You selected Option 2");
                }
                        case "3" ->
                        out.writeUTF("break");

                default -> out.writeUTF("escolha inválida");
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3"));
    }


}

