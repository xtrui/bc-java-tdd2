package example;

public class GuessNumberGame {
    String answer;

    public GuessNumberGame(GenerateAnswer generateAnswer) {
        this.answer = generateAnswer.generate();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String guess(String guess) {
        String result;
        return guess;
    }
}
