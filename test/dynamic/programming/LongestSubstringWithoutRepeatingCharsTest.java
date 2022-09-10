package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestSubstringWithoutRepeatingCharsTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedResult")
    void lengthOfLongestSubstring_shouldReturnTheParametrizedTestResult(String inputString, int expectedLength) {
        var longestSubstringWithoutRepeatingChars = new LongestSubstringWithoutRepeatingChars();
        var length = longestSubstringWithoutRepeatingChars.lengthOfLongestSubstring(inputString);
        Assertions.assertEquals(expectedLength, length);
    }


    private static Stream<Arguments> provideInputStringAndExpectedResult() {
        return Stream.of(
                Arguments.of("dvdf", 3),
                Arguments.of("", 0),
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3));
    }
}