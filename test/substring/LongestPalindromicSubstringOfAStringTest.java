package substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestPalindromicSubstringOfAStringTest {

    @ParameterizedTest
    @MethodSource("provideInputStringAndLongestSubstring")
    void find(String input, String targetLongestSub) {
        LongestPalindromicSubstringOfAString longestPalindromicSubstringOfAString = new LongestPalindromicSubstringOfAString("");
        Assertions.assertEquals(targetLongestSub, longestPalindromicSubstringOfAString.find(input));
    }

    @ParameterizedTest
    @MethodSource("provideInputStringAndLongestSubstring")
    void findNoRec(String input, String targetLongestSub) {
        LongestPalindromicSubstringOfAString longestPalindromicSubstringOfAString = new LongestPalindromicSubstringOfAString("");
        Assertions.assertEquals(targetLongestSub, longestPalindromicSubstringOfAString.findNoRec(input));
    }


    private static Stream<Arguments> provideInputStringAndLongestSubstring() {
        return Stream.of(
                Arguments.of("A", "A"),
                Arguments.of("ABABD", "ABA"),
                Arguments.of("AACABDKACAA", "ACA"),
                Arguments.of("FINDNITIANHERE", "INDNI"),
                Arguments.of("kztakrekvefgchersuoiuatzlmwynzjhdqqftjcqmntoyckqfawikkdrnfgbwtdpbkymvwoumurjdzygyzsbmwzpcxcdmmpwzmeibligwiiqbecxwyxigikoewwrczkanwwqukszsbjukzumzladrvjefpegyicsgctdvldetuegxwihdtitqrdmygdrsweahfrepdcudvyvrggbkthztxwicyzazjyeztytwiyybqdsczozvtegodacdokczfmwqfmyuixbeeqluqcqwxpyrkpfcdosttzooykpvdykfxulttvvwnzftndvhsvpgrgdzsvfxdtzztdiswgwxzvbpsjlizlfrlgvlnwbjwbujafjaedivvgnbgwcdbzbdbprqrflfhahsvlcekeyqueyxjfetkxpapbeejoxwxlgepmxzowldsmqllpzeymakcshfzkvyykwljeltutdmrhxcbzizihzinywggzjctzasvefcxmhnusdvlderconvaisaetcdldeveeemhugipfzbhrwidcjpfrumshbdofchpgcsbkvaexfmenpsuodatxjavoszcitjewflejjmsuvyuyrkumednsfkbgvbqxfphfqeqozcnabmtedffvzwbgbzbfydiyaevoqtfmzxaujdydtjftapkpdhnbmrylcibzuqqynvnsihmyxdcrfftkuoymzoxpnashaderlosnkxbhamkkxfhwjsyehkmblhppbyspmcwuoguptliashefdklokjpggfiixozsrlwmeksmzdcvipgkwxwynzsvxnqtchgwwadqybkguscfyrbyxudzrxacoplmcqcsmkraimfwbauvytkxdnglwfuvehpxd", "dtzztd"));
    }
}