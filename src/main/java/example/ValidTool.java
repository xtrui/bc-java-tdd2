package example;

import java.util.HashSet;

public class ValidTool {

    public static final int GUESS_NUMBER_LENGTH = 4;

    public static boolean isValid(String guess) {
        char[] guessNums = guess.toCharArray();

        boolean isValid = true;
        if (guessNums.length != GUESS_NUMBER_LENGTH) {
            isValid = false;
        } else {
            HashSet<Object> set = new HashSet<>();
            for (char guessNum : guessNums) {
                set.add(guessNum);
                if (!(guessNum >= '0' && guessNum <= '9')) {
                    return false;
                }
            }
            if (set.size() < GUESS_NUMBER_LENGTH) {
                isValid = false;
            }
        }
        return isValid;
    }
}
