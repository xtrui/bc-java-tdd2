package example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class GenerateAnswerImpl implements GenerateAnswer {
    @Override
    public String generate() {
        String answer = String.valueOf(new Random().nextInt(10) + 1) +
                (new Random().nextInt(10) + 1) +
                (new Random().nextInt(10) + 1) +
                (new Random().nextInt(10) + 1);
        HashSet<String> answerSet = new HashSet<String>(Arrays.asList(answer.split("")));
        while (answerSet.size() < 4) {
            answerSet.add(String.valueOf(new Random().nextInt(10) + 1));
        }
        return String.join("", answerSet);

    }

}
