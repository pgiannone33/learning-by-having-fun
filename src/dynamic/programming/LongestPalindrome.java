package dynamic.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        longestPalindrome.longestPalindrome("abccccdd");
    }

    public int max = Integer.MIN_VALUE;
    List<String> allSts = new ArrayList<>();

    public int longestPalindrome(String s) {
        List<Character> chars = new ArrayList<>();
        rec(s, 0, chars);

        return max;
    }

    public void rec(String s, int i, List<Character> characters) {

        if(i == s.length()) {
            allSts.add(characters.stream().map(String::valueOf).collect(Collectors.joining()));
            return;
        }

        characters.add(s.charAt(i));
        rec(s, i+1, characters);
        characters.remove(characters.size()-1);
        rec(s, i+1, characters);
    }


    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        return s.equals(stringBuilder.toString());
    }
}
