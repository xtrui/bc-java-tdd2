package example;

import java.util.HashSet;

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

    public boolean isValid(String guess) {
        char[] guessNums = guess.toCharArray();
        boolean isValid = true;
        if (guessNums.length != 4) {
            isValid = false;
        } else {
            HashSet<Object> set = new HashSet<>();
            for (char guessNum : guessNums) {
                set.add(guessNum);
            }
            if (set.size() < 4) {
                isValid = false;
            }
        }
        return isValid;
    }


    public String guess(String guess) {
        int correctNumberNum = 0;
        int correctLocationNum = 0;
        correctNumberNum = getCorrectNumberNum(guess);
        correctLocationNum = getCorrectLocationNum(guess);
        return correctLocationNum + "A" + (correctNumberNum - correctLocationNum) + "B";
    }

    public int getCorrectNumberNum(String guess) {
        String[] guessNums = guess.split("");
        int correctNumberNum = 0;
        for (String number : guessNums) {
            if (answer.contains(number)) {
                correctNumberNum++;
            }
        }
        return correctNumberNum;
    }

    public int getCorrectLocationNum(String guess) {
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
