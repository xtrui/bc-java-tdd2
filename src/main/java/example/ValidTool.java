package example;

import java.util.HashSet;

public class ValidTool {
    public static boolean isValid(String guess) {
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
}
