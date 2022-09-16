package substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AllSubstringsOfAStringTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndSizeOfAllStrings")
    void find(String input, int targetSize) {
        AllSubstringsOfAString allSubstringsOfAString = new AllSubstringsOfAString();
        List<String> substringsList = new ArrayList<>();
        allSubstringsOfAString.find(input, 0, 1, substringsList);

        Assertions.assertEquals(targetSize, substringsList.size());
    }


    private static Stream<Arguments> provideInputStringAndSizeOfAllStrings() {
        return Stream.of(
                Arguments.of("A", 1),
                Arguments.of("WORD", 10),
                Arguments.of("PAOLO", 15),
                Arguments.of("ALESSANDRA", 55));
    }
}