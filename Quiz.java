import java.io.*;
import java.util.Random;


public class Quiz {

    public static void quiz(DataInputStream in, DataOutputStream out) throws IOException {



        String userInput;
        mode.write(out);
        out.writeUTF("""
                Porfavor escolha a dificuldade:
                1-facil (6 perguntas fáceis, 3 perguntas médias e 1 dificil)
                2-média (3 perguntas fáceis, 4 perguntas médias e 3 dificeis)
                3-dificil (2 perguntas fáceis, 3 perguntas médias e 5 dificeis)
                4-muito dificil (1 pergunta fácil, 2 perguntas médias e 7 dificeis)
                """);

        do {
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> quiz(6,3,1,in,out);
                case "2" -> quiz(3,4,3,in,out);
                case "3" -> quiz(2,3,5,in,out);
                case "4" -> quiz(1,2,7,in,out);
                default -> {
                    mode.write(out);
                    out.writeUTF("Escolha inválida");
                }
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && !userInput.equals("4"));

    }
   private static int[] genRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        int counter = 0;

        for (int i = 0; i < size; i++) {
            int value;
            boolean contains;

            do {
                value = random.nextInt(10);
                contains = false;

                for (int j = 0; j < i; j++) {
                    if (array[j] == value) {
                        contains = true;
                        break;
                    }
                }
            } while (contains);

            array[i] = value;
            counter++;
        }
        return array;
    }
    private static int[] concatenate(int[]easy,int[]medium,int[]hard){
        int[] quests = new int[10];
        int index = 0;
        for (int value : easy) {
            quests[index] = value;
            index++;
        }
        for (int value : medium) {
            quests[index] = value;
            index++;
        }
        for (int value : hard) {
            quests[index] = value;
            index++;
        }
        return quests;
    }


    private static void quiz(int easysize,int mediumsize, int hardsize,DataInputStream in, DataOutputStream out) throws IOException {
        int[] easy = genRandomArray(easysize);
        int[] medium = genRandomArray(mediumsize);
        int[] hard = genRandomArray(hardsize);
        int easypont = 0;
        int medpont = 0;
        int hardpont = 0;
        int total = 0 ;
        String fromuser;
        for(int i = 0; i < easysize; i++){
            mode.write(out);
            out.writeUTF(Questions.easyQuestions[easy[i]].question());
            out.flush();
            fromuser = in.readUTF();
            while (fromuser.isEmpty()){
                mode.write(out);
                out.writeUTF("");
                fromuser = in.readUTF();
            }
            if(Questions.easyQuestions[easy[i]].answer().equalsIgnoreCase(fromuser)){
                easypont++;
                total = total + 20;
                mode.read(out);
                out.writeUTF("A resposta " + fromuser.toUpperCase() + " está correta!  \nPontos:" + total );
            }
            else {
                mode.read(out);
                out.writeUTF("A resposta " + fromuser.toUpperCase() + " está errada!  \nPontos:" + total);
            }
        }
        for(int i = 0; i < mediumsize; i++) {
            mode.write(out);
            out.writeUTF(Questions.mediumQuestions[medium[i]].question());
            out.flush();
            fromuser = in.readUTF();
            while (fromuser.isEmpty()){
                mode.write(out);
                out.writeUTF("");
                fromuser = in.readUTF();
            }
            if (Questions.mediumQuestions[medium[i]].answer().equalsIgnoreCase(fromuser)) {
                medpont++;
                total = total + 50;
                mode.read(out);
                out.writeUTF("A resposta " + fromuser.toUpperCase() + " está correta!  \nPontos:" + total);
            } else {
                mode.read(out);
                out.writeUTF("A resposta " + fromuser.toUpperCase() + " está errada!  \nPontos:" + total);
            }
        }
        for(int i = 0; i < hardsize; i++){
            mode.write(out);
            out.writeUTF(Questions.hardQuestions[hard[i]].question());
            out.flush();
            fromuser = in.readUTF();
            while (fromuser.isEmpty()){
                mode.write(out);
                out.writeUTF("");
                fromuser = in.readUTF();
            }
            if(Questions.hardQuestions[hard[i]].answer().equalsIgnoreCase(fromuser)){
                hardpont++;
                total = total + 50;
                mode.read(out);
                out.writeUTF("A resposta " + fromuser.toUpperCase() + " está correta!  \nPontos:" + total );
            }
            else {
                mode.read(out);
                out.writeUTF("A resposta " + fromuser.toUpperCase() + " está errada!  \nPontos:" + total);
            }

        }
        mode.read(out);
        out.writeUTF("Você conseguiu: " + total + " pontos");
    }

}
