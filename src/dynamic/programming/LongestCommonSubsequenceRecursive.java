package dynamic.programming;

import java.util.Arrays;

public class LongestCommonSubsequenceRecursive {

    public int longestCommonSubsequence(String text1, String text2) {

        int [][] memo = new int[text2.length()+1][text1.length()+1];

        for(int [] row : memo) {
            Arrays.fill(row, -1);
        }

        lcs(text1, text2, memo);
        return memo[text2.length()] [text1.length()];

    }

    public int lcs(String s1, String s2, int [][] memo) {

        if(memo[s2.length()][s1.length()] != -1) {
            return memo[s2.length()][s1.length()];
        }

        if(s1.isEmpty() || s2.isEmpty()) {
            return 0;
        }

        Character c1 = s1.charAt(0);
        Character c2 = s2.charAt(0);

        if(c1.equals(c2)) {
            memo[s2.length()][s1.length()] = 1 + lcs(s1.substring(1), s2.substring(1), memo);
        } else {
            int case_1 = lcs(s1.substring(1), s2, memo);
            int case_2 = lcs(s1, s2.substring(1), memo);
            memo[s2.length()][s1.length()] = Math.max(case_1, case_2);
        }

        return  memo[s2.length()][s1.length()];
    }

}
