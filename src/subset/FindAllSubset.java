package subset;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubset {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> myList = new ArrayList<>();
        rec(nums, 0, new ArrayList<>(), myList);
        return myList;
    }

    private void rec(int [] nums, int i, List<Integer> subs, List<List<Integer>> answer) {
        if(i == nums.length) {
            answer.add(new ArrayList<>(subs));
            return;
        }

        rec(nums, i+1, subs, answer);
        subs.add(nums[i]);
        rec(nums, i+1, subs, answer);
        subs.remove(subs.size()-1);

    }
}
