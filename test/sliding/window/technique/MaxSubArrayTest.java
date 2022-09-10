package sliding.window.technique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class MaxSubArrayTest {

    @ParameterizedTest
    @MethodSource("provideInputArrayAndLengthAndExpectedResult")
    void findMaxSubarray(int [] input, int k, int result) {
        var maxSubArray = new MaxSubArray();
        Assertions.assertEquals(result, maxSubArray.findMaxSubarray(input, k));
    }

    private static Stream<Arguments> provideInputArrayAndLengthAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{100, 200, 300, 400}, 2, 700),
                Arguments.of(new int[]{1, 4, 2, 10, 23, 3, 1, 0, 20}, 4, 39),
                Arguments.of(new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3, 16),
                Arguments.of(new int[]{1, 2, 3}, 1, 3),
                Arguments.of(new int[]{1, 2, 3, 4}, 2, 7));
    }
}