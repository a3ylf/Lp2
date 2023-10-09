public class Questions {

    private final String difficulty;
    private final String answer;
    private final String question;
    public static Questions easyQuestions[] = new Questions[6];
    public static Questions hardQuestions[] = new Questions[6];
    public static Questions mediumQuestions[] = new Questions[4];

    public Questions(String difficulty, String answer, String question) {
        this.difficulty = difficulty;
        this.answer = answer;
        this.question = question;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getAnswer() {
        return answer;
    }

    static {
        easyQuestions[0] = new Questions("easy", "A", "Qual a primeira letra do alfabeto?");
        easyQuestions[1] = new Questions("easy", "2", "Quanto é 1+1?");
            easyQuestions[2] = new Questions("easy", "public", "Qual modificador de acesso de variável a torna pública?");
            easyQuestions[3] = new Questions("easy", "D", "Qual a quarta letra do alfabeto?");
            easyQuestions[4] = new Questions("easy", "2", "Quanto é 5-3?");
            easyQuestions[5] = new Questions("easy", "F", "Qual a sexta letra do alfabeto?");
            mediumQuestions[0] = new Questions("medium", "G", "Qual a sétima letra do alfabeto?");
            mediumQuestions[1] = new Questions("medium", "H", "Qual a oitava letra do alfabeto?");
            mediumQuestions[2] = new Questions("medium", "I", "Qual a nona letra do alfabeto?");
            mediumQuestions[3] = new Questions("medium", "J", "Qual a décima letra do alfabeto?");
            hardQuestions[0] = new Questions("hard", "L", "Qual a décima segunda letra do alfabeto?");
            hardQuestions[1] = new Questions("hard", "M", "Qual a décima terceira letra do alfabeto?");
            hardQuestions[2] = new Questions("hard", "N", "Qual a décima quarta letra do alfabeto?");
            hardQuestions[3] = new Questions("hard", "O", "Qual a décima quinta letra do alfabeto?");
            hardQuestions[4] = new Questions("hard", "P", "Qual a décima sexta letra do alfabeto?");
            hardQuestions[5] = new Questions("hard", "Q", "Qual a décima sétima letra do alfabeto?");
    }

    public String getQuestion() {
        return question;
    }}
    




