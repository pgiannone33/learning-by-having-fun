package sliding.window.technique;
public class LongestPalindromicSubstring {

    public int max = Integer.MIN_VALUE;
    public String longestSubs = "";

    public String find(String aString) {

        for(int i = 0; i<aString.length(); i++) {
            int start = i;
            int end = i;

            while (start>= 0 && end<aString.length() && aString.charAt(start) == aString.charAt(end)) {
                String myStr = aString.substring(start, end+1);
                if(myStr.length() > max) {
                    max = myStr.length();
                    longestSubs = myStr;
                }
                start = start - 1;
                end = end + 1;
            }
        }

        for(int i = 0; i<aString.length(); i++) {
            int start = i;
            int end = i+1;

            while (start>= 0 && end<aString.length() && aString.charAt(start) == aString.charAt(end)) {
                String myStr = aString.substring(start, end+1);
                if(myStr.length() > max) {
                    max = myStr.length();
                    longestSubs = myStr;
                }
                start = start - 1;
                end = end + 1;
            }
        }

        return longestSubs;
    }
}
