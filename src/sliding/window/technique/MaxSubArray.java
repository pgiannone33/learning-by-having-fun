package sliding.window.technique;

public class MaxSubArray {

    public int findMaxSubarray(int [] arr, int k){
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for(int i = 0; i<arr.length; i++){
            currentRunningSum = currentRunningSum + arr[i];
            if(i >= k-1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum = currentRunningSum - arr[i - ( k - 1 )];
            }
        }
        return maxValue;
    }
}
