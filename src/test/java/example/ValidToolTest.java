package example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ValidToolTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    void should_return_right_boolean_when_isValid_given_right_or_wrong_guess() {
        assertFalse(ValidTool.isValid("1123"));
        assertFalse(ValidTool.isValid("11234"));
        assertFalse(ValidTool.isValid("142A"));
        assertTrue(ValidTool.isValid("1356"));
    }

}
