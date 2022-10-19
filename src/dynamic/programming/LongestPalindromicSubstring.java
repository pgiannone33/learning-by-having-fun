package dynamic.programming;

public class LongestPalindromicSubstring {

    String lp = "";
    int max = Integer.MIN_VALUE;


    public String longestPalindrome(String s) {

        boolean [] [] matrix = new boolean[s.length()][s.length()];
        //[0],[0] - [1][1] - [2][2] - [3][3] ..... ecc ecc... are actually palindromic
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix.length; j++) {
                if(i == j) {
                    matrix[i] [j] = true;
                    String myStr = s.substring(i, j + 1);
                    if(max < myStr.length()) {
                        max = myStr.length();
                        lp = myStr;
                    }
                    break;
                }
            }
        }

        for(int i = 0; i<matrix.length; i++) {
            if(i+1 < matrix.length) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    matrix[i][i + 1] = true;
                    String myStr = s.substring(i, i + 2);
                    if(max < myStr.length()) {
                        max = myStr.length();
                        lp = myStr;
                    }
                }
            }
        }


        for(int column = 2; column<matrix.length; column++) {
            for(int row = 0; row<column+1; row++) {
                if(row+1<matrix.length && column>row && !matrix[row][column]) {
                    boolean prevVal = matrix[row + 1][column - 1];
                    if (!prevVal) {
                        matrix[row][column] = false;
                    } else {
                        if (s.charAt(row) == s.charAt(column)) {
                            matrix[row][column] = true;
                            String myStr = s.substring(row, column + 1);
                            if (max < myStr.length()) {
                                max = myStr.length();
                                lp = myStr;
                            }
                        }
                    }
                }
            }
        }

        return lp;
    }


}
