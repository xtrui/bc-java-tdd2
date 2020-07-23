package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessAnswerGameTest {

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    void should_return_4A0B_when_guess_given_1234() {
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        given(generateAnswer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(generateAnswer);
        assertEquals("4A0B", guessNumberGame.guess("1234"));
    }

}