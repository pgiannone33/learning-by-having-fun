package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class RemoveDuplicatesTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedString")
    void removeDuplicate_1(String inputString, String expectedString) {
        var outcome = new RemoveDuplicates().removeDuplicate_1(inputString);
        Assertions.assertEquals(expectedString, outcome);

    }

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedString")
    void removeDuplicate_2(String inputString, String expectedString) {
        var outcome = new RemoveDuplicates().removeDuplicate_2(inputString);
        Assertions.assertEquals(expectedString, outcome);
    }


    private static Stream<Arguments> provideInputStringAndExpectedString() {
        return Stream.of(
                Arguments.of("AAAAAA", "A"),
                Arguments.of("AAABBBCCCDDD", "ABCD"),
                Arguments.of("BBBBCCCCDDDDDDDDDUUUUU(((((", "BCDU("),
                Arguments.of("AAAAAHHHQQQ111", "AHQ1"),
                Arguments.of("PAOLO", "PAOL"));
    }
}