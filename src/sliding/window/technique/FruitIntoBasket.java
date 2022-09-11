package sliding.window.technique;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {

    public int totalFruit(int[] fruits) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> integers = new HashMap<>();
        int start = 0;

        for (int end = 0; end < fruits.length; end++) {
            int aNum = fruits[end];
            integers.put(aNum, integers.get(aNum) != null ? integers.get(aNum) + 1 : 1);

            while (integers.size() > 2) {
                if(integers.get(fruits[start]) == 1) {
                    integers.remove(fruits[start]);
                } else {
                    integers.put(fruits[start], integers.get(fruits[start]) - 1);
                }
                start = start + 1;
            }

            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
