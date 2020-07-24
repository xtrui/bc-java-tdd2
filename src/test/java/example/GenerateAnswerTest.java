package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateAnswerTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    void should_return_4_when_generate() {
        GenerateAnswerImpl generateAnswer = new GenerateAnswerImpl();
        assertEquals(4, generateAnswer.generate().length());
    }
}
