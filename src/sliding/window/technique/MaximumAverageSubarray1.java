package sliding.window.technique;

public class MaximumAverageSubarray1 {

    public double findMaxAverage(int[] nums, int k) {
        double max = -Double.MAX_VALUE;
        double runningSum = 0.0;
        double runningAverage = 0.0;
        int start = 0;

        for(int end = 0; end<nums.length; end++) {
            runningSum = runningSum + nums[end];

            if(end - start + 1 == k) {
                runningAverage = runningSum / k;
                max = Math.max(max, runningAverage);

                runningSum = runningSum - nums[start];
                start = start + 1;
            }
        }
        return max;
    }

}
