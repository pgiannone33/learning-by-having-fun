package dynamic.programming;

import java.util.Arrays;

public class FinonacciSequence {

    public static void main(String[] args) {
        FinonacciSequence f = new FinonacciSequence();
        f.fibRecursive(10, new int[]{});
    }

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

    public int fibRecursive(int n, int [] arr) {
        if(arr.length == 0) {
            arr = new int[n+1];
            Arrays.fill(arr, -1);
        }

        if(n == 1) return 1;
        if(n == 2) return 1;

        if(arr[n] != -1) {
            return arr[n];
        }

        arr[n] = fibRecursive(n-1, arr) + fibRecursive(n-2, arr);
        return arr[n];
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
