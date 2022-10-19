package backtracking;

import backtracking.GenerateParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class GenerateParenthesesTest {

    @ParameterizedTest
    @MethodSource("provideInputAndExpectedResult")
    void generateParenthesis(int input, List<String> expectedOutput) {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> result = generateParentheses.generateParenthesis(input);
        Assertions.assertTrue(result.containsAll(expectedOutput));
    }


    private static Stream<Arguments> provideInputAndExpectedResult() {
        return Stream.of(
                Arguments.of(4, List.of("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()")),
                Arguments.of(0, List.of()),
                Arguments.of(1, List.of("()")),
                Arguments.of(2, List.of("()()", "(())")),
                Arguments.of(3, List.of("((()))","(()())","(())()","()(())","()()()")));
    }
}