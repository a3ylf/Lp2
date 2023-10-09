import java.io.*;


public class Quiz {


    public static void quiz(DataInputStream in, DataOutputStream out) throws IOException {

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
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> {
                    easyquiz(in,out);
                }

                case "2" -> {
                    mediumquiz(in,out);
                }

                case "3" -> {
                    hardquiz(in,out);
                }

                case "4" -> {
                    veryhardquiz(in,out);
                }


                default -> out.writeUTF("Escolha inválida");
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && userInput.equals("4"));
    }




    private static int easyquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        for (int i = 0; i < 6; i++) {
            out.writeUTF(Questions.easyQuestions[i].getQuestion());
          String userAnswer = in.readUTF();
            if ((Questions.easyQuestions[i].getAnswer()).equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        for(int i=0;i<3;i++){
            out.writeUTF(Questions.mediumQuestions[i].getQuestion());
           String userAnswer = in.readUTF();
            if ((Questions.mediumQuestions[i].getAnswer()).equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        out.writeUTF(Questions.hardQuestions[0].getQuestion());
        String userAnswer = in.readUTF();
        if (Questions.hardQuestions[0].getAnswer().equals(userAnswer)) {
            pontuacao++;
            out.writeUTF("Resposta correta");
        } else {
            out.writeUTF("Resposta errada");
        }
        return pontuacao;

    }
    private static int mediumquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        for (int i = 0; i < 3; i++) {
            out.writeUTF(Questions.easyQuestions[i].getQuestion());
            String userAnswer = in.readUTF();
            if (Questions.easyQuestions[i].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        for(int i=0;i<5;i++){
            out.writeUTF(Questions.mediumQuestions[i].getQuestion());
            String userAnswer = in.readUTF();
            if (Questions.mediumQuestions[i].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        for(int i=0;i<2;i++){
        out.writeUTF(Questions.hardQuestions[i].getQuestion());
        String userAnswer = in.readUTF();
        if (Questions.hardQuestions[i].getAnswer().equals(userAnswer)) {
            pontuacao++;
            out.writeUTF("Resposta correta");
        } else {
            out.writeUTF("Resposta errada");
        }}
        return pontuacao;}
    private static int hardquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;

        for (int i = 0; i < 2; i++) {
            out.writeUTF(Questions.easyQuestions[i].getQuestion());
            String userAnswer = in.readUTF();
            if (Questions.easyQuestions[i].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        for(int i=0;i<4;i++){
            out.writeUTF(Questions.mediumQuestions[i].getQuestion());
            String userAnswer = in.readUTF();
            if (Questions.mediumQuestions[i].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        for(int i=0;i<4;i++){
        out.writeUTF(Questions.hardQuestions[i].getQuestion());
        String userAnswer = in.readUTF();
        if (Questions.hardQuestions[i].getAnswer().equals(userAnswer)) {
            pontuacao++;
            out.writeUTF("Resposta correta");
        } else {
            out.writeUTF("Resposta errada");
        }}
        return pontuacao;
    }
    private static int veryhardquiz(DataInputStream in, DataOutputStream out) throws IOException {
        int pontuacao = 0;
        
        for(int i=0;i<4;i++){
            out.writeUTF(Questions.mediumQuestions[i].getQuestion());
            String userAnswer = in.readUTF();
            if (Questions.mediumQuestions[i].getAnswer().equals(userAnswer)) {
                pontuacao++;
                out.writeUTF("Resposta correta");
            } else {
                out.writeUTF("Resposta errada");
            }
        }
        for(int i=0;i<4;i++){
        out.writeUTF(Questions.hardQuestions[i].getQuestion());
        String userAnswer = in.readUTF();
        if (Questions.hardQuestions[i].getAnswer().equals(userAnswer)) {
            pontuacao++;
            out.writeUTF("Resposta correta");
        } else {
            out.writeUTF("Resposta errada");
        }}
        
    
        out.writeUTF(Questions.easyQuestions[0].getQuestion());
        String userAnswer = in.readUTF();
        if (Questions.easyQuestions[0].getAnswer().equals(userAnswer)) {
            pontuacao++;
            out.writeUTF("Resposta correta");
        } else {
            out.writeUTF("Resposta errada");
        }return pontuacao;}



}
