package br.com.codeproblems.dynamicprogramming;

public class DynamicProgrammingProblem509 {
    public static void main(String[] args) {
        int n = 47;
        int[] memoization = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            memoization[i] = -1;
        }
        System.out.println(fibTopDown(n, memoization));
//        System.out.println(fibBottomUp(n, memoization));
//        System.out.println(fibBottomUpWithoutTable(n));
    }

    public static int fibTopDown(int n, int[] memorization) {
        throwExceptionIfNegative(n);
        if(memorization[n] != -1){
            return memorization[n];
        }
        if(n <= 1){
            memorization[n] = n;
            return memorization[n];
        }
        memorization[n] = fibTopDown(n - 2, memorization) + fibTopDown(n - 1, memorization);
        return memorization[n];
    }

    public static int fibBottomUp(int n, int[] table) {
        throwExceptionIfNegative(n);
        table[0] = 0;
        table[1] = 1;
        for(int i = 2; i < n + 1; i++){
            table[i] = table[i-2] + table[i-1];
        }
        return table[n];
    }

    private static void throwExceptionIfNegative(int n) {
        if(n < 0){
            throw new IllegalArgumentException("N cannot be negative");
        }
    }

    public static int fibBottomUpWithoutTable(int n) {
        throwExceptionIfNegative(n);
        if(n <= 1){
            return n;
        }
        int previous = 0;
        int actual = 1;
        int oldActual = 0;
        for(int i = 2; i < n + 1; i++) {
            oldActual = actual;
            actual = previous + actual;
            previous = oldActual;
        }
        return actual;
    }
}