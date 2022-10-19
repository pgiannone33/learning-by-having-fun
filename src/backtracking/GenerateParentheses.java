package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        GenerateParentheses fg = new GenerateParentheses();
        fg.generateParenthesis(2);
    }

    List<String> toReturn = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        rec("", n, 0, 0);
        return toReturn;
    }

    public void rec(String charsString, int n, int openCount, int closeCount) {

        if(openCount == n && closeCount == n) {
            toReturn.add(charsString);
        }

        if (closeCount < openCount) {
                rec(charsString + ")", n, openCount, closeCount+1);

        }

        if (openCount < n) {
                rec(charsString + "(", n, openCount+1, closeCount);
        }
    }
}
