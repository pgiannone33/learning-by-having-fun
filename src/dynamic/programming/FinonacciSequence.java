package dynamic.programming;

import java.util.Arrays;

public class FinonacciSequence {

    public static void main(String[] args) {
        FinonacciSequence finonacciSequence = new FinonacciSequence();
        System.out.println(finonacciSequence.findN(500000000));
        //System.out.println(finonacciSequence.fib(12));
    }

    public int fib(int n) {
        if(n == 0 ) return 0;
        if(n == 1 || n == 2) {
            return 1;
        }
        int val = 0;
        for(int i = 0; i<n; i++) {
            val = fib(n - 1) + fib(n - 2);
        }

        return val;

    }

    public int findN(int n) {
        int [] arr = new int[n];
        Arrays.fill(arr, 1);

        for(int end = 2; end<n; end++) {
            arr[end] = arr[end-1] + arr[end-2];
        }

        return arr[n-1];
    }
}
