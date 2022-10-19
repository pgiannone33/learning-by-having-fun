package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestCommonSubsequenceTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedResult")
    void longestCommonSubsequence(String s1, String s2, int expectedResult) {

        LongestCommonSubsequenceRecursive longestCommonSubsequence = new LongestCommonSubsequenceRecursive();
        Assertions.assertEquals(expectedResult, longestCommonSubsequence.longestCommonSubsequence(s1, s2));

    }

    private static Stream<Arguments> provideInputStringAndExpectedResult() {
        return Stream.of(
                Arguments.of("bsbininm", "jmjkbkjkv", 1),
                Arguments.of("abcde", "ace", 3),
                Arguments.of("abc", "abc", 3),
                Arguments.of("abc", "def", 0),
                Arguments.of("pmjghexybyrgzczy", "hafcdqbgncrcbihkd", 4));
    }
}