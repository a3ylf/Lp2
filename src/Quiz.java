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
                1-facil (6 perguntas fáceis, 3 perguntas médias e 1 dificil)
                2-média (3 perguntas fáceis, 5 perguntas médias e 2 dificeis)
                3-dificil (2 perguntas fáceis, 4 perguntas médias e 4 dificeis)
                4-muito dificil (1 pergunta fácil, 3 perguntas médias e 6 dificil)
                """);

         do {
            userInput = in.readUTF();
            switch (userInput) {
                case "1" -> {
                    easyquiz();
                }

                case "2" -> {
                    mediumquiz();
                }

                case "3" -> {
                    hardquiz();
                }

                case "4" -> {
                    veryhardquiz();
                }


                default -> out.writeUTF("Escolha inválida");
            }
        } while (!userInput.equals("1") && !userInput.equals("2") && !userInput.equals("3") && userInput.equals("4"));
    }




    private static void easyquiz() {}
    private static void mediumquiz() {}
    private static void hardquiz() {}
    private static void veryhardquiz() {}



}
