package dynamic.programming;

import java.util.Arrays;

public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        return lcs(s, s1);
    }


    public int lcs(String s1, String s2) {

        int memo [][] = new int[s1.length()+1][s1.length()+1];

        for(int i = 1; i<s1.length()+1; i++) {
            for(int j = 1; j<s2.length()+1; j++) {

                char charxx = s1.charAt(i-1);
                char charyy = s2.charAt(j-1);

                if(charxx == charyy) {
                    memo[i][j] = 1 + memo[i-1][j-1];
                } else {
                    int val_1 = memo[i] [j-1];
                    int val_2 = memo[i-1][j];
                    memo[i][j] = Math.max(val_1, val_2);
                }
            }
        }

        return memo[s1.length()] [s2.length()];
    }


/*
    public int lcs(String s1, String s2, int [][] memo) {

        if(memo[s1.length()][s2.length()] != -1) {
            return memo[s1.length()][s2.length()];
        }

        if(s1.equals("") || s2.equals("")) {
            return 0;
        }

        String ssx = s1.substring(0, 1);
        String ssy = s2.substring(0,1);

        if(ssx.equals(ssy)) {
            memo[s1.length()][s2.length()] = 1 + lcs(s1.substring(1), s2.substring(1), memo);
        } else {
            int case_1 = lcs(s1.substring(1), s2, memo);
            int case_2 = lcs(s1, s2.substring(1), memo);
            memo[s1.length()][s2.length()] = Math.max(case_1, case_2);
        }

        return memo[s1.length()][s2.length()];
    }
    */
}
