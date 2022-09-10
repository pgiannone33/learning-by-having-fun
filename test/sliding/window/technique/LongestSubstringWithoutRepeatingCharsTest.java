package sliding.window.technique;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharsTest {

    private LongestSubstringWithoutRepeatingChars longestSubstringWithoutRepeatingCharsUnderTest;

    @BeforeEach
    void setUp() {
        longestSubstringWithoutRepeatingCharsUnderTest = new LongestSubstringWithoutRepeatingChars();
    }

    @Test
    void testLengthOfLongestSubstring() {
        assertEquals(7, longestSubstringWithoutRepeatingCharsUnderTest.lengthOfLongestSubstring("aString"));
    }
}
