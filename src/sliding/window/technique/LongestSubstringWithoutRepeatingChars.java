package sliding.window.technique;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {

    int lengthOfLongestSubstring(String aString) {
        if(aString == null || aString.isEmpty()) return 0;

        Set<Character> chars = new HashSet<>();
        int start = 0;
        int max = Integer.MIN_VALUE;

        for(int end = 0; end<aString.length(); end++) {
            var actualChar = aString.charAt(end);


            while (chars.contains(actualChar)) {
                chars.remove(aString.charAt(start));
                start = start + 1;
            }

            chars.add(actualChar);
            max = Math.max(max, end-start+1);
        }

        return max;
    }
}
