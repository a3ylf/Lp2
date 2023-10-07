public class Questions {

    private final String difficulty;
    private final String answer;
    private final String question;

    public Questions(String difficulty,String answer, String question){
       this.difficulty = difficulty; this.answer = answer; this.question = question;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }


}


