import java.io.*;

public class Ranking {
    private static int[] pontos = new int[5];
    private static String[] nomes = new String[5];

    public static int getMenor(){
        return pontos[4];
    }

    private static String nomeArquivo = "ranking.txt";

    public static synchronized  void rankingRead() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            int i = 0;

            while ((linha = br.readLine()) != null && i < 5) {
                String[] partes = linha.split(" ");
                if (partes.length == 2) {
                    nomes[i] = partes[0];
                    pontos[i] = Integer.parseInt(partes[1]);
                    i++;
                }
            }

            br.close();


        } catch (IOException e) {

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
                String[] dadosIniciais = {"AJR 100", "PED 100", "XXD 100", "PAO 100", "CAP 100"};
                for (String dado : dadosIniciais) {
                    bw.write(dado);
                    bw.newLine();
                }
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    private static synchronized void rankingWrite(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo));
            for (int i = 0; i < nomes.length; i++) {
                if (nomes[i] != null && !nomes[i].isEmpty()) {
                    bw.write(nomes[i] + " " + pontos[i]);
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static synchronized boolean adicionar(String novoNome, int novoPontos) {
        int posicaoInsercao = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (novoPontos > pontos[i]) {
                posicaoInsercao = i;
                break;
            }
        }

        if(posicaoInsercao >= 0 ) {
            for (int i = nomes.length - 1; i > posicaoInsercao; i--) {
                nomes[i] = nomes[i - 1];
                pontos[i] = pontos[i - 1];
            }
            nomes[posicaoInsercao] = novoNome;
            pontos[posicaoInsercao] = novoPontos;

            rankingWrite();
            return true;
        }
        else
            return false;
    }
    public static synchronized void imprimirRanking (DataInputStream in, DataOutputStream out) throws IOException, InterruptedException {

        mode.read(out);
        out.writeUTF("Ranking:");
        for (int i = 0; i < nomes.length; i++) {
            mode.read(out);
            out.writeUTF("Nome: " + nomes[i] + ", Pontos: " + pontos[i]);
        }
        Thread.sleep(3000);
        mode.read(out);
        out.writeUTF("\n\n\n\n\nVocê será retornado ao menu\n\n\n\n\n");
        Thread.sleep(5000);
        protocolServer.menu(in,out);
    }
}








