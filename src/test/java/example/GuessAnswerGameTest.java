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

    @Test
    void should_return_2A2B_when_guess_given_1243() {
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        given(generateAnswer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(generateAnswer);
        assertEquals("2A2B", guessNumberGame.guess("1243"));
    }

    @Test
    void should_return_0A4B_when_guess_given_4321() {
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        given(generateAnswer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(generateAnswer);
        assertEquals("0A4B", guessNumberGame.guess("4321"));
    }

}
