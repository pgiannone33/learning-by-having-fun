package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubsequenceTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndExpectedResult")
    void longestPalindromeSubseq(String string, int expected) {
        LongestPalindromicSubsequence l = new LongestPalindromicSubsequence();
        Assertions.assertEquals(expected, l.longestPalindromeSubseq(string));
    }


    private static Stream<Arguments> provideInputStringAndExpectedResult() {
        return Stream.of(
                Arguments.of("BBBAB", 4),
                Arguments.of("aaaaaaaaaaaaaaaaaaaaa", 21),
                Arguments.of("cbbd", 2));
    }
}