package sliding.window.technique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubarrayWithGivenSumTest {

    @ParameterizedTest
    @MethodSource("provideInputArrayAndLengthAndExpectedResult")
    void findMinSubarray(int [] arr, int sum, int result) {

        var smallestSubarrayWithGivenSum = new SmallestSubarrayWithGivenSum();
        Assertions.assertEquals(result, smallestSubarrayWithGivenSum.findMinSubarray(arr, sum));

    }


    private static Stream<Arguments> provideInputArrayAndLengthAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{100, 200, 300, 400}, 500, 2),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20, 3),
                Arguments.of(new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 1, 1),
                Arguments.of(new int[]{1, 2, 3}, 6, 3));
    }
}