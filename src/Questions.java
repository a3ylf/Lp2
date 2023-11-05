public record Questions(String difficulty, String answer, String question) {
    public static Questions[] easyQuestions = new Questions[10];
    public static Questions[] hardQuestions = new Questions[10];
    public static Questions[] mediumQuestions = new Questions[10];


    static {
        easyQuestions[0] = new Questions("easy", "A", "Qual a primeira letra do alfabeto?");
        easyQuestions[1] = new Questions("easy", "2", "Quanto é 1+1?");
        easyQuestions[2] = new Questions("easy", "public", "Qual modificador de acesso de variável a torna pública?");
        easyQuestions[3] = new Questions("easy", "6", "Quanto é 2 x 3?");
        easyQuestions[4] = new Questions("easy", "2", "Quanto é 5-3?");
        easyQuestions[5] = new Questions("easy", "F", "Qual a sexta letra do alfabeto?");
        easyQuestions[6] = new Questions("easy", "G", "Qual a sétima letra do alfabeto?");
        easyQuestions[7] = new Questions("easy", "H", "Qual a oitava letra do alfabeto?");
        easyQuestions[8] = new Questions("easy", "I", "Qual a nona letra do alfabeto?");
        easyQuestions[9] = new Questions("easy", "J", "Qual a décima letra do alfabeto?");
        mediumQuestions[0] = new Questions("medium", "K", "Qual a décima primeira letra do alfabeto?");
        mediumQuestions[1] = new Questions("medium", "L", "Qual a décima segunda letra do alfabeto?");
        mediumQuestions[2] = new Questions("medium", "M", "Qual a décima terceira letra do alfabeto?");
        mediumQuestions[3] = new Questions("medium", "N", "Qual a décima quarta letra do alfabeto?");
        mediumQuestions[4] = new Questions("medium", "O", "Qual a décima quinta letra do alfabeto?");
        mediumQuestions[5] = new Questions("medium", "P", "Qual a décima sexta letra do alfabeto?");
        mediumQuestions[6] = new Questions("medium", "Q", "Qual a décima sétima letra do alfabeto?");
        mediumQuestions[7] = new Questions("medium", "R", "Qual a décima oitava letra do alfabeto?");
        mediumQuestions[8] = new Questions("medium", "S", "Qual a décima nona letra do alfabeto?");
        mediumQuestions[9] = new Questions("medium", "T", "Qual a vigésima letra do alfabeto?");
        hardQuestions[0] = new Questions("hard", "U", "Qual a vigésima primeira letra do alfabeto?");
        hardQuestions[1] = new Questions("hard", "V", "Qual a vigésima segunda letra do alfabeto?");
        hardQuestions[2] = new Questions("hard", "W", "Qual a vigésima terceira letra do alfabeto?");
        hardQuestions[3] = new Questions("hard", "X", "Qual a vigésima quarta letra do alfabeto?");
        hardQuestions[4] = new Questions("hard", "Y", "Qual a vigésima quinta letra do alfabeto?");
        hardQuestions[5] = new Questions("hard", "Z", "Qual a vigésima sexta letra do alfabeto?");
        hardQuestions[6] = new Questions("hard", "A", "Qual a primeira letra do alfabeto?");
        hardQuestions[7] = new Questions("hard", "B", "Qual a segunda letra do alfabeto?");
        hardQuestions[8] = new Questions("hard", "C", "Qual a terceira letra do alfabeto?");
        hardQuestions[9] = new Questions("hard", "D", "Qual a quarta letra do alfabeto?");
    }

    public static void main(String[] args) {

    }
}