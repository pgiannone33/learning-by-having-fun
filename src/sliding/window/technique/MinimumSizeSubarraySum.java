package sliding.window.technique;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int min = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for(int end = 0; end<nums.length; end++) {
            currentSum = currentSum + nums[end];

            while (currentSum >= target)  {
                min = Math.min(min, end-start+1);
                currentSum = currentSum - nums[start];
                start = start + 1;

            }
        }
        return Integer.MAX_VALUE == min ? 0 : min;
    }
}
