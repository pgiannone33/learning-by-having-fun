/*
package sliding.window.technique;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPalindromicSubstring {

    public int max = Integer.MIN_VALUE;
    public String longestSubs = "";

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        longestPalindromicSubstring.longestPalindrome("FINDNITIANHERE");
    }

    public String longestPalindrome(String s) {
        pal(s, 0);
        System.out.println(longestSubs);
        return longestSubs;
    }

    void pal(String s, int i) {
        int start = 0;
        for(int end = 1; end<s.length(); end++) {

        }


    public boolean isPalindrome (String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        return s.equals(stringBuilder.toString());
    }
}
*/