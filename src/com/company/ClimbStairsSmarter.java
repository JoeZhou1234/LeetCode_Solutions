package com.company;

public class ClimbStairsSmarter {
//    Solution was obtained from https://medium.com/analytics-vidhya/leetcode-q70-climbing-stairs-easy-444a4aae54e8
//    This is the solution from LeetCode

    public static int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1+sqrt5)/2, n+1) - Math.pow((1-sqrt5)/2, n+1);
        return (int) (fibn/sqrt5);
    }
}
