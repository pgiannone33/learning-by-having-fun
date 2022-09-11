package dynamic.programming;

import java.util.Arrays;

public class FinonacciSequence {

    public int fibBruteForce(int n) {
        if(n == 0 ) return 0;
        if(n == 1 || n == 2) {
            return 1;
        }
        int val = 0;
        for(int i = 0; i<n; i++) {
            val = fibBruteForce(n - 1) + fibBruteForce(n - 2);
        }

        return val;

    }

    public int fib(int n) {
        int [] arr = new int[n];
        Arrays.fill(arr, 1);

        for(int end = 2; end<n; end++) {
            arr[end] = arr[end-1] + arr[end-2];
        }

        return arr[n-1];
    }
}
