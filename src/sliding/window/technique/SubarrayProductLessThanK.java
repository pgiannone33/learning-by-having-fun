package sliding.window.technique;

public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int currentProduct = 1;
        int start = 0;
        int subArrayNum = 0;

        for (int end = 0; end < nums.length; end++) {

            currentProduct = currentProduct * nums[end];

            while (end >= start && currentProduct >= k) {
                currentProduct = currentProduct / nums[start];
                start = start + 1;
            }

            subArrayNum = subArrayNum + end - start + 1;
        }

        return subArrayNum;
    }
}