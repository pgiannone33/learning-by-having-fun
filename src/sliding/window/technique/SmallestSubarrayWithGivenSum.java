package sliding.window.technique;

public class SmallestSubarrayWithGivenSum {

    public int findMinSubarray(int [] arr, int targetSum) {
        int minVal = Integer.MAX_VALUE;
        int currentSum = 0;
        int start = 0;

        for(int end = 0; end<arr.length; end++) {
            currentSum = currentSum + arr[end];

            while (currentSum >= targetSum) {
                currentSum = currentSum - arr[start];
                minVal = Math.min(minVal, end-start+1);
                start = start + 1;
            }
        }

        return minVal;
    }
}
