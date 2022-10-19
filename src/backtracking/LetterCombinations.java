package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LetterCombinations {
    List<String> result = new ArrayList<>();

    private final static String[] digitsToChars = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> find(String digits) {
        if(digits == null || digits.isBlank()) {
            return Collections.emptyList();
        }

        var chars = digits.toCharArray();
        List<String> letters = new ArrayList<>();

        for (char aChar : chars) {
            letters.add(digitsToChars[aChar - '0']);
        }

        backtracking(letters, "", 0);
        return result;
    }

    public void backtracking(List<String> letters, String charsString, int pos) {

        if(letters.size() == pos) {
            result.add(charsString);
        } else {
            var firstEl = letters.get(pos);

            backtracking(letters, charsString + firstEl.charAt(0), pos+1);
            backtracking(letters, charsString + firstEl.charAt(1), pos + 1);
            backtracking(letters, charsString + firstEl.charAt(2), pos + 1);
            if(firstEl.length()>3) {
                backtracking(letters, charsString + firstEl.charAt(3), pos+1);
            }

        }

    }

}
