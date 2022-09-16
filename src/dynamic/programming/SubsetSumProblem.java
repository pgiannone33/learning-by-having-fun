package dynamic.programming;

public class SubsetSumProblem {

    public static void main(String[] args) {
        SubsetSumProblem subsetSumProblem = new SubsetSumProblem();
        System.out.println(subsetSumProblem.isPresent(new int[] {7,3,2,5,8}, 7));
    }

    public boolean isPresent(int [] arr, int targetSum) {

        int arrIdx = 0;
        boolean [][] matrix = new boolean[arr.length+1][targetSum+1];
        for (int i = 0; i <= arr.length; i++) matrix[i][0] = true;

        for(int i = 1; i<=arr.length; i++) {
            for(int j = 1; j<=targetSum; j++) {

                if(j-arr[arrIdx] < 0) {
                    matrix[i][j] = matrix[i-1][j];
                } else {
                    matrix[i][j] = matrix[i - 1][j] || matrix[i - 1][j - arr[arrIdx]];
                }
            }
            arrIdx = arrIdx + 1;
        }

        return matrix[arr.length][targetSum];
    }
}
