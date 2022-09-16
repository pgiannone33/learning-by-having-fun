package substring;

import java.util.List;

public class AllSubstringsOfAString {

    public void find(String s, int start, int end, List<String> myList)  {
        if(start == s.length()) {
            return;
        }
        myList.add(s.substring(start, end));

        if(end == s.length()) {
            find(s, ++start, ++start, myList);
        } else {
            find(s, start, end+1, myList);
        }
    }
}
