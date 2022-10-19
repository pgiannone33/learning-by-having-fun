package game;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    private final String originalString;

    public RemoveDuplicates(String originalString) {
        this.originalString = originalString;
    }

    public String remove_1() {
        if(originalString == null || originalString.isBlank()) {
            return "";
        }

        Set<Character> set = new LinkedHashSet<>();
        for(Character aChar : originalString.toCharArray()) {
            set.add(aChar);
        }
        return set.stream().map(String::valueOf).collect(Collectors.joining());
    }

    public String remove() {
        if(originalString == null || originalString.isBlank()) {
            return "";
        }

        var noDuplicatesString = "";
        var chars = originalString.toCharArray();

        for(Character aChar : chars) {
            if(!noDuplicatesString.contains(String.valueOf(aChar))) {
                noDuplicatesString = noDuplicatesString + aChar;
            }
        }

        return noDuplicatesString;
    }
}
