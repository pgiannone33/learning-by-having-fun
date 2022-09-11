package sliding.window.technique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

    @ParameterizedTest
    @MethodSource("provideInputArrayAndTargetAndExpectedResult")
    void minSubArrayLen(int [] input, int targetSum, int expectedResult) {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();
        Assertions.assertEquals(expectedResult, minimumSizeSubarraySum.minSubArrayLen(targetSum, input));
    }

    private static Stream<Arguments> provideInputArrayAndTargetAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{2,3,1,2,4,3}, 7, 2),
                Arguments.of(new int[]{1,4,4}, 4, 1),
                Arguments.of(new int[]{1,1,1,1,1,1,1,1}, 11, 0));
    }
}