package game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedResult")
    void remove(String input, String expectedResult) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates(input);
        Assertions.assertEquals(expectedResult, removeDuplicates.remove());
    }

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedResult")
    void remove_1(String input, String expectedResult) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates(input);
        Assertions.assertEquals(expectedResult, removeDuplicates.remove_1());
    }

    private static Stream<Arguments> provideInputStringAndExpectedResult() {
        return Stream.of(
                Arguments.of(null, ""),
                Arguments.of("", ""),
                Arguments.of("     ", ""),
                Arguments.of("AAAAAAAAAAAAAAAAAAAAA", "A"),
                Arguments.of("ABABABABABABABABBBABABABABA", "AB"),
                Arguments.of("*********!!!!!!!*****!!!!**?", "*!?"));
    }
}