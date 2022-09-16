package sliding.window.technique;

import java.util.ArrayList;
import java.util.List;

public class PalindromicSubstrings {

    public static void main(String[] args) {
        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();
        palindromicSubstrings.findSubstrings("ABC");
    }

    public int findSubstrings(String aString) {
        int subsstrings = 0;
        int start = 0;
        List<Character> chars = new ArrayList<>();


        for(int i = 0; i<aString.length()+1; i++) {

            chars.add(aString.charAt(i));

            while (chars.size() > 1 && chars.get(i) != chars.get(start)) {
                chars.remove(start);
                start = start + 1;
            }

            subsstrings = subsstrings + 1;

        }
        return subsstrings;
    }
}
