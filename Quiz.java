import java.io.*;
import java.util.Random;


public class Quiz {
private static FileWriter fileWriter;
private static BufferedWriter bufferedWriter;
private static String nome_arq;

    public static void quiz(DataInputStream in, DataOutputStream out) throws IOException {
        nome_arq = "ranking.txt";
        fileWriter = new FileWriter(nome_arq);
        bufferedWriter = new BufferedWriter(fileWriter);
        Questions[] questionArray = new Questions[50];
        //exemplo
        questionArray[0] = new Questions("easy", "B", """
                Você é homem?
                A - não
                B - sim
                C - talvez""");



        String userInput;
        out.writeUTF("""
                Porfavor escolha a dificuldade:
                1-facil (6 perguntas fáceis, 3 perguntas médias e 1 difícil)
                2-média (3 perguntas fáceis, 5 perguntas médias e 2 difíceis)
                3-dificil (2 perguntas fáceis, 4 perguntas médias e 4 difíceis)
                4-muito dificil (1 pergunta fácil, 3 perguntas médias e 6 difíceis)
                """);

         do {
            int pontuacaofinal;
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> {
                  pontuacaofinal=easyquiz(in,out);
                  if(pontuacaofinal>=8&&pontuacaofinal<=10){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 1000 reais");
                    }
                    else if(pontuacaofinal>=5&&pontuacaofinal<=7){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 500 reais");
                    }
                    else if(pontuacaofinal>=3&&pontuacaofinal<=4){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 100 reais");
                    }
                    else if(pontuacaofinal>=1&&pontuacaofinal<=2){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 50 reais");
                    }
                    else{
                        out.writeUTF("Você não ganhou nada");
                  }
                try{
                  bufferedWriter.write("Pontuação: "+pontuacaofinal+ " - Data: "+java.time.LocalDate.now());
                  bufferedWriter.newLine();
                    bufferedWriter.close();
                    fileWriter.close();
                }catch(IOException e){
                    System.out.println("Erro ao escrever no arquivo");
                }
                  out.writeUTF("break");
                  break;
                }

                case "2" -> {
                   pontuacaofinal= mediumquiz(in,out);
                   if(pontuacaofinal>=8&&pontuacaofinal<=10){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 1000 reais");
                    }
                    else if(pontuacaofinal>=5&&pontuacaofinal<=7){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 500 reais");
                    }
                    else if(pontuacaofinal>=3&&pontuacaofinal<=4){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 100 reais");
                    }
                    else if(pontuacaofinal>=1&&pontuacaofinal<=2){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 50 reais");
                    }
                    else{
                        out.writeUTF("Você não ganhou nada");
                  }
                  out.writeUTF("break");
                  break;
                }

                case "3" -> {
                    pontuacaofinal=hardquiz(in,out);
                    if(pontuacaofinal>=8&&pontuacaofinal<=10){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 1000 reais");
                    }
                    else if(pontuacaofinal>=5&&pontuacaofinal<=7){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 500 reais");
                    }
                    else if(pontuacaofinal>=3&&pontuacaofinal<=4){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 100 reais");
                    }
                    else if(pontuacaofinal>=1&&pontuacaofinal<=2){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 50 reais");
                    }
                    else{
                        out.writeUTF("Você não ganhou nada");
                  }
                  out.writeUTF("break");
                  break;
                }

                case "4" -> {
                   pontuacaofinal= veryhardquiz(in, out);
                    if(pontuacaofinal>=8&&pontuacaofinal<=10){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 1000 reais");
                    }
                    else if(pontuacaofinal>=5&&pontuacaofinal<=7){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 500 reais");
                    }
                    else if(pontuacaofinal>=3&&pontuacaofinal<=4){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 100 reais");
                    }
                    else if(pontuacaofinal>=1&&pontuacaofinal<=2){
                        out.writeUTF("Parabéns, você acertou "+pontuacaofinal+" questões e ganhou um prêmio de 50 reais");
                    }
                    else{
                        out.writeUTF("Você não ganhou nada");
                  }
                  out.writeUTF("break");
                  break;
                }


                default -> {out.writeUTF("Escolha inválida");out.writeUTF("break");break;}
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && userInput.equals("4"));
    }




    private static int easyquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        Random random = new Random();
        String userAnswer;
        int randomIndex;
        int anterior=-1;
        for (int i = 0; i < 6; i++) {
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.easyQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.easyQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;

        }
        for(int i=0;i<3;i++){
           randomIndex = random.nextInt(10);
           while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.mediumQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.mediumQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;
        }
        randomIndex = random.nextInt(10);
            out.writeUTF(Questions.hardQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.hardQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
        return pontuacao;

    }
    private static int mediumquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        Random random = new Random();
        String userAnswer;
        int randomIndex;
        int anterior=-1;
        for (int i = 0; i < 3; i++) {
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.easyQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.easyQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush(); // Limpa o buffer de saída
            anterior=randomIndex;
        }
        
        
        for(int i=0;i<5;i++){
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.mediumQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.mediumQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush(); // Limpa o buffer de saída
            anterior=randomIndex;
        }
        for(int i=0;i<2;i++){
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.hardQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.hardQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush(); // Limpa o buffer de saída}
            anterior=randomIndex;
        }
        return pontuacao;}
    private static int hardquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        Random random = new Random();
        String userAnswer;
        int randomIndex;
        int anterior=-1;
        for (int i = 0; i < 2; i++) {
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.easyQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.easyQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;
        }
        for(int i=0;i<4;i++){
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.mediumQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.mediumQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;
        }
        for(int i=0;i<4;i++){
        randomIndex = random.nextInt(10);
        while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
        }
            out.writeUTF(Questions.hardQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.hardQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;}
        return pontuacao;
    }
    private static int veryhardquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        Random random = new Random();
        String userAnswer;
        int randomIndex;
        int anterior=-1;
        for(int i=0;i<4;i++){
            randomIndex = random.nextInt(10);
            while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.mediumQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.mediumQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;
        }
        for(int i=0;i<4;i++){
        randomIndex = random.nextInt(10);
        while(randomIndex==anterior){
                randomIndex = random.nextInt(10);
            }
            out.writeUTF(Questions.hardQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.hardQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();
            anterior=randomIndex;}
        
        randomIndex = random.nextInt(10);
            out.writeUTF(Questions.easyQuestions[randomIndex].getQuestion());
            out.flush(); // Limpa o buffer de saída
            userAnswer = in.readUTF();
            while (userAnswer.equals("")) {
                userAnswer = in.readUTF();
            }
            if (Questions.easyQuestions[randomIndex].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("A Resposta " + userAnswer + " está correta");
            } else {
                out.writeUTF("A Resposta " + userAnswer + " está errada");
            }
            out.flush();return pontuacao;}



}
