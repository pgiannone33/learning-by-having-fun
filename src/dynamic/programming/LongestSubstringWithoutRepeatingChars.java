package dynamic.programming;

import java.util.Arrays;

/*****
 * Given a string s, find the length of the longest substring without repeating characters.
 * Take care to the difference between substring and subsequence!!!
 *
 ****/

public class LongestSubstringWithoutRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) {
            return 0;
        }


        int [] arr = new int[s.length()];
        Arrays.fill(arr, 1);

        int idx = 0;

        for(int j = 1; j<s.length(); j++) {
            int count = 1;
            for(int i = idx; i<j; i++) {

                if(s.charAt(j) == s.charAt(i)) {
                    if(j == i+1) {
                        idx = i + 1;
                    } else {
                        arr[j] = arr[j-1];
                    }
                    break;
                }

                count = count + 1;

                if(i + 1 == j) {
                    arr[j] = arr[i] + 1;
                }
            }
        }

        int max = 1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
