package strings;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public String removeDuplicate_1(String aStr) {
        Set<Character> s = new LinkedHashSet<>(); //Remember: linkedHashset is sorted while hashtable is not!!
        for(Character character : aStr.toCharArray()) {
            s.add(character);
        }

        return s.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public String removeDuplicate_2(String aStr) {

        String finalString = "";

        for(Character character : aStr.toCharArray()) {
            if(finalString.indexOf(character) == -1) {
                finalString = finalString + character;
            }
        }
        return finalString;
    }
}
