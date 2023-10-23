import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

public class ServerQuiz {
    public static void main(String[] args) throws IOException {
        Executor exec = Executors.newCachedThreadPool();
        List<multiplayerRoom> salas = new ArrayList<>(5);
        ServerSocket s = new ServerSocket(6969);
        Semaphore roomadd = new Semaphore(1);
        while (true) {
            Socket ns = s.accept();
            exec.execute(new protocolServer(ns,roomadd,salas));
        }
    }

}

class protocolServer implements Runnable {
    Socket s;
    DataInputStream in;
    DataOutputStream out;

    private Semaphore roomadd;
    private List<multiplayerRoom> salas;

    public protocolServer(Socket ns, Semaphore roomadd, List<multiplayerRoom> salas) throws IOException {
        s = ns;
        in = new DataInputStream(s.getInputStream());
        out = new DataOutputStream(s.getOutputStream());
        this.roomadd = roomadd;
        this.salas = salas;
    }

    public void run() {
        try {
            mode.read(out);
            out.writeUTF("""
                            Conexão feita! Bem-vindo ao quiz lp2!
                    """);
            menu(in, out, roomadd, salas);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void menu(DataInputStream in, DataOutputStream out,Semaphore roomadd, List<multiplayerRoom> salas) throws IOException, InterruptedException {

        mode.write(out);
        out.writeUTF("""
                Escolha o que você deseja fazer:
                1 - Start
                2 - Ranking
                3 - Leave
                """);
        String userInput;
        do {
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> Quiz.quiz(in,out,roomadd,salas);

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

