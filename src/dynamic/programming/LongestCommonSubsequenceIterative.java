package dynamic.programming;

import java.util.Arrays;

public class LongestCommonSubsequenceIterative {

    public int longestCommonSubsequence(String text1, String text2) {

        int memo [][] = new int[text1.length()+1][text2.length()+1];

        for(int i = 1; i<text1.length()+1; i++) {
            for(int j = 1; j<text2.length()+1; j++) {

                String txt1 = String.valueOf(text1.charAt(i-1));
                String txt2 = String.valueOf(text2.charAt(j-1));

                if(txt1.equals("") || txt2.equals("")) {
                    memo[i][j] = 0;
                } else {
                    if (txt1.equals(txt2)) {
                        memo[i][j] = (memo[i - 1][j-1]) + 1;
                    } else {
                        memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                        }
                    }
                }
            }

        return memo[text1.length()][text2.length()];

    }

}
