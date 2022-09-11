package sliding.window.technique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarray1Test {

    @ParameterizedTest
    @MethodSource("provideInputArrayAndLengthAndExpectedResult")
    void findMaxAverage(int [] arr, int k, double result) {
        MaximumAverageSubarray1 maximumAverageSubarray1 = new MaximumAverageSubarray1();
        Assertions.assertEquals(result, maximumAverageSubarray1.findMaxAverage(arr, k));
    }

    private static Stream<Arguments> provideInputArrayAndLengthAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{-1}, 1, -1),
                Arguments.of(new int[]{1,12, -5, -6, 50, 3}, 4, 12.75),
                Arguments.of(new int[]{5}, 1, 5));
    }
}