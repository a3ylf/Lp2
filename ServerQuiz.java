import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class ServerQuiz {
    public static void main(String[] args) throws IOException {
        Executor exec = Executors.newCachedThreadPool();
        ServerSocket s = new ServerSocket(6969);
        while (true) {
            Socket ns = s.accept();
            exec.execute(new protocolServer(ns));
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
        mode.write(out);
        out.writeUTF("""

                Conexão feita! Bem-vindo ao quiz lp2!

                Escolha o que você deseja fazer:
                1 - Start
                2 - Ranking
                3 - Leave
                """);
        String userInput;
        do {
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> Quiz.quiz(in,out);

                case "2" -> out.writeUTF("You selected Option 2");

                case "3" -> mode.stop(out);

                default -> {
                    mode.write(out);
                    out.writeUTF("escolha inválida");
                }
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3"));
    }


}

import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class ServerQuiz {
    public static void main(String[] args) throws IOException {
        Executor exec = Executors.newCachedThreadPool();
        ServerSocket s = new ServerSocket(6969);
        while (true) {
            Socket ns = s.accept();
            exec.execute(new protocolServer(ns));
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
        mode.write(out);
        out.writeUTF("""

                Conexão feita! Bem-vindo ao quiz lp2!

                Escolha o que você deseja fazer:
                1 - Start
                2 - Ranking
                3 - Leave
                """);
        String userInput;
        do {
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> Quiz.quiz(in,out);

                case "2" -> out.writeUTF("You selected Option 2");

                case "3" -> mode.stop(out);

                default -> {
                    mode.write(out);
                    out.writeUTF("escolha inválida");
                }
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3"));
    }


}

