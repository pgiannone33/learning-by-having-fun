package dynamic.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FinonacciSequenceTest {

    @ParameterizedTest
    @MethodSource("provideInputAndExpectedResultForBruteForce")
    void fibBruteForce(int n, int expectedResult) {
        var finonacciSequence = new FinonacciSequence();
        Assertions.assertEquals(expectedResult, finonacciSequence.fibBruteForce(n));
    }

    @ParameterizedTest
    @MethodSource("provideInputAndExpectedResultForDynamicProgramming")
    void fib(int n, int expectedResult) {
        var finonacciSequence = new FinonacciSequence();
        Assertions.assertEquals(expectedResult, finonacciSequence.fib(n));
    }



    private static Stream<Arguments> provideInputAndExpectedResultForBruteForce() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(5, 5),
                Arguments.of(10, 55));
    }

    private static Stream<Arguments> provideInputAndExpectedResultForDynamicProgramming() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(5, 5),
                Arguments.of(10, 55),
                Arguments.of(16, 987),
                Arguments.of(20, 6765),
                Arguments.of(28, 317811),
                Arguments.of(27, 196418),
                Arguments.of(26, 121393),
                Arguments.of(25, 75025));
    }
}