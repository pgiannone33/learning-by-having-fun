package substring;

public class LongestPalindromicSubstringOfAString {

    private int max;
    private String longestString;

    public LongestPalindromicSubstringOfAString(String longestString) {
        this.max = Integer.MIN_VALUE;
        this.longestString = longestString;
    }

    public String findNoRec(String s) {

        for(int start = 0; start<s.length(); start++) {
            for(int end = start+1; end<=s.length(); end++) {

                String aSbs = s.substring(start, end);
                if(isPalindrome(aSbs) && max < aSbs.length()) {
                    max = aSbs.length();
                    longestString = aSbs;
                }
            }
        }

        return longestString;
    }

    public String find(String s) {
        rec(s, 0, 1);
        return longestString;
    }

    public void rec(String s, int start, int end) {
        if(start == s.length()) {
            return;
        }

        String aSbs = s.substring(start, end);
        if(isPalindrome(aSbs) && max < aSbs.length()) {
            max = aSbs.length();
            longestString = aSbs;
        }

        if(end == s.length()) {
            rec(s, ++start, ++start);
        } else {
            rec(s, start, end + 1);
        }

    }

    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        return s.equals(stringBuilder.toString());
    }
}
