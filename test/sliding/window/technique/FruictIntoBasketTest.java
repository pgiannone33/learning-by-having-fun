package sliding.window.technique;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FruictIntoBasketTest {

    @ParameterizedTest
    @MethodSource("provideInputArrayAndExpectedResult")
    void totalFruit(int [] inputArr, int expectedResult) {
        var fruitIntoBasket = new FruitIntoBasket();
        Assertions.assertEquals(expectedResult, fruitIntoBasket.totalFruit(inputArr));
    }

    private static Stream<Arguments> provideInputArrayAndExpectedResult() {
        return Stream.of(
                Arguments.of(new int[]{1,2,1}, 3),
                Arguments.of(new int[]{0,1,2,2}, 3),
                Arguments.of(new int[]{1,2,3,2,2}, 4),
                Arguments.of(new int[]{0,1,6,6,4,4,6}, 5),
                Arguments.of(new int[]{3,3,3,1,2,1,1,2,3,3,4}, 5));
    }
}