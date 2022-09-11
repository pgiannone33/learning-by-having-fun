package dynamic.programming;

public class ClimbStairs {

    public static void main(String[] args) {
        ClimbStairs climbStairs = new ClimbStairs();
        System.out.println(climbStairs.climbStairs(1));
    }

    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;

        int [] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for(int i = 2; i<n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr[n-1];
    }
}
