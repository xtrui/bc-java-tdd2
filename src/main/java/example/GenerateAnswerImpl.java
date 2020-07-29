package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateAnswerImpl implements GenerateAnswer {

    public static final int ANSWER_LENGTH = 4;

    @Override
    public String generate() {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> answers = Arrays.asList(integers);
        List<String> answerStr = answers.stream().map(answer -> "" + answer).collect(Collectors.toList());

        Collections.shuffle(answerStr);
        return String.join("", answerStr.subList(0, 4));
    }

}
