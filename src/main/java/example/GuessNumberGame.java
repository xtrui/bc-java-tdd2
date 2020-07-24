package example;

public class GuessNumberGame {
    private String answer;

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
        int correctNumberNum = 0;
        int correctLocationNum = 0;
        correctNumberNum = getCorrectNumberNum(guess);
        correctLocationNum = getCorrectLocationNum(guess);
        return correctLocationNum + "A" + (correctNumberNum - correctLocationNum) + "B";
    }

    private int getCorrectNumberNum(String guess) {
        String[] guessNums = guess.split("");
        int correctNumberNum = 0;
        for (String number : guessNums) {
            if (answer.contains(number)) {
                correctNumberNum++;
            }
        }
        return correctNumberNum;
    }

    private int getCorrectLocationNum(String guess) {
        int correctLocationNum = 0;
        char[] chars = guess.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == answer.charAt(i)) {
                correctLocationNum++;
            }
        }
        return correctLocationNum;
    }
}
