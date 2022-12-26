package com.company;

public class ClimbStairs {
//    Return number of ways to climb stairs with n steps if 1 or 2 steps can be taken at once
    public static int climbStairs(int n) {
        int ones = n;
        int twos = 0;
        int total = 0;
        while(ones >= 0){
            total = total + nCr(ones + twos, ones);
            ones = ones - 2;
            twos = twos + 1;
        }
        return total;
    }

//    Return nCr (i.e. number of ways to choose r positions from a total of n positions)
    public static int nCr(int n, int r){
        return factorial(n) / (factorial(n-r)*factorial(r));
    }

//    Return n! (i.e. n factorial which is: 1*2*...*n)
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int total = 1;
        for(int i=1; i<=n; i++){
            total = total * i;
        }
        return total;
    }
}
