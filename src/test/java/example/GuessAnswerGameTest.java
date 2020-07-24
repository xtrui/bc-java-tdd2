package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessAnswerGameTest {
    private GuessNumberGame guessNumberGame;

    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
        GenerateAnswer generateAnswer = Mockito.mock(GenerateAnswer.class);
        given(generateAnswer.generate()).willReturn("1234");
        this.guessNumberGame = new GuessNumberGame(generateAnswer);
    }

    @Test
    void should_return_4A0B_when_guess_given_1234() {


        assertEquals("4A0B", guessNumberGame.guess("1234"));
    }

    @Test
    void should_return_2A2B_when_guess_given_1243() {
        assertEquals("2A2B", guessNumberGame.guess("1243"));
    }

    @Test
    void should_return_0A4B_when_guess_given_4321() {
        assertEquals("0A4B", guessNumberGame.guess("4321"));
    }

    @Test
    void should_return_2A1B_when_guess_given_1235() {
        assertEquals("2A1B", guessNumberGame.guess("1253"));
    }

    @Test
    void should_return_0A2B_when_guess_given_3456() {
        assertEquals("0A2B", guessNumberGame.guess("3456"));
    }

    @Test
    void should_return_0A0B_when_guess_given_5678() {
        assertEquals("0A0B", guessNumberGame.guess("5678"));
    }


}
