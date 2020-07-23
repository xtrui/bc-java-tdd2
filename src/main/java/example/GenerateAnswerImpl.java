package example;

import java.util.Random;

public class GenerateAnswerImpl implements GenerateAnswer {
    @Override
    public String generate() {
        return String.valueOf(new Random().nextInt(10) + 1) +
                (new Random().nextInt(10) + 1) +
                (new Random().nextInt(10) + 1) +
                (new Random().nextInt(10) + 1);
    }

}
