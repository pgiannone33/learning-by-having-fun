package dynamic.programming;

public class SubsetSumZero {

    public static void main(String[] args) {
        SubsetSumZero subsetSumZero = new SubsetSumZero();
        System.out.println(subsetSumZero.countSubset(new int[]{2, 2, 2, -4, -4}));
    }

    public int countSubset(int arr[]) {

        int [] subs = new int[arr.length + 1];
        subs[0] = 1;

        int arrIdx = 0;
        int currentSum = 0;

        for(int i = 1; i<=arr.length; i++) {
            currentSum = currentSum + arr[arrIdx];
            if(currentSum == 0) {
                subs[i] = subs[i - 1] + 1;
            } else {
                subs[i] = subs[i-1];
            }
            arrIdx = arrIdx + 1;
        }

        return subs[arr.length];

    }
}
